package z01;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import u50.r;
import y01.u0;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140580r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y01.e f140581s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f140582t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y01.e eVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f140581s = eVar;
        this.f140582t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f140581s, this.f140582t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140580r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f140581s.getClass();
            this.f140580r = 1;
            if (l0.S(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f140582t.a(u0.f136497a);
        return Unit.f80348a;
    }
}
