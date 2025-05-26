package yi1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import ey.n2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f139143a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f139144b;

    /* renamed from: c, reason: collision with root package name */
    public final String f139145c;

    /* renamed from: d, reason: collision with root package name */
    public final long f139146d;

    /* renamed from: e, reason: collision with root package name */
    public final long f139147e;

    /* renamed from: f, reason: collision with root package name */
    public final long f139148f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f139149g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f139150h;

    /* renamed from: i, reason: collision with root package name */
    public final n2 f139151i;

    public r(boolean z13, boolean z14, String str, long j13, long j14, long j15, boolean z15, boolean z16, n2 n2Var) {
        this.f139143a = z13;
        this.f139144b = z14;
        this.f139145c = str;
        this.f139146d = j13;
        this.f139147e = j14;
        this.f139148f = j15;
        this.f139149g = z15;
        this.f139150h = z16;
        this.f139151i = n2Var;
    }

    public static r a(r rVar, boolean z13, String str, long j13, long j14, boolean z14, boolean z15, n2 n2Var, int i13) {
        boolean z16 = (i13 & 1) != 0 ? rVar.f139143a : z13;
        boolean z17 = rVar.f139144b;
        String str2 = (i13 & 4) != 0 ? rVar.f139145c : str;
        long j15 = (i13 & 8) != 0 ? rVar.f139146d : j13;
        long j16 = rVar.f139147e;
        long j17 = (i13 & 32) != 0 ? rVar.f139148f : j14;
        boolean z18 = (i13 & 64) != 0 ? rVar.f139149g : z14;
        boolean z19 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? rVar.f139150h : z15;
        n2 n2Var2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? rVar.f139151i : n2Var;
        rVar.getClass();
        return new r(z16, z17, str2, j15, j16, j17, z18, z19, n2Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f139143a == rVar.f139143a && this.f139144b == rVar.f139144b && Intrinsics.d(this.f139145c, rVar.f139145c) && this.f139146d == rVar.f139146d && this.f139147e == rVar.f139147e && this.f139148f == rVar.f139148f && this.f139149g == rVar.f139149g && this.f139150h == rVar.f139150h && Intrinsics.d(this.f139151i, rVar.f139151i);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f139144b, Boolean.hashCode(this.f139143a) * 31, 31);
        String str = this.f139145c;
        int e14 = ep.b.e(this.f139150h, ep.b.e(this.f139149g, a.a.c(this.f139148f, a.a.c(this.f139147e, a.a.c(this.f139146d, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        n2 n2Var = this.f139151i;
        return e14 + (n2Var != null ? n2Var.hashCode() : 0);
    }

    public final String toString() {
        return "PinImageLoggingData(mediaLoaded=" + this.f139143a + ", cached=" + this.f139144b + ", imageUrl=" + this.f139145c + ", renderStart=" + this.f139146d + ", renderDuration=" + this.f139147e + ", impressionStart=" + this.f139148f + ", drawableImageIsDrawn=" + this.f139149g + ", isPlaceHolderDrawnOnGrid=" + this.f139150h + ", pinCellImageLoadStartEventParameters=" + this.f139151i + ")";
    }
}
