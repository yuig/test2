package fn1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f62676a;

    /* renamed from: b, reason: collision with root package name */
    public final List f62677b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f62678c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f62679d;

    /* renamed from: e, reason: collision with root package name */
    public final int f62680e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f62681f;

    /* renamed from: g, reason: collision with root package name */
    public final f f62682g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f62683h;

    /* renamed from: i, reason: collision with root package name */
    public final fm1.c f62684i;

    /* renamed from: j, reason: collision with root package name */
    public final i0 f62685j;

    /* renamed from: k, reason: collision with root package name */
    public final int f62686k;

    public b(Integer num, List list, i0 labelText, i0 helperText, int i13, i0 hintText, f variant, boolean z13, fm1.c visibility, i0 i0Var, int i14) {
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f62676a = num;
        this.f62677b = list;
        this.f62678c = labelText;
        this.f62679d = helperText;
        this.f62680e = i13;
        this.f62681f = hintText;
        this.f62682g = variant;
        this.f62683h = z13;
        this.f62684i = visibility;
        this.f62685j = i0Var;
        this.f62686k = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f62676a, bVar.f62676a) && Intrinsics.d(this.f62677b, bVar.f62677b) && Intrinsics.d(this.f62678c, bVar.f62678c) && Intrinsics.d(this.f62679d, bVar.f62679d) && this.f62680e == bVar.f62680e && Intrinsics.d(this.f62681f, bVar.f62681f) && this.f62682g == bVar.f62682g && this.f62683h == bVar.f62683h && this.f62684i == bVar.f62684i && Intrinsics.d(this.f62685j, bVar.f62685j) && this.f62686k == bVar.f62686k;
    }

    public final int hashCode() {
        Integer num = this.f62676a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f62677b;
        int a13 = d7.g.a(this.f62684i, ep.b.e(this.f62683h, (this.f62682g.hashCode() + ep.b.d(this.f62681f, ep.b.b(this.f62680e, ep.b.d(this.f62679d, ep.b.d(this.f62678c, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31)) * 31, 31), 31);
        i0 i0Var = this.f62685j;
        return Integer.hashCode(this.f62686k) + ((a13 + (i0Var != null ? i0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(selectedIndex=");
        sb3.append(this.f62676a);
        sb3.append(", options=");
        sb3.append(this.f62677b);
        sb3.append(", labelText=");
        sb3.append(this.f62678c);
        sb3.append(", helperText=");
        sb3.append(this.f62679d);
        sb3.append(", helperTextLines=");
        sb3.append(this.f62680e);
        sb3.append(", hintText=");
        sb3.append(this.f62681f);
        sb3.append(", variant=");
        sb3.append(this.f62682g);
        sb3.append(", enabled=");
        sb3.append(this.f62683h);
        sb3.append(", visibility=");
        sb3.append(this.f62684i);
        sb3.append(", contentDescription=");
        sb3.append(this.f62685j);
        sb3.append(", id=");
        return a.a.n(sb3, this.f62686k, ")");
    }
}
