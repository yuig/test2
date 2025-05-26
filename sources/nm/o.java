package nm;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import qm.n1;
import qm.z0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f91319a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f91320b;

    /* renamed from: c, reason: collision with root package name */
    public final ae.s f91321c;

    /* renamed from: d, reason: collision with root package name */
    public final qm.j f91322d;

    /* renamed from: e, reason: collision with root package name */
    public final List f91323e;

    /* renamed from: f, reason: collision with root package name */
    public final pm.h f91324f;

    /* renamed from: g, reason: collision with root package name */
    public final i f91325g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f91326h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f91327i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f91328j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f91329k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f91330l;

    /* renamed from: m, reason: collision with root package name */
    public final j f91331m;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f91332n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f91333o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f91334p;

    /* renamed from: q, reason: collision with root package name */
    public final String f91335q;

    /* renamed from: r, reason: collision with root package name */
    public final int f91336r;

    /* renamed from: s, reason: collision with root package name */
    public final int f91337s;

    /* renamed from: t, reason: collision with root package name */
    public final z f91338t;

    /* renamed from: u, reason: collision with root package name */
    public final List f91339u;

    /* renamed from: v, reason: collision with root package name */
    public final List f91340v;

    /* renamed from: w, reason: collision with root package name */
    public final h0 f91341w;

    /* renamed from: x, reason: collision with root package name */
    public final h0 f91342x;

    /* renamed from: y, reason: collision with root package name */
    public final List f91343y;

    /* renamed from: z, reason: collision with root package name */
    public static final j f91318z = j.f91310d;
    public static final h A = h.IDENTITY;
    public static final g0 B = g0.DOUBLE;
    public static final g0 C = g0.LAZILY_PARSED_NUMBER;

    public o() {
        this(pm.h.f100591f, A, Collections.emptyMap(), false, false, false, true, f91318z, null, false, true, z.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), B, C, Collections.emptyList());
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        return com.bumptech.glide.c.v1(cls).cast(c(str, new TypeToken(cls)));
    }

    public final Object c(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        um.a aVar = new um.a(new StringReader(str));
        b0 b0Var = this.f91332n;
        if (b0Var == null) {
            b0Var = b0.LEGACY_STRICT;
        }
        aVar.O(b0Var);
        Object f13 = f(aVar, typeToken);
        if (f13 != null) {
            try {
                if (aVar.K() != um.b.END_DOCUMENT) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e13) {
                throw new JsonSyntaxException((Throwable) e13);
            } catch (IOException e14) {
                throw new JsonIOException((Throwable) e14);
            }
        }
        return f13;
    }

    public final Object d(String str, Type type) {
        return c(str, new TypeToken(type));
    }

    public final Object e(s sVar, Class cls) {
        return com.bumptech.glide.c.v1(cls).cast(sVar == null ? null : f(new qm.m(sVar), new TypeToken(cls)));
    }

    public final Object f(um.a aVar, TypeToken typeToken) {
        boolean z13;
        b0 b0Var = aVar.f122652b;
        b0 b0Var2 = this.f91332n;
        if (b0Var2 != null) {
            aVar.f122652b = b0Var2;
        } else if (b0Var == b0.LEGACY_STRICT) {
            aVar.O(b0.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        aVar.K();
                        z13 = false;
                        try {
                            return g(typeToken).c(aVar);
                        } catch (EOFException e13) {
                            e = e13;
                            if (!z13) {
                                throw new JsonSyntaxException((Throwable) e);
                            }
                            aVar.O(b0Var);
                            return null;
                        }
                    } catch (IOException e14) {
                        throw new JsonSyntaxException((Throwable) e14);
                    } catch (IllegalStateException e15) {
                        throw new JsonSyntaxException((Throwable) e15);
                    }
                } catch (AssertionError e16) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e16.getMessage(), e16);
                }
            } catch (EOFException e17) {
                e = e17;
                z13 = true;
            }
        } finally {
            aVar.O(b0Var);
        }
    }

    public final i0 g(TypeToken typeToken) {
        boolean z13;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f91320b;
        i0 i0Var = (i0) concurrentHashMap.get(typeToken);
        if (i0Var != null) {
            return i0Var;
        }
        ThreadLocal threadLocal = this.f91319a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z13 = true;
        } else {
            i0 i0Var2 = (i0) map.get(typeToken);
            if (i0Var2 != null) {
                return i0Var2;
            }
            z13 = false;
        }
        try {
            n nVar = new n();
            map.put(typeToken, nVar);
            Iterator it = this.f91323e.iterator();
            i0 i0Var3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i0Var3 = ((j0) it.next()).a(this, typeToken);
                if (i0Var3 != null) {
                    if (nVar.f91317a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    nVar.f91317a = i0Var3;
                    map.put(typeToken, i0Var3);
                }
            }
            if (z13) {
                threadLocal.remove();
            }
            if (i0Var3 != null) {
                if (z13) {
                    concurrentHashMap.putAll(map);
                }
                return i0Var3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + typeToken);
        } catch (Throwable th3) {
            if (z13) {
                threadLocal.remove();
            }
            throw th3;
        }
    }

    public final i0 h(Class cls) {
        return g(new TypeToken(cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        if (r3 == r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r3 == r6) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final nm.i0 i(nm.j0 r6, com.google.gson.reflect.TypeToken r7) {
        /*
            r5 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            qm.j r0 = r5.f91322d
            r0.getClass()
            qm.i r1 = qm.j.f104167c
            if (r6 != r1) goto L14
            goto L57
        L14:
            java.util.concurrent.ConcurrentHashMap r1 = r0.f104170b
            java.lang.Class r2 = r7.f33846a
            java.lang.Object r3 = r1.get(r2)
            nm.j0 r3 = (nm.j0) r3
            if (r3 == 0) goto L23
            if (r3 != r6) goto L58
            goto L57
        L23:
            java.lang.Class<om.a> r3 = om.a.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            om.a r3 = (om.a) r3
            if (r3 != 0) goto L2e
            goto L58
        L2e:
            java.lang.Class r3 = r3.value()
            java.lang.Class<nm.j0> r4 = nm.j0.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 != 0) goto L3b
            goto L58
        L3b:
            com.google.gson.reflect.TypeToken r4 = new com.google.gson.reflect.TypeToken
            r4.<init>(r3)
            ae.s r3 = r0.f104169a
            pm.p r3 = r3.f(r4)
            java.lang.Object r3 = r3.u()
            nm.j0 r3 = (nm.j0) r3
            java.lang.Object r1 = r1.putIfAbsent(r2, r3)
            nm.j0 r1 = (nm.j0) r1
            if (r1 == 0) goto L55
            r3 = r1
        L55:
            if (r3 != r6) goto L58
        L57:
            r6 = r0
        L58:
            java.util.List r0 = r5.f91323e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L5f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()
            nm.j0 r2 = (nm.j0) r2
            if (r1 != 0) goto L71
            if (r2 != r6) goto L5f
            r1 = 1
            goto L5f
        L71:
            nm.i0 r2 = r2.a(r5, r7)
            if (r2 == 0) goto L5f
            return r2
        L78:
            if (r1 != 0) goto L7f
            nm.i0 r6 = r5.g(r7)
            return r6
        L7f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.o.i(nm.j0, com.google.gson.reflect.TypeToken):nm.i0");
    }

    public final um.c j(Writer writer) {
        if (this.f91329k) {
            writer.write(")]}'\n");
        }
        um.c cVar = new um.c(writer);
        cVar.q(this.f91331m);
        cVar.f122677i = this.f91330l;
        b0 b0Var = this.f91332n;
        if (b0Var == null) {
            b0Var = b0.LEGACY_STRICT;
        }
        cVar.w(b0Var);
        cVar.f122679k = this.f91327i;
        return cVar;
    }

    public final String k(Object obj) {
        if (obj == null) {
            return l(t.f91365a);
        }
        Type type = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            m(obj, type, j(stringWriter));
            return stringWriter.toString();
        } catch (IOException e13) {
            throw new JsonIOException((Throwable) e13);
        }
    }

    public final String l(s sVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            n(sVar, j(stringWriter));
            return stringWriter.toString();
        } catch (IOException e13) {
            throw new JsonIOException((Throwable) e13);
        }
    }

    public final void m(Object obj, Type type, um.c cVar) {
        i0 g13 = g(new TypeToken(type));
        b0 b0Var = cVar.f122676h;
        b0 b0Var2 = this.f91332n;
        if (b0Var2 != null) {
            cVar.f122676h = b0Var2;
        } else if (b0Var == b0.LEGACY_STRICT) {
            cVar.w(b0.LENIENT);
        }
        boolean z13 = cVar.f122677i;
        boolean z14 = cVar.f122679k;
        cVar.f122677i = this.f91330l;
        cVar.f122679k = this.f91327i;
        try {
            try {
                try {
                    g13.e(cVar, obj);
                } catch (AssertionError e13) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e13.getMessage(), e13);
                }
            } catch (IOException e14) {
                throw new JsonIOException((Throwable) e14);
            }
        } finally {
            cVar.w(b0Var);
            cVar.f122677i = z13;
            cVar.f122679k = z14;
        }
    }

    public final void n(s sVar, um.c cVar) {
        b0 b0Var = cVar.f122676h;
        boolean z13 = cVar.f122677i;
        boolean z14 = cVar.f122679k;
        cVar.f122677i = this.f91330l;
        cVar.f122679k = this.f91327i;
        b0 b0Var2 = this.f91332n;
        if (b0Var2 != null) {
            cVar.f122676h = b0Var2;
        } else if (b0Var == b0.LEGACY_STRICT) {
            cVar.w(b0.LENIENT);
        }
        try {
            try {
                z0 z0Var = n1.B;
                z0Var.getClass();
                z0Var.e(sVar, cVar);
                cVar.w(b0Var);
                cVar.f122677i = z13;
                cVar.f122679k = z14;
            } catch (IOException e13) {
                throw new JsonIOException((Throwable) e13);
            } catch (AssertionError e14) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e14.getMessage(), e14);
            }
        } catch (Throwable th3) {
            cVar.w(b0Var);
            cVar.f122677i = z13;
            cVar.f122679k = z14;
            throw th3;
        }
    }

    public final s o(Object obj) {
        if (obj == null) {
            return t.f91365a;
        }
        Type type = obj.getClass();
        qm.o oVar = new qm.o();
        m(obj, type, oVar);
        return oVar.Q();
    }

    public final String toString() {
        return "{serializeNulls:" + this.f91327i + ",factories:" + this.f91323e + ",instanceCreators:" + this.f91321c + "}";
    }

    public o(pm.h hVar, i iVar, Map map, boolean z13, boolean z14, boolean z15, boolean z16, j jVar, b0 b0Var, boolean z17, boolean z18, z zVar, String str, int i13, int i14, List list, List list2, List list3, h0 h0Var, h0 h0Var2, List list4) {
        qm.d dVar;
        i0 lVar;
        i0 kVar;
        i0 kVar2;
        qm.d dVar2;
        this.f91319a = new ThreadLocal();
        this.f91320b = new ConcurrentHashMap();
        this.f91324f = hVar;
        this.f91325g = iVar;
        this.f91326h = map;
        ae.s sVar = new ae.s(map, z18, list4);
        this.f91321c = sVar;
        this.f91327i = z13;
        this.f91328j = z14;
        this.f91329k = z15;
        this.f91330l = z16;
        this.f91331m = jVar;
        this.f91332n = b0Var;
        this.f91333o = z17;
        this.f91334p = z18;
        this.f91338t = zVar;
        this.f91335q = str;
        this.f91336r = i13;
        this.f91337s = i14;
        this.f91339u = list;
        this.f91340v = list2;
        this.f91341w = h0Var;
        this.f91342x = h0Var2;
        this.f91343y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n1.C);
        qm.d dVar3 = qm.u.f104220c;
        if (h0Var == g0.DOUBLE) {
            dVar = qm.u.f104220c;
        } else {
            dVar = new qm.d(h0Var, 2);
        }
        arrayList.add(dVar);
        arrayList.add(hVar);
        arrayList.addAll(list3);
        arrayList.add(n1.f104196r);
        arrayList.add(n1.f104185g);
        arrayList.add(n1.f104182d);
        arrayList.add(n1.f104183e);
        arrayList.add(n1.f104184f);
        if (zVar == z.DEFAULT) {
            lVar = n1.f104189k;
        } else {
            lVar = new l();
        }
        arrayList.add(n1.b(Long.TYPE, Long.class, lVar));
        Class cls = Double.TYPE;
        int i15 = 0;
        if (z17) {
            kVar = n1.f104191m;
        } else {
            kVar = new k(0);
        }
        arrayList.add(n1.b(cls, Double.class, kVar));
        Class cls2 = Float.TYPE;
        int i16 = 1;
        if (z17) {
            kVar2 = n1.f104190l;
        } else {
            kVar2 = new k(1);
        }
        arrayList.add(n1.b(cls2, Float.class, kVar2));
        qm.d dVar4 = qm.s.f104217b;
        if (h0Var2 == g0.LAZILY_PARSED_NUMBER) {
            dVar2 = qm.s.f104217b;
        } else {
            dVar2 = new qm.d(new qm.s(h0Var2), i16);
        }
        arrayList.add(dVar2);
        arrayList.add(n1.f104186h);
        arrayList.add(n1.f104187i);
        arrayList.add(n1.a(AtomicLong.class, new m(lVar, 0).b()));
        arrayList.add(n1.a(AtomicLongArray.class, new m(lVar, 1).b()));
        arrayList.add(n1.f104188j);
        arrayList.add(n1.f104192n);
        arrayList.add(n1.f104197s);
        arrayList.add(n1.f104198t);
        arrayList.add(n1.a(BigDecimal.class, n1.f104193o));
        arrayList.add(n1.a(BigInteger.class, n1.f104194p));
        arrayList.add(n1.a(pm.j.class, n1.f104195q));
        arrayList.add(n1.f104199u);
        arrayList.add(n1.f104200v);
        arrayList.add(n1.f104202x);
        arrayList.add(n1.f104203y);
        arrayList.add(n1.A);
        arrayList.add(n1.f104201w);
        arrayList.add(n1.f104180b);
        arrayList.add(qm.h.f104164c);
        arrayList.add(n1.f104204z);
        if (tm.h.f118120a) {
            arrayList.add(tm.h.f118124e);
            arrayList.add(tm.h.f118123d);
            arrayList.add(tm.h.f118125f);
        }
        arrayList.add(qm.b.f104124c);
        arrayList.add(n1.f104179a);
        arrayList.add(new qm.d(sVar, i15));
        arrayList.add(new qm.q(sVar, z14));
        qm.j jVar2 = new qm.j(sVar);
        this.f91322d = jVar2;
        arrayList.add(jVar2);
        arrayList.add(n1.D);
        arrayList.add(new qm.b0(sVar, iVar, hVar, jVar2, list4));
        this.f91323e = Collections.unmodifiableList(arrayList);
    }
}
