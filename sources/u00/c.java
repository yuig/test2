package u00;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.f0;

/* loaded from: classes.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f119824j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f119825k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119826i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f119826i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f0 f0Var = vb0.j.f125466a;
        int i13 = this.f119826i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(th3);
                        f0Var.J(th3, tb0.p.PLATFORM);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(th4);
                        f0Var.J(th4, tb0.p.PLATFORM);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
