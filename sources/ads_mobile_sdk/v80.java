package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class v80 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80 f12394a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(y80 y80Var) {
        super(0);
        this.f12394a = y80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.f12394a.f14136f.hasSystemFeature("com.google.android.feature.services_updater") && this.f12394a.f14136f.hasSystemFeature("cn.google.services"));
    }
}
