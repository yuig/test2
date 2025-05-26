package v72;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f124401r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f124402s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f124403t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f124403t = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f124403t, cVar);
        bVar.f124402s = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((i) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f124401r;
        if (i13 == 0) {
            ue.c.H(obj);
            i iVar2 = (i) this.f124402s;
            this.f124402s = iVar2;
            this.f124401r = 1;
            if (l0.S(100L, this) == aVar) {
                return aVar;
            }
            iVar = iVar2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (i) this.f124402s;
            ue.c.H(obj);
        }
        int i14 = g.f124416x;
        g gVar = this.f124403t;
        gVar.getClass();
        com.pinterest.shuffles.scene.composer.y.r(gVar.f124430q, iVar.f124437a);
        gVar.f124429p.h(iVar.f124438b);
        gVar.f124434u.bindDisplayState(iVar.f124439c);
        return Unit.f80348a;
    }
}
