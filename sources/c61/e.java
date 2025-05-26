package c61;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f26531r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f26532s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f26532s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f26532s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f26531r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = i.f26565m1;
            i iVar = this.f26532s;
            do2.i d2 = iVar.c9().f26626o.d();
            d dVar = new d(iVar, null);
            this.f26531r = 1;
            if (lb.l0.I(d2, dVar, this) == aVar) {
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
