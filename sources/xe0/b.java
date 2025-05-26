package xe0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk2.f;

/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f134652a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134653b;

    /* renamed from: c, reason: collision with root package name */
    public final int f134654c;

    /* renamed from: d, reason: collision with root package name */
    public final float f134655d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134656e;

    /* renamed from: f, reason: collision with root package name */
    public final int f134657f;

    /* renamed from: g, reason: collision with root package name */
    public final int f134658g;

    /* renamed from: h, reason: collision with root package name */
    public final int f134659h;

    /* renamed from: i, reason: collision with root package name */
    public final int f134660i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f134661j;

    public b(String imageUrl, int i13, int i14, float f13, int i15, int i16, int i17, int i18, int i19, Function0 function0) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f134652a = imageUrl;
        this.f134653b = i13;
        this.f134654c = i14;
        this.f134655d = f13;
        this.f134656e = i15;
        this.f134657f = i16;
        this.f134658g = i17;
        this.f134659h = i18;
        this.f134660i = i19;
        this.f134661j = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f134652a, bVar.f134652a) && this.f134653b == bVar.f134653b && this.f134654c == bVar.f134654c && Float.compare(this.f134655d, bVar.f134655d) == 0 && this.f134656e == bVar.f134656e && this.f134657f == bVar.f134657f && this.f134658g == bVar.f134658g && this.f134659h == bVar.f134659h && this.f134660i == bVar.f134660i && Intrinsics.d(this.f134661j, bVar.f134661j);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f134660i, ep.b.b(this.f134659h, ep.b.b(this.f134658g, ep.b.b(this.f134657f, ep.b.b(this.f134656e, a.a.a(this.f134655d, ep.b.b(this.f134654c, ep.b.b(this.f134653b, this.f134652a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Function0 function0 = this.f134661j;
        return b13 + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DynamicUrlImageStackItem(imageUrl=");
        sb3.append(this.f134652a);
        sb3.append(", imageWidth=");
        sb3.append(this.f134653b);
        sb3.append(", imageHeight=");
        sb3.append(this.f134654c);
        sb3.append(", imageRotation=");
        sb3.append(this.f134655d);
        sb3.append(", imageOffset=");
        sb3.append(this.f134656e);
        sb3.append(", gravity=");
        sb3.append(this.f134657f);
        sb3.append(", marginTop=");
        sb3.append(this.f134658g);
        sb3.append(", marginBottom=");
        sb3.append(this.f134659h);
        sb3.append(", marginEnd=");
        sb3.append(this.f134660i);
        sb3.append(", onImageClick=");
        return f.i(sb3, this.f134661j, ")");
    }
}
