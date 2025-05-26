package cj1;

import d7.g;
import ej1.d;
import kotlin.jvm.internal.Intrinsics;
import rm1.c;
import rm1.i;
import rm1.q;
import u50.b0;
import u50.n;

/* loaded from: classes5.dex */
public final class b implements aj1.a {

    /* renamed from: a, reason: collision with root package name */
    public final d f27885a;

    /* renamed from: b, reason: collision with root package name */
    public final n f27886b;

    /* renamed from: c, reason: collision with root package name */
    public final n f27887c;

    /* renamed from: d, reason: collision with root package name */
    public final n f27888d;

    /* renamed from: e, reason: collision with root package name */
    public final n f27889e;

    /* renamed from: f, reason: collision with root package name */
    public final n f27890f;

    /* renamed from: g, reason: collision with root package name */
    public final q f27891g;

    /* renamed from: h, reason: collision with root package name */
    public final c f27892h;

    /* renamed from: i, reason: collision with root package name */
    public final i f27893i;

    public b(d pinTextDisplayState) {
        b0 endPadding = new b0(fk1.c.f62343a);
        b0 bottomPadding = new b0(fk1.c.f62345c);
        b0 iconPadding = new b0(fk1.c.f62347e);
        q icon = q.INFO_CIRCLE;
        c iconColor = c.DEFAULT;
        i iconSize = i.XS;
        Intrinsics.checkNotNullParameter(pinTextDisplayState, "pinTextDisplayState");
        Intrinsics.checkNotNullParameter(endPadding, "startPadding");
        Intrinsics.checkNotNullParameter(endPadding, "endPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(iconPadding, "iconPadding");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconSize, "iconSize");
        this.f27885a = pinTextDisplayState;
        this.f27886b = endPadding;
        this.f27887c = endPadding;
        this.f27888d = bottomPadding;
        this.f27889e = bottomPadding;
        this.f27890f = iconPadding;
        this.f27891g = icon;
        this.f27892h = iconColor;
        this.f27893i = iconSize;
    }

    public final n e() {
        return this.f27889e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f27885a, bVar.f27885a) && Intrinsics.d(this.f27886b, bVar.f27886b) && Intrinsics.d(this.f27887c, bVar.f27887c) && Intrinsics.d(this.f27888d, bVar.f27888d) && Intrinsics.d(this.f27889e, bVar.f27889e) && Intrinsics.d(this.f27890f, bVar.f27890f) && this.f27891g == bVar.f27891g && this.f27892h == bVar.f27892h && this.f27893i == bVar.f27893i;
    }

    public final n f() {
        return this.f27887c;
    }

    public final q g() {
        return this.f27891g;
    }

    public final c h() {
        return this.f27892h;
    }

    public final int hashCode() {
        return this.f27893i.hashCode() + ((this.f27892h.hashCode() + ((this.f27891g.hashCode() + g.e(this.f27890f, g.e(this.f27889e, g.e(this.f27888d, g.e(this.f27887c, g.e(this.f27886b, this.f27885a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31);
    }

    public final n i() {
        return this.f27890f;
    }

    public final i j() {
        return this.f27893i;
    }

    public final d k() {
        return this.f27885a;
    }

    public final n l() {
        return this.f27886b;
    }

    public final n m() {
        return this.f27888d;
    }

    public final String toString() {
        return "PharmaAdDisclosureDisplayState(pinTextDisplayState=" + this.f27885a + ", startPadding=" + this.f27886b + ", endPadding=" + this.f27887c + ", topPadding=" + this.f27888d + ", bottomPadding=" + this.f27889e + ", iconPadding=" + this.f27890f + ", icon=" + this.f27891g + ", iconColor=" + this.f27892h + ", iconSize=" + this.f27893i + ")";
    }
}
