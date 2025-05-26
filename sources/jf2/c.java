package jf2;

import android.net.Uri;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.v2;
import androidx.recyclerview.widget.c3;
import c0.p1;
import c0.z;
import com.linecorp.linesdk.LineApiError;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import jl.d0;
import jl.e0;
import jl.w;
import jl.x;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import oa.i;
import r0.h;
import r0.m;
import r0.n;
import r0.r;
import uk.l;
import y0.f0;

/* loaded from: classes4.dex */
public final class c implements c1, p5.f {

    /* renamed from: a, reason: collision with root package name */
    public Object f75872a;

    /* renamed from: b, reason: collision with root package name */
    public Object f75873b;

    /* renamed from: c, reason: collision with root package name */
    public Object f75874c;

    /* renamed from: d, reason: collision with root package name */
    public Object f75875d;

    /* renamed from: e, reason: collision with root package name */
    public Object f75876e;

    /* renamed from: f, reason: collision with root package name */
    public Object f75877f;

    /* renamed from: g, reason: collision with root package name */
    public Object f75878g;

    public /* synthetic */ c() {
        this.f75872a = null;
        this.f75873b = null;
        this.f75874c = null;
        this.f75875d = null;
        this.f75876e = null;
        this.f75877f = null;
        this.f75878g = null;
    }

    public final ej.c a() {
        return new ej.c((String) this.f75872a, (String) this.f75873b, (String) this.f75874c, (String) this.f75875d, (String) this.f75876e, (Uri) this.f75877f, (String) this.f75878g);
    }

    @Override // androidx.camera.core.impl.c1
    public final boolean b(int i13) {
        return h(i13) != null;
    }

    public final w c() {
        x xVar = (x) this.f75872a;
        if (xVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        j jVar = (j) this.f75874c;
        if (jVar == null || ((j) this.f75875d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (((j) this.f75873b) == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (((j) this.f75876e) == null || ((j) this.f75877f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (((j) this.f75878g) == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = xVar.f76917c.f76907b;
        BigInteger bigInteger2 = xVar.f76918d;
        l lVar = l.f122370b;
        BigInteger k13 = jVar.k(lVar);
        BigInteger k14 = ((j) this.f75875d).k(lVar);
        BigInteger k15 = ((j) this.f75873b).k(lVar);
        BigInteger k16 = ((j) this.f75876e).k(lVar);
        BigInteger k17 = ((j) this.f75877f).k(lVar);
        BigInteger k18 = ((j) this.f75878g).k(lVar);
        if (!k13.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!k14.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!k13.multiply(k14).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger3 = BigInteger.ONE;
        BigInteger subtract = k13.subtract(bigInteger3);
        BigInteger subtract2 = k14.subtract(bigInteger3);
        if (!bigInteger.multiply(k15).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger3)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(k16).mod(subtract).equals(bigInteger3)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(k17).mod(subtract2).equals(bigInteger3)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (k14.multiply(k18).mod(k13).equals(bigInteger3)) {
            return new w((x) this.f75872a, (j) this.f75874c, (j) this.f75875d, (j) this.f75873b, (j) this.f75876e, (j) this.f75877f, (j) this.f75878g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public final d0 d() {
        e0 e0Var = (e0) this.f75872a;
        if (e0Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        j jVar = (j) this.f75874c;
        if (jVar == null || ((j) this.f75875d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (((j) this.f75873b) == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (((j) this.f75876e) == null || ((j) this.f75877f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (((j) this.f75878g) == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = e0Var.f76832c.f76811b;
        BigInteger bigInteger2 = e0Var.f76833d;
        l lVar = l.f122370b;
        BigInteger k13 = jVar.k(lVar);
        BigInteger k14 = ((j) this.f75875d).k(lVar);
        BigInteger k15 = ((j) this.f75873b).k(lVar);
        BigInteger k16 = ((j) this.f75876e).k(lVar);
        BigInteger k17 = ((j) this.f75877f).k(lVar);
        BigInteger k18 = ((j) this.f75878g).k(lVar);
        if (!k13.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!k14.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!k13.multiply(k14).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger3 = BigInteger.ONE;
        BigInteger subtract = k13.subtract(bigInteger3);
        BigInteger subtract2 = k14.subtract(bigInteger3);
        if (!bigInteger.multiply(k15).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger3)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(k16).mod(subtract).equals(bigInteger3)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(k17).mod(subtract2).equals(bigInteger3)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (k14.multiply(k18).mod(k13).equals(bigInteger3)) {
            return new d0((e0) this.f75872a, (j) this.f75874c, (j) this.f75875d, (j) this.f75873b, (j) this.f75876e, (j) this.f75877f, (j) this.f75878g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public final Object e(zi2.a aVar) {
        Object apply = ((Function) this.f75878g).apply(aVar);
        synchronized (this.f75876e) {
            ((Set) this.f75877f).add(apply);
        }
        return apply;
    }

    public final void f(String str) {
        ((ja.d0) this.f75872a).b();
        i a13 = ((c3) this.f75878g).a();
        a13.c1(1, str);
        try {
            ((ja.d0) this.f75872a).c();
            try {
                a13.G();
                ((ja.d0) this.f75872a).r();
            } finally {
                ((ja.d0) this.f75872a).m();
            }
        } finally {
            ((c3) this.f75878g).j(a13);
        }
    }

    public final Object g(final qi2.a aVar, final String str, final String str2, String str3) {
        if (str2 != null && str3 != null) {
            return ((Map) ((Map) ((Map) this.f75875d).computeIfAbsent(str, new ek0.b(4))).computeIfAbsent(str2, new ek0.b(5))).computeIfAbsent(str3, new Function() { // from class: aj2.c
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    jf2.c cVar = jf2.c.this;
                    cVar.getClass();
                    int i13 = zi2.a.f142031e;
                    qi2.d dVar = aVar;
                    if (dVar == null) {
                        dVar = qi2.a.f104005d;
                    }
                    return cVar.e(zi2.a.a(dVar, str, str2, str4));
                }
            });
        }
        if (str2 != null) {
            final int i13 = 0;
            return ((Map) ((Map) this.f75873b).computeIfAbsent(str, new ek0.b(6))).computeIfAbsent(str2, new Function(this) { // from class: aj2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ jf2.c f15438b;

                {
                    this.f15438b = this;
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i14 = i13;
                    String str4 = str;
                    qi2.d dVar = aVar;
                    jf2.c cVar = this.f15438b;
                    String str5 = (String) obj;
                    cVar.getClass();
                    switch (i14) {
                        case 0:
                            int i15 = zi2.a.f142031e;
                            if (dVar == null) {
                                dVar = qi2.a.f104005d;
                            }
                            return cVar.e(zi2.a.a(dVar, str4, str5, null));
                        default:
                            int i16 = zi2.a.f142031e;
                            if (dVar == null) {
                                dVar = qi2.a.f104005d;
                            }
                            return cVar.e(zi2.a.a(dVar, str4, null, str5));
                    }
                }
            });
        }
        if (str3 == null) {
            return ((Map) this.f75872a).computeIfAbsent(str, new Function() { // from class: aj2.e
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    jf2.c cVar = jf2.c.this;
                    cVar.getClass();
                    int i14 = zi2.a.f142031e;
                    qi2.d dVar = aVar;
                    if (dVar == null) {
                        dVar = qi2.a.f104005d;
                    }
                    return cVar.e(zi2.a.a(dVar, str4, null, null));
                }
            });
        }
        final int i14 = 1;
        return ((Map) ((Map) this.f75874c).computeIfAbsent(str, new ek0.b(7))).computeIfAbsent(str3, new Function(this) { // from class: aj2.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ jf2.c f15438b;

            {
                this.f15438b = this;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i142 = i14;
                String str4 = str;
                qi2.d dVar = aVar;
                jf2.c cVar = this.f15438b;
                String str5 = (String) obj;
                cVar.getClass();
                switch (i142) {
                    case 0:
                        int i15 = zi2.a.f142031e;
                        if (dVar == null) {
                            dVar = qi2.a.f104005d;
                        }
                        return cVar.e(zi2.a.a(dVar, str4, str5, null));
                    default:
                        int i16 = zi2.a.f142031e;
                        if (dVar == null) {
                            dVar = qi2.a.f104005d;
                        }
                        return cVar.e(zi2.a.a(dVar, str4, null, str5));
                }
            }
        });
    }

    @Override // p5.f
    public final Object get() {
        int i13 = ((androidx.camera.core.impl.f) this.f75876e).f16831d;
        Range range = (Range) this.f75878g;
        Range range2 = p1.f24298p;
        int intValue = !Objects.equals(range, range2) ? ((Integer) ((Range) this.f75878g).clamp(Integer.valueOf(i13))).intValue() : i13;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(intValue);
        objArr[1] = Integer.valueOf(i13);
        objArr[2] = Objects.equals((Range) this.f75878g, range2) ? (Range) this.f75878g : "<UNSPECIFIED>";
        m0.p("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", objArr));
        m0.p("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + intValue + "fps");
        Range range3 = ((m) this.f75874c).f105609c;
        m0.p("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        androidx.camera.core.impl.f fVar = (androidx.camera.core.impl.f) this.f75876e;
        int d2 = x0.b.d(fVar.f16830c, ((z) this.f75877f).f24408b, fVar.f16835h, intValue, fVar.f16831d, ((Size) this.f75875d).getWidth(), ((androidx.camera.core.impl.f) this.f75876e).f16832e, ((Size) this.f75875d).getHeight(), ((androidx.camera.core.impl.f) this.f75876e).f16833f, range3);
        int i14 = ((androidx.camera.core.impl.f) this.f75876e).f16834g;
        y0.f a13 = x0.b.a(i14, (String) this.f75872a);
        y0.d d13 = y0.e.d();
        String str = (String) this.f75872a;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        d13.f136303a = str;
        v2 v2Var = (v2) this.f75873b;
        if (v2Var == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        d13.f136305c = v2Var;
        Size size = (Size) this.f75875d;
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        d13.f136306d = size;
        d13.f136311i = Integer.valueOf(d2);
        d13.f136309g = Integer.valueOf(intValue);
        d13.f136304b = Integer.valueOf(i14);
        d13.f136308f = a13;
        return d13.a();
    }

    public final d1 h(int i13) {
        r rVar;
        androidx.camera.core.impl.e eVar;
        Object value;
        n nVar;
        if (((Map) this.f75877f).containsKey(Integer.valueOf(i13))) {
            return (d1) ((Map) this.f75877f).get(Integer.valueOf(i13));
        }
        d1 k13 = ((c1) this.f75872a).k(i13);
        Iterator it = ((Set) this.f75873b).iterator();
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = (r) it.next();
            if (((h) rVar).f105518j == i13) {
                break;
            }
        }
        if (rVar != null) {
            if (k13 != null) {
                for (z zVar : (Set) this.f75875d) {
                    Iterator it2 = k13.b().iterator();
                    while (it2.hasNext()) {
                        if (z0.b.a((androidx.camera.core.impl.f) it2.next(), zVar)) {
                            break;
                        }
                    }
                }
            }
            com.bumptech.glide.d.h(((Set) this.f75873b).contains(rVar));
            h hVar = (h) rVar;
            d1 k14 = ((c1) this.f75872a).k(hVar.f105518j);
            Iterator it3 = hVar.f105520l.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    eVar = null;
                    break;
                }
                Size size = (Size) it3.next();
                if (((Set) this.f75874c).contains(size)) {
                    TreeMap treeMap = new TreeMap(new e0.f(false));
                    ArrayList arrayList = new ArrayList();
                    for (z zVar2 : (Set) this.f75875d) {
                        if (k14 != null) {
                            Iterator it4 = k14.b().iterator();
                            while (it4.hasNext()) {
                                if (z0.b.a((androidx.camera.core.impl.f) it4.next(), zVar2)) {
                                    break;
                                }
                            }
                        }
                        if (((Map) this.f75878g).containsKey(zVar2)) {
                            nVar = (n) ((Map) this.f75878g).get(zVar2);
                            Objects.requireNonNull(nVar);
                        } else {
                            n nVar2 = new n(new androidx.appcompat.app.d((c1) this.f75872a, zVar2));
                            ((Map) this.f75878g).put(zVar2, nVar2);
                            nVar = nVar2;
                        }
                        t0.a a13 = nVar.a(size);
                        if (a13 != null) {
                            androidx.camera.core.impl.f fVar = a13.f115661f;
                            f0 f0Var = (f0) ((q.a) this.f75876e).apply(x0.b.e(fVar));
                            if (f0Var != null && f0Var.e(size.getWidth(), size.getHeight())) {
                                treeMap.put(new Size(fVar.f16832e, fVar.f16833f), a13);
                                arrayList.add(ph.a.x(fVar, size, f0Var.g()));
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Size size2 = k0.c.f77781a;
                        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
                        if (ceilingEntry != null) {
                            value = ceilingEntry.getValue();
                        } else {
                            Map.Entry floorEntry = treeMap.floorEntry(size);
                            value = floorEntry != null ? floorEntry.getValue() : null;
                        }
                        d1 d1Var = (d1) value;
                        Objects.requireNonNull(d1Var);
                        eVar = androidx.camera.core.impl.e.e(d1Var.a(), d1Var.c(), d1Var.d(), arrayList);
                    }
                }
            }
            if (k13 == null && eVar == null) {
                k13 = null;
            } else {
                int a14 = k13 != null ? k13.a() : eVar.f16821a;
                int c13 = k13 != null ? k13.c() : eVar.f16822b;
                List d2 = k13 != null ? k13.d() : eVar.f16823c;
                ArrayList arrayList2 = new ArrayList();
                if (k13 != null) {
                    arrayList2.addAll(k13.b());
                }
                if (eVar != null) {
                    arrayList2.addAll(eVar.f16824d);
                }
                k13 = androidx.camera.core.impl.e.e(a14, c13, d2, arrayList2);
            }
        }
        ((Map) this.f75877f).put(Integer.valueOf(i13), k13);
        return k13;
    }

    public final void i(String str) {
        this.f75874c = str;
    }

    public final void j(String str) {
        this.f75875d = str;
    }

    @Override // androidx.camera.core.impl.c1
    public final d1 k(int i13) {
        return h(i13);
    }

    public final void l(String str) {
        this.f75876e = str;
    }

    public final void m(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f75872a = id3;
    }

    public final void n(String idToken) {
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        this.f75873b = idToken;
    }

    public final void o(String str) {
        this.f75878g = str;
    }

    public final void p(Uri uri) {
        this.f75877f = uri;
    }

    public c(int i13) {
        if (i13 != 7) {
            this.f75872a = "";
            this.f75873b = "";
        } else {
            this.f75872a = rn.c.SUCCESS;
            this.f75878g = LineApiError.f34025d;
        }
    }

    public c(ja.d0 d0Var) {
        this.f75874c = new gf2.w(10);
        this.f75872a = d0Var;
        this.f75873b = new zd0.a(this, d0Var, 5);
        int i13 = 0;
        this.f75875d = new a(this, d0Var, i13);
        int i14 = 1;
        this.f75876e = new a(this, d0Var, i14);
        this.f75877f = new b(d0Var, i13);
        this.f75878g = new b(d0Var, i14);
    }

    public c(bg.c cVar) {
        this.f75872a = new ConcurrentHashMap();
        this.f75873b = new ConcurrentHashMap();
        this.f75874c = new ConcurrentHashMap();
        this.f75875d = new ConcurrentHashMap();
        this.f75876e = new Object();
        this.f75877f = Collections.newSetFromMap(new IdentityHashMap());
        this.f75878g = cVar;
    }
}
