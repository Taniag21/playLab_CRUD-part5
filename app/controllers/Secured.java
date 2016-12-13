package controllers;
import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;
import models.users.*;


/**
 * Created by TaniaG on 13/12/2016.
 */
public class Secured extends Security.Authenticator{

    @Override
    public String getUsername(Context ctx)
    {
        return ctx.session().get("email");
    }
    @Override
    public Result onUnauthorized(Context ctx)
    {
        return redirect(routes.LoginController.login());
    }
}
