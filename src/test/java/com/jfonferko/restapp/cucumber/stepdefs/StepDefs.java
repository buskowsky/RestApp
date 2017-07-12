package com.jfonferko.restapp.cucumber.stepdefs;

import com.jfonferko.restapp.RestApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = RestApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
