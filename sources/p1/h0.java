package p1;

import a.cb;

/* loaded from: classes2.dex */
public final class h0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f98515a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f98516b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f98517c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f98518d = 0;

    @Override // p1.m1
    public final int a(n4.b bVar, n4.k kVar) {
        return this.f98517c;
    }

    @Override // p1.m1
    public final int b(n4.b bVar) {
        return this.f98516b;
    }

    @Override // p1.m1
    public final int c(n4.b bVar) {
        return this.f98518d;
    }

    @Override // p1.m1
    public final int d(n4.b bVar, n4.k kVar) {
        return this.f98515a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f98515a == h0Var.f98515a && this.f98516b == h0Var.f98516b && this.f98517c == h0Var.f98517c && this.f98518d == h0Var.f98518d;
    }

    public final int hashCode() {
        return (((((this.f98515a * 31) + this.f98516b) * 31) + this.f98517c) * 31) + this.f98518d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Insets(left=");
        sb3.append(this.f98515a);
        sb3.append(", top=");
        sb3.append(this.f98516b);
        sb3.append(", right=");
        sb3.append(this.f98517c);
        sb3.append(", bottom=");
        return cb.l(sb3, this.f98518d, ')');
    }
}
