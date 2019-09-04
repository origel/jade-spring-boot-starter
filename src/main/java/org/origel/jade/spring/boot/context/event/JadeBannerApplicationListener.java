package org.origel.jade.spring.boot.context.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.origel.jade.spring.boot.util.JadeSpringBootStarterConstants;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.logging.LoggingApplicationListener;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * Dubbo banner
 * 
 * @author xionghui
 * @version 2.0.0
 * @since 2.0.0
 */
@Order(LoggingApplicationListener.DEFAULT_ORDER)
public class JadeBannerApplicationListener
    implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
  private static final Log logger = LogFactory.getLog(JadeBannerApplicationListener.class);

  private static Mode BANNER_MODE = Mode.CONSOLE;

  public static void setBANNER_MODE(Mode bANNER_MODE) {
    BANNER_MODE = bANNER_MODE;
  }

  @Override
  public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
    if (BANNER_MODE == Mode.OFF) {
      return;
    }
    String bannerText = this.buildBannerText();
    if (BANNER_MODE == Mode.CONSOLE) {
      System.out.print(bannerText);
    } else if (BANNER_MODE == Mode.LOG) {
      logger.info(bannerText);
    }
  }

  private String buildBannerText() {
    StringBuilder bannerTextBuilder = new StringBuilder();
    bannerTextBuilder.append(JadeSpringBootStarterConstants.LINE_SEPARATOR).append("jade")
        .append(" :: Jade ::        (v").append("1.0").append(")")
        .append(JadeSpringBootStarterConstants.LINE_SEPARATOR);
    return bannerTextBuilder.toString();
  }
}
