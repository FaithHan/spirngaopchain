package cn.hf.chain;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Chain chain = new Chain(Arrays.asList(new HandlerA(), new HandlerB(), new HandlerC()));
        chain.proceed();
    }


    private static class HandlerA implements Handler{
        @Override
        public void execute(Chain chain) {
            System.out.println("chain A");
            chain.proceed();
        }
    }

    private static class HandlerB implements Handler{
        @Override
        public void execute(Chain chain) {
            System.out.println("chain B");
            chain.proceed();
        }
    }

    private static class HandlerC implements Handler{
        @Override
        public void execute(Chain chain) {
            System.out.println("chain C");
            chain.proceed();
        }
    }
}

