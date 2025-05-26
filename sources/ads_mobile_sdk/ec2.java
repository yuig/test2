package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.NativeAdMapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class ec2 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic2 f4810a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec2(ic2 ic2Var) {
        super(1);
        this.f4810a = ic2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        ic2 ic2Var = this.f4810a;
        hg1 hg1Var = new hg1(nativeAdMapper);
        ic2Var.getClass();
        Intrinsics.checkNotNullParameter(hg1Var, "<set-?>");
        ic2Var.f6318d = hg1Var;
        return Unit.f80348a;
    }
}
