package hn1;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f69638a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69639b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f69640c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f69641d;

    /* renamed from: e, reason: collision with root package name */
    public final yl1.g f69642e;

    /* renamed from: f, reason: collision with root package name */
    public final yl1.c f69643f;

    /* renamed from: g, reason: collision with root package name */
    public final int f69644g;

    public a(f0 text, boolean z13, fm1.c visibility, f0 contentDescription, yl1.g colorPalette, yl1.c size) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f69638a = text;
        this.f69639b = z13;
        this.f69640c = visibility;
        this.f69641d = contentDescription;
        this.f69642e = colorPalette;
        this.f69643f = size;
        this.f69644g = Integer.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f69638a, aVar.f69638a) && this.f69639b == aVar.f69639b && this.f69640c == aVar.f69640c && Intrinsics.d(this.f69641d, aVar.f69641d) && Intrinsics.d(this.f69642e, aVar.f69642e) && this.f69643f == aVar.f69643f && this.f69644g == aVar.f69644g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69644g) + ((this.f69643f.hashCode() + ((this.f69642e.hashCode() + ep.b.d(this.f69641d, d7.g.a(this.f69640c, ep.b.e(this.f69639b, this.f69638a.hashCode() * 31, 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionButtonDisplayState(text=");
        sb3.append(this.f69638a);
        sb3.append(", enabled=");
        sb3.append(this.f69639b);
        sb3.append(", visibility=");
        sb3.append(this.f69640c);
        sb3.append(", contentDescription=");
        sb3.append(this.f69641d);
        sb3.append(", colorPalette=");
        sb3.append(this.f69642e);
        sb3.append(", size=");
        sb3.append(this.f69643f);
        sb3.append(", id=");
        return a.a.n(sb3, this.f69644g, ")");
    }
}
