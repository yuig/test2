package ym1;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f139419a;

    /* renamed from: b, reason: collision with root package name */
    public final fm1.c f139420b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139421c;

    public d(f0 text, fm1.c visibility) {
        int i13 = z.popover_button_end;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f139419a = text;
        this.f139420b = visibility;
        this.f139421c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f139419a, dVar.f139419a) && this.f139420b == dVar.f139420b && this.f139421c == dVar.f139421c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139421c) + d7.g.a(this.f139420b, this.f139419a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EndButtonDisplayState(text=");
        sb3.append(this.f139419a);
        sb3.append(", visibility=");
        sb3.append(this.f139420b);
        sb3.append(", id=");
        return a.a.n(sb3, this.f139421c, ")");
    }
}
