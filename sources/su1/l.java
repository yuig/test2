package su1;

import ao2.m0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import wo2.f0;
import wo2.g0;

/* loaded from: classes4.dex */
public final class l extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final ResponseBody f115240d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f115241e;

    public l(ResponseBody originalBody, g0 throttler) {
        Intrinsics.checkNotNullParameter(originalBody, "originalBody");
        Intrinsics.checkNotNullParameter(throttler, "throttler");
        this.f115240d = originalBody;
        this.f115241e = throttler;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getF95980e() {
        return this.f115240d.getF95980e();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF95751d() {
        return this.f115240d.getF95751d();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final wo2.l getF95981f() {
        wo2.l source = this.f115240d.getF95981f();
        g0 g0Var = this.f115241e;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        return m0.i(new f0(source, g0Var));
    }
}
