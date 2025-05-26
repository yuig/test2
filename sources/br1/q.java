package br1;

import com.google.android.gms.ads.AdSize;
import j1.g1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;
import lb.l0;

/* loaded from: classes2.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f23809r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f23810s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f23811t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(j0 j0Var, j0 j0Var2, bl2.c cVar) {
        super(2, cVar);
        this.f23810s = j0Var;
        this.f23811t = j0Var2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q(this.f23810s, this.f23811t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f23809r;
        if (i13 == 0) {
            ue.c.H(obj);
            g1 g1Var = (g1) this.f23810s.f80434a;
            g1Var.f74074c.setValue(Boolean.TRUE);
            zn2.a aVar2 = zn2.b.f142311b;
            long P2 = dl2.b.P2(AdSize.MEDIUM_RECTANGLE_WIDTH, zn2.d.MILLISECONDS);
            this.f23809r = 1;
            if (l0.T(P2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        g1 g1Var2 = (g1) this.f23811t.f80434a;
        g1Var2.f74074c.setValue(Boolean.TRUE);
        return Unit.f80348a;
    }
}
