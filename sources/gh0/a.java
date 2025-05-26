package gh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f64994a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64995b;

    public a(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f64994a = text;
        this.f64995b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f64994a, aVar.f64994a) && Intrinsics.d(this.f64995b, aVar.f64995b);
    }

    public final int hashCode() {
        int hashCode = this.f64994a.hashCode() * 31;
        String str = this.f64995b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ButtonData(text=");
        sb3.append(this.f64994a);
        sb3.append(", url=");
        return a.a.p(sb3, this.f64995b, ")");
    }
}
