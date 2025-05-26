package qz;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public class v extends x {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f105440v = 0;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f105441t;

    /* renamed from: u, reason: collision with root package name */
    public final dc2.e f105442u;

    public v(boolean z13, dc2.e eVar) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f105441t = z13;
        this.f105442u = eVar;
    }

    @Override // qz.x, okhttp3.EventListener
    public void v(RealCall call, long j13) {
        Intrinsics.checkNotNullParameter(call, "call");
        new hy.k(j13).i();
        super.v(call, j13);
    }

    @Override // qz.x, okhttp3.EventListener
    public void w(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        new hy.l(5, 0).i();
        super.w(call);
    }

    @Override // qz.x, okhttp3.EventListener
    public void y(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!this.f105441t) {
            hs1.t.b().F(new mc.h(16, new i2.i(14, response, this)), new mc.h(17, u.f105435j), new vy.c(3), ck2.i.f27924d);
        }
        super.y(call, response);
    }
}
