package rb1;

import kotlin.jvm.internal.Intrinsics;
import va1.m1;

/* loaded from: classes5.dex */
public final class u implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f107095a;

    public u(p pVar) {
        this.f107095a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f107095a, ((u) obj).f107095a);
    }

    public final int hashCode() {
        m1 m1Var = this.f107095a;
        if (m1Var == null) {
            return 0;
        }
        return m1Var.hashCode();
    }

    public final String toString() {
        return "PasscodeSettingsToggleDisplayState(toggleItem=" + this.f107095a + ")";
    }
}
