package yv;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f140165r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ bj.f f140166s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f140167t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, bj.f fVar2, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f140165r = fVar;
        this.f140166s = fVar2;
        this.f140167t = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f140165r, this.f140166s, this.f140167t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        h hVar = (h) this.f140165r.getViewIfBound();
        if (hVar != null) {
            hVar.x0(this.f140166s);
        }
        return Unit.f80348a;
    }
}
