package it.alessiosavi.gym;

import it.alessiosavi.gym.datastructure.Constants;
import it.alessiosavi.gym.datastructure.Response;
import it.alessiosavi.gym.datastructure.User;
import org.apache.commons.lang3.StringUtils;

public class Util {


    public static Response validateRequest(User req) {
        if (StringUtils.isBlank(req.getUsername())) {
            return new Response(Constants.MISSING_PARAMETER, Constants.REQ_USERNAME_NOT_PROVIDED);
        }
        if (StringUtils.isBlank(req.getName())) {
            return new Response(Constants.MISSING_PARAMETER, Constants.REQ_NAME_NOT_PROVIDED);
        }
        if (StringUtils.isBlank(req.getSurname())) {
            return new Response(Constants.MISSING_PARAMETER, Constants.REQ_SURNAME_NOT_PROVIDED);
        }
        if (StringUtils.isBlank(req.getMail())) {
            return new Response(Constants.MISSING_PARAMETER, Constants.REQ_MAIL_NOT_PROVIDED);
        }
        if (req.getTime() == null) {
            return new Response(Constants.MISSING_PARAMETER, Constants.REQ_TIME_NOT_PROVIDED);
        }
        if (req.getRegisterDate() == null) {
            return new Response(Constants.MISSING_PARAMETER, Constants.REQ_REGISTER_DATA_NOT_PROVIDED);
        }
        return null;
    }


}
