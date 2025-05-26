package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f54132a;

    public d(String str) {
        this.f54132a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f54132a, ((d) obj).f54132a);
    }

    public final int hashCode() {
        String str = this.f54132a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OpenNativeBrowser(url="), this.f54132a, ")");
    }
}
