package b10;

import com.pinterest.api.model.e30;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.mh;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20939i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e30 f20940j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ mh f20941k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(e30 e30Var, mh mhVar, int i13) {
        super(0);
        this.f20939i = i13;
        this.f20940j = e30Var;
        this.f20941k = mhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20939i) {
            case 0:
                m67invoke();
                break;
            case 1:
                m67invoke();
                break;
            case 2:
                m67invoke();
                break;
            case 3:
                m67invoke();
                break;
            case 4:
                m67invoke();
                break;
            default:
                m67invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m67invoke() {
        int i13 = this.f20939i;
        e30 e30Var = this.f20940j;
        mh mhVar = this.f20941k;
        switch (i13) {
            case 0:
                e30Var.i0(mhVar.f132843n);
                break;
            case 1:
                e30Var.D = mhVar.f132844o;
                boolean[] zArr = e30Var.f37101h3;
                if (zArr.length > 29) {
                    zArr[29] = true;
                    break;
                }
                break;
            case 2:
                e30Var.f37068b = mhVar.f132831b;
                boolean[] zArr2 = e30Var.f37101h3;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                    break;
                }
                break;
            case 3:
                e30Var.q2(mhVar.f132832c);
                break;
            case 4:
                e30Var.x2(mhVar.f132833d);
                break;
            default:
                e30Var.L2 = mhVar.f132837h;
                boolean[] zArr3 = e30Var.f37101h3;
                if (zArr3.length > 193) {
                    zArr3[193] = true;
                    break;
                }
                break;
        }
    }
}
