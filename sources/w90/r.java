package w90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f128575r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f128576s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, x xVar, bl2.c cVar) {
        super(2, cVar);
        this.f128575r = sVar;
        this.f128576s = xVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r(this.f128575r, this.f128576s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        boolean z13 = this.f128576s.f128582a;
        s sVar = this.f128575r;
        if (z13) {
            sVar.f128577a.i("collage_has_navigated_to_composer", true);
        } else {
            sVar.getClass();
        }
        return Unit.f80348a;
    }
}
