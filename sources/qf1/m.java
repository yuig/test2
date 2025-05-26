package qf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f103742a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103743b;

    public m(String title, int i13) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f103742a = title;
        this.f103743b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f103742a, mVar.f103742a) && this.f103743b == mVar.f103743b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103743b) + (this.f103742a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Preview(title=");
        sb3.append(this.f103742a);
        sb3.append(", iconResId=");
        return a.a.n(sb3, this.f103743b, ")");
    }
}
