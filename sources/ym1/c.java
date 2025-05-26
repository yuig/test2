package ym1;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final fm1.c f139412a;

    /* renamed from: b, reason: collision with root package name */
    public final List f139413b;

    /* renamed from: c, reason: collision with root package name */
    public final d f139414c;

    /* renamed from: d, reason: collision with root package name */
    public final e f139415d;

    /* renamed from: e, reason: collision with root package name */
    public final g f139416e;

    /* renamed from: f, reason: collision with root package name */
    public final View f139417f;

    /* renamed from: g, reason: collision with root package name */
    public final int f139418g;

    public c(fm1.c visibility, List mainText, d dVar, e idealCaretDirection, g variant, View view, int i13) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(idealCaretDirection, "idealCaretDirection");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f139412a = visibility;
        this.f139413b = mainText;
        this.f139414c = dVar;
        this.f139415d = idealCaretDirection;
        this.f139416e = variant;
        this.f139417f = view;
        this.f139418g = i13;
    }

    public static c e(c cVar, List list, d dVar, e eVar, int i13) {
        fm1.c visibility = cVar.f139412a;
        if ((i13 & 2) != 0) {
            list = cVar.f139413b;
        }
        List mainText = list;
        if ((i13 & 4) != 0) {
            dVar = cVar.f139414c;
        }
        d dVar2 = dVar;
        if ((i13 & 8) != 0) {
            eVar = cVar.f139415d;
        }
        e idealCaretDirection = eVar;
        g variant = cVar.f139416e;
        View view = cVar.f139417f;
        int i14 = cVar.f139418g;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(idealCaretDirection, "idealCaretDirection");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new c(visibility, mainText, dVar2, idealCaretDirection, variant, view, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f139412a == cVar.f139412a && Intrinsics.d(this.f139413b, cVar.f139413b) && Intrinsics.d(this.f139414c, cVar.f139414c) && this.f139415d == cVar.f139415d && this.f139416e == cVar.f139416e && Intrinsics.d(this.f139417f, cVar.f139417f) && this.f139418g == cVar.f139418g;
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.f139413b, this.f139412a.hashCode() * 31, 31);
        d dVar = this.f139414c;
        int hashCode = (this.f139416e.hashCode() + ((this.f139415d.hashCode() + ((c13 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31)) * 31;
        View view = this.f139417f;
        return Integer.hashCode(this.f139418g) + ((hashCode + (view != null ? view.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(visibility=");
        sb3.append(this.f139412a);
        sb3.append(", mainText=");
        sb3.append(this.f139413b);
        sb3.append(", endButtonState=");
        sb3.append(this.f139414c);
        sb3.append(", idealCaretDirection=");
        sb3.append(this.f139415d);
        sb3.append(", variant=");
        sb3.append(this.f139416e);
        sb3.append(", customView=");
        sb3.append(this.f139417f);
        sb3.append(", id=");
        return a.a.n(sb3, this.f139418g, ")");
    }
}
