package qf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f103740a;

    /* renamed from: b, reason: collision with root package name */
    public final String f103741b;

    public l0(k0 option, String str) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f103740a = option;
        this.f103741b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f103740a == l0Var.f103740a && Intrinsics.d(this.f103741b, l0Var.f103741b);
    }

    public final int hashCode() {
        int hashCode = this.f103740a.hashCode() * 31;
        String str = this.f103741b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StoryPinOptionItem(option=" + this.f103740a + ", titleResVariableSubstitution=" + this.f103741b + ")";
    }
}
