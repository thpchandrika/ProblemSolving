package com.springtest.beanscope.singleton;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;

    @Bean
    //@Scope("singleton")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person personSingleton() {
        return new Person();
    }
}
