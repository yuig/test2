package v21;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class b0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f123856a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123857b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123858c;

    /* renamed from: d, reason: collision with root package name */
    public final List f123859d;

    /* renamed from: e, reason: collision with root package name */
    public final List f123860e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f123861f;

    public b0(String experienceId, String title, String subtitle, List imageUrls, List pinIds, l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f123856a = experienceId;
        this.f123857b = title;
        this.f123858c = subtitle;
        this.f123859d = imageUrls;
        this.f123860e = pinIds;
        this.f123861f = pinalyticsVMState;
    }

    public static b0 b(b0 b0Var, String str, String str2, String str3, List list, List list2, l0 l0Var, int i13) {
        if ((i13 & 1) != 0) {
            str = b0Var.f123856a;
        }
        String experienceId = str;
        if ((i13 & 2) != 0) {
            str2 = b0Var.f123857b;
        }
        String title = str2;
        if ((i13 & 4) != 0) {
            str3 = b0Var.f123858c;
        }
        String subtitle = str3;
        if ((i13 & 8) != 0) {
            list = b0Var.f123859d;
        }
        List imageUrls = list;
        if ((i13 & 16) != 0) {
            list2 = b0Var.f123860e;
        }
        List pinIds = list2;
        if ((i13 & 32) != 0) {
            l0Var = b0Var.f123861f;
        }
        l0 pinalyticsVMState = l0Var;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new b0(experienceId, title, subtitle, imageUrls, pinIds, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f123856a, b0Var.f123856a) && Intrinsics.d(this.f123857b, b0Var.f123857b) && Intrinsics.d(this.f123858c, b0Var.f123858c) && Intrinsics.d(this.f123859d, b0Var.f123859d) && Intrinsics.d(this.f123860e, b0Var.f123860e) && Intrinsics.d(this.f123861f, b0Var.f123861f);
    }

    public final int hashCode() {
        return this.f123861f.hashCode() + ep.b.c(this.f123860e, ep.b.c(this.f123859d, cb.d(this.f123858c, cb.d(this.f123857b, this.f123856a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "PinOrSpinRewardPreviewVMState(experienceId=" + this.f123856a + ", title=" + this.f123857b + ", subtitle=" + this.f123858c + ", imageUrls=" + this.f123859d + ", pinIds=" + this.f123860e + ", pinalyticsVMState=" + this.f123861f + ")";
    }
}
