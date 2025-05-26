package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f54136a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54137b;

    public e(String str, String promotedName) {
        Intrinsics.checkNotNullParameter(promotedName, "promotedName");
        this.f54136a = str;
        this.f54137b = promotedName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f54136a, eVar.f54136a) && Intrinsics.d(this.f54137b, eVar.f54137b);
    }

    public final int hashCode() {
        String str = this.f54136a;
        return this.f54137b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RefreshView(url=");
        sb3.append(this.f54136a);
        sb3.append(", promotedName=");
        return a.a.p(sb3, this.f54137b, ")");
    }
}
