package tu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f119277a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119278b;

    public d(String url, String pinId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f119277a = url;
        this.f119278b = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f119277a, dVar.f119277a) && Intrinsics.d(this.f119278b, dVar.f119278b);
    }

    public final int hashCode() {
        return this.f119278b.hashCode() + (this.f119277a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowCctBrowser(url=");
        sb3.append(this.f119277a);
        sb3.append(", pinId=");
        return a.a.p(sb3, this.f119278b, ")");
    }
}
