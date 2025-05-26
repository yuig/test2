package ez0;

import ao2.j0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import ni1.o2;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f60674r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o2 f60675s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f60676t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o2 o2Var, SbaPinRep sbaPinRep, bl2.c cVar) {
        super(2, cVar);
        this.f60675s = o2Var;
        this.f60676t = sbaPinRep;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f60675s, this.f60676t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f60674r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i d2 = this.f60675s.f90763e.d();
            f fVar = new f(this.f60676t, null);
            this.f60674r = 1;
            if (l0.I(d2, fVar, this) == aVar) {
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
