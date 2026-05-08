package com.proweb.tareas.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NuevaTareaPage {
    private final WebDriver driver;
    private final By campoTitulo = By.id("titulo");

    public NuevaTareaPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean campoTituloVisible() {
        return driver.findElement(campoTitulo).isDisplayed();
    }

    public String obtenerTituloPagina() {
        return driver.getTitle();
    }
}
