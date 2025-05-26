package a41;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f626r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f627s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f627s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f627s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f626r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = r.P1;
            r rVar = this.f627s;
            do2.i d2 = ((y31.p0) rVar.N1.getValue()).f136841k.d();
            y1.b bVar = new y1.b(rVar, 11);
            this.f626r = 1;
            if (d2.collect(bVar, this) == aVar) {
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
