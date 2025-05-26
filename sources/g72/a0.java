package g72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* renamed from: p, reason: collision with root package name */
    public static final no2.b[] f63909p = {null, null, null, null, null, o.Companion.serializer(), u4.Companion.serializer(), v1.Companion.serializer(), null, null, null, null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f63910a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63911b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63912c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63913d;

    /* renamed from: e, reason: collision with root package name */
    public final float f63914e;

    /* renamed from: f, reason: collision with root package name */
    public final o f63915f;

    /* renamed from: g, reason: collision with root package name */
    public final u4 f63916g;

    /* renamed from: h, reason: collision with root package name */
    public final v1 f63917h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f63918i;

    /* renamed from: j, reason: collision with root package name */
    public final String f63919j;

    /* renamed from: k, reason: collision with root package name */
    public final r f63920k;

    /* renamed from: l, reason: collision with root package name */
    public final Double f63921l;

    /* renamed from: m, reason: collision with root package name */
    public final Double f63922m;

    /* renamed from: n, reason: collision with root package name */
    public final b2 f63923n;

    /* renamed from: o, reason: collision with root package name */
    public final String f63924o;

    public a0(int i13, boolean z13, boolean z14, boolean z15, boolean z16, float f13, o oVar, u4 u4Var, v1 v1Var, i0 i0Var, String str, r rVar, Double d2, Double d13, b2 b2Var, String str2) {
        if ((i13 & 1) == 0) {
            this.f63910a = false;
        } else {
            this.f63910a = z13;
        }
        if ((i13 & 2) == 0) {
            this.f63911b = false;
        } else {
            this.f63911b = z14;
        }
        if ((i13 & 4) == 0) {
            this.f63912c = false;
        } else {
            this.f63912c = z15;
        }
        if ((i13 & 8) == 0) {
            this.f63913d = false;
        } else {
            this.f63913d = z16;
        }
        this.f63914e = (i13 & 16) == 0 ? 1.0f : f13;
        if ((i13 & 32) == 0) {
            this.f63915f = null;
        } else {
            this.f63915f = oVar;
        }
        if ((i13 & 64) == 0) {
            this.f63916g = null;
        } else {
            this.f63916g = u4Var;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            this.f63917h = null;
        } else {
            this.f63917h = v1Var;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0) {
            this.f63918i = null;
        } else {
            this.f63918i = i0Var;
        }
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0) {
            this.f63919j = null;
        } else {
            this.f63919j = str;
        }
        if ((i13 & 1024) == 0) {
            this.f63920k = null;
        } else {
            this.f63920k = rVar;
        }
        this.f63921l = (i13 & 2048) == 0 ? Double.valueOf(0.0d) : d2;
        this.f63922m = (i13 & 4096) == 0 ? Double.valueOf(0.0d) : d13;
        if ((i13 & 8192) == 0) {
            this.f63923n = null;
        } else {
            this.f63923n = b2Var;
        }
        if ((i13 & 16384) == 0) {
            this.f63924o = null;
        } else {
            this.f63924o = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f63910a == a0Var.f63910a && this.f63911b == a0Var.f63911b && this.f63912c == a0Var.f63912c && this.f63913d == a0Var.f63913d && Float.compare(this.f63914e, a0Var.f63914e) == 0 && Intrinsics.d(this.f63915f, a0Var.f63915f) && Intrinsics.d(this.f63916g, a0Var.f63916g) && Intrinsics.d(this.f63917h, a0Var.f63917h) && Intrinsics.d(this.f63918i, a0Var.f63918i) && Intrinsics.d(this.f63919j, a0Var.f63919j) && Intrinsics.d(this.f63920k, a0Var.f63920k) && Intrinsics.d(this.f63921l, a0Var.f63921l) && Intrinsics.d(this.f63922m, a0Var.f63922m) && Intrinsics.d(this.f63923n, a0Var.f63923n) && Intrinsics.d(this.f63924o, a0Var.f63924o);
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f63914e, ep.b.e(this.f63913d, ep.b.e(this.f63912c, ep.b.e(this.f63911b, Boolean.hashCode(this.f63910a) * 31, 31), 31), 31), 31);
        o oVar = this.f63915f;
        int hashCode = (a13 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        u4 u4Var = this.f63916g;
        int hashCode2 = (hashCode + (u4Var == null ? 0 : u4Var.hashCode())) * 31;
        v1 v1Var = this.f63917h;
        int hashCode3 = (hashCode2 + (v1Var == null ? 0 : v1Var.hashCode())) * 31;
        i0 i0Var = this.f63918i;
        int hashCode4 = (hashCode3 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        String str = this.f63919j;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        r rVar = this.f63920k;
        int hashCode6 = (hashCode5 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Double d2 = this.f63921l;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d13 = this.f63922m;
        int hashCode8 = (hashCode7 + (d13 == null ? 0 : d13.hashCode())) * 31;
        b2 b2Var = this.f63923n;
        int hashCode9 = (hashCode8 + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        String str2 = this.f63924o;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectDataEntity(isFlippedVertically=");
        sb3.append(this.f63910a);
        sb3.append(", isFlippedHorizontally=");
        sb3.append(this.f63911b);
        sb3.append(", isHidden=");
        sb3.append(this.f63912c);
        sb3.append(", isLocked=");
        sb3.append(this.f63913d);
        sb3.append(", alpha=");
        sb3.append(this.f63914e);
        sb3.append(", alphaEffectData=");
        sb3.append(this.f63915f);
        sb3.append(", motionEffectData=");
        sb3.append(this.f63916g);
        sb3.append(", frameEffectData=");
        sb3.append(this.f63917h);
        sb3.append(", filterEffectData=");
        sb3.append(this.f63918i);
        sb3.append(", backgroundColor=");
        sb3.append(this.f63919j);
        sb3.append(", bitmapMask=");
        sb3.append(this.f63920k);
        sb3.append(", rotationX=");
        sb3.append(this.f63921l);
        sb3.append(", rotationY=");
        sb3.append(this.f63922m);
        sb3.append(", keyframeAnimation=");
        sb3.append(this.f63923n);
        sb3.append(", objectId=");
        return a.a.p(sb3, this.f63924o, ")");
    }

    public a0(boolean z13, boolean z14, boolean z15, boolean z16, float f13, o oVar, u4 u4Var, v1 v1Var, i0 i0Var, String str, r rVar, Double d2, Double d13, String str2) {
        this.f63910a = z13;
        this.f63911b = z14;
        this.f63912c = z15;
        this.f63913d = z16;
        this.f63914e = f13;
        this.f63915f = oVar;
        this.f63916g = u4Var;
        this.f63917h = v1Var;
        this.f63918i = i0Var;
        this.f63919j = str;
        this.f63920k = rVar;
        this.f63921l = d2;
        this.f63922m = d13;
        this.f63923n = null;
        this.f63924o = str2;
    }
}
