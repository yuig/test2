package bt0;

import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23866r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f23867s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f23867s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f23867s, cVar);
        eVar.f23866r = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        int i13 = ((b) this.f23866r).f23861b;
        j jVar = this.f23867s;
        LegoEmptyStateView a13 = ht0.u.a(jVar, i13);
        int i14 = j.K0;
        jVar.O8(a13, 49);
        return Unit.f80348a;
    }
}
