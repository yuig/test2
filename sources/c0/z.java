package c0;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final z f24400c = new z(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final z f24401d = new z(1, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final z f24402e = new z(3, 10);

    /* renamed from: f, reason: collision with root package name */
    public static final z f24403f = new z(4, 10);

    /* renamed from: g, reason: collision with root package name */
    public static final z f24404g = new z(5, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final z f24405h = new z(6, 10);

    /* renamed from: i, reason: collision with root package name */
    public static final z f24406i = new z(6, 8);

    /* renamed from: a, reason: collision with root package name */
    public final int f24407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24408b;

    public z(int i13, int i14) {
        this.f24407a = i13;
        this.f24408b = i14;
    }

    public final boolean a() {
        return b() && this.f24407a != 1 && this.f24408b == 10;
    }

    public final boolean b() {
        int i13 = this.f24407a;
        return (i13 == 0 || i13 == 2 || this.f24408b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f24407a == zVar.f24407a && this.f24408b == zVar.f24408b;
    }

    public final int hashCode() {
        return ((this.f24407a ^ 1000003) * 1000003) ^ this.f24408b;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("DynamicRange@");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("{encoding=");
        switch (this.f24407a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb3.append(str);
        sb3.append(", bitDepth=");
        return a.a.n(sb3, this.f24408b, "}");
    }
}
