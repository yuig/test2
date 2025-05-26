package d72;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kg.t;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import no2.g;
import org.jetbrains.annotations.NotNull;

@g
/* loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* renamed from: a, reason: collision with root package name */
    public final String f53919a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53920b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53921c;

    /* renamed from: d, reason: collision with root package name */
    public final String f53922d;

    /* renamed from: e, reason: collision with root package name */
    public final String f53923e;

    /* renamed from: f, reason: collision with root package name */
    public final String f53924f;

    /* renamed from: g, reason: collision with root package name */
    public final String f53925g;

    /* renamed from: h, reason: collision with root package name */
    public final String f53926h;

    /* renamed from: i, reason: collision with root package name */
    public final String f53927i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f53928j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f53929k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f53930l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f53931m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f53932n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f53933o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f53934p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f53935q;

    /* renamed from: r, reason: collision with root package name */
    public final String f53936r;

    /* renamed from: s, reason: collision with root package name */
    public final String f53937s;

    /* renamed from: t, reason: collision with root package name */
    public final String f53938t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f53939u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f53940v;

    public f(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z13, boolean z14, boolean z15, boolean z16, Integer num, Integer num2, Integer num3, Integer num4, String str10, String str11, String str12, Integer num5, boolean z17) {
        if (3 != (i13 & 3)) {
            t.b1(i13, 3, d.f53918b);
            throw null;
        }
        this.f53919a = str;
        this.f53920b = str2;
        if ((i13 & 4) == 0) {
            this.f53921c = null;
        } else {
            this.f53921c = str3;
        }
        if ((i13 & 8) == 0) {
            this.f53922d = null;
        } else {
            this.f53922d = str4;
        }
        if ((i13 & 16) == 0) {
            this.f53923e = null;
        } else {
            this.f53923e = str5;
        }
        if ((i13 & 32) == 0) {
            this.f53924f = null;
        } else {
            this.f53924f = str6;
        }
        if ((i13 & 64) == 0) {
            this.f53925g = null;
        } else {
            this.f53925g = str7;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            this.f53926h = null;
        } else {
            this.f53926h = str8;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0) {
            this.f53927i = null;
        } else {
            this.f53927i = str9;
        }
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0) {
            this.f53928j = false;
        } else {
            this.f53928j = z13;
        }
        if ((i13 & 1024) == 0) {
            this.f53929k = false;
        } else {
            this.f53929k = z14;
        }
        if ((i13 & 2048) == 0) {
            this.f53930l = false;
        } else {
            this.f53930l = z15;
        }
        if ((i13 & 4096) == 0) {
            this.f53931m = false;
        } else {
            this.f53931m = z16;
        }
        this.f53932n = (i13 & 8192) == 0 ? 0 : num;
        this.f53933o = (i13 & 16384) == 0 ? 0 : num2;
        this.f53934p = (32768 & i13) == 0 ? 0 : num3;
        this.f53935q = (65536 & i13) == 0 ? 0 : num4;
        if ((131072 & i13) == 0) {
            this.f53936r = null;
        } else {
            this.f53936r = str10;
        }
        if ((262144 & i13) == 0) {
            this.f53937s = null;
        } else {
            this.f53937s = str11;
        }
        if ((524288 & i13) == 0) {
            this.f53938t = null;
        } else {
            this.f53938t = str12;
        }
        this.f53939u = (1048576 & i13) == 0 ? 0 : num5;
        if ((i13 & 2097152) == 0) {
            this.f53940v = false;
        } else {
            this.f53940v = z17;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f53919a, fVar.f53919a) && Intrinsics.d(this.f53920b, fVar.f53920b) && Intrinsics.d(this.f53921c, fVar.f53921c) && Intrinsics.d(this.f53922d, fVar.f53922d) && Intrinsics.d(this.f53923e, fVar.f53923e) && Intrinsics.d(this.f53924f, fVar.f53924f) && Intrinsics.d(this.f53925g, fVar.f53925g) && Intrinsics.d(this.f53926h, fVar.f53926h) && Intrinsics.d(this.f53927i, fVar.f53927i) && this.f53928j == fVar.f53928j && this.f53929k == fVar.f53929k && this.f53930l == fVar.f53930l && this.f53931m == fVar.f53931m && Intrinsics.d(this.f53932n, fVar.f53932n) && Intrinsics.d(this.f53933o, fVar.f53933o) && Intrinsics.d(this.f53934p, fVar.f53934p) && Intrinsics.d(this.f53935q, fVar.f53935q) && Intrinsics.d(this.f53936r, fVar.f53936r) && Intrinsics.d(this.f53937s, fVar.f53937s) && Intrinsics.d(this.f53938t, fVar.f53938t) && Intrinsics.d(this.f53939u, fVar.f53939u) && this.f53940v == fVar.f53940v;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f53920b, this.f53919a.hashCode() * 31, 31);
        String str = this.f53921c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53922d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f53923e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f53924f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f53925g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f53926h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f53927i;
        int e13 = ep.b.e(this.f53931m, ep.b.e(this.f53930l, ep.b.e(this.f53929k, ep.b.e(this.f53928j, (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31), 31), 31);
        Integer num = this.f53932n;
        int hashCode7 = (e13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f53933o;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f53934p;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f53935q;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.f53936r;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f53937s;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f53938t;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num5 = this.f53939u;
        return Boolean.hashCode(this.f53940v) + ((hashCode13 + (num5 != null ? num5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserEntity(id=");
        sb3.append(this.f53919a);
        sb3.append(", username=");
        sb3.append(this.f53920b);
        sb3.append(", first_name=");
        sb3.append(this.f53921c);
        sb3.append(", last_name=");
        sb3.append(this.f53922d);
        sb3.append(", full_name=");
        sb3.append(this.f53923e);
        sb3.append(", email=");
        sb3.append(this.f53924f);
        sb3.append(", image_medium_url=");
        sb3.append(this.f53925g);
        sb3.append(", image_large_url=");
        sb3.append(this.f53926h);
        sb3.append(", image_xlarge_url=");
        sb3.append(this.f53927i);
        sb3.append(", is_employee=");
        sb3.append(this.f53928j);
        sb3.append(", shuffles_followed_by_me=");
        sb3.append(this.f53929k);
        sb3.append(", shuffles_following_me=");
        sb3.append(this.f53930l);
        sb3.append(", blocked_by_me=");
        sb3.append(this.f53931m);
        sb3.append(", shuffles_count=");
        sb3.append(this.f53932n);
        sb3.append(", shuffles_public_count=");
        sb3.append(this.f53933o);
        sb3.append(", shuffles_follower_count=");
        sb3.append(this.f53934p);
        sb3.append(", shuffles_followee_count=");
        sb3.append(this.f53935q);
        sb3.append(", about=");
        sb3.append(this.f53936r);
        sb3.append(", gender=");
        sb3.append(this.f53937s);
        sb3.append(", custom_gender=");
        sb3.append(this.f53938t);
        sb3.append(", age_in_years=");
        sb3.append(this.f53939u);
        sb3.append(", is_shuffles_private_profile=");
        return a.a.r(sb3, this.f53940v, ")");
    }
}
