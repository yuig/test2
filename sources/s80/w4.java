package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111838a;

    public w4(String str) {
        this.f111838a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w4) {
            return Intrinsics.d(this.f111838a, ((w4) obj).f111838a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f111838a;
        return Boolean.hashCode(true) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SetBackgroundColor(color="), this.f111838a, ", pushToHistory=true)");
    }
}
