package ke2;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a */
    public PointF f79304a;

    /* renamed from: b */
    public float f79305b;

    /* renamed from: c */
    public hd2.a f79306c;

    /* renamed from: d */
    public a f79307d;

    /* renamed from: e */
    public float f79308e;

    public b(PointF center, float f13, hd2.a rotation, a flip, int i13) {
        rotation = (i13 & 4) != 0 ? new hd2.a(0.0d) : rotation;
        flip = (i13 & 8) != 0 ? new a(0.0f, 0.0f) : flip;
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(flip, "flip");
        this.f79304a = center;
        this.f79305b = f13;
        this.f79306c = rotation;
        this.f79307d = flip;
        this.f79308e = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f79304a, bVar.f79304a) && Float.compare(this.f79305b, bVar.f79305b) == 0 && Intrinsics.d(this.f79306c, bVar.f79306c) && Intrinsics.d(this.f79307d, bVar.f79307d) && Float.compare(this.f79308e, bVar.f79308e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f79308e) + ((this.f79307d.hashCode() + ((this.f79306c.hashCode() + a.a.a(this.f79305b, this.f79304a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ItemLayout(center=");
        sb3.append(this.f79304a);
        sb3.append(", z=");
        sb3.append(this.f79305b);
        sb3.append(", rotation=");
        sb3.append(this.f79306c);
        sb3.append(", flip=");
        sb3.append(this.f79307d);
        sb3.append(", scale=");
        return d7.g.h(sb3, this.f79308e, ')');
    }
}
