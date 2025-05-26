package o1;

import ao2.j0;
import do2.f2;
import i2.q1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92760r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f92761s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f92762t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f92761s = kVar;
        this.f92762t = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f92761s, this.f92762t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92760r;
        if (i13 == 0) {
            ue.c.H(obj);
            ArrayList arrayList = new ArrayList();
            f2 f2Var = ((l) this.f92761s).f92764a;
            f fVar = new f(0, arrayList, this.f92762t);
            this.f92760r = 1;
            f2Var.getClass();
            if (f2.j(f2Var, fVar, this) == aVar) {
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
