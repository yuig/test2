package y01;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final Navigation f136395a;

    public c1(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f136395a = navigation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && Intrinsics.d(this.f136395a, ((c1) obj).f136395a);
    }

    public final int hashCode() {
        return this.f136395a.hashCode();
    }

    public final String toString() {
        return "PinSwipeFragmentPWTEventSER(navigation=" + this.f136395a + ")";
    }
}
