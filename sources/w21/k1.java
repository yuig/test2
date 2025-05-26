package w21;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f127731a;

    /* renamed from: b, reason: collision with root package name */
    public final String f127732b;

    /* renamed from: c, reason: collision with root package name */
    public final String f127733c;

    /* renamed from: d, reason: collision with root package name */
    public final List f127734d;

    public k1(String title, String revealRewardTitle, String revealRewardSubtitle, List chosenAnswers) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(revealRewardTitle, "revealRewardTitle");
        Intrinsics.checkNotNullParameter(revealRewardSubtitle, "revealRewardSubtitle");
        Intrinsics.checkNotNullParameter(chosenAnswers, "chosenAnswers");
        this.f127731a = title;
        this.f127732b = revealRewardTitle;
        this.f127733c = revealRewardSubtitle;
        this.f127734d = chosenAnswers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.d(this.f127731a, k1Var.f127731a) && Intrinsics.d(this.f127732b, k1Var.f127732b) && Intrinsics.d(this.f127733c, k1Var.f127733c) && Intrinsics.d(this.f127734d, k1Var.f127734d);
    }

    public final int hashCode() {
        return this.f127734d.hashCode() + cb.d(this.f127733c, cb.d(this.f127732b, this.f127731a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MoveToPreview(title=");
        sb3.append(this.f127731a);
        sb3.append(", revealRewardTitle=");
        sb3.append(this.f127732b);
        sb3.append(", revealRewardSubtitle=");
        sb3.append(this.f127733c);
        sb3.append(", chosenAnswers=");
        return a.c.j(sb3, this.f127734d, ")");
    }
}
