package i01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f70691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70692b;

    public s0(String storyType, int i13) {
        Intrinsics.checkNotNullParameter(storyType, "storyType");
        this.f70691a = storyType;
        this.f70692b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f70691a, s0Var.f70691a) && this.f70692b == s0Var.f70692b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70692b) + (this.f70691a.hashCode() * 31);
    }

    public final String toString() {
        return this.f70691a + ":" + this.f70692b;
    }
}
