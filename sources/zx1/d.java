package zx1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f143033r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f143034s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f143034s = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f143034s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f143033r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = k.f143044x0;
            k kVar = this.f143034s;
            do2.i d2 = kVar.f8().f20692e.d();
            c cVar = new c(kVar, null);
            this.f143033r = 1;
            if (l0.I(d2, cVar, this) == aVar) {
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
