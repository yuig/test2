package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111800i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w80.h1 f111801j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(w80.h1 h1Var, int i13) {
        super(1);
        this.f111800i = i13;
        this.f111801j = h1Var;
    }

    public final void b(q3.x it) {
        int i13 = this.f111800i;
        w80.h1 h1Var = this.f111801j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                a3.d c13 = androidx.compose.ui.layout.b.c(it);
                h1Var.getClass();
                Intrinsics.checkNotNullParameter(c13, "<set-?>");
                h1Var.f128303d.setValue(c13);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                a3.d c14 = androidx.compose.ui.layout.b.c(it);
                h1Var.getClass();
                Intrinsics.checkNotNullParameter(c14, "<set-?>");
                h1Var.f128301b.setValue(c14);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                a3.d c15 = androidx.compose.ui.layout.b.c(it);
                h1Var.getClass();
                Intrinsics.checkNotNullParameter(c15, "<set-?>");
                h1Var.f128302c.setValue(c15);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                a3.d c16 = androidx.compose.ui.layout.b.c(it);
                h1Var.getClass();
                Intrinsics.checkNotNullParameter(c16, "<set-?>");
                h1Var.f128300a.setValue(c16);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                a3.d c17 = androidx.compose.ui.layout.b.c(it);
                h1Var.getClass();
                Intrinsics.checkNotNullParameter(c17, "<set-?>");
                h1Var.f128303d.setValue(c17);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                a3.d c18 = androidx.compose.ui.layout.b.c(it);
                h1Var.getClass();
                Intrinsics.checkNotNullParameter(c18, "<set-?>");
                h1Var.f128301b.setValue(c18);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                a3.d c19 = androidx.compose.ui.layout.b.c(it);
                h1Var.getClass();
                Intrinsics.checkNotNullParameter(c19, "<set-?>");
                h1Var.f128302c.setValue(c19);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f111800i) {
            case 0:
                b((q3.x) obj);
                return Unit.f80348a;
            case 1:
                b((q3.x) obj);
                return Unit.f80348a;
            case 2:
                b((q3.x) obj);
                return Unit.f80348a;
            case 3:
                b((q3.x) obj);
                return Unit.f80348a;
            case 4:
                b((q3.x) obj);
                return Unit.f80348a;
            case 5:
                b((q3.x) obj);
                return Unit.f80348a;
            case 6:
                b((q3.x) obj);
                return Unit.f80348a;
            default:
                n4.b offset = (n4.b) obj;
                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                return new n4.h(d7.b.a(0, (int) ((a3.d) this.f111801j.f128302c.getValue()).f485b));
        }
    }
}
