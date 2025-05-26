package kd1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f79249r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f79250s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f79250s = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f79250s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f79249r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = k.X0;
            k kVar = this.f79250s;
            do2.i a13 = kVar.e9().a();
            g gVar = new g(kVar, null);
            this.f79249r = 1;
            if (l0.I(a13, gVar, this) == aVar) {
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
