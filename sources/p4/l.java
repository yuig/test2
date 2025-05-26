package p4;

import j1.q0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s3.k0;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f98817j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f98818k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f98819l = new l(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98820i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(2);
        this.f98820i = i13;
    }

    public final void b(k0 k0Var, Function1 function1) {
        switch (this.f98820i) {
            case 0:
                t c13 = androidx.compose.ui.viewinterop.a.c(k0Var);
                c13.A = function1;
                c13.f98799f = new q0(c13, 25);
                break;
            case 1:
                t c14 = androidx.compose.ui.viewinterop.a.c(k0Var);
                c14.f98842z = function1;
                c14.f98797d = new s(c14, 2);
                c14.f98798e = true;
                c14.f98807n.invoke();
                break;
            default:
                t c15 = androidx.compose.ui.viewinterop.a.c(k0Var);
                c15.B = function1;
                c15.f98800g = new s(c15, 1);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f98820i) {
            case 0:
                b((k0) obj, (Function1) obj2);
                break;
            case 1:
                b((k0) obj, (Function1) obj2);
                break;
            default:
                b((k0) obj, (Function1) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
