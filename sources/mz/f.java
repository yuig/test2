package mz;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import rg0.s0;
import uj2.q;
import vq0.h;
import yk1.m;
import yk1.n;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public final cz.e f88535a;

    /* renamed from: b, reason: collision with root package name */
    public final q f88536b;

    /* renamed from: c, reason: collision with root package name */
    public final uk1.d f88537c;

    /* renamed from: d, reason: collision with root package name */
    public final g f88538d;

    public f(cz.e anketManager, q networkStateStream, uk1.d presenterPinalytics, g gVar) {
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f88535a = anketManager;
        this.f88536b = networkStateStream;
        this.f88537c = presenterPinalytics;
        this.f88538d = gVar;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        e view = (e) nVar;
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        s0.f108088a.a(view, model, this.f88535a, Integer.valueOf(i13), this.f88538d);
    }

    @Override // vq0.h
    public final m f() {
        return new kz.a(this.f88535a, this.f88536b, this.f88537c);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
