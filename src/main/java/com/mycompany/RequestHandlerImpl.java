package com.mycompany;

import org.apache.wicket.request.handler.resource.ResourceStreamRequestHandler;
import org.apache.wicket.request.resource.ContentDisposition;
import org.apache.wicket.util.resource.AbstractResourceStreamWriter;

import java.io.IOException;
import java.io.OutputStream;

public class RequestHandlerImpl extends ResourceStreamRequestHandler {
    private static final String FILENAME = "pong.txt";
    private static final byte[] CONTENT = "pang".getBytes();

    public RequestHandlerImpl() {
        super(new AbstractResourceStreamWriter() {
            private static final long serialVersionUID = 5859240491592101941L;

            @Override
            public void write(OutputStream output) throws IOException {
                output.write(CONTENT);
            }
        }, FILENAME);

        this.setContentDisposition(ContentDisposition.ATTACHMENT);
    }
}
