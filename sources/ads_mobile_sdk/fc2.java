package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class fc2 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic2 f5103a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc2(ic2 ic2Var) {
        super(1);
        this.f5103a = ic2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(unifiedNativeAdMapper, "unifiedNativeAdMapper");
        ic2 ic2Var = this.f5103a;
        vv2 vv2Var = new vv2(unifiedNativeAdMapper);
        ic2Var.getClass();
        Intrinsics.checkNotNullParameter(vv2Var, "<set-?>");
        ic2Var.f6318d = vv2Var;
        return Unit.f80348a;
    }
}
