package ba1;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Navigation f22380a;

    public k0(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f22380a = navigation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f22380a, ((k0) obj).f22380a);
    }

    public final int hashCode() {
        return this.f22380a.hashCode();
    }

    public final String toString() {
        return "NavigateToAccount(navigation=" + this.f22380a + ")";
    }
}
