package la0;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class v1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f82472r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f82473s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(SbaPinRep sbaPinRep, bl2.c cVar) {
        super(2, cVar);
        this.f82473s = sbaPinRep;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v1 v1Var = new v1(this.f82473s, cVar);
        v1Var.f82472r = obj;
        return v1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v1) create((ni1.u0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f82473s.bindDisplayState((ni1.u0) this.f82472r);
        return Unit.f80348a;
    }
}
