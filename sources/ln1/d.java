package ln1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes2.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final f f83999a;

    /* renamed from: b, reason: collision with root package name */
    public final c f84000b;

    /* renamed from: c, reason: collision with root package name */
    public final e f84001c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f84002d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.c f84003e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84004f;

    public d(f size, c color, e loadingState, i0 label, fm1.c visibility, int i13) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f83999a = size;
        this.f84000b = color;
        this.f84001c = loadingState;
        this.f84002d = label;
        this.f84003e = visibility;
        this.f84004f = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f83999a == dVar.f83999a && this.f84000b == dVar.f84000b && this.f84001c == dVar.f84001c && Intrinsics.d(this.f84002d, dVar.f84002d) && this.f84003e == dVar.f84003e && this.f84004f == dVar.f84004f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84004f) + d7.g.a(this.f84003e, ep.b.d(this.f84002d, (this.f84001c.hashCode() + ((this.f84000b.hashCode() + (this.f83999a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "DisplayState(size=" + this.f83999a + ", color=" + this.f84000b + ", loadingState=" + this.f84001c + ", label=" + this.f84002d + ", visibility=" + this.f84003e + ", id=" + this.f84004f + ")";
    }
}
