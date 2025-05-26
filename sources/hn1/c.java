package hn1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f69645a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f69646b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f69647c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69648d;

    public c(rm1.q icon, i0 contentDescription, fm1.c visibility, int i13) {
        if ((i13 & 2) != 0) {
            int i14 = w.sheet_next_page;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            contentDescription = new k0(i14, new ArrayList(0));
        }
        visibility = (i13 & 4) != 0 ? fm1.c.VISIBLE : visibility;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f69645a = icon;
        this.f69646b = contentDescription;
        this.f69647c = visibility;
        this.f69648d = Integer.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f69645a == cVar.f69645a && Intrinsics.d(this.f69646b, cVar.f69646b) && this.f69647c == cVar.f69647c && this.f69648d == cVar.f69648d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69648d) + d7.g.a(this.f69647c, ep.b.d(this.f69646b, this.f69645a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ActionIconDisplayState(icon=" + this.f69645a + ", contentDescription=" + this.f69646b + ", visibility=" + this.f69647c + ", id=" + this.f69648d + ")";
    }
}
