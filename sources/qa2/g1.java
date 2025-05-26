package qa2;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ni1.o2;

/* loaded from: classes4.dex */
public final class g1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f103265r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o2 f103266s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f103267t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(o2 o2Var, SbaPinRep sbaPinRep, bl2.c cVar) {
        super(2, cVar);
        this.f103266s = o2Var;
        this.f103267t = sbaPinRep;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g1(this.f103266s, this.f103267t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f103265r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i d2 = this.f103266s.f90763e.d();
            f1 f1Var = new f1(this.f103267t, null);
            this.f103265r = 1;
            if (lb.l0.I(d2, f1Var, this) == aVar) {
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
