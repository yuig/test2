package b10;

import com.pinterest.api.model.h60;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.ni;

/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20867i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h60 f20868j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ni f20869k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(h60 h60Var, ni niVar, int i13) {
        super(0);
        this.f20867i = i13;
        this.f20868j = h60Var;
        this.f20869k = niVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20867i) {
            case 0:
                m52invoke();
                break;
            case 1:
                m52invoke();
                break;
            case 2:
                m52invoke();
                break;
            case 3:
                m52invoke();
                break;
            case 4:
                m52invoke();
                break;
            case 5:
                m52invoke();
                break;
            case 6:
                m52invoke();
                break;
            case 7:
                m52invoke();
                break;
            case 8:
                m52invoke();
                break;
            default:
                m52invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m52invoke() {
        int i13 = this.f20867i;
        h60 h60Var = this.f20868j;
        ni niVar = this.f20869k;
        switch (i13) {
            case 0:
                h60Var.f38311p = niVar.f132911k;
                boolean[] zArr = h60Var.f38319x;
                if (zArr.length > 15) {
                    zArr[15] = true;
                    break;
                }
                break;
            case 1:
                h60Var.f38297b = niVar.f132902b;
                boolean[] zArr2 = h60Var.f38319x;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                    break;
                }
                break;
            case 2:
                h60Var.f38296a = niVar.f132903c;
                boolean[] zArr3 = h60Var.f38319x;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                    break;
                }
                break;
            case 3:
                h60Var.f38301f = niVar.f132904d;
                boolean[] zArr4 = h60Var.f38319x;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                    break;
                }
                break;
            case 4:
                h60Var.f38310o = niVar.f132905e;
                boolean[] zArr5 = h60Var.f38319x;
                if (zArr5.length > 14) {
                    zArr5[14] = true;
                    break;
                }
                break;
            case 5:
                h60Var.f38300e = niVar.f132906f;
                boolean[] zArr6 = h60Var.f38319x;
                if (zArr6.length > 4) {
                    zArr6[4] = true;
                    break;
                }
                break;
            case 6:
                h60Var.f38317v = niVar.f132907g;
                boolean[] zArr7 = h60Var.f38319x;
                if (zArr7.length > 21) {
                    zArr7[21] = true;
                    break;
                }
                break;
            case 7:
                h60Var.f38305j = niVar.f132908h;
                boolean[] zArr8 = h60Var.f38319x;
                if (zArr8.length > 9) {
                    zArr8[9] = true;
                    break;
                }
                break;
            case 8:
                h60Var.f38307l = niVar.f132909i;
                boolean[] zArr9 = h60Var.f38319x;
                if (zArr9.length > 11) {
                    zArr9[11] = true;
                    break;
                }
                break;
            default:
                h60Var.f38306k = niVar.f132910j;
                boolean[] zArr10 = h60Var.f38319x;
                if (zArr10.length > 10) {
                    zArr10[10] = true;
                    break;
                }
                break;
        }
    }
}
