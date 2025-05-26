package e82;

import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57827i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f57828j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f57829k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HashMap f57830l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, w wVar, HashMap hashMap, int i13) {
        super(1);
        this.f57827i = i13;
        this.f57828j = fVar;
        this.f57829k = wVar;
        this.f57830l = hashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HashMap hashMap = this.f57830l;
        int i13 = this.f57827i;
        w wVar = this.f57829k;
        f fVar = this.f57828j;
        switch (i13) {
            case 0:
                fVar.getClass();
                f1 f1Var = c.f57821a[wVar.ordinal()] == 1 ? f1.INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_SUCCESS : null;
                if (f1Var != null) {
                    fVar.f57833c.g(f1Var, null, hashMap, false);
                }
                break;
            default:
                fVar.getClass();
                f1 f1Var2 = c.f57821a[wVar.ordinal()] == 1 ? f1.INSTAGRAM_ACCT_CLAIMING_AUTOPUBLISH_FAILURE : null;
                if (f1Var2 != null) {
                    fVar.f57833c.g(f1Var2, null, hashMap, false);
                }
                break;
        }
        return Unit.f80348a;
    }
}
