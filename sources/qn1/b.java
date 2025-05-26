package qn1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f104467a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f104468b;

    /* renamed from: c, reason: collision with root package name */
    public final d f104469c;

    /* renamed from: d, reason: collision with root package name */
    public final c f104470d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.c f104471e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104472f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f104473g;

    /* renamed from: h, reason: collision with root package name */
    public final int f104474h;

    public b(i0 text, i0 contentDescription, d variant, c size, fm1.c visibility, boolean z13, boolean z14, int i13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f104467a = text;
        this.f104468b = contentDescription;
        this.f104469c = variant;
        this.f104470d = size;
        this.f104471e = visibility;
        this.f104472f = z13;
        this.f104473g = z14;
        this.f104474h = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f104467a, bVar.f104467a) && Intrinsics.d(this.f104468b, bVar.f104468b) && this.f104469c == bVar.f104469c && this.f104470d == bVar.f104470d && this.f104471e == bVar.f104471e && this.f104472f == bVar.f104472f && this.f104473g == bVar.f104473g && this.f104474h == bVar.f104474h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104474h) + ep.b.e(this.f104473g, ep.b.e(this.f104472f, d7.g.a(this.f104471e, (this.f104470d.hashCode() + ((this.f104469c.hashCode() + ep.b.d(this.f104468b, this.f104467a.hashCode() * 31, 31)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f104467a);
        sb3.append(", contentDescription=");
        sb3.append(this.f104468b);
        sb3.append(", variant=");
        sb3.append(this.f104469c);
        sb3.append(", size=");
        sb3.append(this.f104470d);
        sb3.append(", visibility=");
        sb3.append(this.f104471e);
        sb3.append(", selected=");
        sb3.append(this.f104472f);
        sb3.append(", dismissible=");
        sb3.append(this.f104473g);
        sb3.append(", id=");
        return a.a.n(sb3, this.f104474h, ")");
    }
}
