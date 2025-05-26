package kb;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f79004r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f79005s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CoroutineWorker coroutineWorker, bl2.c cVar) {
        super(2, cVar);
        this.f79005s = coroutineWorker;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f79005s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f79004r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f79004r = 1;
            obj = this.f79005s.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
