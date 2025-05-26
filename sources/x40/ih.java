package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ih {

    /* renamed from: a, reason: collision with root package name */
    public final String f132577a;

    public ih(String str) {
        this.f132577a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih) && Intrinsics.d(this.f132577a, ((ih) obj).f132577a);
    }

    public final int hashCode() {
        String str = this.f132577a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Metadata(compatibleVersion="), this.f132577a, ")");
    }
}
