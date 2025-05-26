package qc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f103519a;

    /* renamed from: b, reason: collision with root package name */
    public int f103520b;

    /* renamed from: c, reason: collision with root package name */
    public int f103521c;

    /* renamed from: d, reason: collision with root package name */
    public int f103522d;

    public b(int i13, int i14, int i15, int i16) {
        this.f103519a = i13;
        this.f103520b = i14;
        this.f103521c = i15;
        this.f103522d = i16;
    }

    public final int a() {
        int i13;
        int i14;
        int i15 = this.f103521c;
        int i16 = this.f103519a;
        if (i15 <= i16 || (i13 = this.f103522d) <= (i14 = this.f103520b)) {
            return 0;
        }
        return (i15 - i16) * (i13 - i14);
    }

    public final boolean b(b rect) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i19 = rect.f103519a;
        int i23 = this.f103521c;
        if (i19 >= i23 || (i13 = this.f103519a) >= (i14 = rect.f103521c) || (i15 = rect.f103520b) >= (i16 = this.f103522d) || (i17 = this.f103520b) >= (i18 = rect.f103522d)) {
            return false;
        }
        if (i13 < i19) {
            this.f103519a = i19;
        }
        if (i17 < i15) {
            this.f103520b = i15;
        }
        if (i23 > i14) {
            this.f103521c = i14;
        }
        if (i16 <= i18) {
            return true;
        }
        this.f103522d = i18;
        return true;
    }

    public final void c(b rhs) {
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        this.f103519a = rhs.f103519a;
        this.f103520b = rhs.f103520b;
        this.f103521c = rhs.f103521c;
        this.f103522d = rhs.f103522d;
    }
}
