package dv0;

import com.pinterest.api.model.ln0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f56337j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, int i13) {
        super(0);
        this.f56336i = i13;
        this.f56337j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        k kVar = this.f56337j;
        int i13 = this.f56336i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        kVar.u3();
                        break;
                    default:
                        ln0 ln0Var = kVar.f56361t;
                        if (ln0Var != null) {
                            kVar.D3(ln0Var);
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        kVar.u3();
                        break;
                    default:
                        ln0 ln0Var2 = kVar.f56361t;
                        if (ln0Var2 != null) {
                            kVar.D3(ln0Var2);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
