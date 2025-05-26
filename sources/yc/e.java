package yc;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f138616r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f138617s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f138617s = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f138617s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f138616r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                Function1 function1 = this.f138617s;
                this.f138616r = 1;
                if (function1.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
        } catch (Throwable th3) {
            zc.a.f141580i.invoke(new Exception("An exception occurred while writing to the cache asynchronously", th3));
        }
        return Unit.f80348a;
    }
}
