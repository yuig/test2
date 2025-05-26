package a7;

import a.cb;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Objects;
import pk.v2;

/* loaded from: classes.dex */
public final class l0 {
    public static final l0 I;
    public final Integer A;
    public final Integer B;
    public final CharSequence C;
    public final CharSequence D;
    public final CharSequence E;
    public final Integer F;
    public final Bundle G;
    public final pk.c1 H;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1117a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1118b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f1119c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f1120d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f1121e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f1122f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1123g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f1124h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f1125i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f1126j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f1127k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f1128l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f1129m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f1130n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f1131o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f1132p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f1133q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f1134r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f1135s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f1136t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f1137u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f1138v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f1139w;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f1140x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f1141y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f1142z;

    static {
        k0 k0Var = new k0();
        pk.y0 y0Var = pk.c1.f100372b;
        k0Var.G = v2.f100502e;
        I = new l0(k0Var);
        cb.s(0, 1, 2, 3, 4);
        cb.s(5, 6, 8, 9, 10);
        cb.s(11, 12, 13, 14, 15);
        cb.s(16, 17, 18, 19, 20);
        cb.s(21, 22, 23, 24, 25);
        cb.s(26, 27, 28, 29, 30);
        cb.s(31, 32, 33, 34, 1000);
    }

    public l0(k0 k0Var) {
        Boolean bool = k0Var.f1105o;
        Integer num = k0Var.f1104n;
        Integer num2 = k0Var.E;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                num = Integer.valueOf(num2 != null ? b(num2.intValue()) : 0);
            }
        } else if (num != null) {
            boolean z13 = num.intValue() != -1;
            bool = Boolean.valueOf(z13);
            if (z13 && num2 == null) {
                num2 = Integer.valueOf(c(num.intValue()));
            }
        }
        this.f1117a = k0Var.f1091a;
        this.f1118b = k0Var.f1092b;
        this.f1119c = k0Var.f1093c;
        this.f1120d = k0Var.f1094d;
        this.f1121e = k0Var.f1095e;
        this.f1122f = k0Var.f1096f;
        this.f1123g = k0Var.f1097g;
        this.f1124h = k0Var.f1098h;
        this.f1125i = k0Var.f1099i;
        this.f1126j = k0Var.f1100j;
        this.f1127k = k0Var.f1101k;
        this.f1128l = k0Var.f1102l;
        this.f1129m = k0Var.f1103m;
        this.f1130n = num;
        this.f1131o = bool;
        this.f1132p = k0Var.f1106p;
        Integer num3 = k0Var.f1107q;
        this.f1133q = num3;
        this.f1134r = num3;
        this.f1135s = k0Var.f1108r;
        this.f1136t = k0Var.f1109s;
        this.f1137u = k0Var.f1110t;
        this.f1138v = k0Var.f1111u;
        this.f1139w = k0Var.f1112v;
        this.f1140x = k0Var.f1113w;
        this.f1141y = k0Var.f1114x;
        this.f1142z = k0Var.f1115y;
        this.A = k0Var.f1116z;
        this.B = k0Var.A;
        this.C = k0Var.B;
        this.D = k0Var.C;
        this.E = k0Var.D;
        this.F = num2;
        this.H = k0Var.G;
        this.G = k0Var.F;
    }

    public static int b(int i13) {
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return 1;
            case 20:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            default:
                return 0;
            case 21:
                return 2;
            case 22:
                return 3;
            case 23:
                return 4;
            case 24:
                return 5;
            case 25:
                return 6;
        }
    }

    public static int c(int i13) {
        switch (i13) {
            case 1:
                return 0;
            case 2:
                return 21;
            case 3:
                return 22;
            case 4:
                return 23;
            case 5:
                return 24;
            case 6:
                return 25;
            default:
                return 20;
        }
    }

    public final k0 a() {
        k0 k0Var = new k0();
        k0Var.f1091a = this.f1117a;
        k0Var.f1092b = this.f1118b;
        k0Var.f1093c = this.f1119c;
        k0Var.f1094d = this.f1120d;
        k0Var.f1095e = this.f1121e;
        k0Var.f1096f = this.f1122f;
        k0Var.f1097g = this.f1123g;
        k0Var.f1098h = this.f1124h;
        k0Var.f1099i = this.f1125i;
        k0Var.f1100j = this.f1126j;
        k0Var.f1101k = this.f1127k;
        k0Var.f1102l = this.f1128l;
        k0Var.f1103m = this.f1129m;
        k0Var.f1104n = this.f1130n;
        k0Var.f1105o = this.f1131o;
        k0Var.f1106p = this.f1132p;
        k0Var.f1107q = this.f1134r;
        k0Var.f1108r = this.f1135s;
        k0Var.f1109s = this.f1136t;
        k0Var.f1110t = this.f1137u;
        k0Var.f1111u = this.f1138v;
        k0Var.f1112v = this.f1139w;
        k0Var.f1113w = this.f1140x;
        k0Var.f1114x = this.f1141y;
        k0Var.f1115y = this.f1142z;
        k0Var.f1116z = this.A;
        k0Var.A = this.B;
        k0Var.B = this.C;
        k0Var.C = this.D;
        k0Var.D = this.E;
        k0Var.E = this.F;
        k0Var.G = this.H;
        k0Var.F = this.G;
        return k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (Objects.equals(this.f1117a, l0Var.f1117a) && Objects.equals(this.f1118b, l0Var.f1118b) && Objects.equals(this.f1119c, l0Var.f1119c) && Objects.equals(this.f1120d, l0Var.f1120d) && Objects.equals(this.f1121e, l0Var.f1121e) && Objects.equals(this.f1122f, l0Var.f1122f) && Objects.equals(this.f1123g, l0Var.f1123g) && Objects.equals(this.f1124h, l0Var.f1124h) && Arrays.equals(this.f1125i, l0Var.f1125i) && Objects.equals(this.f1126j, l0Var.f1126j) && Objects.equals(this.f1127k, l0Var.f1127k) && Objects.equals(this.f1128l, l0Var.f1128l) && Objects.equals(this.f1129m, l0Var.f1129m) && Objects.equals(this.f1130n, l0Var.f1130n) && Objects.equals(this.f1131o, l0Var.f1131o) && Objects.equals(this.f1132p, l0Var.f1132p) && Objects.equals(this.f1134r, l0Var.f1134r) && Objects.equals(this.f1135s, l0Var.f1135s) && Objects.equals(this.f1136t, l0Var.f1136t) && Objects.equals(this.f1137u, l0Var.f1137u) && Objects.equals(this.f1138v, l0Var.f1138v) && Objects.equals(this.f1139w, l0Var.f1139w) && Objects.equals(this.f1140x, l0Var.f1140x) && Objects.equals(this.f1141y, l0Var.f1141y) && Objects.equals(this.f1142z, l0Var.f1142z) && Objects.equals(this.A, l0Var.A) && Objects.equals(this.B, l0Var.B) && Objects.equals(this.C, l0Var.C) && Objects.equals(this.D, l0Var.D) && Objects.equals(this.E, l0Var.E) && Objects.equals(this.F, l0Var.F) && Objects.equals(this.H, l0Var.H)) {
            if ((this.G == null) == (l0Var.G == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[35];
        objArr[0] = this.f1117a;
        objArr[1] = this.f1118b;
        objArr[2] = this.f1119c;
        objArr[3] = this.f1120d;
        objArr[4] = this.f1121e;
        objArr[5] = this.f1122f;
        objArr[6] = this.f1123g;
        objArr[7] = this.f1124h;
        objArr[8] = null;
        objArr[9] = null;
        objArr[10] = Integer.valueOf(Arrays.hashCode(this.f1125i));
        objArr[11] = this.f1126j;
        objArr[12] = this.f1127k;
        objArr[13] = this.f1128l;
        objArr[14] = this.f1129m;
        objArr[15] = this.f1130n;
        objArr[16] = this.f1131o;
        objArr[17] = this.f1132p;
        objArr[18] = this.f1134r;
        objArr[19] = this.f1135s;
        objArr[20] = this.f1136t;
        objArr[21] = this.f1137u;
        objArr[22] = this.f1138v;
        objArr[23] = this.f1139w;
        objArr[24] = this.f1140x;
        objArr[25] = this.f1141y;
        objArr[26] = this.f1142z;
        objArr[27] = this.A;
        objArr[28] = this.B;
        objArr[29] = this.C;
        objArr[30] = this.D;
        objArr[31] = this.E;
        objArr[32] = this.F;
        objArr[33] = Boolean.valueOf(this.G == null);
        objArr[34] = this.H;
        return Objects.hash(objArr);
    }
}
