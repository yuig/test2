package rm2;

import am2.w0;
import am2.x0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 implements w0 {

    /* renamed from: b, reason: collision with root package name */
    public final mm2.r f108732b;

    public g0(mm2.r packageFragment) {
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f108732b = packageFragment;
    }

    @Override // am2.w0
    public final void b() {
        org.chromium.net.y NO_SOURCE_FILE = x0.Tm;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        mm2.r rVar = this.f108732b;
        sb3.append(rVar);
        sb3.append(": ");
        sb3.append(((Map) lb.l0.B0(rVar.f87725i, mm2.r.f87722m[0])).keySet());
        return sb3.toString();
    }
}
