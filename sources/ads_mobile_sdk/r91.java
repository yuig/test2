package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class r91 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u91 f10555a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r91(u91 u91Var) {
        super(1);
        this.f10555a = u91Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(unifiedNativeAdMapper, "unifiedNativeAdMapper");
        u91 u91Var = this.f10555a;
        vv2 vv2Var = new vv2(unifiedNativeAdMapper);
        u91Var.getClass();
        Intrinsics.checkNotNullParameter(vv2Var, "<set-?>");
        u91Var.f11892c = vv2Var;
        return Unit.f80348a;
    }
}
