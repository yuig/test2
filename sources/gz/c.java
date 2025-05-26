package gz;

import h32.g0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final jz.d f66332a;

    /* renamed from: b, reason: collision with root package name */
    public final cz.b f66333b;

    /* renamed from: c, reason: collision with root package name */
    public final om1.e f66334c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f66335d;

    /* renamed from: e, reason: collision with root package name */
    public final List f66336e;

    public c(jz.d question, cz.b bVar, om1.e eVar, g0 g0Var, List list) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.f66332a = question;
        this.f66333b = bVar;
        this.f66334c = eVar;
        this.f66335d = g0Var;
        this.f66336e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f66332a, cVar.f66332a) && Intrinsics.d(this.f66333b, cVar.f66333b) && this.f66334c == cVar.f66334c && this.f66335d == cVar.f66335d && Intrinsics.d(this.f66336e, cVar.f66336e);
    }

    public final int hashCode() {
        int hashCode = this.f66332a.hashCode() * 31;
        cz.b bVar = this.f66333b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        om1.e eVar = this.f66334c;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g0 g0Var = this.f66335d;
        int hashCode4 = (hashCode3 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        List list = this.f66336e;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Loaded(question=");
        sb3.append(this.f66332a);
        sb3.append(", savedAnswer=");
        sb3.append(this.f66333b);
        sb3.append(", size=");
        sb3.append(this.f66334c);
        sb3.append(", type=");
        sb3.append(this.f66335d);
        sb3.append(", customAnswerIcons=");
        return a.c.j(sb3, this.f66336e, ")");
    }
}
