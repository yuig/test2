package z80;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141062r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f141063s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f141063s = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f141063s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141062r;
        if (i13 == 0) {
            ue.c.H(obj);
            o72.a aVar = this.f141063s.f141069d;
            this.f141062r = 1;
            h72.l lVar = (h72.l) aVar;
            Object M = kotlin.jvm.internal.j.M(this, lVar.f67991f.f89707c, new h72.i(lVar, null));
            if (M != obj2) {
                M = Unit.f80348a;
            }
            if (M == obj2) {
                return obj2;
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
