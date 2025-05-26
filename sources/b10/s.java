package b10;

import com.pinterest.api.model.pe0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.hh;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20930i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pe0 f20931j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hh f20932k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(pe0 pe0Var, hh hhVar, int i13) {
        super(0);
        this.f20930i = i13;
        this.f20931j = pe0Var;
        this.f20932k = hhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        hh hhVar = this.f20932k;
        pe0 pe0Var = this.f20931j;
        int i13 = this.f20930i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        pe0Var.f40961q = hhVar.f132511b;
                        boolean[] zArr = pe0Var.f40963s;
                        if (zArr.length > 16) {
                            zArr[16] = true;
                            break;
                        }
                        break;
                    default:
                        pe0Var.f40951g = hhVar.f132512c;
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
                        pe0Var.f40961q = hhVar.f132511b;
                        boolean[] zArr3 = pe0Var.f40963s;
                        if (zArr3.length > 16) {
                            zArr3[16] = true;
                            break;
                        }
                        break;
                    default:
                        pe0Var.f40951g = hhVar.f132512c;
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
