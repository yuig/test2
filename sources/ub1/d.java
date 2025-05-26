package ub1;

/* loaded from: classes5.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f121716a;

    public d(boolean z13) {
        this.f121716a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f121716a == ((d) obj).f121716a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121716a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("DisableDialogChecked(isChecked="), this.f121716a, ")");
    }
}
