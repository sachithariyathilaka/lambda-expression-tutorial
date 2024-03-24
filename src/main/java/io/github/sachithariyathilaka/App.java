package io.github.sachithariyathilaka;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;

/**
 * Main class for the application.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
public class App {

    public static void main( String[] args ) {

        List<String> brands = Arrays.asList("honda", "audi", "toyota");
        App app = new App();

        // Optional type declaration
        app.optionalTypeDeclaration(brands);
        System.out.println();

        // Optional parenthesis around parameters
        app.optionalParenthesisAroundParameters(brands);
        System.out.println();

        // Optional return keyword
        app.optionalReturnKeyword(brands);

        // Optional curly braces
        app.optionalCurlyBraces(brands);

        // Empty parameters
        app.emptyParameters();
    }

    /**
     * Optional type declaration.
     *
     * @param   brands the brands
     */
    public void optionalTypeDeclaration(List<String> brands) {

        // Without lambda expression and with type declaration
        System.out.print("Without lambda expression and with type declaration: ");
        for (String brand: brands)
            if (brands.indexOf(brand) != brands.size() -1)
                System.out.print(StringUtils.capitalize(brand) + ", ");
            else
                System.out.print(StringUtils.capitalize(brand));

        System.out.println();

        // With lambda expression and without type declaration
        System.out.print("With lambda expression and without type declaration: ");
        brands.forEach((brand) ->
        {
            if (brands.indexOf(brand) != brands.size() -1)
                System.out.print(StringUtils.capitalize(brand) + ", ");
            else
                System.out.print(StringUtils.capitalize(brand));
        });
    }

    /**
     * Optional parenthesis around parameters.
     *
     * @param   brands the brands
     */
    public void optionalParenthesisAroundParameters(List<String> brands) {

       // Without lambda expression and with the parenthesis
        System.out.print("Without lambda expression and with the parenthesis: ");
        for (String brand: brands)
            if (brands.indexOf(brand) != brands.size() -1)
                System.out.print(StringUtils.capitalize(brand) + ", ");
            else
                System.out.print(StringUtils.capitalize(brand));

        System.out.println();

        // With lambda expression and without the parenthesis
        System.out.print("With lambda expression and without the parenthesis: ");
        brands.forEach(brand ->
        {
            if (brands.indexOf(brand) != brands.size() -1)
                System.out.print(StringUtils.capitalize(brand) + ", ");
            else
                System.out.print(StringUtils.capitalize(brand));
        });
    }

    /**
     * Optional return keyword.
     *
     * @param   brands the brands
     */
    public void optionalReturnKeyword(List<String> brands) {

        // Without lambda expression and with the return keyword
        System.out.print("Without lambda expression and with the return keyword: ");
        int count = 0;

        for (String brand: brands)
            count = count + brand.length();

        System.out.println(count);

        // With lambda expression and without the return keyword
        System.out.print("With lambda expression and without the return keyword: ");
        AtomicInteger atomicCount = new AtomicInteger();

        brands.forEach(brand -> {
            IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
            atomicCount.addAndGet(intBinaryOperator.applyAsInt(0, brand.length()));
        });

        System.out.println(atomicCount.get());
    }

    /**
     * Optional curly braces.
     *
     * @param   brands the brands
     */
    public void optionalCurlyBraces(List<String> brands) {

        // Without lambda expression and without the curly braces
        System.out.print("Without lambda expression and without the curly braces: ");
        int count = 0;

        for (String brand: brands)
            count = count + brand.length();

        System.out.println(count);

        // With lambda expression and without the curly braces
        System.out.print("With lambda expression and without the curly braces: ");
        AtomicInteger atomicCount = new AtomicInteger();

        brands.forEach(brand -> {
            IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
            atomicCount.addAndGet(intBinaryOperator.applyAsInt(0, brand.length()));
        });

        System.out.println(atomicCount.get());
    }

    /**
     * Empty parameters.
     */
    public void emptyParameters() {

        // Without lambda expression and without the parameters
        System.out.print("Without lambda expression and without the parameters: ");
        System.out.println("No parameters");

        // With lambda expression and without the parameters
        System.out.print("With lambda expression and without the parameters: ");

        Runnable runnable = () -> System.out.println("Thread is running");
        runnable.run();
    }
}
