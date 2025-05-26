package i41;

import com.pinterest.api.model.vz0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import h41.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import y31.q;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71512i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f71513j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(1);
        this.f71512i = i13;
        this.f71513j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f71512i;
        d dVar = this.f71513j;
        switch (i13) {
            case 0:
                vz0 verifiedMerchant = (vz0) obj;
                dVar.f71535r = verifiedMerchant;
                e eVar = (e) dVar.getView();
                Intrinsics.f(verifiedMerchant);
                LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) eVar;
                legoUserProfileHeader.getClass();
                Intrinsics.checkNotNullParameter(verifiedMerchant, "verifiedMerchant");
                ((q) legoUserProfileHeader.Z()).d(legoUserProfileHeader.A, verifiedMerchant);
                break;
            default:
                wy0 wy0Var = (wy0) obj;
                String uid = wy0Var.getUid();
                wy0 wy0Var2 = dVar.f71533p;
                if (Intrinsics.d(uid, wy0Var2 != null ? wy0Var2.getUid() : null)) {
                    dVar.u3(wy0Var);
                }
                break;
        }
        return Unit.f80348a;
    }
}
