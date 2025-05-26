package t90;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class p implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f116817a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f116818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f116819c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f116820d;

    public p(rm1.q icon, i0 label, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f116817a = icon;
        this.f116818b = label;
        this.f116819c = i13;
        this.f116820d = z13;
    }

    public static p e(p pVar, boolean z13) {
        rm1.q icon = pVar.f116817a;
        i0 label = pVar.f116818b;
        int i13 = pVar.f116819c;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        return new p(icon, label, i13, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f116817a == pVar.f116817a && Intrinsics.d(this.f116818b, pVar.f116818b) && this.f116819c == pVar.f116819c && this.f116820d == pVar.f116820d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116820d) + ep.b.b(this.f116819c, ep.b.d(this.f116818b, this.f116817a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CutoutEditorActionState(icon=" + this.f116817a + ", label=" + this.f116818b + ", id=" + this.f116819c + ", selected=" + this.f116820d + ")";
    }
}
