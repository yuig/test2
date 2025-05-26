package a7;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: d, reason: collision with root package name */
    public static final o1 f1158d = new o1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1160b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1161c;

    static {
        d7.n0.Q(0);
        d7.n0.Q(1);
        d7.n0.Q(3);
    }

    public o1(int i13, int i14) {
        this(i13, 1.0f, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f1159a == o1Var.f1159a && this.f1160b == o1Var.f1160b && this.f1161c == o1Var.f1161c;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1161c) + ((((RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER + this.f1159a) * 31) + this.f1160b) * 31);
    }

    public o1(int i13, float f13, int i14) {
        this.f1159a = i13;
        this.f1160b = i14;
        this.f1161c = f13;
    }
}
