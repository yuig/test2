package l82;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f82248r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f82249s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f82250t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f82251u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f82252v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g gVar, y yVar, h hVar, String str, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f82248r = gVar;
        this.f82249s = yVar;
        this.f82250t = hVar;
        this.f82251u = str;
        this.f82252v = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r(this.f82248r, this.f82249s, this.f82250t, this.f82251u, this.f82252v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        y yVar = this.f82249s;
        j0 j0Var = yVar.f82283a;
        c e13 = yVar.e();
        e13.f82211c = this.f82251u;
        Unit unit = Unit.f80348a;
        q qVar = new q(e13, this.f82252v);
        g gVar = this.f82248r;
        h hVar = this.f82250t;
        gVar.e(j0Var, hVar, qVar);
        m82.b bVar = yVar.f82288f;
        if (bVar != null) {
            ((m82.a) bVar).c(gVar, hVar);
        }
        return Unit.f80348a;
    }
}
