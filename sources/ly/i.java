package ly;

import ey.u1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final String f85105c;

    public i(String coexistId) {
        Intrinsics.checkNotNullParameter(coexistId, "coexistId");
        this.f85105c = coexistId;
    }

    @Override // ey.u1
    public final String b() {
        return this.f85105c;
    }

    @Override // ey.u1
    public final String e() {
        return "text_rendered";
    }
}
