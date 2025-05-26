package q1;

import i2.v3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101948i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v3 f101949j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(v3 v3Var, int i13) {
        super(0);
        this.f101948i = i13;
        this.f101949j = v3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j13;
        long j14;
        int i13 = this.f101948i;
        v3 v3Var = this.f101949j;
        switch (i13) {
            case 0:
                return new i((Function1) v3Var.getValue());
            case 1:
                return new r1.l((Function1) v3Var.getValue());
            case 2:
                return (androidx.compose.foundation.lazy.layout.y) ((Function0) v3Var.getValue()).invoke();
            case 3:
                Boolean bool = (Boolean) v3Var.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                switch (i13) {
                    case 4:
                        j13 = ((a3.c) v3Var.getValue()).f482a;
                        break;
                    default:
                        j1.q qVar = b2.i0.f21164a;
                        j13 = ((a3.c) v3Var.getValue()).f482a;
                        break;
                }
                return new a3.c(j13);
            case 5:
                switch (i13) {
                    case 4:
                        j14 = ((a3.c) v3Var.getValue()).f482a;
                        break;
                    default:
                        j1.q qVar2 = b2.i0.f21164a;
                        j14 = ((a3.c) v3Var.getValue()).f482a;
                        break;
                }
                return new a3.c(j14);
            case 6:
                return (e2.i) v3Var.getValue();
            default:
                List list = (List) v3Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.d(((z9.k) obj).f141211b.f141322a, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }
}
