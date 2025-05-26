package rb1;

import kotlin.jvm.internal.Intrinsics;
import o82.a0;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f107077a;

    public b(a0 multiSectionDisplayState) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f107077a = multiSectionDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f107077a, ((b) obj).f107077a);
    }

    public final int hashCode() {
        return this.f107077a.f93524a.hashCode();
    }

    public final String toString() {
        return "PasscodeSettingsDisplayState(multiSectionDisplayState=" + this.f107077a + ")";
    }
}
