package a;

import ads_mobile_sdk.oh0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a7 extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(oh0 oh0Var, int i13) {
        super(0, oh0Var, oh0.class, "attributionReportingEnabled", "attributionReportingEnabled()Z", 0);
        this.f11a = i13;
        if (i13 != 1) {
        } else {
            super(0, oh0Var, oh0.class, "topicsSignalEnabled", "topicsSignalEnabled()Z", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11a) {
            case 0:
                Boolean bool = (Boolean) ((oh0) this.receiver).a("gads:attribution_reporting:enabled", Boolean.FALSE, oh0.f9281e);
                bool.getClass();
                return bool;
            default:
                Boolean bool2 = (Boolean) ((oh0) this.receiver).a("gads:topics_signal:enabled", Boolean.FALSE, oh0.f9281e);
                bool2.getClass();
                return bool2;
        }
    }
}
