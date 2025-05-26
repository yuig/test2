package b10;

import com.pinterest.api.model.s10;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.oi;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20840i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s10 f20841j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ oi f20842k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(s10 s10Var, oi oiVar, int i13) {
        super(0);
        this.f20840i = i13;
        this.f20841j = s10Var;
        this.f20842k = oiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20840i) {
            case 0:
                m48invoke();
                break;
            case 1:
                m48invoke();
                break;
            case 2:
                m48invoke();
                break;
            case 3:
                m48invoke();
                break;
            case 4:
                m48invoke();
                break;
            case 5:
                m48invoke();
                break;
            default:
                m48invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m48invoke() {
        int i13 = this.f20840i;
        s10 s10Var = this.f20841j;
        oi oiVar = this.f20842k;
        switch (i13) {
            case 0:
                s10Var.f41757b = oiVar.f133001b;
                boolean[] zArr = s10Var.f41771p;
                if (zArr.length > 1) {
                    zArr[1] = true;
                    break;
                }
                break;
            case 1:
                s10Var.f41767l = oiVar.f133002c;
                boolean[] zArr2 = s10Var.f41771p;
                if (zArr2.length > 11) {
                    zArr2[11] = true;
                    break;
                }
                break;
            case 2:
                s10Var.f41756a = oiVar.f133003d;
                boolean[] zArr3 = s10Var.f41771p;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                    break;
                }
                break;
            case 3:
                s10Var.f41761f = oiVar.f133004e;
                boolean[] zArr4 = s10Var.f41771p;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                    break;
                }
                break;
            case 4:
                s10Var.e(oiVar.f133005f);
                break;
            case 5:
                s10Var.c(oiVar.f133006g);
                break;
            default:
                s10Var.f41766k = oiVar.f133008i;
                boolean[] zArr5 = s10Var.f41771p;
                if (zArr5.length > 10) {
                    zArr5[10] = true;
                    break;
                }
                break;
        }
    }
}
