package c2;

import androidx.compose.material.AnchoredDragFinishedSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f24715r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function2 f24716s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f24717t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f24718u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function2 function2, Object obj, ao2.j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f24716s = function2;
        this.f24717t = obj;
        this.f24718u = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f24716s, this.f24717t, this.f24718u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f24715r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f24715r = 1;
            if (this.f24716s.invoke(this.f24717t, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        dl2.b.E(this.f24718u, new AnchoredDragFinishedSignal());
        return Unit.f80348a;
    }
}
