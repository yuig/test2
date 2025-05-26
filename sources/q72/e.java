package q72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f102836a;

    public e(String str) {
        this.f102836a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f102836a, ((e) obj).f102836a);
    }

    public final int hashCode() {
        String str = this.f102836a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RichMetadata(title="), this.f102836a, ")");
    }
}
