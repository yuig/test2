package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.Unmarshaller;
import java.util.Map;

/* loaded from: classes3.dex */
public class S3XmlResponseHandler<T> extends AbstractS3ResponseHandler<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final Log f28819e = LogFactory.b("com.amazonaws.request");

    /* renamed from: c, reason: collision with root package name */
    public final Unmarshaller f28820c;

    /* renamed from: d, reason: collision with root package name */
    public Map f28821d;

    public S3XmlResponseHandler(Unmarshaller unmarshaller) {
        this.f28820c = unmarshaller;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AmazonWebServiceResponse a(HttpResponse httpResponse) {
        AmazonWebServiceResponse c13 = AbstractS3ResponseHandler.c(httpResponse);
        this.f28821d = httpResponse.f28606d;
        Unmarshaller unmarshaller = this.f28820c;
        if (unmarshaller != null) {
            Log log = f28819e;
            log.i("Beginning to parse service response XML");
            Object a13 = unmarshaller.a(httpResponse.a());
            log.i("Done parsing service response XML");
            c13.f28521a = a13;
        }
        return c13;
    }
}
