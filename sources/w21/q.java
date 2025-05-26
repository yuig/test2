package w21;

import a.cb;
import com.pinterest.api.model.y40;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements v {

    /* renamed from: a, reason: collision with root package name */
    public final String f127771a;

    /* renamed from: b, reason: collision with root package name */
    public final String f127772b;

    /* renamed from: c, reason: collision with root package name */
    public final String f127773c;

    /* renamed from: d, reason: collision with root package name */
    public final String f127774d;

    /* renamed from: e, reason: collision with root package name */
    public final y40 f127775e;

    /* renamed from: f, reason: collision with root package name */
    public final List f127776f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f127777g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f127778h;

    public q(String experienceId, String title, String revealRewardTitle, String revealRewardSubtitle, y40 y40Var, List questions, Set decisionPool, boolean z13) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(revealRewardTitle, "revealRewardTitle");
        Intrinsics.checkNotNullParameter(revealRewardSubtitle, "revealRewardSubtitle");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(decisionPool, "decisionPool");
        this.f127771a = experienceId;
        this.f127772b = title;
        this.f127773c = revealRewardTitle;
        this.f127774d = revealRewardSubtitle;
        this.f127775e = y40Var;
        this.f127776f = questions;
        this.f127777g = decisionPool;
        this.f127778h = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f127771a, qVar.f127771a) && Intrinsics.d(this.f127772b, qVar.f127772b) && Intrinsics.d(this.f127773c, qVar.f127773c) && Intrinsics.d(this.f127774d, qVar.f127774d) && Intrinsics.d(this.f127775e, qVar.f127775e) && Intrinsics.d(this.f127776f, qVar.f127776f) && Intrinsics.d(this.f127777g, qVar.f127777g) && this.f127778h == qVar.f127778h;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f127774d, cb.d(this.f127773c, cb.d(this.f127772b, this.f127771a.hashCode() * 31, 31), 31), 31);
        y40 y40Var = this.f127775e;
        return Boolean.hashCode(this.f127778h) + ((this.f127777g.hashCode() + ep.b.c(this.f127776f, (d2 + (y40Var == null ? 0 : y40Var.hashCode())) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadInitialState(experienceId=");
        sb3.append(this.f127771a);
        sb3.append(", title=");
        sb3.append(this.f127772b);
        sb3.append(", revealRewardTitle=");
        sb3.append(this.f127773c);
        sb3.append(", revealRewardSubtitle=");
        sb3.append(this.f127774d);
        sb3.append(", pinOrSpin=");
        sb3.append(this.f127775e);
        sb3.append(", questions=");
        sb3.append(this.f127776f);
        sb3.append(", decisionPool=");
        sb3.append(this.f127777g);
        sb3.append(", useServerData=");
        return a.a.r(sb3, this.f127778h, ")");
    }
}
