package cd2;

/* loaded from: classes4.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27551a;

    public b(boolean z13) {
        this.f27551a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f27551a == ((b) obj).f27551a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27551a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("WidgetContentSelectionDisplayState(showLoading="), this.f27551a, ")");
    }
}
