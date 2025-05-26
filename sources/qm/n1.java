package qm;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public abstract class n1 {
    public static final c1 A;
    public static final z0 B;
    public static final c1 C;
    public static final a1 D;

    /* renamed from: a */
    public static final c1 f104179a = a(Class.class, new q0().b());

    /* renamed from: b */
    public static final c1 f104180b = a(BitSet.class, new b1().b());

    /* renamed from: c */
    public static final g1 f104181c;

    /* renamed from: d */
    public static final d1 f104182d;

    /* renamed from: e */
    public static final d1 f104183e;

    /* renamed from: f */
    public static final d1 f104184f;

    /* renamed from: g */
    public static final d1 f104185g;

    /* renamed from: h */
    public static final c1 f104186h;

    /* renamed from: i */
    public static final c1 f104187i;

    /* renamed from: j */
    public static final c1 f104188j;

    /* renamed from: k */
    public static final h0 f104189k;

    /* renamed from: l */
    public static final i0 f104190l;

    /* renamed from: m */
    public static final j0 f104191m;

    /* renamed from: n */
    public static final d1 f104192n;

    /* renamed from: o */
    public static final m0 f104193o;

    /* renamed from: p */
    public static final n0 f104194p;

    /* renamed from: q */
    public static final o0 f104195q;

    /* renamed from: r */
    public static final c1 f104196r;

    /* renamed from: s */
    public static final c1 f104197s;

    /* renamed from: t */
    public static final c1 f104198t;

    /* renamed from: u */
    public static final c1 f104199u;

    /* renamed from: v */
    public static final c1 f104200v;

    /* renamed from: w */
    public static final c1 f104201w;

    /* renamed from: x */
    public static final c1 f104202x;

    /* renamed from: y */
    public static final c1 f104203y;

    /* renamed from: z */
    public static final d1 f104204z;

    static {
        e1 e1Var = new e1();
        f104181c = new g1();
        f104182d = b(Boolean.TYPE, Boolean.class, e1Var);
        f104183e = b(Byte.TYPE, Byte.class, new h1());
        f104184f = b(Short.TYPE, Short.class, new i1());
        f104185g = b(Integer.TYPE, Integer.class, new j1());
        f104186h = a(AtomicInteger.class, new k1().b());
        f104187i = a(AtomicBoolean.class, new l1().b());
        f104188j = a(AtomicIntegerArray.class, new g0().b());
        f104189k = new h0();
        f104190l = new i0();
        f104191m = new j0();
        f104192n = b(Character.TYPE, Character.class, new k0());
        l0 l0Var = new l0();
        f104193o = new m0();
        f104194p = new n0();
        f104195q = new o0();
        f104196r = a(String.class, l0Var);
        f104197s = a(StringBuilder.class, new p0());
        f104198t = a(StringBuffer.class, new r0());
        f104199u = a(URL.class, new s0());
        f104200v = a(URI.class, new t0());
        f104201w = new c1(InetAddress.class, new u0(), 1);
        f104202x = a(UUID.class, new v0());
        f104203y = a(Currency.class, new w0().b());
        f104204z = new d1(Calendar.class, GregorianCalendar.class, new x0(), 1);
        A = a(Locale.class, new y0());
        z0 z0Var = new z0();
        B = z0Var;
        C = new c1(nm.s.class, z0Var, 1);
        D = new a1();
    }

    public static c1 a(Class cls, nm.i0 i0Var) {
        return new c1(cls, i0Var, 0);
    }

    public static d1 b(Class cls, Class cls2, nm.i0 i0Var) {
        return new d1(cls, cls2, i0Var, 0);
    }
}
