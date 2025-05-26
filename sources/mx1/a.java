package mx1;

import a.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88471a;

    /* renamed from: b, reason: collision with root package name */
    public final List f88472b;

    public a(String str, List categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f88471a = str;
        this.f88472b = categories;
    }

    public final List a() {
        return this.f88472b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f88471a, aVar.f88471a) && Intrinsics.d(this.f88472b, aVar.f88472b);
    }

    public final int hashCode() {
        String str = this.f88471a;
        return this.f88472b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TopCategories(subtitle=");
        sb3.append(this.f88471a);
        sb3.append(", categories=");
        return c.j(sb3, this.f88472b, ")");
    }
}
