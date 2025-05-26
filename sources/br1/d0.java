package br1;

import ao2.j0;
import i2.m1;
import j1.d1;
import j1.e1;
import j1.g0;
import j1.l1;
import j1.n0;
import j1.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import p1.p1;

/* loaded from: classes2.dex */
public final class d0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f23774r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f23775s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m1 f23776t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i13, m1 m1Var, bl2.c cVar) {
        super(2, cVar);
        this.f23775s = i13;
        this.f23776t = m1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d0(this.f23775s, this.f23776t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f23774r;
        if (i13 == 0) {
            ue.c.H(obj);
            zn2.a aVar2 = zn2.b.f142311b;
            long P2 = dl2.b.P2(this.f23775s, zn2.d.MILLISECONDS);
            this.f23774r = 1;
            if (l0.T(P2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        d1 keyframesWithSpline = new d1();
        Intrinsics.checkNotNullParameter(keyframesWithSpline, "$this$keyframesWithSpline");
        keyframesWithSpline.f74021a = 2000;
        Float valueOf = Float.valueOf(0.94f);
        int i14 = keyframesWithSpline.f74021a / 2;
        z0 z0Var = new z0(valueOf);
        keyframesWithSpline.f74022b.l(i14, z0Var);
        z0Var.f74323b = g0.f74072c;
        Unit unit = Unit.f80348a;
        n0 o13 = j1.e.o(new e1(keyframesWithSpline), l1.Restart, 4);
        p1 p1Var = new p1(this.f23776t, 14);
        this.f23774r = 2;
        if (j1.e.e(1.0f, 1.0f, o13, p1Var, this, 4) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
