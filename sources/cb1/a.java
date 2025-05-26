package cb1;

import ao2.j0;
import com.pinterest.feature.settings.notifications.d0;
import dl2.j;
import do2.f2;
import eb1.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27263r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f27264s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f27264s = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f27264s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        f2 f2Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f27263r;
        if (i13 == 0) {
            ue.c.H(obj);
            switch (b.f27265a.f90075a) {
                case 25:
                    f2Var = b.f27266b;
                    break;
                case 26:
                    f2Var = eb1.e.f58234c;
                    break;
                default:
                    f2Var = h.f58244c;
                    break;
            }
            String str = this.f27264s.f48175a;
            this.f27263r = 1;
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
