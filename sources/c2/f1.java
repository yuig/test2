package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24720r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1.k f24721s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s2.t f24722t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(o1.k kVar, s2.t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f24721s = kVar;
        this.f24722t = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f1(this.f24721s, this.f24722t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24720r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.f2 f2Var = ((o1.l) this.f24721s).f92764a;
            e1 e1Var = new e1(this.f24722t, 0);
            this.f24720r = 1;
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
