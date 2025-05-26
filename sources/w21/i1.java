package w21;

import a.cb;
import com.pinterest.api.model.y40;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f127708a;

    /* renamed from: b, reason: collision with root package name */
    public final String f127709b;

    /* renamed from: c, reason: collision with root package name */
    public final String f127710c;

    /* renamed from: d, reason: collision with root package name */
    public final String f127711d;

    /* renamed from: e, reason: collision with root package name */
    public final List f127712e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f127713f;

    /* renamed from: g, reason: collision with root package name */
    public final y40 f127714g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f127715h;

    /* renamed from: i, reason: collision with root package name */
    public final String f127716i;

    public i1(String title, String experienceId, String revealRewardTitle, String revealRewardSubtitle, List questions, Set decisionPool, y40 y40Var, boolean z13, String errorMsg) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(revealRewardTitle, "revealRewardTitle");
        Intrinsics.checkNotNullParameter(revealRewardSubtitle, "revealRewardSubtitle");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(decisionPool, "decisionPool");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.f127708a = title;
        this.f127709b = experienceId;
        this.f127710c = revealRewardTitle;
        this.f127711d = revealRewardSubtitle;
        this.f127712e = questions;
        this.f127713f = decisionPool;
        this.f127714g = y40Var;
        this.f127715h = z13;
        this.f127716i = errorMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.d(this.f127708a, i1Var.f127708a) && Intrinsics.d(this.f127709b, i1Var.f127709b) && Intrinsics.d(this.f127710c, i1Var.f127710c) && Intrinsics.d(this.f127711d, i1Var.f127711d) && Intrinsics.d(this.f127712e, i1Var.f127712e) && Intrinsics.d(this.f127713f, i1Var.f127713f) && Intrinsics.d(this.f127714g, i1Var.f127714g) && this.f127715h == i1Var.f127715h && Intrinsics.d(this.f127716i, i1Var.f127716i);
    }

    public final int hashCode() {
        int hashCode = (this.f127713f.hashCode() + ep.b.c(this.f127712e, cb.d(this.f127711d, cb.d(this.f127710c, cb.d(this.f127709b, this.f127708a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        y40 y40Var = this.f127714g;
        return this.f127716i.hashCode() + ep.b.e(this.f127715h, (hashCode + (y40Var == null ? 0 : y40Var.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Initialize(title=");
        sb3.append(this.f127708a);
        sb3.append(", experienceId=");
        sb3.append(this.f127709b);
        sb3.append(", revealRewardTitle=");
        sb3.append(this.f127710c);
        sb3.append(", revealRewardSubtitle=");
        sb3.append(this.f127711d);
        sb3.append(", questions=");
        sb3.append(this.f127712e);
        sb3.append(", decisionPool=");
        sb3.append(this.f127713f);
        sb3.append(", pinOrSpin=");
        sb3.append(this.f127714g);
        sb3.append(", reuseData=");
        sb3.append(this.f127715h);
        sb3.append(", errorMsg=");
        return a.a.p(sb3, this.f127716i, ")");
    }
}
