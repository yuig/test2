package ic1;

/* loaded from: classes5.dex */
public final class s extends v {

    /* renamed from: d, reason: collision with root package name */
    public boolean f72089d;

    public s(boolean z13) {
        super(9, c52.e.edit_layout, null, 4, null);
        this.f72089d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f72089d == ((s) obj).f72089d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72089d);
    }

    public final String toString() {
        return "ProfileLayout(showAllPins=" + this.f72089d + ")";
    }
}
