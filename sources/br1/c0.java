package br1;

import ao2.j0;
import i2.c3;
import i2.m1;
import i2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f23769r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f23770s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m1 f23771t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q1 f23772u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i13, m1 m1Var, q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f23770s = i13;
        this.f23771t = m1Var;
        this.f23772u = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f23770s, this.f23771t, this.f23772u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f23769r;
        if (i13 == 0) {
            ue.c.H(obj);
            zn2.a aVar2 = zn2.b.f142311b;
            long P2 = dl2.b.P2(this.f23770s, zn2.d.MILLISECONDS);
            this.f23769r = 1;
            if (l0.T(P2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        u2.q qVar = e0.f23779a;
        ((c3) this.f23771t).i(1.0f);
        this.f23772u.setValue(Boolean.TRUE);
        return Unit.f80348a;
    }
}
