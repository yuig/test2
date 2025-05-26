package y01;

import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Navigation f136442a;

    public n0(Navigation navigation) {
        this.f136442a = navigation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f136442a, ((n0) obj).f136442a);
    }

    public final int hashCode() {
        Navigation navigation = this.f136442a;
        if (navigation == null) {
            return 0;
        }
        return navigation.hashCode();
    }

    public final String toString() {
        return "OnEnterTransitionStartedPWTEvent(navigation=" + this.f136442a + ")";
    }
}
