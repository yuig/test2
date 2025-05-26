package on1;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class k implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final b f96740a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f96741b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f96742c;

    /* renamed from: d, reason: collision with root package name */
    public final fm1.c f96743d;

    /* renamed from: e, reason: collision with root package name */
    public final n f96744e;

    /* renamed from: f, reason: collision with root package name */
    public final l f96745f;

    /* renamed from: g, reason: collision with root package name */
    public final int f96746g;

    public k(b bVar, i0 label, i0 i0Var, fm1.c visibility, n textAlignment, l labelPosition, int i13) {
        Intrinsics.checkNotNullParameter(bVar, "switch");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        this.f96740a = bVar;
        this.f96741b = label;
        this.f96742c = i0Var;
        this.f96743d = visibility;
        this.f96744e = textAlignment;
        this.f96745f = labelPosition;
        this.f96746g = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [u50.i0] */
    public static k e(k kVar, b bVar, f0 f0Var, fm1.c cVar, int i13) {
        if ((i13 & 1) != 0) {
            bVar = kVar.f96740a;
        }
        b bVar2 = bVar;
        f0 f0Var2 = f0Var;
        if ((i13 & 2) != 0) {
            f0Var2 = kVar.f96741b;
        }
        f0 label = f0Var2;
        i0 i0Var = kVar.f96742c;
        if ((i13 & 8) != 0) {
            cVar = kVar.f96743d;
        }
        fm1.c visibility = cVar;
        n textAlignment = kVar.f96744e;
        l labelPosition = kVar.f96745f;
        int i14 = kVar.f96746g;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(bVar2, "switch");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        return new k(bVar2, label, i0Var, visibility, textAlignment, labelPosition, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f96740a, kVar.f96740a) && Intrinsics.d(this.f96741b, kVar.f96741b) && Intrinsics.d(this.f96742c, kVar.f96742c) && this.f96743d == kVar.f96743d && this.f96744e == kVar.f96744e && this.f96745f == kVar.f96745f && this.f96746g == kVar.f96746g;
    }

    public final b f() {
        return this.f96740a;
    }

    public final int hashCode() {
        int d2 = ep.b.d(this.f96741b, this.f96740a.hashCode() * 31, 31);
        i0 i0Var = this.f96742c;
        return Integer.hashCode(this.f96746g) + ((this.f96745f.hashCode() + ((this.f96744e.hashCode() + d7.g.a(this.f96743d, (d2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(switch=");
        sb3.append(this.f96740a);
        sb3.append(", label=");
        sb3.append(this.f96741b);
        sb3.append(", subtext=");
        sb3.append(this.f96742c);
        sb3.append(", visibility=");
        sb3.append(this.f96743d);
        sb3.append(", textAlignment=");
        sb3.append(this.f96744e);
        sb3.append(", labelPosition=");
        sb3.append(this.f96745f);
        sb3.append(", id=");
        return a.a.n(sb3, this.f96746g, ")");
    }
}
