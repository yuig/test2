package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.NativeAdMapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class q91 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u91 f9992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q91(u91 u91Var) {
        super(1);
        this.f9992a = u91Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        u91 u91Var = this.f9992a;
        hg1 hg1Var = new hg1(nativeAdMapper);
        u91Var.getClass();
        Intrinsics.checkNotNullParameter(hg1Var, "<set-?>");
        u91Var.f11892c = hg1Var;
        return Unit.f80348a;
    }
}
