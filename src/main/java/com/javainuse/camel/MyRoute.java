package com.javainuse.camel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.model.RouteDefinition;
import org.springframework.stereotype.Component;

// @Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // ((ProcessorDefinition<RouteDefinition>) from("file:/home/surajit/Downloads/InputFolder?noop=true")).to("file:/home/surajit/Downloads/OutPutFolder");
	}
}