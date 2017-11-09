package com.mycompany;

import org.apache.wicket.request.IRequestHandler;
import org.apache.wicket.request.IRequestMapper;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Url;

public class RequestMapperImpl implements IRequestMapper {
    private static final String PATH = "ping";

    @Override
    public IRequestHandler mapRequest(Request request) {
        Url url = request.getUrl();

        System.out.println("request url: " + url);

        return url.toString().equals(PATH) ? new RequestHandlerImpl() : null;
    }

    @Override
    public int getCompatibilityScore(Request request) {
        return Integer.MIN_VALUE;
    }

    @Override
    public Url mapHandler(IRequestHandler requestHandler) {
        return requestHandler instanceof RequestHandlerImpl ? Url.parse("./" + PATH) : null;
    }
}
