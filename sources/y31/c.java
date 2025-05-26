package y31;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f136777a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136778b;

    /* renamed from: c, reason: collision with root package name */
    public final String f136779c;

    public c(d type, String label, String url) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f136777a = type;
        this.f136778b = label;
        this.f136779c = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f136777a == cVar.f136777a && Intrinsics.d(this.f136778b, cVar.f136778b) && Intrinsics.d(this.f136779c, cVar.f136779c);
    }

    public final int hashCode() {
        return this.f136779c.hashCode() + cb.d(this.f136778b, this.f136777a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LinkState(type=");
        sb3.append(this.f136777a);
        sb3.append(", label=");
        sb3.append(this.f136778b);
        sb3.append(", url=");
        return a.a.p(sb3, this.f136779c, ")");
    }
}
