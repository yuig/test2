package b10;

import com.pinterest.api.model.dn;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.og;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20918i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ dn f20919j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ og f20920k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(dn dnVar, og ogVar, int i13) {
        super(0);
        this.f20918i = i13;
        this.f20919j = dnVar;
        this.f20920k = ogVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        og ogVar = this.f20920k;
        dn dnVar = this.f20919j;
        int i13 = this.f20918i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        dnVar.e(ogVar.f132994b);
                        break;
                    default:
                        dnVar.d(ogVar.f132995c);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        dnVar.e(ogVar.f132994b);
                        break;
                    default:
                        dnVar.d(ogVar.f132995c);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
