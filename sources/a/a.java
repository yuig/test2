package a;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(StringBuilder sb3, int i13, String str, String str2, String str3) {
        sb3.append(i13);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
    }

    public static void B(StringBuilder sb3, String str, String str2, String str3, String str4) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
    }

    public static String C(String str, String str2) {
        return str + str2;
    }

    public static String D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int a(float f13, int i13, int i14) {
        return (Float.hashCode(f13) + i13) * i14;
    }

    public static int b(int i13, int i14, int i15, int i16) {
        return ((i13 - i14) / i15) + i16;
    }

    public static int c(long j13, int i13, int i14) {
        return (Long.hashCode(j13) + i13) * i14;
    }

    public static String d(String str, int i13) {
        return str + i13;
    }

    public static String e(String str, int i13, String str2) {
        return str + i13 + str2;
    }

    public static String f(String str, int i13, String str2, int i14) {
        return str + i13 + str2 + i14;
    }

    public static String g(String str, long j13) {
        return str + j13;
    }

    public static String h(String str, Class cls) {
        return str + cls;
    }

    public static String i(String str, Object obj) {
        return str + obj;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String n(StringBuilder sb3, int i13, String str) {
        sb3.append(i13);
        sb3.append(str);
        return sb3.toString();
    }

    public static String o(StringBuilder sb3, long j13, String str) {
        sb3.append(j13);
        sb3.append(str);
        return sb3.toString();
    }

    public static String p(StringBuilder sb3, String str, String str2) {
        sb3.append(str);
        sb3.append(str2);
        return sb3.toString();
    }

    public static String q(StringBuilder sb3, String str, String str2, String str3, String str4) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
        return sb3.toString();
    }

    public static String r(StringBuilder sb3, boolean z13, String str) {
        sb3.append(z13);
        sb3.append(str);
        return sb3.toString();
    }

    public static StringBuilder s(String str, int i13, String str2) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(i13);
        sb3.append(str2);
        return sb3;
    }

    public static StringBuilder t(String str, int i13, String str2, int i14, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(i13);
        sb3.append(str2);
        sb3.append(i14);
        sb3.append(str3);
        return sb3;
    }

    public static StringBuilder u(String str, long j13, String str2) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(j13);
        sb3.append(str2);
        return sb3;
    }

    public static StringBuilder v(String str, String str2, String str3, int i13, String str4) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(i13);
        sb3.append(str4);
        return sb3;
    }

    public static StringBuilder w(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
        sb3.append(str5);
        return sb3;
    }

    public static HashMap x(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return hashMap;
    }

    public static rl2.l y(Class cls, String str, String str2, int i13, kotlin.jvm.internal.l0 l0Var) {
        return l0Var.e(new kotlin.jvm.internal.x(cls, str, str2, i13));
    }

    public static void z(StringBuilder sb3, int i13, String str, int i14, String str2) {
        sb3.append(i13);
        sb3.append(str);
        sb3.append(i14);
        sb3.append(str2);
    }
}
