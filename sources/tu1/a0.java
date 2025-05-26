package tu1;

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
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f119343a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f119344b;

    public a0(UrlRequest request, b0 responseSupplier) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(responseSupplier, "responseSupplier");
        this.f119343a = request;
        this.f119344b = responseSupplier;
    }

    public final Response a() {
        b0 b0Var = (b0) this.f119344b;
        b0Var.f119350a.f119363a.getClass();
        t0 t0Var = b0Var.f119352c;
        try {
            UrlResponseInfo urlResponseInfo = (UrlResponseInfo) com.bumptech.glide.c.c0(t0Var.f119448n);
            try {
                wo2.e0 e0Var = (wo2.e0) com.bumptech.glide.c.c0(t0Var.f119444j);
                Request request = b0Var.f119351b;
                Response.Builder a13 = z.a(request, urlResponseInfo, e0Var);
                List unmodifiableList = Collections.unmodifiableList(t0Var.f119450p);
                List<String> urlChain = urlResponseInfo.getUrlChain();
                if (!unmodifiableList.isEmpty()) {
                    bf.b.j("The number of redirects should be consistent across URLs and headers!", urlChain.size() == unmodifiableList.size() + 1);
                    int size = unmodifiableList.size();
                    Response response = null;
                    for (int i13 = 0; i13 < size; i13++) {
                        Request.Builder b13 = request.b();
                        b13.j(urlChain.get(i13));
                        Response.Builder a14 = z.a(b13.b(), (UrlResponseInfo) unmodifiableList.get(i13), null);
                        a14.g(response);
                        response = a14.b();
                    }
                    Request.Builder b14 = request.b();
                    b14.j((String) com.bumptech.glide.c.P(urlChain));
                    Request request2 = b14.b();
                    Intrinsics.checkNotNullParameter(request2, "request");
                    a13.f95734a = request2;
                    a13.g(response);
                }
                Response b15 = a13.b();
                Intrinsics.checkNotNullExpressionValue(b15, "toResponse(...)");
                return b15;
            } catch (ExecutionException e13) {
                throw new IOException(e13);
            }
        } catch (ExecutionException e14) {
            throw new IOException(e14);
        }
    }
}
