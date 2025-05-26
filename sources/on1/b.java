package on1;

import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96708a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96709b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f96710c;

    /* renamed from: d, reason: collision with root package name */
    public final int f96711d;

    /* renamed from: e, reason: collision with root package name */
    public final c f96712e;

    /* renamed from: f, reason: collision with root package name */
    public final fm1.a f96713f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f96714g;

    public b(boolean z13, boolean z14, int i13) {
        this(z13, (i13 & 2) != 0 ? true : z14, GestaltSwitch.L, Integer.MIN_VALUE, c.DEVICE_SETTING, GestaltSwitch.N, false);
    }

    public static b e(b bVar, boolean z13, boolean z14, fm1.c cVar, int i13, c cVar2, int i14) {
        if ((i14 & 1) != 0) {
            z13 = bVar.f96708a;
        }
        boolean z15 = z13;
        if ((i14 & 2) != 0) {
            z14 = bVar.f96709b;
        }
        boolean z16 = z14;
        if ((i14 & 4) != 0) {
            cVar = bVar.f96710c;
        }
        fm1.c visibility = cVar;
        if ((i14 & 8) != 0) {
            i13 = bVar.f96711d;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            cVar2 = bVar.f96712e;
        }
        c theme = cVar2;
        fm1.a importantForAccessibility = bVar.f96713f;
        boolean z17 = bVar.f96714g;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        return new b(z15, z16, visibility, i15, theme, importantForAccessibility, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f96708a == bVar.f96708a && this.f96709b == bVar.f96709b && this.f96710c == bVar.f96710c && this.f96711d == bVar.f96711d && this.f96712e == bVar.f96712e && this.f96713f == bVar.f96713f && this.f96714g == bVar.f96714g;
    }

    public final boolean f() {
        return this.f96708a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96714g) + ((this.f96713f.hashCode() + ((this.f96712e.hashCode() + ep.b.b(this.f96711d, d7.g.a(this.f96710c, ep.b.e(this.f96709b, Boolean.hashCode(this.f96708a) * 31, 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(checked=");
        sb3.append(this.f96708a);
        sb3.append(", enabled=");
        sb3.append(this.f96709b);
        sb3.append(", visibility=");
        sb3.append(this.f96710c);
        sb3.append(", id=");
        sb3.append(this.f96711d);
        sb3.append(", theme=");
        sb3.append(this.f96712e);
        sb3.append(", importantForAccessibility=");
        sb3.append(this.f96713f);
        sb3.append(", screenReaderFocusable=");
        return a.a.r(sb3, this.f96714g, ")");
    }

    public b(boolean z13, boolean z14, fm1.c visibility, int i13, c theme, fm1.a importantForAccessibility, boolean z15) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        this.f96708a = z13;
        this.f96709b = z14;
        this.f96710c = visibility;
        this.f96711d = i13;
        this.f96712e = theme;
        this.f96713f = importantForAccessibility;
        this.f96714g = z15;
    }
}
