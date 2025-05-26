package re1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f107660a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107661b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f107662c;

    /* renamed from: d, reason: collision with root package name */
    public final float f107663d;

    /* renamed from: e, reason: collision with root package name */
    public final int f107664e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107665f;

    /* renamed from: g, reason: collision with root package name */
    public final u f107666g;

    public s(String imageUrl, String str, Function1 function1, float f13, int i13, int i14, u uVar, int i15) {
        i14 = (i15 & 32) != 0 ? xe1.v.f134810y : i14;
        uVar = (i15 & 64) != 0 ? null : uVar;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f107660a = imageUrl;
        this.f107661b = str;
        this.f107662c = function1;
        this.f107663d = f13;
        this.f107664e = i13;
        this.f107665f = i14;
        this.f107666g = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f107660a, sVar.f107660a) && Intrinsics.d(this.f107661b, sVar.f107661b) && Intrinsics.d(this.f107662c, sVar.f107662c) && Float.compare(this.f107663d, sVar.f107663d) == 0 && this.f107664e == sVar.f107664e && this.f107665f == sVar.f107665f && Intrinsics.d(this.f107666g, sVar.f107666g);
    }

    public final int hashCode() {
        int hashCode = this.f107660a.hashCode() * 31;
        String str = this.f107661b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function1 function1 = this.f107662c;
        int b13 = ep.b.b(this.f107665f, ep.b.b(this.f107664e, a.a.a(this.f107663d, (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31, 31), 31), 31);
        u uVar = this.f107666g;
        return b13 + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "HeaderThumbnailData(imageUrl=" + this.f107660a + ", imageDeeplink=" + this.f107661b + ", navigateToImage=" + this.f107662c + ", widthHeightRatio=" + this.f107663d + ", thumbnailCornerRadius=" + this.f107664e + ", thumbnailWidth=" + this.f107665f + ", heroExtras=" + this.f107666g + ")";
    }
}
