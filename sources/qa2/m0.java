package qa2;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f103318r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f103319s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(SbaPinRep sbaPinRep, bl2.c cVar) {
        super(2, cVar);
        this.f103319s = sbaPinRep;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m0 m0Var = new m0(this.f103319s, cVar);
        m0Var.f103318r = obj;
        return m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ni1.u0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f103319s.bindDisplayState((ni1.u0) this.f103318r);
        return Unit.f80348a;
    }
}
