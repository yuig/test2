package sy0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f115641a;

    public a(List selectedPickerItems) {
        Intrinsics.checkNotNullParameter(selectedPickerItems, "selectedPickerItems");
        this.f115641a = selectedPickerItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f115641a, ((a) obj).f115641a);
    }

    public final int hashCode() {
        return this.f115641a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("NUXInterestState(selectedPickerItems="), this.f115641a, ")");
    }
}
