package rr1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes4.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f109941a = new e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1686899917;
    }

    @Override // rr1.f
    public final boolean test(Object obj) {
        String password = (String) obj;
        Intrinsics.checkNotNullParameter(password, "password");
        return !z.j(password);
    }

    public final String toString() {
        return "CheckNotEmpty";
    }
}
