package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s3 {

    /* renamed from: k, reason: collision with root package name */
    public static final vb0.i f67232k = new vb0.i(11);

    /* renamed from: a, reason: collision with root package name */
    public final Short f67233a;

    /* renamed from: b, reason: collision with root package name */
    public final Short f67234b;

    /* renamed from: c, reason: collision with root package name */
    public final Short f67235c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f67236d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f67237e;

    /* renamed from: f, reason: collision with root package name */
    public final String f67238f;

    /* renamed from: g, reason: collision with root package name */
    public final String f67239g;

    /* renamed from: h, reason: collision with root package name */
    public final Short f67240h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f67241i;

    /* renamed from: j, reason: collision with root package name */
    public final String f67242j;

    public s3(Short sh3, Short sh4, Short sh5, Short sh6, Long l13, String str, String str2, Short sh7, Long l14, String str3) {
        this.f67233a = sh3;
        this.f67234b = sh4;
        this.f67235c = sh5;
        this.f67236d = sh6;
        this.f67237e = l13;
        this.f67238f = str;
        this.f67239g = str2;
        this.f67240h = sh7;
        this.f67241i = l14;
        this.f67242j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return Intrinsics.d(this.f67233a, s3Var.f67233a) && Intrinsics.d(this.f67234b, s3Var.f67234b) && Intrinsics.d(this.f67235c, s3Var.f67235c) && Intrinsics.d(this.f67236d, s3Var.f67236d) && Intrinsics.d(this.f67237e, s3Var.f67237e) && Intrinsics.d(this.f67238f, s3Var.f67238f) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(this.f67239g, s3Var.f67239g) && Intrinsics.d(this.f67240h, s3Var.f67240h) && Intrinsics.d(null, null) && Intrinsics.d(this.f67241i, s3Var.f67241i) && Intrinsics.d(null, null) && Intrinsics.d(this.f67242j, s3Var.f67242j);
    }

    public final int hashCode() {
        Short sh3 = this.f67233a;
        int hashCode = (sh3 == null ? 0 : sh3.hashCode()) * 31;
        Short sh4 = this.f67234b;
        int hashCode2 = (hashCode + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        Short sh5 = this.f67235c;
        int hashCode3 = (hashCode2 + (sh5 == null ? 0 : sh5.hashCode())) * 31;
        Short sh6 = this.f67236d;
        int hashCode4 = (hashCode3 + (sh6 == null ? 0 : sh6.hashCode())) * 31;
        Long l13 = this.f67237e;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str = this.f67238f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 28629151;
        String str2 = this.f67239g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Short sh7 = this.f67240h;
        int hashCode8 = (hashCode7 + (sh7 == null ? 0 : sh7.hashCode())) * 961;
        Long l14 = this.f67241i;
        int hashCode9 = (hashCode8 + (l14 == null ? 0 : l14.hashCode())) * 961;
        String str3 = this.f67242j;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoSegment(sourceWidth=");
        sb3.append(this.f67233a);
        sb3.append(", sourceHeight=");
        sb3.append(this.f67234b);
        sb3.append(", viewportWidth=");
        sb3.append(this.f67235c);
        sb3.append(", viewportHeight=");
        sb3.append(this.f67236d);
        sb3.append(", watchedDurationMs=");
        sb3.append(this.f67237e);
        sb3.append(", uri=");
        sb3.append(this.f67238f);
        sb3.append(", indicatedKbps=null, observedKbps=null, switchBitrateKbps=null, playbackStartDate=null, serverAddress=");
        sb3.append(this.f67239g);
        sb3.append(", numServerAddressChanges=");
        sb3.append(this.f67240h);
        sb3.append(", startupTimeMs=null, playbackOffsetMs=");
        sb3.append(this.f67241i);
        sb3.append(", numActiveDownloads=null, cdnCacheStatus=");
        return a.a.p(sb3, this.f67242j, ")");
    }
}
