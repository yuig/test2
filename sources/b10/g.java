package b10;

import com.pinterest.api.model.dn;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.hf;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20884i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ dn f20885j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hf f20886k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(dn dnVar, hf hfVar, int i13) {
        super(0);
        this.f20884i = i13;
        this.f20885j = dnVar;
        this.f20886k = hfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        hf hfVar = this.f20886k;
        dn dnVar = this.f20885j;
        int i13 = this.f20884i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        dnVar.e(hfVar.f132506b);
                        break;
                    default:
                        dnVar.d(hfVar.f132507c);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        dnVar.e(hfVar.f132506b);
                        break;
                    default:
                        dnVar.d(hfVar.f132507c);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
