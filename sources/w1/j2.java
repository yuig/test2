package w1;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m1.n3;

/* loaded from: classes2.dex */
public final class j2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127312r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127313s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f127314t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127315u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1.l f127316v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v3 f127317w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(ao2.j0 j0Var, i2.q1 q1Var, o1.l lVar, v3 v3Var, bl2.c cVar) {
        super(2, cVar);
        this.f127314t = j0Var;
        this.f127315u = q1Var;
        this.f127316v = lVar;
        this.f127317w = v3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j2 j2Var = new j2(this.f127314t, this.f127315u, this.f127316v, this.f127317w, cVar);
        j2Var.f127313s = obj;
        return j2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j2) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127312r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f127313s;
            i2 i2Var = new i2(this.f127314t, this.f127315u, this.f127316v, null);
            i1.u0 u0Var = new i1.u0(this.f127317w, 2);
            this.f127312r = 1;
            m1.v0 v0Var = n3.f85477a;
            Object O = dl2.b.O(new m1.x2(wVar, i2Var, u0Var, new m1.j1(wVar), null), this);
            if (O != obj2) {
                O = Unit.f80348a;
            }
            if (O == obj2) {
                return obj2;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
