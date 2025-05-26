package dc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f54319a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54320b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54321c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i f54322d;

    /* renamed from: e, reason: collision with root package name */
    public final e f54323e;

    public g(String str, String str2, String str3, u50.i iVar, e style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54319a = str;
        this.f54320b = str2;
        this.f54321c = str3;
        this.f54322d = iVar;
        this.f54323e = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f54319a, gVar.f54319a) && Intrinsics.d(this.f54320b, gVar.f54320b) && Intrinsics.d(this.f54321c, gVar.f54321c) && Intrinsics.d(this.f54322d, gVar.f54322d) && this.f54323e == gVar.f54323e;
    }

    public final int hashCode() {
        String str = this.f54319a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f54320b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54321c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        u50.i iVar = this.f54322d;
        return this.f54323e.hashCode() + ((hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BoardRepPreviewImageData(primaryImage=" + this.f54319a + ", secondaryImageTop=" + this.f54320b + ", secondaryImageBottom=" + this.f54321c + ", backgroundColor=" + this.f54322d + ", style=" + this.f54323e + ")";
    }

    public /* synthetic */ g(String str, String str2, String str3) {
        this(str, str2, str3, null, e.MONTAGE);
    }
}
