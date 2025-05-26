package ht1;

import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ et1.c f70287a;

    /* renamed from: b, reason: collision with root package name */
    public final mt1.h f70288b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f70289c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et1.c f70290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f70291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wk2.a f70292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f70293g = 50000;

    public n0(et1.c cVar, o0 o0Var, id1.a aVar) {
        this.f70290d = cVar;
        this.f70291e = o0Var;
        this.f70292f = aVar;
        this.f70287a = cVar;
        et1.v0 v0Var = (et1.v0) cVar;
        mt1.h hVar = (mt1.h) o0Var.f70297b.a(v0Var.b());
        this.f70288b = hVar;
        this.f70289c = new HashMap();
        v0Var.a(hVar, "Detect Minimum Audio Frames Available");
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70287a).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70287a).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70287a.j(callback);
    }
}
