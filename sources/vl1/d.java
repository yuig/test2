package vl1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f126110a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f126111b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f126112c;

    /* renamed from: d, reason: collision with root package name */
    public final c f126113d;

    /* renamed from: e, reason: collision with root package name */
    public final l f126114e;

    /* renamed from: f, reason: collision with root package name */
    public final b f126115f;

    /* renamed from: g, reason: collision with root package name */
    public final int f126116g;

    /* renamed from: h, reason: collision with root package name */
    public final fm1.c f126117h;

    public d(i0 i0Var, i0 bodyText, boolean z13, c cVar, l variant, b style, int i13, fm1.c visibility) {
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f126110a = i0Var;
        this.f126111b = bodyText;
        this.f126112c = z13;
        this.f126113d = cVar;
        this.f126114e = variant;
        this.f126115f = style;
        this.f126116g = i13;
        this.f126117h = visibility;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f126110a, dVar.f126110a) && Intrinsics.d(this.f126111b, dVar.f126111b) && this.f126112c == dVar.f126112c && Intrinsics.d(this.f126113d, dVar.f126113d) && Intrinsics.d(this.f126114e, dVar.f126114e) && this.f126115f == dVar.f126115f && this.f126116g == dVar.f126116g && this.f126117h == dVar.f126117h;
    }

    public final int hashCode() {
        i0 i0Var = this.f126110a;
        int e13 = ep.b.e(this.f126112c, ep.b.d(this.f126111b, (i0Var == null ? 0 : i0Var.hashCode()) * 31, 31), 31);
        c cVar = this.f126113d;
        return this.f126117h.hashCode() + ep.b.b(this.f126116g, (this.f126115f.hashCode() + ((this.f126114e.hashCode() + ((e13 + (cVar != null ? cVar.hashCode() : 0)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DisplayState(headerText=" + this.f126110a + ", bodyText=" + this.f126111b + ", showDismissButton=" + this.f126112c + ", buttonGroup=" + this.f126113d + ", variant=" + this.f126114e + ", style=" + this.f126115f + ", id=" + this.f126116g + ", visibility=" + this.f126117h + ")";
    }
}
