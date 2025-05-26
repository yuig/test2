package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f25381r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1.k f25382s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s2.t f25383t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(o1.k kVar, s2.t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f25382s = kVar;
        this.f25383t = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x4(this.f25382s, this.f25383t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x4) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f25381r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.f2 f2Var = ((o1.l) this.f25382s).f92764a;
            e1 e1Var = new e1(this.f25383t, i14);
            this.f25381r = 1;
            f2Var.getClass();
            if (do2.f2.j(f2Var, e1Var, this) == aVar) {
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
