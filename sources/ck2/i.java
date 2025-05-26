package ck2;

import h6.r;
import x02.a2;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a */
    public static final e f27921a = new e();

    /* renamed from: b */
    public static final r f27922b = new r(2);

    /* renamed from: c */
    public static final c f27923c = new c();

    /* renamed from: d */
    public static final a2 f27924d = new a2(1);

    /* renamed from: e */
    public static final a2 f27925e = new a2(4);

    /* renamed from: f */
    public static final bk.f f27926f = new bk.f();

    /* renamed from: g */
    public static final re2.h f27927g = new re2.h(2);

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(int i13, String str) {
        if (i13 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i13);
    }
}
