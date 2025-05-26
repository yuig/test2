package bi1;

/* loaded from: classes5.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22844a;

    public g(boolean z13) {
        this.f22844a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f22844a == ((g) obj).f22844a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22844a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("UpdateShowBoardPickerState(showBoardPicker="), this.f22844a, ")");
    }
}
