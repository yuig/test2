package a6;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class e extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f816r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ nb0.a f817s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nb0.a aVar, bl2.c cVar) {
        super(1, cVar);
        this.f817s = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new e(this.f817s, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f816r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f816r = 1;
            this.f817s.getClass();
            if (Unit.f80348a == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
