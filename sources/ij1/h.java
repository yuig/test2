package ij1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final m f72349a;

    /* renamed from: b, reason: collision with root package name */
    public final m f72350b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72351c;

    /* renamed from: d, reason: collision with root package name */
    public final vn1.c f72352d;

    public h(m title, m subtitle, int i13, vn1.c textColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f72349a = title;
        this.f72350b = subtitle;
        this.f72351c = i13;
        this.f72352d = textColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f72349a, hVar.f72349a) && Intrinsics.d(this.f72350b, hVar.f72350b) && this.f72351c == hVar.f72351c && this.f72352d == hVar.f72352d;
    }

    public final int hashCode() {
        return this.f72352d.hashCode() + ep.b.b(this.f72351c, (this.f72350b.hashCode() + (this.f72349a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "MetadataDS(title=" + this.f72349a + ", subtitle=" + this.f72350b + ", lineSpacing=" + this.f72351c + ", textColor=" + this.f72352d + ")";
    }
}
