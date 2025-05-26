package u21;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120076a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120077b;

    /* renamed from: c, reason: collision with root package name */
    public final List f120078c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f120079d;

    public c0(String experienceId, String title, List imageUrls, l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f120076a = experienceId;
        this.f120077b = title;
        this.f120078c = imageUrls;
        this.f120079d = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f120076a, c0Var.f120076a) && Intrinsics.d(this.f120077b, c0Var.f120077b) && Intrinsics.d(this.f120078c, c0Var.f120078c) && Intrinsics.d(this.f120079d, c0Var.f120079d);
    }

    public final int hashCode() {
        return this.f120079d.hashCode() + ep.b.c(this.f120078c, cb.d(this.f120077b, this.f120076a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PinOrSpinRewardVMState(experienceId=" + this.f120076a + ", title=" + this.f120077b + ", imageUrls=" + this.f120078c + ", pinalyticsVMState=" + this.f120079d + ")";
    }
}
