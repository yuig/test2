package al1;

import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Navigation f15486a;

    public h(NavigationImpl navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f15486a = navigation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f15486a, ((h) obj).f15486a);
    }

    public final int hashCode() {
        return this.f15486a.hashCode();
    }

    public final String toString() {
        return "ReplaceTopOfBackStackWith(navigation=" + this.f15486a + ")";
    }
}
