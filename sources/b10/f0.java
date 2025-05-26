package b10;

import com.pinterest.api.model.pe0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.yf;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20881i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pe0 f20882j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ yf f20883k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(pe0 pe0Var, yf yfVar, int i13) {
        super(0);
        this.f20881i = i13;
        this.f20882j = pe0Var;
        this.f20883k = yfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yf yfVar = this.f20883k;
        pe0 pe0Var = this.f20882j;
        int i13 = this.f20881i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        pe0Var.f40961q = yfVar.f133750b;
                        boolean[] zArr = pe0Var.f40963s;
                        if (zArr.length > 16) {
                            zArr[16] = true;
                            break;
                        }
                        break;
                    default:
                        pe0Var.f40951g = yfVar.f133751c;
                        boolean[] zArr2 = pe0Var.f40963s;
                        if (zArr2.length > 6) {
                            zArr2[6] = true;
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        pe0Var.f40961q = yfVar.f133750b;
                        boolean[] zArr3 = pe0Var.f40963s;
                        if (zArr3.length > 16) {
                            zArr3[16] = true;
                            break;
                        }
                        break;
                    default:
                        pe0Var.f40951g = yfVar.f133751c;
                        boolean[] zArr4 = pe0Var.f40963s;
                        if (zArr4.length > 6) {
                            zArr4[6] = true;
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
