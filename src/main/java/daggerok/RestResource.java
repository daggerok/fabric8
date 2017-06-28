package daggerok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Map;

@RestController
public class RestResource {

  @GetMapping
  public Map<String, LocalDateTime> api() {
    return Collections.singletonMap("date", LocalDateTime.now());
  }
}
