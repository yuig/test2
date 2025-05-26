package yq1;

/* loaded from: classes4.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f139771a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139772b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139773c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f139774d;

    public a2(int i13, int i14, boolean z13, int i15) {
        this.f139771a = i13;
        this.f139772b = i14;
        this.f139773c = i15;
        this.f139774d = z13;
    }

    public final int a() {
        return this.f139771a;
    }

    public final int b() {
        return this.f139772b;
    }

    public final int c() {
        return this.f139773c;
    }

    public final boolean d() {
        return this.f139774d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.f139771a == a2Var.f139771a && this.f139772b == a2Var.f139772b && this.f139773c == a2Var.f139773c && this.f139774d == a2Var.f139774d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139774d) + ep.b.b(this.f139773c, ep.b.b(this.f139772b, Integer.hashCode(this.f139771a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConsentMappingIds(checkboxId=");
        sb3.append(this.f139771a);
        sb3.append(", checkboxStringRes=");
        sb3.append(this.f139772b);
        sb3.append(", learnMoreLinkStringRes=");
        sb3.append(this.f139773c);
        sb3.append(", isRequired=");
        return a.a.r(sb3, this.f139774d, ")");
    }
}
