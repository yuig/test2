package b10;

import com.pinterest.api.model.re;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.e3;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20870i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ re f20871j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e3 f20872k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(re reVar, e3 e3Var, int i13) {
        super(0);
        this.f20870i = i13;
        this.f20871j = reVar;
        this.f20872k = e3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20870i) {
            case 0:
                m53invoke();
                break;
            case 1:
                m53invoke();
                break;
            case 2:
                m53invoke();
                break;
            case 3:
                m53invoke();
                break;
            default:
                m53invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m53invoke() {
        int i13 = this.f20870i;
        re reVar = this.f20871j;
        e3 e3Var = this.f20872k;
        switch (i13) {
            case 0:
                reVar.f41558b = e3Var.f132301b;
                boolean[] zArr = reVar.f41573q;
                if (zArr.length > 1) {
                    zArr[1] = true;
                    break;
                }
                break;
            case 1:
                reVar.f41557a = e3Var.f132302c;
                boolean[] zArr2 = reVar.f41573q;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                    break;
                }
                break;
            case 2:
                reVar.f41570n = e3Var.f132304e;
                boolean[] zArr3 = reVar.f41573q;
                if (zArr3.length > 13) {
                    zArr3[13] = true;
                    break;
                }
                break;
            case 3:
                reVar.f41563g = e3Var.f132305f;
                boolean[] zArr4 = reVar.f41573q;
                if (zArr4.length > 6) {
                    zArr4[6] = true;
                    break;
                }
                break;
            default:
                reVar.f41566j = e3Var.f132306g;
                boolean[] zArr5 = reVar.f41573q;
                if (zArr5.length > 9) {
                    zArr5[9] = true;
                    break;
                }
                break;
        }
    }
}
