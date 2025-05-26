package hc2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh0.g1;
import lh0.k4;
import lh0.y0;
import lh0.z0;
import xk2.v;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final k4 f68753a;

    /* renamed from: b, reason: collision with root package name */
    public final v f68754b;

    public g(k4 videoExperiments) {
        Intrinsics.checkNotNullParameter(videoExperiments, "videoExperiments");
        this.f68753a = videoExperiments;
        this.f68754b = xk2.m.b(f.f68752i);
    }

    public final boolean a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return d7.b.f0(url) && this.f68753a.c("narrow");
    }

    public final boolean b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!d7.b.f0(url)) {
            return false;
        }
        k4 k4Var = this.f68753a;
        k4Var.getClass();
        Intrinsics.checkNotNullParameter("narrow", "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) k4Var.f83410a).h("android_video_reuse", y0.f83512b);
        return h10 != null && z.p(h10, "control", false) && StringsKt.E(h10, "narrow", false);
    }

    public final boolean c(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return d7.b.f0(url) && this.f68753a.c("metadata");
    }
}
