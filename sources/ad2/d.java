package ad2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f2095a;

    public d(String str) {
        this.f2095a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f2095a, ((d) obj).f2095a);
    }

    public final int hashCode() {
        String str = this.f2095a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SearchTextChanged(newText="), this.f2095a, ")");
    }
}
