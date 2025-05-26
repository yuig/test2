package ads_mobile_sdk;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.Response;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class w82 {

    /* renamed from: a, reason: collision with root package name */
    public final a.nf f12898a;

    public w82(UrlRequest urlRequest, v82 v82Var) {
        this.f12898a = v82Var;
    }

    public final Response a() {
        v82 v82Var = (v82) this.f12898a;
        m92 m92Var = v82Var.f12398c.f14147c;
        Request request = v82Var.f12396a;
        bq1 bq1Var = v82Var.f12397b;
        m92Var.getClass();
        try {
            UrlResponseInfo urlResponseInfo = (UrlResponseInfo) com.bumptech.glide.c.c0(bq1Var.f3558e);
            try {
                Response.Builder a13 = m92.a(request, urlResponseInfo, (wo2.e0) com.bumptech.glide.c.c0(bq1Var.f3554a));
                List unmodifiableList = Collections.unmodifiableList(bq1Var.f3560g);
                List<String> urlChain = urlResponseInfo.getUrlChain();
                if (!unmodifiableList.isEmpty()) {
                    bf.b.j("The number of redirects should be consistent across URLs and headers!", urlChain.size() == unmodifiableList.size() + 1);
                    Response response = null;
                    for (int i13 = 0; i13 < unmodifiableList.size(); i13++) {
                        Request.Builder b13 = request.b();
                        b13.j(urlChain.get(i13));
                        Response.Builder a14 = m92.a(b13.b(), (UrlResponseInfo) unmodifiableList.get(i13), null);
                        a14.g(response);
                        response = a14.b();
                    }
                    Request.Builder b14 = request.b();
                    b14.j((String) com.bumptech.glide.c.P(urlChain));
                    Request request2 = b14.b();
                    a13.getClass();
                    Intrinsics.checkNotNullParameter(request2, "request");
                    a13.f95734a = request2;
                    a13.g(response);
                }
                return a13.b();
            } catch (ExecutionException e13) {
                throw new IOException(e13);
            }
        } catch (ExecutionException e14) {
            throw new IOException(e14);
        }
    }
}
