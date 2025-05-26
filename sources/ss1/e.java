package ss1;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f115144r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f115145s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f115144r = fVar;
        this.f115145s = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f115144r, this.f115145s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ts1.b bVar = this.f115144r.f115146a;
        if (bVar == null) {
            throw new IllegalStateException("Don't call this after the activity is finished! Check for memory leak.".toString());
        }
        this.f115145s.invoke(bVar);
        return Unit.f80348a;
    }
}
