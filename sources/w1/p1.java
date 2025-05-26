package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class p1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127439r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n3.w f127440s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y1 f127441t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(n3.w wVar, y1 y1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127440s = wVar;
        this.f127441t = y1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p1(this.f127440s, this.f127441t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127439r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f127439r = 1;
            y1 y1Var = this.f127441t;
            int i15 = 0;
            r1 r1Var = new r1(y1Var, i15);
            s1 s1Var = new s1(y1Var, i15);
            s1 s1Var2 = new s1(y1Var, i14);
            i1.j jVar = new i1.j(y1Var, 6);
            float f13 = m1.i0.f85372a;
            Object w13 = kh2.u2.w(this.f127440s, new m1.g0(m1.f0.f85337i, new kotlin.jvm.internal.i0(), null, new m1.d0(i15, r1Var), jVar, s1Var2, new m1.e0(i15, s1Var), null), this);
            if (w13 != obj2) {
                w13 = Unit.f80348a;
            }
            if (w13 != obj2) {
                w13 = Unit.f80348a;
            }
            if (w13 != obj2) {
                w13 = Unit.f80348a;
            }
            if (w13 == obj2) {
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
