package p90;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f99167a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99168b;

    public a(boolean z13, boolean z14) {
        this.f99167a = z13;
        this.f99168b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f99167a == aVar.f99167a && this.f99168b == aVar.f99168b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99168b) + (Boolean.hashCode(this.f99167a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CloseupToolbarState(editActionEnabled=");
        sb3.append(this.f99167a);
        sb3.append(", addActionEnabled=");
        return a.a.r(sb3, this.f99168b, ")");
    }
}
