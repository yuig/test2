package et0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f60017a;

    public a(String str) {
        this.f60017a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f60017a, ((a) obj).f60017a);
    }

    public final int hashCode() {
        String str = this.f60017a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadingArgs(filterParams="), this.f60017a, ")");
    }
}
