package xx1;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ni1.u0;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f136132r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f136133s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SbaPinRep sbaPinRep, bl2.c cVar) {
        super(2, cVar);
        this.f136133s = sbaPinRep;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f136133s, cVar);
        cVar2.f136132r = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((u0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f136133s.bindDisplayState((u0) this.f136132r);
        return Unit.f80348a;
    }
}
