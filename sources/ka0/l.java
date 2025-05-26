package ka0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f78913a;

    public l(String str) {
        this.f78913a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f78913a, ((l) obj).f78913a);
    }

    public final int hashCode() {
        String str = this.f78913a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CollageComposer(draftId="), this.f78913a, ")");
    }
}
