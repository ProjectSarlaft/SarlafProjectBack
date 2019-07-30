package com.BackProject.BackProject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class varargs {

    public static void main(String[] args) {
        Supplier<Object> objectSupplier = () -> new Object();
        Supplier<String> stringSupploer = () -> "hi there";
        Supplier<List<String>> arraySupller = () -> Arrays.asList("hola", "como", "estas");
        Supplier<HashMap<String, Object>> mapSupllier = () -> new HashMap<>();
    }
}


@FunctionalInterface
interface mockito {
    void test();
}

interface UsadorMocks {
    boolean test(mockito mockito);
}

class UsadorMocksImpl implements UsadorMocks{
    @Override
    public boolean test(mockito mockito) {
        System.out.println("Estoy en el usador");
        mockito.test();
        return false;
    }
}

class mockitoImpl implements mockito{
    @Override
    public void test() {
        System.out.println("Mockito Impl");
    }
}
