package ti1;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ni1.u0;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f117715r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f117716s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f117717t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, SbaPinRep sbaPinRep, bl2.c cVar) {
        super(2, cVar);
        this.f117716s = sbaPinRep;
        this.f117717t = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j jVar = new j(this.f117717t, this.f117716s, cVar);
        jVar.f117715r = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((u0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        u0 u0Var = (u0) this.f117715r;
        this.f117716s.bindDisplayState(u0Var);
        o oVar = this.f117717t;
        a aVar2 = oVar.f117734h;
        a aVar3 = u0Var.f90827u;
        if (aVar3 == null) {
            aVar2.getClass();
        } else if (!Intrinsics.d(aVar2.f117702a, aVar3.f117702a) || aVar2.f117703b != aVar3.f117703b || aVar2.f117704c != aVar3.f117704c || aVar2.f117705d != aVar3.f117705d || aVar2.f117706e != aVar3.f117706e) {
            a aVar4 = u0Var.f90827u;
            Intrinsics.f(aVar4);
            oVar.f117734h = aVar4;
        }
        return Unit.f80348a;
    }
}
