package z91;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141391r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p70.e f141392s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f141393t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p70.e eVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f141392s = eVar;
        this.f141393t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f141392s, this.f141393t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141391r;
        p70.e eVar = this.f141392s;
        if (i13 == 0) {
            ue.c.H(obj);
            np1.j jVar = (np1.j) eVar.f99072b;
            this.f141391r = 1;
            obj = ((np1.i) jVar).g(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        u50.r rVar = this.f141393t;
        if (booleanValue) {
            rVar.a(f.f141373f);
            ((rp1.d) eVar.f99074d).a();
        } else {
            rVar.a(g.f141374a);
        }
        return Unit.f80348a;
    }
}
