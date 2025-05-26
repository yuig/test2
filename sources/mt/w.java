package mt;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88137r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f88138s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, bl2.c cVar) {
        super(2, cVar);
        this.f88138s = yVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w(this.f88138s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88137r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = y.B0;
            y yVar = this.f88138s;
            do2.i d2 = yVar.j8().f88129g.d();
            y1.b bVar = new y1.b(yVar, 5);
            this.f88137r = 1;
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
