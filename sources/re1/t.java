package re1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f107667a;

    /* renamed from: b, reason: collision with root package name */
    public final float f107668b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f107669c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f107670d;

    /* renamed from: e, reason: collision with root package name */
    public final String f107671e;

    /* renamed from: f, reason: collision with root package name */
    public final List f107672f;

    public t(String imageUrl, float f13, boolean z13, Integer num, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f107667a = imageUrl;
        this.f107668b = f13;
        this.f107669c = z13;
        this.f107670d = num;
        this.f107671e = str;
        this.f107672f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f107667a, tVar.f107667a) && Float.compare(this.f107668b, tVar.f107668b) == 0 && this.f107669c == tVar.f107669c && Intrinsics.d(this.f107670d, tVar.f107670d) && Intrinsics.d(this.f107671e, tVar.f107671e) && Intrinsics.d(this.f107672f, tVar.f107672f);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f107669c, a.a.a(this.f107668b, this.f107667a.hashCode() * 31, 31), 31);
        Integer num = this.f107670d;
        int hashCode = (e13 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f107671e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f107672f;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "HeroImageData(imageUrl=" + this.f107667a + ", widthHeightRatio=" + this.f107668b + ", addBlur=" + this.f107669c + ", iconResId=" + this.f107670d + ", dominantColor=" + this.f107671e + ", thumbnails=" + this.f107672f + ")";
    }
}
