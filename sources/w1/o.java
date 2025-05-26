package w1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127417i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127418j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13, i2.q1 q1Var) {
        super(1);
        this.f127417i = i13;
        this.f127418j = q1Var;
    }

    public final void b(q3.x layoutCoordinates) {
        int i13 = this.f127417i;
        i2.q1 q1Var = this.f127418j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                q1Var.setValue(new n4.j(layoutCoordinates.j()));
                break;
            case 3:
            case 5:
            default:
                Intrinsics.checkNotNullParameter(layoutCoordinates, "it");
                q1Var.setValue(new n4.j(layoutCoordinates.j()));
                break;
            case 4:
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                a3.d b13 = androidx.compose.ui.layout.b.b(layoutCoordinates);
                long d2 = com.bumptech.glide.c.d(b13.f484a, b13.f485b);
                q1Var.setValue(new n4.h(d7.b.a((int) a3.c.d(d2), (int) a3.c.e(d2))));
                break;
            case 6:
                Intrinsics.checkNotNullParameter(layoutCoordinates, "it");
                a3.d d13 = androidx.compose.ui.layout.b.d(layoutCoordinates);
                float f13 = w80.d0.f128272a;
                q1Var.setValue(d13);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(layoutCoordinates, "it");
                q1Var.setValue(new n4.j(layoutCoordinates.j()));
                break;
        }
    }

    public final long e(n4.b offset) {
        int i13 = this.f127417i;
        i2.q1 q1Var = this.f127418j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                return ((n4.h) q1Var.getValue()).f89180a;
            default:
                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                return d7.b.a((int) a3.c.d(((a3.c) q1Var.getValue()).f482a), (int) a3.c.e(((a3.c) q1Var.getValue()).f482a));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127417i;
        i2.q1 q1Var = this.f127418j;
        switch (i13) {
            case 0:
                a2.f fVar = (a2.f) obj;
                q1Var.setValue(fVar.f424c ? fVar.f423b : fVar.f422a);
                break;
            case 1:
                List list = (List) obj;
                if (q1Var != null) {
                    q1Var.setValue(list);
                }
                break;
            case 2:
                b((q3.x) obj);
                break;
            case 3:
                break;
            case 4:
                b((q3.x) obj);
                break;
            case 5:
                break;
            case 6:
                b((q3.x) obj);
                break;
            case 7:
                b((q3.x) obj);
                break;
            case 8:
                b((q3.x) obj);
                break;
            case 9:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                switch (i13) {
                    case 9:
                        q1Var.setValue(bool);
                        break;
                    default:
                        if (((Boolean) q1Var.getValue()).booleanValue() != booleanValue) {
                            q1Var.setValue(bool);
                            break;
                        }
                        break;
                }
                break;
            case 10:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                switch (i13) {
                    case 9:
                        q1Var.setValue(bool2);
                        break;
                    default:
                        if (((Boolean) q1Var.getValue()).booleanValue() != booleanValue2) {
                            q1Var.setValue(bool2);
                            break;
                        }
                        break;
                }
                break;
            default:
                rn1.i event = (rn1.i) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof rn1.f) {
                    q1Var.setValue(un1.c.y((un1.c) q1Var.getValue(), null, null, 0, null, false, null, null, 0, null, !r2.f122881y, 262143));
                }
                break;
        }
        return Unit.f80348a;
    }
}
