package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * Description: Controller de la page d'acceuil.
 * Route: localhost:900/
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def index() = Action { implicit request: Request[AnyContent] =>
        Ok(views.html.index())
    }

}
