package bk1;

import com.pinterest.api.model.f30;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class u0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23347a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f23348b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23349c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23350d;

    /* renamed from: e, reason: collision with root package name */
    public final h32.i0 f23351e;

    /* renamed from: f, reason: collision with root package name */
    public final h32.i0 f23352f;

    /* renamed from: g, reason: collision with root package name */
    public final h32.c1 f23353g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23354h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23355i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f23356j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f23357k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23358l;

    public u0(String linkUrl, f30 pin, HashMap hashMap, boolean z13, h32.i0 i0Var, h32.i0 i0Var2, h32.c1 c1Var, boolean z14, String str, boolean z15, boolean z16, int i13) {
        z15 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z15;
        boolean z17 = (i13 & 1024) != 0;
        z16 = (i13 & 2048) != 0 ? false : z16;
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23347a = linkUrl;
        this.f23348b = pin;
        this.f23349c = hashMap;
        this.f23350d = z13;
        this.f23351e = i0Var;
        this.f23352f = i0Var2;
        this.f23353g = c1Var;
        this.f23354h = z14;
        this.f23355i = str;
        this.f23356j = z15;
        this.f23357k = z17;
        this.f23358l = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f23347a, u0Var.f23347a) && Intrinsics.d(this.f23348b, u0Var.f23348b) && Intrinsics.d(this.f23349c, u0Var.f23349c) && this.f23350d == u0Var.f23350d && Intrinsics.d(this.f23351e, u0Var.f23351e) && Intrinsics.d(this.f23352f, u0Var.f23352f) && Intrinsics.d(this.f23353g, u0Var.f23353g) && this.f23354h == u0Var.f23354h && Intrinsics.d(this.f23355i, u0Var.f23355i) && this.f23356j == u0Var.f23356j && this.f23357k == u0Var.f23357k && this.f23358l == u0Var.f23358l;
    }

    public final HashMap getAuxData() {
        return this.f23349c;
    }

    public final int hashCode() {
        int hashCode = (this.f23348b.hashCode() + (this.f23347a.hashCode() * 31)) * 31;
        HashMap hashMap = this.f23349c;
        int e13 = ep.b.e(this.f23350d, (hashCode + (hashMap == null ? 0 : hashMap.hashCode())) * 31, 31);
        h32.i0 i0Var = this.f23351e;
        int hashCode2 = (e13 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        h32.i0 i0Var2 = this.f23352f;
        int hashCode3 = (hashCode2 + (i0Var2 == null ? 0 : i0Var2.hashCode())) * 31;
        h32.c1 c1Var = this.f23353g;
        int e14 = ep.b.e(this.f23354h, (hashCode3 + (c1Var == null ? 0 : c1Var.hashCode())) * 31, 31);
        String str = this.f23355i;
        return Boolean.hashCode(this.f23358l) + ep.b.e(this.f23357k, ep.b.e(this.f23356j, (e14 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    public final h32.i0 j() {
        return this.f23351e;
    }

    public final h32.i0 k() {
        return this.f23352f;
    }

    public final boolean l() {
        return this.f23357k;
    }

    public final h32.c1 m() {
        return this.f23353g;
    }

    public final String n() {
        return this.f23347a;
    }

    public final f30 o() {
        return this.f23348b;
    }

    public final boolean p() {
        return this.f23356j;
    }

    public final String q() {
        return this.f23355i;
    }

    public final boolean r() {
        return this.f23350d;
    }

    public final boolean s() {
        return this.f23358l;
    }

    public final boolean t() {
        return this.f23354h;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PerformClickThrough(linkUrl=");
        sb3.append(this.f23347a);
        sb3.append(", pin=");
        sb3.append(this.f23348b);
        sb3.append(", auxData=");
        sb3.append(this.f23349c);
        sb3.append(", webCloseUp=");
        sb3.append(this.f23350d);
        sb3.append(", analyticContext=");
        sb3.append(this.f23351e);
        sb3.append(", analyticContextForClickthrough=");
        sb3.append(this.f23352f);
        sb3.append(", eventData=");
        sb3.append(this.f23353g);
        sb3.append(", isDLCollection=");
        sb3.append(this.f23354h);
        sb3.append(", uniqueScreenKey=");
        sb3.append(this.f23355i);
        sb3.append(", skipToBrowser=");
        sb3.append(this.f23356j);
        sb3.append(", enableBottomToolbar=");
        sb3.append(this.f23357k);
        sb3.append(", isAdsAndroidInternalLinkEnabled=");
        return a.a.r(sb3, this.f23358l, ")");
    }
}
