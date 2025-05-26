package eb1;

import ao2.j0;
import com.pinterest.feature.settings.notifications.f0;
import dl2.j;
import do2.f2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f58226r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f58227s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ tt1.a f58228t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f0 f0Var, tt1.a aVar, bl2.c cVar) {
        super(2, cVar);
        this.f58227s = f0Var;
        this.f58228t = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f58227s, this.f58228t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f58226r;
        if (i13 == 0) {
            ue.c.H(obj);
            f2 f2Var = e.f58234c;
            Pair pair = new Pair(this.f58227s.f48186a, this.f58228t.c());
            this.f58226r = 1;
            if (f2Var.emit(pair, this) == aVar) {
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
