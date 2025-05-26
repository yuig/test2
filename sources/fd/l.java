package fd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class l extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f61779r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, bl2.c cVar) {
        super(1, cVar);
        this.f61779r = str;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new l(this.f61779r, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return this.f61779r;
    }
}
