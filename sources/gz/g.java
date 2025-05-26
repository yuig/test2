package gz;

import h32.g0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jz.d f66340a;

    /* renamed from: b, reason: collision with root package name */
    public final cz.b f66341b;

    /* renamed from: c, reason: collision with root package name */
    public final om1.e f66342c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f66343d;

    /* renamed from: e, reason: collision with root package name */
    public final List f66344e;

    public g(jz.d question, cz.b bVar, om1.e eVar, g0 g0Var, List list) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.f66340a = question;
        this.f66341b = bVar;
        this.f66342c = eVar;
        this.f66343d = g0Var;
        this.f66344e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f66340a, gVar.f66340a) && Intrinsics.d(this.f66341b, gVar.f66341b) && this.f66342c == gVar.f66342c && this.f66343d == gVar.f66343d && Intrinsics.d(this.f66344e, gVar.f66344e);
    }

    public final int hashCode() {
        int hashCode = this.f66340a.hashCode() * 31;
        cz.b bVar = this.f66341b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        om1.e eVar = this.f66342c;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g0 g0Var = this.f66343d;
        int hashCode4 = (hashCode3 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        List list = this.f66344e;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("QuestionFetched(question=");
        sb3.append(this.f66340a);
        sb3.append(", savedAnswer=");
        sb3.append(this.f66341b);
        sb3.append(", size=");
        sb3.append(this.f66342c);
        sb3.append(", type=");
        sb3.append(this.f66343d);
        sb3.append(", customAnswerIcons=");
        return a.c.j(sb3, this.f66344e, ")");
    }
}
