package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements u {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f124932a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f124933b;

    public l(n1 mode, p1 p1Var) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f124932a = mode;
        this.f124933b = p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f124932a == lVar.f124932a && this.f124933b == lVar.f124933b;
    }

    public final int hashCode() {
        int hashCode = this.f124932a.hashCode() * 31;
        p1 p1Var = this.f124933b;
        return hashCode + (p1Var == null ? 0 : p1Var.hashCode());
    }

    public final String toString() {
        return "MaskEditorModeClicked(mode=" + this.f124932a + ", action=" + this.f124933b + ")";
    }
}
