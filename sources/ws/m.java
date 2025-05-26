package ws;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f131065r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f131066s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f131066s = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f131066s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f131065r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = o.C0;
            o oVar = this.f131066s;
            do2.i d2 = oVar.j8().f131047l.d();
            y1.b bVar = new y1.b(oVar, 3);
            this.f131065r = 1;
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
