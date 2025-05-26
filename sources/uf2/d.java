package uf2;

import kh2.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122116a;

    /* renamed from: b, reason: collision with root package name */
    public final tf2.d f122117b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f122118c;

    /* renamed from: d, reason: collision with root package name */
    public tf2.d f122119d;

    /* renamed from: e, reason: collision with root package name */
    public final v f122120e;

    /* renamed from: f, reason: collision with root package name */
    public a f122121f;

    public d(Function0 factory, v0 v0Var, int i13) {
        Function0 configGate = v0Var;
        configGate = (i13 & 2) != 0 ? c.f122113j : configGate;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(configGate, "configGate");
        this.f122116a = configGate;
        this.f122117b = null;
        this.f122118c = false;
        this.f122120e = m.b(factory);
        b();
    }

    public final void a(tf2.d dVar) {
        a aVar;
        this.f122119d = dVar;
        b();
        v vVar = this.f122120e;
        if (!vVar.isInitialized() || (aVar = (a) vVar.getValue()) == null) {
            return;
        }
        ((b) aVar).f122112c.a();
    }

    public final void b() {
        a aVar;
        tf2.d dVar = this.f122119d;
        boolean z13 = (dVar == null || dVar == this.f122117b || !((Boolean) this.f122116a.invoke()).booleanValue()) ? false : true;
        a aVar2 = null;
        if (z13 && this.f122121f == null) {
            a aVar3 = (a) this.f122120e.getValue();
            if (aVar3 != null) {
                aVar3.c();
                aVar2 = aVar3;
            }
            this.f122121f = aVar2;
            return;
        }
        if (z13 || (aVar = this.f122121f) == null) {
            return;
        }
        aVar.a();
        this.f122121f = null;
    }
}
