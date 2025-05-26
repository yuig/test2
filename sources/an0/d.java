package an0;

import a.cb;
import android.graphics.Typeface;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r72.i2;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f15637a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15639c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15640d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15641e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15642f;

    /* renamed from: g, reason: collision with root package name */
    public final Size f15643g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f15644h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f15645i;

    /* renamed from: j, reason: collision with root package name */
    public final Typeface f15646j;

    /* renamed from: k, reason: collision with root package name */
    public final i2 f15647k;

    /* renamed from: l, reason: collision with root package name */
    public final List f15648l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f15649m;

    /* renamed from: n, reason: collision with root package name */
    public final int f15650n;

    /* renamed from: o, reason: collision with root package name */
    public final int f15651o;

    public d(String id3, String mediaId, int i13, int i14, int i15, int i16, Size size, Integer num, Integer num2, Typeface typeface, i2 alignment, ArrayList animations, boolean z13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(animations, "animations");
        this.f15637a = id3;
        this.f15638b = mediaId;
        this.f15639c = i13;
        this.f15640d = i14;
        this.f15641e = i15;
        this.f15642f = i16;
        this.f15643g = size;
        this.f15644h = num;
        this.f15645i = num2;
        this.f15646j = typeface;
        this.f15647k = alignment;
        this.f15648l = animations;
        this.f15649m = z13;
        float f13 = i14;
        float f14 = 1000;
        this.f15650n = (int) (((i16 - i15) / f13) * f14);
        this.f15651o = (int) ((i15 / f13) * f14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f15637a, dVar.f15637a) && Intrinsics.d(this.f15638b, dVar.f15638b) && this.f15639c == dVar.f15639c && this.f15640d == dVar.f15640d && this.f15641e == dVar.f15641e && this.f15642f == dVar.f15642f && Intrinsics.d(this.f15643g, dVar.f15643g) && Intrinsics.d(this.f15644h, dVar.f15644h) && Intrinsics.d(this.f15645i, dVar.f15645i) && Intrinsics.d(this.f15646j, dVar.f15646j) && this.f15647k == dVar.f15647k && Intrinsics.d(this.f15648l, dVar.f15648l) && this.f15649m == dVar.f15649m;
    }

    public final int hashCode() {
        int hashCode = (this.f15643g.hashCode() + ep.b.b(this.f15642f, ep.b.b(this.f15641e, ep.b.b(this.f15640d, ep.b.b(this.f15639c, cb.d(this.f15638b, this.f15637a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31;
        Integer num = this.f15644h;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15645i;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Typeface typeface = this.f15646j;
        return Boolean.hashCode(this.f15649m) + ep.b.c(this.f15648l, (this.f15647k.hashCode() + ((hashCode3 + (typeface != null ? typeface.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Item(id=");
        sb3.append(this.f15637a);
        sb3.append(", mediaId=");
        sb3.append(this.f15638b);
        sb3.append(", frameIndex=");
        sb3.append(this.f15639c);
        sb3.append(", fps=");
        sb3.append(this.f15640d);
        sb3.append(", startFrame=");
        sb3.append(this.f15641e);
        sb3.append(", endFrame=");
        sb3.append(this.f15642f);
        sb3.append(", size=");
        sb3.append(this.f15643g);
        sb3.append(", color=");
        sb3.append(this.f15644h);
        sb3.append(", cornerRadius=");
        sb3.append(this.f15645i);
        sb3.append(", typeface=");
        sb3.append(this.f15646j);
        sb3.append(", alignment=");
        sb3.append(this.f15647k);
        sb3.append(", animations=");
        sb3.append(this.f15648l);
        sb3.append(", isWatermark=");
        return a.a.r(sb3, this.f15649m, ")");
    }
}
