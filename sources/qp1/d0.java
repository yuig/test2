package qp1;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class d0 extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f104757r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f104758s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f104759t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f104760u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(u50.r rVar, String str, bl2.c cVar, int i13) {
        super(3, cVar);
        this.f104757r = i13;
        this.f104759t = rVar;
        this.f104760u = str;
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f104757r) {
        }
        return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f104757r;
        u50.r rVar = this.f104759t;
        String str = this.f104760u;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new v(str, this.f104758s.toString()));
                break;
            default:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new d92.s(str, this.f104758s.toString()));
                break;
        }
        return Unit.f80348a;
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        int i13 = this.f104757r;
        u50.r rVar = this.f104759t;
        String str = this.f104760u;
        switch (i13) {
            case 0:
                d0 d0Var = new d0(rVar, str, cVar, 0);
                d0Var.f104758s = th3;
                return d0Var.invokeSuspend(Unit.f80348a);
            default:
                d0 d0Var2 = new d0(rVar, str, cVar, 1);
                d0Var2.f104758s = th3;
                return d0Var2.invokeSuspend(Unit.f80348a);
        }
    }
}
