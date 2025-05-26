package z10;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import nm.o;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import tb0.p;

/* loaded from: classes.dex */
public final class i implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final int f140594a;

    public i(o gson, int i13, int i14) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f140594a = i14;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request f95974e = chain.getF95974e();
        HttpUrl httpUrl = f95974e.f95700a;
        Request.Builder b13 = f95974e.b();
        String b14 = httpUrl.b();
        byte[] bytes = httpUrl.f95639i.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        int length = bytes.length;
        if (Intrinsics.d(f95974e.f95701b, "GET") && length > this.f140594a && length > 7800) {
            vb0.j.f125466a.K(false, a.a.k("URL ", b14, " too long, this request will fail with a 414 status code. See http://pinch/414error"), p.PLATFORM, new Object[0]);
        }
        return chain.b(b13.b());
    }
}
