package e2;

import ao2.j0;
import j1.o2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56877r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f56878s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f56878s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f56878s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56877r;
        if (i13 == 0) {
            ue.c.H(obj);
            j1.d dVar = this.f56878s.f56894f;
            Float f13 = new Float(1.0f);
            o2 r13 = j1.e.r(75, 0, j1.g0.f74072c, 2);
            this.f56877r = 1;
            if (j1.d.c(dVar, f13, r13, this) == aVar) {
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
