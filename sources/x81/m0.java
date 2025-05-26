package x81;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134254i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f134255j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(o0 o0Var, int i13) {
        super(0);
        this.f134254i = i13;
        this.f134255j = o0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f134254i) {
            case 0:
                m283invoke();
                break;
            case 1:
                m283invoke();
                break;
            default:
                m283invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m283invoke() {
        int i13 = this.f134254i;
        o0 o0Var = this.f134255j;
        switch (i13) {
            case 0:
                o0Var.a4(i0.TRY_ON);
                break;
            case 1:
                o0Var.a4(i0.TRY_ON);
                f30 f30Var = o0Var.f134283s;
                if (f30Var != null) {
                    o0Var.I3(f30Var, null);
                    break;
                }
                break;
            default:
                o0Var.U3();
                break;
        }
    }
}
