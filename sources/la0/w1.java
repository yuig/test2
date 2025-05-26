package la0;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ni1.o2;

/* loaded from: classes5.dex */
public final class w1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f82475r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o2 f82476s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f82477t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(o2 o2Var, SbaPinRep sbaPinRep, bl2.c cVar) {
        super(2, cVar);
        this.f82476s = o2Var;
        this.f82477t = sbaPinRep;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w1(this.f82476s, this.f82477t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f82475r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i d2 = this.f82476s.f90763e.d();
            v1 v1Var = new v1(this.f82477t, null);
            this.f82475r = 1;
            if (lb.l0.I(d2, v1Var, this) == aVar) {
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
