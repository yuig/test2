package ey0;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f60643r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f60644s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f60645t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f60645t = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f60645t, cVar);
        dVar.f60644s = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f60643r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f60644s;
            g gVar = this.f60645t;
            int size = gVar.f60658a.a().f105346h.size();
            this.f60643r = 1;
            if (g.j(gVar, j0Var, "NUX_SELECTED_PIN_COUNT", size, this) == aVar) {
                return aVar;
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
