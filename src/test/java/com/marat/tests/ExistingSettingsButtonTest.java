package com.marat.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class ExistingSettingsButtonTest extends TestBase{

    @DisplayName("Settings button")
    @AllureId("22994")
    @Owner(value = "Marat")
    @Test
    void existingSettingsButton() {
        step("Open settings menu", () -> {
            $(id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        });
        step("Existing settings button", () -> {
            $(id("org.wikipedia.alpha:id/explore_overflow_settings")).shouldHave(Condition.text("Settings"));
        });
    }
}
