package translator.infrastructure;

import org.springframework.stereotype.Component;

@Component
public class DummyTranslator extends TranslatorImpl {

  // Now the function throws an exception as default
  @Override
  protected String translateInternal(String from, String to, String text, String encodedText) {
    throw new RuntimeException("I don't know how to translate from "+from+" to "+ to + " the text '"+text+"'");
  }
}
