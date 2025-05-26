package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class na {

    /* renamed from: a, reason: collision with root package name */
    public final String f132882a;

    public na(String str) {
        this.f132882a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na) && Intrinsics.d(this.f132882a, ((na) obj).f132882a);
    }

    public final int hashCode() {
        String str = this.f132882a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Image(url="), this.f132882a, ")");
    }
}
