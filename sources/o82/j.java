package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93627a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93628b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f93629c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f93630d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93631e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f93632f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f93633g;

    public /* synthetic */ j(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i13) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, (Integer) null, (i13 & 8) != 0 ? false : z15, (i13 & 16) != 0 ? false : z16, (i13 & 32) != 0 ? false : z17, (i13 & 64) != 0 ? false : z18);
    }

    public static j a(j jVar, boolean z13, boolean z14, boolean z15, int i13) {
        if ((i13 & 1) != 0) {
            z13 = jVar.f93627a;
        }
        boolean z16 = z13;
        if ((i13 & 16) != 0) {
            z14 = jVar.f93631e;
        }
        boolean z17 = z14;
        if ((i13 & 64) != 0) {
            z15 = jVar.f93633g;
        }
        return new j(z16, jVar.f93628b, jVar.f93629c, jVar.f93630d, z17, jVar.f93632f, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f93627a == jVar.f93627a && this.f93628b == jVar.f93628b && Intrinsics.d(this.f93629c, jVar.f93629c) && this.f93630d == jVar.f93630d && this.f93631e == jVar.f93631e && this.f93632f == jVar.f93632f && this.f93633g == jVar.f93633g;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f93628b, Boolean.hashCode(this.f93627a) * 31, 31);
        Integer num = this.f93629c;
        return Boolean.hashCode(this.f93633g) + ep.b.e(this.f93632f, ep.b.e(this.f93631e, ep.b.e(this.f93630d, (e13 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GridSpacing(isFullSpan=");
        sb3.append(this.f93627a);
        sb3.append(", isFullBleed=");
        sb3.append(this.f93628b);
        sb3.append(", spanCountOverride=");
        sb3.append(this.f93629c);
        sb3.append(", shouldAddLeftSpacing=");
        sb3.append(this.f93630d);
        sb3.append(", shouldAddTopSpacing=");
        sb3.append(this.f93631e);
        sb3.append(", shouldAddRightSpacing=");
        sb3.append(this.f93632f);
        sb3.append(", shouldAddBottomSpacing=");
        return a.a.r(sb3, this.f93633g, ")");
    }

    public j(boolean z13, boolean z14, Integer num, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f93627a = z13;
        this.f93628b = z14;
        this.f93629c = num;
        this.f93630d = z15;
        this.f93631e = z16;
        this.f93632f = z17;
        this.f93633g = z18;
    }
}
