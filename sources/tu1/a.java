package tu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f119341a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119342b;

    public a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f119341a = key;
        this.f119342b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f119341a, aVar.f119341a) && Intrinsics.d(this.f119342b, aVar.f119342b);
    }

    public final int hashCode() {
        return this.f119342b.hashCode() + (this.f119341a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Annotation(key=");
        sb3.append(this.f119341a);
        sb3.append(", value=");
        return a.a.p(sb3, this.f119342b, ")");
    }
}
