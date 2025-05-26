package al1;

import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Navigation f15476a;

    public a(NavigationImpl navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f15476a = navigation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f15476a, ((a) obj).f15476a);
    }

    public final int hashCode() {
        return this.f15476a.hashCode();
    }

    public final String toString() {
        return "AddToBackStack(navigation=" + this.f15476a + ")";
    }
}
