/**
 * The Controller leg for this Model-View-Controller application.
 *
 * @author Mark Nelson
 * @since 6.0
 * @see https://www.playframework.com
 */

package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.About;
import views.html.Aukahi;
import views.html.Home;
import views.html.Pueo;
import views.html.V6;


/**
 * Controllers for the application.
 */
public class Application extends Controller {

  /**
   * Application home page.
   *
   * @return HTTP OK with page content.
   */
  public static Result home() {
    return ok(Home.render());
  }


  /**
   * Pueo home page.
   *
   * @return HTTP OK with page content.
   */
  public static Result pueo() {
    return ok(Pueo.render());
  }


  /**
   * Aukahi home page.
   *
   * @return HTTP OK with page content.
   */
  public static Result aukahi() {
    return ok(Aukahi.render());
  }


  /**
   * V6 home page.
   *
   * @return HTTP OK with page content.
   */
  public static Result v6() {
    return ok(V6.render());
  }


  /**
   * About home page.
   *
   * @return HTTP OK with page content.
   */
  public static Result about() {
    return ok(About.render());
  }
}
