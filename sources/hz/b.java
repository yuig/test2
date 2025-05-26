package hz;

import ao2.j0;
import gz.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f70597r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f70598s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f70598s = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f70598s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f70597r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = d.f70601r0;
            d dVar = this.f70598s;
            do2.i d2 = ((p) dVar.f70609q0.getValue()).f66353c.d();
            y1.b bVar = new y1.b(dVar, 6);
            this.f70597r = 1;
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
