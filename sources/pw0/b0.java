package pw0;

import com.pinterest.api.model.pu;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101496i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f101497j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, int i13) {
        super(1);
        this.f101496i = i13;
        this.f101497j = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101496i;
        c0 c0Var = this.f101497j;
        switch (i13) {
            case 0:
                pu puVar = (pu) obj;
                Intrinsics.f(puVar);
                c0Var.j2(puVar);
                c0Var.f101508p.invoke(c0Var.d());
                break;
            default:
                Throwable th3 = (Throwable) obj;
                Function1 function1 = c0Var.f101510r;
                Intrinsics.f(th3);
                function1.invoke(th3);
                break;
        }
        return Unit.f80348a;
    }
}
