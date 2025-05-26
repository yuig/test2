package fn0;

import co2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62604r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f62605s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f62606t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f62606t = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f62606t, cVar);
        bVar.f62605s = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62604r;
        if (i13 == 0) {
            ue.c.H(obj);
            z scope = (z) this.f62605s;
            c cVar = this.f62606t;
            bn0.c cVar2 = cVar.f62610d;
            cVar2.getClass();
            Intrinsics.checkNotNullParameter(scope, "scope");
            cVar2.f23565a = scope;
            cVar.f62608b.start();
            jh0.d dVar = new jh0.d(cVar, 21);
            this.f62604r = 1;
            if (dl2.b.w(scope, dVar, this) == aVar) {
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
