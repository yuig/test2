package uk;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import el.a1;
import el.g0;
import el.h0;
import el.q0;
import el.r0;
import el.s0;
import el.t0;
import el.u0;
import el.y0;
import il.a3;
import il.a5;
import il.b3;
import il.i4;
import il.l4;
import il.o5;
import il.u4;
import il.v4;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import oi.u6;
import t3.s1;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final v4 f122372a;

    /* renamed from: b, reason: collision with root package name */
    public final List f122373b;

    /* renamed from: c, reason: collision with root package name */
    public final el.v f122374c;

    public n(v4 v4Var, List list) {
        this.f122372a = v4Var;
        this.f122373b = list;
        this.f122374c = el.v.f59543b;
    }

    public static void a(v4 v4Var) {
        for (u4 u4Var : v4Var.E()) {
            if (u4Var.E().E() == i4.UNKNOWN_KEYMATERIAL || u4Var.E().E() == i4.SYMMETRIC || u4Var.E().E() == i4.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(s1.c("keyset contains key material of type ", u4Var.E().E().name(), " for type url ", u4Var.E().F()));
            }
        }
    }

    public static final n b(v4 v4Var) {
        if (v4Var == null || v4Var.D() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(v4Var.D());
        for (u4 u4Var : v4Var.E()) {
            u4Var.F();
            try {
                se.l f13 = f(u4Var);
                int i13 = j.f122364a[u4Var.H().ordinal()];
                if (i13 != 1 && i13 != 2 && i13 != 3) {
                    throw new GeneralSecurityException("Unknown key status");
                }
                arrayList.add(new m(f13));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return new n(v4Var, Collections.unmodifiableList(arrayList));
    }

    public static final n d(nd.g gVar, dl.a aVar) {
        byte[] bArr = new byte[0];
        b3 b13 = gVar.b();
        if (b13.D().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            v4 I = v4.I(aVar.b(b13.D().i(), bArr), com.google.crypto.tink.shaded.protobuf.u.a());
            if (I.D() > 0) {
                return b(I);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static final n e(g gVar) {
        try {
            try {
                v4 I = v4.I(gVar.e().d(), com.google.crypto.tink.shaded.protobuf.u.a());
                a(I);
                return b(I);
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (InvalidProtocolBufferException unused2) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static se.l f(u4 u4Var) {
        u0 a13 = u0.a(u4Var.E().F(), u4Var.E().G(), u4Var.E().E(), u4Var.G(), u4Var.G() == o5.RAW ? null : Integer.valueOf(u4Var.F()));
        h0 h0Var = h0.f59491b;
        a1 a1Var = (a1) h0Var.f59492a.get();
        a1Var.getClass();
        return !a1Var.f59454b.containsKey(new y0(u0.class, a13.f59538b)) ? new el.s(a13) : h0Var.a(a13);
    }

    public final Object c(Class cls) {
        Class cls2;
        int i13 = t.f122376a;
        try {
            cls2 = g0.f59489b.a(cls);
        } catch (GeneralSecurityException unused) {
            cls2 = null;
        }
        if (cls2 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i14 = v.f122377a;
        v4 v4Var = this.f122372a;
        int F = v4Var.F();
        boolean z13 = true;
        int i15 = 0;
        boolean z14 = false;
        for (u4 u4Var : v4Var.E()) {
            if (u4Var.H() == l4.ENABLED) {
                if (!u4Var.I()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(u4Var.F())));
                }
                if (u4Var.G() == o5.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(u4Var.F())));
                }
                if (u4Var.H() == l4.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(u4Var.F())));
                }
                if (u4Var.F() == F) {
                    if (z14) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z14 = true;
                }
                if (u4Var.E().E() != i4.ASYMMETRIC_PUBLIC) {
                    z13 = false;
                }
                i15++;
            }
        }
        if (i15 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z14 && !z13) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        r0 r0Var = new r0(cls2);
        if (r0Var.f59524a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        r0Var.f59528e = this.f122374c;
        int i16 = 0;
        while (true) {
            List list = this.f122373b;
            if (i16 >= list.size()) {
                Map map = r0Var.f59524a;
                if (map == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                s0 s0Var = r0Var.f59526c;
                el.v vVar = r0Var.f59528e;
                List list2 = r0Var.f59525b;
                Class cls3 = r0Var.f59527d;
                r0 r0Var2 = new r0(map, list2, s0Var, vVar, cls3);
                r0Var.f59524a = null;
                int i17 = t.f122376a;
                HashMap hashMap = ((q0) g0.f59489b.f59490a.get()).f59521b;
                if (!hashMap.containsKey(cls)) {
                    throw new GeneralSecurityException(a.a.h("No wrapper found for ", cls));
                }
                t0 t0Var = (t0) hashMap.get(cls);
                if (cls3.equals(t0Var.a()) && t0Var.a().equals(cls3)) {
                    return t0Var.c(r0Var2);
                }
                throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            u4 C = v4Var.C(i16);
            if (C.H().equals(l4.ENABLED)) {
                m mVar = (m) list.get(i16);
                if (mVar == null) {
                    StringBuilder s13 = a.a.s("Key parsing of key with index ", i16, " and type_url ");
                    s13.append(C.E().F());
                    s13.append(" failed, unable to get primitive");
                    throw new GeneralSecurityException(s13.toString());
                }
                try {
                    Object b13 = g0.f59489b.b(mVar.f122371a, cls2);
                    if (C.F() == v4Var.F()) {
                        r0Var.a(b13, C, true);
                    } else {
                        r0Var.a(b13, C, false);
                    }
                } catch (GeneralSecurityException e13) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2 + " for key of type " + C.E().F() + ", see https://developers.google.com/tink/faq/registration_errors", e13);
                }
            }
            i16++;
        }
    }

    public final void g(u6 u6Var, dl.a aVar) {
        v4 v4Var = this.f122372a;
        byte[] a13 = aVar.a(v4Var.d(), new byte[0]);
        a3 E = b3.E();
        com.google.crypto.tink.shaded.protobuf.j d2 = com.google.crypto.tink.shaded.protobuf.k.d(a13, 0, a13.length);
        E.g();
        b3.A((b3) E.f33596b, d2);
        a5 a14 = v.a(v4Var);
        E.g();
        b3.B((b3) E.f33596b, a14);
        try {
            a3 a3Var = (a3) ((b3) E.a()).z();
            a3Var.g();
            b3.C((b3) a3Var.f33596b);
            b3 b3Var = (b3) a3Var.a();
            OutputStream outputStream = (OutputStream) u6Var.f95225b;
            int a15 = b3Var.a(null);
            Logger logger = com.google.crypto.tink.shaded.protobuf.r.f33683c;
            if (a15 > 4096) {
                a15 = 4096;
            }
            com.google.crypto.tink.shaded.protobuf.q qVar = new com.google.crypto.tink.shaded.protobuf.q(outputStream, a15);
            b3Var.f(qVar);
            qVar.N0();
        } finally {
            ((OutputStream) u6Var.f95225b).close();
        }
    }

    public final String toString() {
        return v.a(this.f122372a).toString();
    }

    public n(v4 v4Var, ArrayList arrayList, el.v vVar) {
        this.f122372a = v4Var;
        this.f122373b = arrayList;
        this.f122374c = vVar;
    }
}
