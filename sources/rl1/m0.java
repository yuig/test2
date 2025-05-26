package rl1;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f108630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108631b;

    /* renamed from: c, reason: collision with root package name */
    public final int f108632c;

    /* renamed from: d, reason: collision with root package name */
    public final int f108633d;

    /* renamed from: e, reason: collision with root package name */
    public final int f108634e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f108635f;

    /* renamed from: g, reason: collision with root package name */
    public final int f108636g;

    /* renamed from: h, reason: collision with root package name */
    public final int f108637h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f108638i;

    /* renamed from: j, reason: collision with root package name */
    public final int f108639j;

    /* renamed from: k, reason: collision with root package name */
    public final int f108640k;

    public m0(boolean z13, int i13, int i14, int i15, int i16, boolean z14, int i17, int i18, boolean z15, int i19, int i23) {
        this.f108630a = z13;
        this.f108631b = i13;
        this.f108632c = i14;
        this.f108633d = i15;
        this.f108634e = i16;
        this.f108635f = z14;
        this.f108636g = i17;
        this.f108637h = i18;
        this.f108638i = z15;
        this.f108639j = i19;
        this.f108640k = i23;
    }

    public static m0 a(m0 m0Var, boolean z13, int i13, int i14, int i15, int i16, int i17) {
        boolean z14 = (i17 & 1) != 0 ? m0Var.f108630a : z13;
        int i18 = (i17 & 2) != 0 ? m0Var.f108631b : i13;
        int i19 = m0Var.f108632c;
        int i23 = m0Var.f108633d;
        int i24 = m0Var.f108634e;
        boolean z15 = m0Var.f108635f;
        int i25 = (i17 & 64) != 0 ? m0Var.f108636g : i14;
        int i26 = (i17 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? m0Var.f108637h : i15;
        boolean z16 = m0Var.f108638i;
        int i27 = m0Var.f108639j;
        int i28 = (i17 & 1024) != 0 ? m0Var.f108640k : i16;
        m0Var.getClass();
        return new m0(z14, i18, i19, i23, i24, z15, i25, i26, z16, i27, i28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f108630a == m0Var.f108630a && this.f108631b == m0Var.f108631b && this.f108632c == m0Var.f108632c && this.f108633d == m0Var.f108633d && this.f108634e == m0Var.f108634e && this.f108635f == m0Var.f108635f && this.f108636g == m0Var.f108636g && this.f108637h == m0Var.f108637h && this.f108638i == m0Var.f108638i && this.f108639j == m0Var.f108639j && this.f108640k == m0Var.f108640k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108640k) + ep.b.b(this.f108639j, ep.b.e(this.f108638i, ep.b.b(this.f108637h, ep.b.b(this.f108636g, ep.b.e(this.f108635f, ep.b.b(this.f108634e, ep.b.b(this.f108633d, ep.b.b(this.f108632c, ep.b.b(this.f108631b, Boolean.hashCode(this.f108630a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIconViewModel(verified=");
        sb3.append(this.f108630a);
        sb3.append(", verifiedIcon=");
        sb3.append(this.f108631b);
        sb3.append(", verifiedIconSize=");
        sb3.append(this.f108632c);
        sb3.append(", verifiedIconPositionOffset=");
        sb3.append(this.f108633d);
        sb3.append(", verifiedIconPadding=");
        sb3.append(this.f108634e);
        sb3.append(", verifiedIconBorder=");
        sb3.append(this.f108635f);
        sb3.append(", verifiedIconBorderWidth=");
        sb3.append(this.f108636g);
        sb3.append(", verifiedIconBorderColor=");
        sb3.append(this.f108637h);
        sb3.append(", verifiedIconBackground=");
        sb3.append(this.f108638i);
        sb3.append(", verifiedIconBackgroundColor=");
        sb3.append(this.f108639j);
        sb3.append(", verifiedIconTintColor=");
        return a.a.n(sb3, this.f108640k, ")");
    }
}
