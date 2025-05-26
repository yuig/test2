package gx;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f66250a;

    /* renamed from: b, reason: collision with root package name */
    public final List f66251b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66252c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66253d;

    public h(String pinId, String title, String subtitle, List categories) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f66250a = pinId;
        this.f66251b = categories;
        this.f66252c = title;
        this.f66253d = subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f66250a, hVar.f66250a) && Intrinsics.d(this.f66251b, hVar.f66251b) && Intrinsics.d(this.f66252c, hVar.f66252c) && Intrinsics.d(this.f66253d, hVar.f66253d);
    }

    public final int hashCode() {
        return this.f66253d.hashCode() + cb.d(this.f66252c, ep.b.c(this.f66251b, this.f66250a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CacheStoryCategoriesSideEffect(pinId=");
        sb3.append(this.f66250a);
        sb3.append(", categories=");
        sb3.append(this.f66251b);
        sb3.append(", title=");
        sb3.append(this.f66252c);
        sb3.append(", subtitle=");
        return a.a.p(sb3, this.f66253d, ")");
    }
}
