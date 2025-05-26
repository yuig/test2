package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class fq1 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gq1 f5240a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq1(gq1 gq1Var) {
        super(1);
        this.f5240a = gq1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(unifiedNativeAdMapper, "unifiedNativeAdMapper");
        gq1 gq1Var = this.f5240a;
        vv2 vv2Var = new vv2(unifiedNativeAdMapper);
        gq1Var.getClass();
        Intrinsics.checkNotNullParameter(vv2Var, "<set-?>");
        gq1Var.f5664c = vv2Var;
        return Unit.f80348a;
    }
}
