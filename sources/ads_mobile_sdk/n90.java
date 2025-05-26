package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n90 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8725a;

    public n90(int i13) {
        this.f8725a = i13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.displayCount = Integer.valueOf(this.f8725a);
    }
}
