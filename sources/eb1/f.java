package eb1;

import ao2.j0;
import com.pinterest.feature.settings.notifications.h0;
import dl2.j;
import do2.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f58236r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f58237s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h0 h0Var, bl2.c cVar) {
        super(2, cVar);
        this.f58237s = h0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f58237s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f58236r;
        if (i13 == 0) {
            ue.c.H(obj);
            f2 f2Var = h.f58244c;
            String str = this.f58237s.f48199a;
            this.f58236r = 1;
            if (f2Var.emit(str, this) == aVar) {
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
