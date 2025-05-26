package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ResponseHeaderHandlerChain<T> extends S3XmlResponseHandler<T> {

    /* renamed from: f, reason: collision with root package name */
    public final List f28811f;

    public ResponseHeaderHandlerChain(Unmarshaller unmarshaller, HeaderHandler... headerHandlerArr) {
        super(unmarshaller);
        this.f28811f = Arrays.asList(headerHandlerArr);
    }

    @Override // com.amazonaws.services.s3.internal.S3XmlResponseHandler, com.amazonaws.http.HttpResponseHandler
    /* renamed from: e */
    public final AmazonWebServiceResponse a(HttpResponse httpResponse) {
        AmazonWebServiceResponse a13 = super.a(httpResponse);
        Object obj = a13.f28521a;
        if (obj != null) {
            Iterator it = this.f28811f.iterator();
            while (it.hasNext()) {
                ((HeaderHandler) it.next()).a(obj, httpResponse);
            }
        }
        return a13;
    }
}
