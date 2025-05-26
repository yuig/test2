package mx;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes3.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88452r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f88453s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, bl2.c cVar) {
        super(2, cVar);
        this.f88453s = hVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f88453s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88452r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = h.f88457l0;
            h hVar = this.f88453s;
            do2.i d2 = hVar.a8().f104843e.d();
            d dVar = new d(hVar, null);
            this.f88452r = 1;
            if (l0.I(d2, dVar, this) == aVar) {
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
