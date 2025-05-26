package do2;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b0 extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f55732r;

    /* renamed from: s, reason: collision with root package name */
    public co2.b0 f55733s;

    /* renamed from: t, reason: collision with root package name */
    public int f55734t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f55735u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f55736v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f55737w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f55738x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j13, i iVar, bl2.c cVar) {
        super(3, cVar);
        this.f55737w = j13;
        this.f55738x = iVar;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0 b0Var = new b0(this.f55737w, this.f55738x, (bl2.c) obj3);
        b0Var.f55735u = (ao2.j0) obj;
        b0Var.f55736v = (j) obj2;
        return b0Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        co2.b0 o23;
        co2.b0 b0Var;
        kotlin.jvm.internal.j0 j0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f55734t;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var2 = (ao2.j0) this.f55735u;
            j jVar2 = (j) this.f55736v;
            co2.y o24 = dl2.b.o2(j0Var2, -1, new a0(this.f55738x, null), 1);
            kotlin.jvm.internal.j0 j0Var3 = new kotlin.jvm.internal.j0();
            jVar = jVar2;
            o23 = dl2.b.o2(j0Var2, 0, new w(this.f55737w, null), 1);
            b0Var = o24;
            j0Var = j0Var3;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o23 = this.f55733s;
            j0Var = this.f55732r;
            b0Var = (co2.b0) this.f55736v;
            jVar = (j) this.f55735u;
            ue.c.H(obj);
        }
        while (j0Var.f80434a != eo2.j0.f59785c) {
            lo2.h hVar = new lo2.h(getContext());
            hVar.g(b0Var.l(), new x(j0Var, o23, null));
            hVar.g(o23.k(), new y(null, j0Var, jVar));
            this.f55735u = jVar;
            this.f55736v = b0Var;
            this.f55732r = j0Var;
            this.f55733s = o23;
            this.f55734t = 1;
            if ((lo2.h.f84187f.get(hVar) instanceof lo2.f ? hVar.c(this) : hVar.d(this)) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
