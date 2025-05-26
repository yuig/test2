package md2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f86965a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86966b;

    public a(b type, String path) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f86965a = type;
        this.f86966b = path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f86965a == aVar.f86965a && Intrinsics.d(this.f86966b, aVar.f86966b);
    }

    public final int hashCode() {
        return this.f86966b.hashCode() + (this.f86965a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Asset(type=");
        sb3.append(this.f86965a);
        sb3.append(", path=");
        return ep.b.k(sb3, this.f86966b, ')');
    }
}
