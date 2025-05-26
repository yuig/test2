package e82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f57891a;

    public q(String str) {
        this.f57891a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f57891a, ((q) obj).f57891a);
    }

    public final int hashCode() {
        String str = this.f57891a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NativeSharesheetOpenedEvent(inviteCode="), this.f57891a, ")");
    }
}
