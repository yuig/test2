package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127592r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y1.n f127593s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(y1.n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f127593s = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z1(this.f127593s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127592r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f127592r = 1;
            y1.n nVar = this.f127593s;
            nVar.getClass();
            Object O = dl2.b.O(new y1.m(nVar, null), this);
            if (O != obj2) {
                O = Unit.f80348a;
            }
            if (O == obj2) {
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
