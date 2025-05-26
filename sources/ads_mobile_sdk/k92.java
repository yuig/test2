package ads_mobile_sdk;

import android.graphics.Point;
import android.graphics.Rect;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k92 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7173a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7176d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7177e;

    /* renamed from: f, reason: collision with root package name */
    public final zn f7178f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f7179g;

    /* renamed from: h, reason: collision with root package name */
    public final Pair f7180h;

    /* renamed from: i, reason: collision with root package name */
    public final Pair f7181i;

    public k92(int i13, int i14, int i15, int i16, boolean z13, zn closeButtonPosition, Rect originalAdPosition, Pair activityWindowDimensions, Pair activityVerticalLimits) {
        Intrinsics.checkNotNullParameter(closeButtonPosition, "closeButtonPosition");
        Intrinsics.checkNotNullParameter(originalAdPosition, "originalAdPosition");
        Intrinsics.checkNotNullParameter(activityWindowDimensions, "activityWindowDimensions");
        Intrinsics.checkNotNullParameter(activityVerticalLimits, "activityVerticalLimits");
        this.f7173a = i13;
        this.f7174b = i14;
        this.f7175c = i15;
        this.f7176d = i16;
        this.f7177e = z13;
        this.f7178f = closeButtonPosition;
        this.f7179g = originalAdPosition;
        this.f7180h = activityWindowDimensions;
        this.f7181i = activityVerticalLimits;
    }

    public final Point a() {
        Rect rect = this.f7179g;
        int i13 = rect.left + this.f7175c;
        int i14 = rect.top + this.f7176d;
        if (!this.f7177e) {
            Pair pair = this.f7181i;
            int intValue = ((Number) pair.f80346a).intValue();
            int intValue2 = ((Number) pair.f80347b).intValue();
            int intValue3 = ((Number) this.f7180h.f80346a).intValue();
            if (i13 < 0) {
                i13 = 0;
            } else {
                int i15 = this.f7173a;
                if (i13 + i15 > intValue3) {
                    i13 = intValue3 - i15;
                }
            }
            if (i14 < intValue) {
                i14 = intValue;
            } else {
                int i16 = this.f7174b;
                if (i14 + i16 > intValue2) {
                    i14 = intValue2 - i16;
                }
            }
        }
        return new Point(i13, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k92)) {
            return false;
        }
        k92 k92Var = (k92) obj;
        return this.f7173a == k92Var.f7173a && this.f7174b == k92Var.f7174b && this.f7175c == k92Var.f7175c && this.f7176d == k92Var.f7176d && this.f7177e == k92Var.f7177e && this.f7178f == k92Var.f7178f && Intrinsics.d(this.f7179g, k92Var.f7179g) && Intrinsics.d(this.f7180h, k92Var.f7180h) && Intrinsics.d(this.f7181i, k92Var.f7181i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int f13 = kh2.n3.f(this.f7176d, kh2.n3.f(this.f7175c, kh2.n3.f(this.f7174b, Integer.hashCode(this.f7173a) * 31)));
        boolean z13 = this.f7177e;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return this.f7181i.hashCode() + ((this.f7180h.hashCode() + ((this.f7179g.hashCode() + ((this.f7178f.hashCode() + ((f13 + i13) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i13 = this.f7173a;
        int i14 = this.f7174b;
        int i15 = this.f7175c;
        int i16 = this.f7176d;
        boolean z13 = this.f7177e;
        zn znVar = this.f7178f;
        Rect rect = this.f7179g;
        Pair pair = this.f7180h;
        Pair pair2 = this.f7181i;
        StringBuilder t13 = a.a.t("ResizeParams(widthDips=", i13, ", heightDips=", i14, ", offsetXDips=");
        a.a.z(t13, i15, ", offsetYDips=", i16, ", allowOffScreen=");
        t13.append(z13);
        t13.append(", closeButtonPosition=");
        t13.append(znVar);
        t13.append(", originalAdPosition=");
        t13.append(rect);
        t13.append(", activityWindowDimensions=");
        t13.append(pair);
        t13.append(", activityVerticalLimits=");
        t13.append(pair2);
        t13.append(")");
        return t13.toString();
    }
}
