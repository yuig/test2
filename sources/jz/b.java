package jz;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f77735a;

    /* renamed from: b, reason: collision with root package name */
    public final List f77736b;

    public b(String str, yk2.b pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f77735a = str;
        this.f77736b = pages;
    }

    public final List a() {
        return this.f77736b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f77735a, bVar.f77735a) && Intrinsics.d(this.f77736b, bVar.f77736b);
    }

    public final int hashCode() {
        String str = this.f77735a;
        return this.f77736b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Paged(uid=");
        sb3.append(this.f77735a);
        sb3.append(", pages=");
        return a.c.j(sb3, this.f77736b, ")");
    }
}
