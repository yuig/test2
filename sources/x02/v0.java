package x02;

import com.pinterest.api.model.e30;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.i3;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final v0 f131505j = new v0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v0 f131506k = new v0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final v0 f131507l = new v0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131508i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i13) {
        super(1);
        this.f131508i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i3 i3Var;
        switch (this.f131508i) {
            case 0:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "pair");
                return (String) pair.f80346a;
            case 1:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                e30 R6 = pin.R6();
                f3 z33 = pin.z3();
                if (z33 != null) {
                    i3Var = z33.P();
                } else {
                    i3Var = new i3(0);
                    i3Var.f38611a = UUID.randomUUID().toString();
                    boolean[] zArr = i3Var.f38629s;
                    if (zArr.length > 0) {
                        zArr[0] = true;
                    }
                }
                Integer num = i3Var.f38616f;
                if (num == null) {
                    num = 0;
                }
                i3Var.f38616f = Integer.valueOf(Math.max(num.intValue() - 1, 0));
                boolean[] zArr2 = i3Var.f38629s;
                if (zArr2.length > 5) {
                    zArr2[5] = true;
                }
                R6.h(i3Var.a());
                return R6.a();
            default:
                return Unit.f80348a;
        }
    }
}
