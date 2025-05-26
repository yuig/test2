package qz;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c implements EventListener.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final xk2.v f105370a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f105371b;

    /* renamed from: c, reason: collision with root package name */
    public final s f105372c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f105373d;

    /* renamed from: e, reason: collision with root package name */
    public final v f105374e;

    /* renamed from: f, reason: collision with root package name */
    public final e f105375f;

    /* renamed from: g, reason: collision with root package name */
    public final e f105376g;

    /* renamed from: h, reason: collision with root package name */
    public final v f105377h;

    public c(dc2.e videoPlayerFactory, n1 hairballExperiments) {
        Intrinsics.checkNotNullParameter(videoPlayerFactory, "videoPlayerFactory");
        Intrinsics.checkNotNullParameter(hairballExperiments, "hairballExperiments");
        xk2.v b13 = xk2.m.b(new b(hairballExperiments, 1));
        this.f105370a = xk2.m.b(new b(hairballExperiments, 2));
        this.f105371b = xk2.m.b(new b(hairballExperiments, 0));
        pb0.g clock = pb0.g.f99432a;
        boolean b14 = b();
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f105372c = new s(b14, null);
        boolean b15 = b();
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f105373d = new g0(b15, null);
        this.f105374e = ((Boolean) b13.getValue()).booleanValue() ? new v(b(), videoPlayerFactory) : new v(b(), null);
        this.f105375f = new e(2);
        this.f105376g = new e(1);
        this.f105377h = new v(b(), null);
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener a(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        HttpUrl url = call.getF95898b().f95700a;
        if (com.bumptech.glide.c.r0(url)) {
            return this.f105372c;
        }
        if (com.bumptech.glide.c.x0(url)) {
            return this.f105373d;
        }
        if (com.bumptech.glide.c.v0(url)) {
            return this.f105374e;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        List list = url.f95636f;
        if (list.size() == 5 && Intrinsics.d("v3", list.get(0)) && Intrinsics.d("users", list.get(1)) && Intrinsics.d("following", list.get(3))) {
            return this.f105375f;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (list.size() == 5 && Intrinsics.d("v3", list.get(0)) && Intrinsics.d("users", list.get(1)) && Intrinsics.d("follow", list.get(3))) {
            return this.f105376g;
        }
        return (com.bumptech.glide.c.u0(url) || com.bumptech.glide.c.o0(url) || (((Boolean) this.f105370a.getValue()).booleanValue() && com.bumptech.glide.c.C0(url))) ? this.f105377h : EventListener.f95611a;
    }

    public final boolean b() {
        return ((Boolean) this.f105371b.getValue()).booleanValue();
    }
}
