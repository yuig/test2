package b10;

import com.pinterest.api.model.e30;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.dg;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20843i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e30 f20844j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ dg f20845k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(e30 e30Var, dg dgVar, int i13) {
        super(0);
        this.f20843i = i13;
        this.f20844j = e30Var;
        this.f20845k = dgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20843i) {
            case 0:
                m49invoke();
                break;
            case 1:
                m49invoke();
                break;
            case 2:
                m49invoke();
                break;
            case 3:
                m49invoke();
                break;
            case 4:
                m49invoke();
                break;
            case 5:
                m49invoke();
                break;
            default:
                m49invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m49invoke() {
        int i13 = this.f20843i;
        e30 e30Var = this.f20844j;
        dg dgVar = this.f20845k;
        switch (i13) {
            case 0:
                e30Var.D = dgVar.f132268s;
                boolean[] zArr = e30Var.f37101h3;
                if (zArr.length > 29) {
                    zArr[29] = true;
                    break;
                }
                break;
            case 1:
                e30Var.i0(dgVar.f132269t);
                break;
            case 2:
                e30Var.f37068b = dgVar.f132251b;
                boolean[] zArr2 = e30Var.f37101h3;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                    break;
                }
                break;
            case 3:
                e30Var.q2(dgVar.f132252c);
                break;
            case 4:
                e30Var.x2(dgVar.f132253d);
                break;
            case 5:
                e30Var.h0(dgVar.f132255f);
                break;
            default:
                e30Var.L2 = dgVar.f132256g;
                boolean[] zArr3 = e30Var.f37101h3;
                if (zArr3.length > 193) {
                    zArr3[193] = true;
                    break;
                }
                break;
        }
    }
}
