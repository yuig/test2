package qz;

import java.util.List;
import jk2.k2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import tu1.o0;

/* loaded from: classes3.dex */
public final class r implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final dc2.e f105429a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f105430b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f105431c;

    public r(dc2.e videoPlayerFactory, tb0.h crashReporting, boolean z13) {
        Intrinsics.checkNotNullParameter(videoPlayerFactory, "videoPlayerFactory");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f105429a = videoPlayerFactory;
        this.f105430b = crashReporting;
        this.f105431c = z13;
    }

    @Override // tu1.o0
    public final void a(String url, List headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        HttpUrl.f95629k.getClass();
        HttpUrl d2 = HttpUrl.Companion.d(url);
        if (com.bumptech.glide.c.r0(d2) || com.bumptech.glide.c.x0(d2) || com.bumptech.glide.c.v0(d2) || com.bumptech.glide.c.u0(d2) || com.bumptech.glide.c.o0(d2) || (this.f105431c && com.bumptech.glide.c.C0(d2))) {
            k2 b13 = hs1.t.b();
            uj2.a0 a0Var = tk2.e.f118017c;
            b13.H(a0Var).A(a0Var).F(new dv.a(12, new hs.a(24, this, headers)), new dv.a(13, new mz.c(this, 1)), ck2.i.f27923c, ck2.i.f27924d);
        }
    }
}
