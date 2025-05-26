package tx0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import x02.w1;

/* loaded from: classes5.dex */
public final class b0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f119643r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ mb0.a f119644s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f119645t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(mb0.a aVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f119644s = aVar;
        this.f119645t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b0(this.f119644s, this.f119645t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f119643r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.c a13 = kotlin.jvm.internal.j.a(((w1) this.f119644s.f86862b).f131518b);
            da0.b bVar = new da0.b(this.f119645t, 2);
            this.f119643r = 1;
            if (a13.collect(bVar, this) == aVar) {
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
