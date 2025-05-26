package kb2;

import bl2.c;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ni1.u0;
import ti1.f;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79098r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f79099s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, c cVar) {
        super(2, cVar);
        this.f79099s = fVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        a aVar = new a(this.f79099s, cVar);
        aVar.f79098r = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((u0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f79099s.bindDisplayState((u0) this.f79098r);
        return Unit.f80348a;
    }
}
