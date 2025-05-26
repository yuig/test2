package a7;

import a.cb;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final j f1080h;

    /* renamed from: i, reason: collision with root package name */
    public static final j f1081i;

    /* renamed from: a, reason: collision with root package name */
    public final int f1082a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1083b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1084c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1085d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1086e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1087f;

    /* renamed from: g, reason: collision with root package name */
    public int f1088g;

    static {
        k5.a aVar = new k5.a(1);
        aVar.f78307a = 1;
        aVar.f78308b = 2;
        aVar.f78309c = 3;
        f1080h = aVar.a();
        k5.a aVar2 = new k5.a(1);
        aVar2.f78307a = 1;
        aVar2.f78308b = 1;
        aVar2.f78309c = 2;
        f1081i = aVar2.a();
        cb.s(0, 1, 2, 3, 4);
        d7.n0.Q(5);
    }

    public j(int i13, int i14, int i15, byte[] bArr, int i16, int i17) {
        this.f1082a = i13;
        this.f1083b = i14;
        this.f1084c = i15;
        this.f1085d = bArr;
        this.f1086e = i16;
        this.f1087f = i17;
    }

    public static String b(int i13) {
        return i13 != -1 ? i13 != 1 ? i13 != 2 ? a.a.d("Undefined color range ", i13) : "Limited range" : "Full range" : "Unset color range";
    }

    public static String c(int i13) {
        return i13 != -1 ? i13 != 6 ? i13 != 1 ? i13 != 2 ? a.a.d("Undefined color space ", i13) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String d(int i13) {
        return i13 != -1 ? i13 != 10 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 6 ? i13 != 7 ? a.a.d("Undefined color transfer ", i13) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean f(j jVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        if (jVar == null) {
            return true;
        }
        int i17 = jVar.f1082a;
        return (i17 == -1 || i17 == 1 || i17 == 2) && ((i13 = jVar.f1083b) == -1 || i13 == 2) && (((i14 = jVar.f1084c) == -1 || i14 == 3) && jVar.f1085d == null && (((i15 = jVar.f1087f) == -1 || i15 == 8) && ((i16 = jVar.f1086e) == -1 || i16 == 8)));
    }

    public static boolean g(j jVar) {
        int i13;
        return jVar != null && ((i13 = jVar.f1084c) == 7 || i13 == 6);
    }

    public static int h(int i13) {
        if (i13 == 1) {
            return 1;
        }
        if (i13 != 9) {
            return (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int i(int i13) {
        if (i13 == 1) {
            return 3;
        }
        if (i13 == 4) {
            return 10;
        }
        if (i13 == 13) {
            return 2;
        }
        if (i13 == 16) {
            return 6;
        }
        if (i13 != 18) {
            return (i13 == 6 || i13 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final k5.a a() {
        k5.a aVar = new k5.a();
        aVar.f78307a = this.f1082a;
        aVar.f78308b = this.f1083b;
        aVar.f78309c = this.f1084c;
        aVar.f78312f = this.f1085d;
        aVar.f78310d = this.f1086e;
        aVar.f78311e = this.f1087f;
        return aVar;
    }

    public final boolean e() {
        return (this.f1082a == -1 || this.f1083b == -1 || this.f1084c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1082a == jVar.f1082a && this.f1083b == jVar.f1083b && this.f1084c == jVar.f1084c && Arrays.equals(this.f1085d, jVar.f1085d) && this.f1086e == jVar.f1086e && this.f1087f == jVar.f1087f;
    }

    public final int hashCode() {
        if (this.f1088g == 0) {
            this.f1088g = ((((Arrays.hashCode(this.f1085d) + ((((((527 + this.f1082a) * 31) + this.f1083b) * 31) + this.f1084c) * 31)) * 31) + this.f1086e) * 31) + this.f1087f;
        }
        return this.f1088g;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("ColorInfo(");
        sb3.append(c(this.f1082a));
        sb3.append(", ");
        sb3.append(b(this.f1083b));
        sb3.append(", ");
        sb3.append(d(this.f1084c));
        sb3.append(", ");
        sb3.append(this.f1085d != null);
        sb3.append(", ");
        String str2 = "NA";
        int i13 = this.f1086e;
        if (i13 != -1) {
            str = i13 + "bit Luma";
        } else {
            str = "NA";
        }
        sb3.append(str);
        sb3.append(", ");
        int i14 = this.f1087f;
        if (i14 != -1) {
            str2 = i14 + "bit Chroma";
        }
        return a.a.p(sb3, str2, ")");
    }
}
