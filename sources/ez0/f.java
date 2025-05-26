package ez0;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ni1.u0;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f60672r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SbaPinRep f60673s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SbaPinRep sbaPinRep, bl2.c cVar) {
        super(2, cVar);
        this.f60673s = sbaPinRep;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f60673s, cVar);
        fVar.f60672r = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((u0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f60673s.bindDisplayState((u0) this.f60672r);
        return Unit.f80348a;
    }
}
