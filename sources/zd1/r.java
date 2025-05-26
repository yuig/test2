package zd1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class r extends h {

    /* renamed from: a, reason: collision with root package name */
    public final t32.f f141746a;

    /* renamed from: b, reason: collision with root package name */
    public final q f141747b;

    /* renamed from: c, reason: collision with root package name */
    public final int f141748c;

    /* renamed from: d, reason: collision with root package name */
    public final int f141749d;

    /* renamed from: e, reason: collision with root package name */
    public int f141750e;

    /* renamed from: f, reason: collision with root package name */
    public int f141751f;

    /* renamed from: g, reason: collision with root package name */
    public int f141752g;

    /* renamed from: h, reason: collision with root package name */
    public final String f141753h;

    /* renamed from: i, reason: collision with root package name */
    public final String f141754i;

    /* renamed from: j, reason: collision with root package name */
    public final String f141755j;

    /* renamed from: k, reason: collision with root package name */
    public final String f141756k;

    /* renamed from: l, reason: collision with root package name */
    public final String f141757l;

    /* renamed from: m, reason: collision with root package name */
    public final String f141758m;

    /* renamed from: n, reason: collision with root package name */
    public final String f141759n;

    public /* synthetic */ r(t32.f fVar, int i13, int i14, int i15, int i16, int i17, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i18) {
        this(fVar, q.PRICE_FILTER_ITEM, i13, i14, i15, i16, i17, str, (i18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str2, (i18 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str3, (i18 & 1024) != 0 ? null : str4, (i18 & 2048) != 0 ? null : str5, (i18 & 4096) != 0 ? null : str6, (i18 & 8192) != 0 ? null : str7);
    }

    @Override // zd1.h
    public final h a() {
        int i13 = this.f141750e;
        int i14 = this.f141751f;
        int i15 = this.f141752g;
        q filterType = this.f141747b;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return new r(this.f141746a, filterType, this.f141748c, this.f141749d, i13, i14, i15, this.f141753h, this.f141754i, this.f141755j, this.f141756k, this.f141757l, this.f141758m, this.f141759n);
    }

    @Override // zd1.h
    public final q b() {
        return this.f141747b;
    }

    @Override // zd1.h
    public final t32.f c() {
        return this.f141746a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f141746a == rVar.f141746a && this.f141747b == rVar.f141747b && this.f141748c == rVar.f141748c && this.f141749d == rVar.f141749d && this.f141750e == rVar.f141750e && this.f141751f == rVar.f141751f && this.f141752g == rVar.f141752g && Intrinsics.d(this.f141753h, rVar.f141753h) && Intrinsics.d(this.f141754i, rVar.f141754i) && Intrinsics.d(this.f141755j, rVar.f141755j) && Intrinsics.d(this.f141756k, rVar.f141756k) && Intrinsics.d(this.f141757l, rVar.f141757l) && Intrinsics.d(this.f141758m, rVar.f141758m) && Intrinsics.d(this.f141759n, rVar.f141759n);
    }

    public final int hashCode() {
        t32.f fVar = this.f141746a;
        int b13 = ep.b.b(this.f141752g, ep.b.b(this.f141751f, ep.b.b(this.f141750e, ep.b.b(this.f141749d, ep.b.b(this.f141748c, (this.f141747b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31, 31), 31), 31), 31), 31);
        String str = this.f141753h;
        int hashCode = (b13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f141754i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141755j;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f141756k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f141757l;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f141758m;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f141759n;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        int i13 = this.f141750e;
        int i14 = this.f141751f;
        int i15 = this.f141752g;
        StringBuilder sb3 = new StringBuilder("RangeFilter(thriftProductFilterType=");
        sb3.append(this.f141746a);
        sb3.append(", filterType=");
        sb3.append(this.f141747b);
        sb3.append(", initialMin=");
        sb3.append(this.f141748c);
        sb3.append(", initialMax=");
        a.a.z(sb3, this.f141749d, ", suggestedMax=", i13, ", selectedMinRange=");
        a.a.z(sb3, i14, ", selectedMaxRange=", i15, ", currency=");
        sb3.append(this.f141753h);
        sb3.append(", filterId=");
        sb3.append(this.f141754i);
        sb3.append(", minFilterOptionId=");
        sb3.append(this.f141755j);
        sb3.append(", maxFilterOptionId=");
        sb3.append(this.f141756k);
        sb3.append(", hintText=");
        sb3.append(this.f141757l);
        sb3.append(", moduleId=");
        sb3.append(this.f141758m);
        sb3.append(", errorStateLabel=");
        return a.a.p(sb3, this.f141759n, ")");
    }

    public r(t32.f fVar, q filterType, int i13, int i14, int i15, int i16, int i17, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        this.f141746a = fVar;
        this.f141747b = filterType;
        this.f141748c = i13;
        this.f141749d = i14;
        this.f141750e = i15;
        this.f141751f = i16;
        this.f141752g = i17;
        this.f141753h = str;
        this.f141754i = str2;
        this.f141755j = str3;
        this.f141756k = str4;
        this.f141757l = str5;
        this.f141758m = str6;
        this.f141759n = str7;
    }
}
