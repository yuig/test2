package c2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class d extends dl2.j implements kl2.m {

    /* renamed from: r, reason: collision with root package name */
    public int f24610r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ q f24611s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ a3 f24612t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f24613u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w f24614v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f24615w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w wVar, float f13, bl2.c cVar) {
        super(4, cVar);
        this.f24614v = wVar;
        this.f24615w = f13;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        d dVar = new d(this.f24614v, this.f24615w, (bl2.c) obj4);
        dVar.f24611s = (q) obj;
        dVar.f24612t = (a3) obj2;
        dVar.f24613u = obj3;
        return dVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24610r;
        if (i13 == 0) {
            ue.c.H(obj);
            q qVar = this.f24611s;
            float c13 = this.f24612t.c(this.f24613u);
            if (!Float.isNaN(c13)) {
                kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                w wVar = this.f24614v;
                float h10 = Float.isNaN(wVar.f25334j.h()) ? 0.0f : wVar.f25334j.h();
                g0Var.f80425a = h10;
                c cVar = new c(0, qVar, g0Var);
                this.f24611s = null;
                this.f24612t = null;
                this.f24610r = 1;
                if (j1.e.c(h10, c13, this.f24615w, wVar.f25327c, cVar, this) == aVar) {
                    return aVar;
                }
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
