package com.reactive;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Main {

    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Hello World");
        mono.subscribe(System.out::println);

        Flux<String> flux = Flux.just("apple", "banana", "orange");
        flux.subscribe(System.out::println);
    }
}
