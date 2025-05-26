package r72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106599a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f106600b;

    /* renamed from: c, reason: collision with root package name */
    public final String f106601c;

    /* renamed from: d, reason: collision with root package name */
    public final q72.b f106602d;

    /* renamed from: e, reason: collision with root package name */
    public final i1 f106603e;

    /* renamed from: f, reason: collision with root package name */
    public final String f106604f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f106605g;

    /* renamed from: h, reason: collision with root package name */
    public final float f106606h;

    /* renamed from: i, reason: collision with root package name */
    public final q72.d f106607i;

    public o1(String id3, p1 image, String str, i1 mask, String userId, boolean z13, float f13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f106599a = id3;
        this.f106600b = image;
        this.f106601c = str;
        this.f106602d = null;
        this.f106603e = mask;
        this.f106604f = userId;
        this.f106605g = z13;
        this.f106606h = f13;
        this.f106607i = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (!Intrinsics.d(this.f106599a, o1Var.f106599a) || !Intrinsics.d(this.f106600b, o1Var.f106600b)) {
            return false;
        }
        String str = this.f106601c;
        String str2 = o1Var.f106601c;
        if (str != null ? !(str2 != null && Intrinsics.d(str, str2)) : str2 != null) {
            return false;
        }
        if (!Intrinsics.d(this.f106602d, o1Var.f106602d) || !Intrinsics.d(this.f106603e, o1Var.f106603e)) {
            return false;
        }
        int i13 = p72.b.f99115a;
        return Intrinsics.d(this.f106604f, o1Var.f106604f) && this.f106605g == o1Var.f106605g && Float.compare(this.f106606h, o1Var.f106606h) == 0 && Intrinsics.d(this.f106607i, o1Var.f106607i);
    }

    public final int hashCode() {
        int hashCode = (this.f106600b.hashCode() + (this.f106599a.hashCode() * 31)) * 31;
        String str = this.f106601c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        q72.b bVar = this.f106602d;
        int hashCode3 = (this.f106603e.hashCode() + ((hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        int i13 = p72.b.f99115a;
        int a13 = a.a.a(this.f106606h, ep.b.e(this.f106605g, cb.d(this.f106604f, hashCode3, 31), 31), 31);
        q72.d dVar = this.f106607i;
        return a13 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        String p13 = a.a.p(new StringBuilder("ShuffleCutoutId(value="), this.f106599a, ")");
        String str = this.f106601c;
        String i13 = str == null ? "null" : kh2.d.i1(str);
        int i14 = p72.b.f99115a;
        String p14 = a.a.p(new StringBuilder("UserId(value="), this.f106604f, ")");
        StringBuilder o13 = cb.o("ShuffleCutout(id=", p13, ", image=");
        o13.append(this.f106600b);
        o13.append(", pinId=");
        o13.append(i13);
        o13.append(", pin=");
        o13.append(this.f106602d);
        o13.append(", mask=");
        o13.append(this.f106603e);
        o13.append(", userId=");
        o13.append(p14);
        o13.append(", isFavoritedByMe=");
        o13.append(this.f106605g);
        o13.append(", imageRatio=");
        o13.append(this.f106606h);
        o13.append(", productPinData=");
        o13.append(this.f106607i);
        o13.append(")");
        return o13.toString();
    }
}
