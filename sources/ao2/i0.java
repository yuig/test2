package ao2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.coroutines.a {

    /* renamed from: c, reason: collision with root package name */
    public static final bk.f f20162c = new bk.f();

    /* renamed from: b, reason: collision with root package name */
    public final String f20163b;

    public i0(String str) {
        super(f20162c);
        this.f20163b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f20163b, ((i0) obj).f20163b);
    }

    public final int hashCode() {
        return this.f20163b.hashCode();
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("CoroutineName("), this.f20163b, ')');
    }
}
