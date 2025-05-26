package qz;

import ao2.m0;
import ey.j1;
import ey.t2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class b0 implements Interceptor {
    public b0() {
        j1 networkActivityRecorder = j1.f60505b;
        Intrinsics.checkNotNullParameter(networkActivityRecorder, "networkActivityRecorder");
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request d2 = chain.d();
        String url = d2.f95700a.f95639i;
        if (j1.f60506c) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.E(url, "pinimg.com", false)) {
                new t2(url).i();
            }
        }
        Response b13 = chain.b(d2);
        ResponseBody responseBody = b13.f95726g;
        if (responseBody == null) {
            return b13;
        }
        z zVar = new z(responseBody, m0.i(new a0(this, url, b13, responseBody.getF95981f())));
        Response.Builder e13 = b13.e();
        e13.f95740g = zVar;
        return e13.b();
    }
}
