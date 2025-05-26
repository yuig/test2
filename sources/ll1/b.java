package ll1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f83827a;

    public b(String str) {
        this.f83827a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f83827a, ((b) obj).f83827a);
    }

    public final int hashCode() {
        String str = this.f83827a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OnCreateView(objectIdStr="), this.f83827a, ")");
    }
}
