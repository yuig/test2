package bk1;

import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final d4 f23219a;

    public f0(d4 navigatingFrom) {
        Intrinsics.checkNotNullParameter(navigatingFrom, "navigatingFrom");
        this.f23219a = navigatingFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.f23219a == ((f0) obj).f23219a;
    }

    public final int hashCode() {
        return this.f23219a.hashCode();
    }

    public final d4 j() {
        return this.f23219a;
    }

    public final String toString() {
        return "PostNavigationEvent(navigatingFrom=" + this.f23219a + ")";
    }
}
