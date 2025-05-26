package ti1;

import ao2.j0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import ni1.o2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f117718r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f117719s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f117720t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, SbaPinRep sbaPinRep, bl2.c cVar) {
        super(2, cVar);
        this.f117719s = oVar;
        this.f117720t = sbaPinRep;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f117719s, this.f117720t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f117718r;
        if (i13 == 0) {
            ue.c.H(obj);
            o oVar = this.f117719s;
            do2.i d2 = ((o2) oVar.f117739m.getValue()).f90763e.d();
            j jVar = new j(oVar, this.f117720t, null);
            this.f117718r = 1;
            if (l0.I(d2, jVar, this) == aVar) {
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
