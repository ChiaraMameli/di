package org.springframework.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("IT")
@Service("i18nGreetingService")
public class I18nItalianGreetingService implements GreetingService {
    @Override
    public String greetings() {
        return "Ciao, Mondo! (IT)";
    }
}
