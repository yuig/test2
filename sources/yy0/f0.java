package yy0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f140450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f140451b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f140452c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i f140453d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f140454e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f140455f;

    /* renamed from: g, reason: collision with root package name */
    public final k0 f140456g;

    public f0(String id3, String str, i0 title, u50.i backgroundColor, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f140450a = id3;
        this.f140451b = str;
        this.f140452c = title;
        this.f140453d = backgroundColor;
        this.f140454e = z13;
        this.f140455f = z14;
        int i13 = z13 ? x0.icon_selected : x0.deselected;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.f140456g = new k0(i13, new ArrayList(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f140450a, f0Var.f140450a) && Intrinsics.d(this.f140451b, f0Var.f140451b) && Intrinsics.d(this.f140452c, f0Var.f140452c) && Intrinsics.d(this.f140453d, f0Var.f140453d) && this.f140454e == f0Var.f140454e && this.f140455f == f0Var.f140455f;
    }

    public final int hashCode() {
        int hashCode = this.f140450a.hashCode() * 31;
        String str = this.f140451b;
        return Boolean.hashCode(this.f140455f) + ep.b.e(this.f140454e, (this.f140453d.hashCode() + ep.b.d(this.f140452c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UseCaseDisplayState(id=");
        sb3.append(this.f140450a);
        sb3.append(", imageUrl=");
        sb3.append(this.f140451b);
        sb3.append(", title=");
        sb3.append(this.f140452c);
        sb3.append(", backgroundColor=");
        sb3.append(this.f140453d);
        sb3.append(", isSelected=");
        sb3.append(this.f140454e);
        sb3.append(", shouldShowSelectOverlay=");
        return a.a.r(sb3, this.f140455f, ")");
    }
}
