package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127725r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v1 f127726s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f127727t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f127728u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v1 v1Var, u50.r rVar, l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f127726s = v1Var;
        this.f127727t = rVar;
        this.f127728u = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f127726s, this.f127727t, this.f127728u, cVar);
        kVar.f127725r = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ao2.j0 j0Var = (ao2.j0) this.f127725r;
        s1 s1Var = (s1) this.f127726s;
        if (s1Var.f127807a.length() == 0) {
            this.f127727t.a(new o(s1Var.f127809c));
            return Unit.f80348a;
        }
        z20.a aVar2 = this.f127728u.f127735a;
        String str = s1Var.f127807a;
        if (str.length() == 0) {
            str = "2267818045480390400";
        }
        kk2.t l13 = aVar2.a(str).r(tk2.e.f118017c).l(wj2.c.a());
        u50.r rVar = this.f127727t;
        v1 v1Var = this.f127726s;
        l13.o(new a21.a(14, new aw0.j(j0Var, rVar, v1Var, this.f127728u, 7)), new a21.a(15, new y11.c(6, rVar, v1Var)));
        return Unit.f80348a;
    }
}
