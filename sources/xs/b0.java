package xs;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes3.dex */
public final class b0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f135699r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f135700s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f135701t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j13, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f135700s = j13;
        this.f135701t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b0(this.f135700s, this.f135701t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f135699r;
        if (i13 == 0) {
            ue.c.H(obj);
            long currentTimeMillis = System.currentTimeMillis() - this.f135700s;
            long j13 = currentTimeMillis > 700 ? 0L : 700 - currentTimeMillis;
            this.f135699r = 1;
            if (l0.S(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f135701t.a(new q(System.currentTimeMillis() * 1000000));
        return Unit.f80348a;
    }
}
