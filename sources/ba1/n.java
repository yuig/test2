package ba1;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements r {

    /* renamed from: a, reason: collision with root package name */
    public final Navigation f22384a;

    public n(Navigation navigation) {
        this.f22384a = navigation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f22384a, ((n) obj).f22384a);
    }

    public final int hashCode() {
        Navigation navigation = this.f22384a;
        if (navigation == null) {
            return 0;
        }
        return navigation.hashCode();
    }

    public final String toString() {
        return "OnAccountClicked(navigation=" + this.f22384a + ")";
    }
}
