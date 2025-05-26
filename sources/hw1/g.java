package hw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f70477a;

    public g(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f70477a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f70477a, ((g) obj).f70477a);
    }

    public final int hashCode() {
        return this.f70477a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FetchProductTagStela(id="), this.f70477a, ")");
    }
}
