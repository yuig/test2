package vd0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f125619a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125620b;

    /* renamed from: c, reason: collision with root package name */
    public String f125621c;

    public b(a array, String bookmark) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(bookmark, "bookmark");
        this.f125619a = array;
        this.f125620b = bookmark;
        this.f125621c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f125619a, bVar.f125619a) && Intrinsics.d(this.f125620b, bVar.f125620b) && Intrinsics.d(this.f125621c, bVar.f125621c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f125620b, this.f125619a.hashCode() * 31, 31);
        String str = this.f125621c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.f125621c;
        StringBuilder sb3 = new StringBuilder("PinterestJsonArrayWithBookmark(array=");
        sb3.append(this.f125619a);
        sb3.append(", bookmark=");
        return a.a.q(sb3, this.f125620b, ", url=", str, ")");
    }
}
