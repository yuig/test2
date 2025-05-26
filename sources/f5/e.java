package f5;

import a.cb;
import android.graphics.Insets;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f61080e = new e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f61081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61082b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61083c;

    /* renamed from: d, reason: collision with root package name */
    public final int f61084d;

    public e(int i13, int i14, int i15, int i16) {
        this.f61081a = i13;
        this.f61082b = i14;
        this.f61083c = i15;
        this.f61084d = i16;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f61081a, eVar2.f61081a), Math.max(eVar.f61082b, eVar2.f61082b), Math.max(eVar.f61083c, eVar2.f61083c), Math.max(eVar.f61084d, eVar2.f61084d));
    }

    public static e b(int i13, int i14, int i15, int i16) {
        return (i13 == 0 && i14 == 0 && i15 == 0 && i16 == 0) ? f61080e : new e(i13, i14, i15, i16);
    }

    public static e c(Insets insets) {
        int i13;
        int i14;
        int i15;
        int i16;
        i13 = insets.left;
        i14 = insets.top;
        i15 = insets.right;
        i16 = insets.bottom;
        return b(i13, i14, i15, i16);
    }

    public final Insets d() {
        return d.c(this.f61081a, this.f61082b, this.f61083c, this.f61084d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f61084d == eVar.f61084d && this.f61081a == eVar.f61081a && this.f61083c == eVar.f61083c && this.f61082b == eVar.f61082b;
    }

    public final int hashCode() {
        return (((((this.f61081a * 31) + this.f61082b) * 31) + this.f61083c) * 31) + this.f61084d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Insets{left=");
        sb3.append(this.f61081a);
        sb3.append(", top=");
        sb3.append(this.f61082b);
        sb3.append(", right=");
        sb3.append(this.f61083c);
        sb3.append(", bottom=");
        return cb.l(sb3, this.f61084d, '}');
    }
}
