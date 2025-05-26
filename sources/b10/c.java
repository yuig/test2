package b10;

import com.pinterest.api.model.y20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.mi;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20858i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y20 f20859j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ mi f20860k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(y20 y20Var, mi miVar, int i13) {
        super(0);
        this.f20858i = i13;
        this.f20859j = y20Var;
        this.f20860k = miVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mi miVar = this.f20860k;
        y20 y20Var = this.f20859j;
        int i13 = this.f20858i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        y20Var.f43906c = miVar.f132854b;
                        boolean[] zArr = y20Var.f43908e;
                        if (zArr.length > 2) {
                            zArr[2] = true;
                            break;
                        }
                        break;
                    default:
                        y20Var.f43907d = miVar.f132855c;
                        boolean[] zArr2 = y20Var.f43908e;
                        if (zArr2.length > 3) {
                            zArr2[3] = true;
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        y20Var.f43906c = miVar.f132854b;
                        boolean[] zArr3 = y20Var.f43908e;
                        if (zArr3.length > 2) {
                            zArr3[2] = true;
                            break;
                        }
                        break;
                    default:
                        y20Var.f43907d = miVar.f132855c;
                        boolean[] zArr4 = y20Var.f43908e;
                        if (zArr4.length > 3) {
                            zArr4[3] = true;
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
