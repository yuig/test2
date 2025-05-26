package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class S3StringResponseHandler extends AbstractS3ResponseHandler<String> {
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object a(HttpResponse httpResponse) {
        AmazonWebServiceResponse c13 = AbstractS3ResponseHandler.c(httpResponse);
        byte[] bArr = new byte[1024];
        StringBuilder sb3 = new StringBuilder();
        InputStream a13 = httpResponse.a();
        while (true) {
            int read = a13.read(bArr);
            if (read <= 0) {
                c13.f28521a = sb3.toString();
                return c13;
            }
            sb3.append(new String(bArr, 0, read, StringUtils.f29048a));
        }
    }
}
