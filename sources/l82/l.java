package l82;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f82232r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f82233s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f82234t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f82235u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f82236v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, n nVar, h hVar, String str, f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f82232r = gVar;
        this.f82233s = nVar;
        this.f82234t = hVar;
        this.f82235u = str;
        this.f82236v = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f82232r, this.f82233s, this.f82234t, this.f82235u, this.f82236v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = this.f82233s;
        y yVar = nVar.f82242a;
        j0 j0Var = yVar.f82283a;
        c e13 = yVar.e();
        e13.f82211c = this.f82235u;
        Unit unit = Unit.f80348a;
        k kVar = new k(e13, this.f82236v, 0);
        g gVar = this.f82232r;
        h hVar = this.f82234t;
        gVar.e(j0Var, hVar, kVar);
        m82.b bVar = nVar.f82242a.f82288f;
        if (bVar != null) {
            ((m82.a) bVar).c(gVar, hVar);
        }
        return Unit.f80348a;
    }
}
