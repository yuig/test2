package so2;

import kh2.j1;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import t3.s1;

/* loaded from: classes4.dex */
public final class c0 extends m2 implements ro2.l {

    /* renamed from: d, reason: collision with root package name */
    public final ro2.c f114765d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f114766e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f114767f;

    /* renamed from: g, reason: collision with root package name */
    public final to2.d f114768g;

    /* renamed from: h, reason: collision with root package name */
    public int f114769h;

    /* renamed from: i, reason: collision with root package name */
    public z.a f114770i;

    /* renamed from: j, reason: collision with root package name */
    public final ro2.k f114771j;

    /* renamed from: k, reason: collision with root package name */
    public final m f114772k;

    public c0(ro2.c json, i0 mode, g0 lexer, oo2.g descriptor, z.a aVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f114765d = json;
        this.f114766e = mode;
        this.f114767f = lexer;
        this.f114768g = json.f108977b;
        this.f114769h = -1;
        this.f114770i = aVar;
        ro2.k kVar = json.f108976a;
        this.f114771j = kVar;
        this.f114772k = kVar.f109017f ? null : new m(descriptor);
    }

    @Override // kh2.m2, po2.c
    public final boolean A() {
        m mVar = this.f114772k;
        return (mVar == null || !mVar.f114803b) && !this.f114767f.x(true);
    }

    @Override // kh2.m2, po2.a
    public final Object C(oo2.g descriptor, int i13, no2.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z13 = this.f114766e == i0.MAP && (i13 & 1) == 0;
        g0 g0Var = this.f114767f;
        if (z13) {
            bn0.a aVar = g0Var.f114790b;
            int[] iArr = (int[]) aVar.f23561d;
            int i14 = aVar.f23559b;
            if (iArr[i14] == -2) {
                ((Object[]) aVar.f23560c)[i14] = o.f114805a;
            }
        }
        Object C = super.C(descriptor, i13, deserializer, obj);
        if (z13) {
            bn0.a aVar2 = g0Var.f114790b;
            int[] iArr2 = (int[]) aVar2.f23561d;
            int i15 = aVar2.f23559b;
            if (iArr2[i15] != -2) {
                int i16 = i15 + 1;
                aVar2.f23559b = i16;
                if (i16 == ((Object[]) aVar2.f23560c).length) {
                    aVar2.h();
                }
            }
            Object[] objArr = (Object[]) aVar2.f23560c;
            int i17 = aVar2.f23559b;
            objArr[i17] = C;
            ((int[]) aVar2.f23561d)[i17] = -2;
        }
        return C;
    }

    @Override // kh2.m2, po2.c
    public final byte E() {
        g0 g0Var = this.f114767f;
        long h10 = g0Var.h();
        byte b13 = (byte) h10;
        if (h10 == b13) {
            return b13;
        }
        g0.n(g0Var, "Failed to parse byte for input '" + h10 + '\'', 0, null, 6);
        throw null;
    }

    @Override // kh2.m2, po2.a
    public final void a(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ro2.c cVar = this.f114765d;
        if (cVar.f108976a.f109013b && descriptor.e() == 0) {
            while (o(descriptor) != -1) {
            }
        }
        g0 g0Var = this.f114767f;
        if (g0Var.w() && !cVar.f108976a.f109025n) {
            j1.Z0(g0Var, "");
            throw null;
        }
        g0Var.g(this.f114766e.end);
        bn0.a aVar = g0Var.f114790b;
        int i13 = aVar.f23559b;
        int[] iArr = (int[]) aVar.f23561d;
        if (iArr[i13] == -2) {
            iArr[i13] = -1;
            aVar.f23559b = i13 - 1;
        }
        int i14 = aVar.f23559b;
        if (i14 != -1) {
            aVar.f23559b = i14 - 1;
        }
    }

    @Override // kh2.m2, po2.c
    public final po2.a b(oo2.g sd3) {
        Intrinsics.checkNotNullParameter(sd3, "descriptor");
        ro2.c cVar = this.f114765d;
        i0 o03 = f0.h.o0(sd3, cVar);
        g0 g0Var = this.f114767f;
        bn0.a aVar = g0Var.f114790b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(sd3, "sd");
        int i13 = aVar.f23559b + 1;
        aVar.f23559b = i13;
        if (i13 == ((Object[]) aVar.f23560c).length) {
            aVar.h();
        }
        ((Object[]) aVar.f23560c)[i13] = sd3;
        g0Var.g(o03.begin);
        if (g0Var.r() == 4) {
            g0.n(g0Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int i14 = b0.f114760a[o03.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            return new c0(this.f114765d, o03, this.f114767f, sd3, this.f114770i);
        }
        if (this.f114766e == o03 && cVar.f108976a.f109017f) {
            return this;
        }
        return new c0(this.f114765d, o03, this.f114767f, sd3, this.f114770i);
    }

    @Override // po2.a
    public final to2.d c() {
        return this.f114768g;
    }

    @Override // ro2.l
    public final ro2.c d() {
        return this.f114765d;
    }

    @Override // ro2.l
    public final ro2.n f() {
        return new y(this.f114765d.f108976a, this.f114767f).b();
    }

    @Override // kh2.m2, po2.c
    public final int g() {
        g0 g0Var = this.f114767f;
        long h10 = g0Var.h();
        int i13 = (int) h10;
        if (h10 == i13) {
            return i13;
        }
        g0.n(g0Var, "Failed to parse int for input '" + h10 + '\'', 0, null, 6);
        throw null;
    }

    @Override // kh2.m2, po2.c
    public final long i() {
        return this.f114767f.h();
    }

    @Override // kh2.m2, po2.c
    public final Object m(no2.a deserializer) {
        g0 g0Var = this.f114767f;
        ro2.c cVar = this.f114765d;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if ((deserializer instanceof qo2.b) && !cVar.f108976a.f109020i) {
                String w13 = kh2.r.w(deserializer.a(), cVar);
                String q13 = g0Var.q(w13, this.f114771j.f109014c);
                if (q13 == null) {
                    return kh2.r.B(this, deserializer);
                }
                try {
                    no2.a F = kh2.r.F((qo2.b) deserializer, this, q13);
                    this.f114770i = new z.a(w13, 16, 0);
                    return F.e(this);
                } catch (SerializationException e13) {
                    String message = e13.getMessage();
                    Intrinsics.f(message);
                    String S = StringsKt.S(".", StringsKt.d0('\n', message, message));
                    String message2 = e13.getMessage();
                    Intrinsics.f(message2);
                    g0.n(g0Var, S, 0, StringsKt.Z('\n', message2, ""), 2);
                    throw null;
                }
            }
            return deserializer.e(this);
        } catch (MissingFieldException e14) {
            String message3 = e14.getMessage();
            Intrinsics.f(message3);
            if (StringsKt.E(message3, "at path", false)) {
                throw e14;
            }
            throw new MissingFieldException(e14.getMessage() + " at path: " + g0Var.f114790b.c(), e14, e14.f80511a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00c7, code lost:
    
        r1 = r13.f114802a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00cb, code lost:
    
        if (r11 >= 64) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00cd, code lost:
    
        r1.f104631c |= 1 << r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00d6, code lost:
    
        r2 = (r11 >>> 6) - 1;
        r1 = r1.f104632d;
        r1[r2] = r1[r2] | (1 << (r11 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00e6, code lost:
    
        r13 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // po2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(oo2.g r20) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.c0.o(oo2.g):int");
    }

    @Override // kh2.m2, po2.c
    public final po2.c p(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (f0.a(descriptor)) {
            return new k(this.f114767f, this.f114765d);
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kh2.m2, po2.c
    public final short q() {
        g0 g0Var = this.f114767f;
        long h10 = g0Var.h();
        short s13 = (short) h10;
        if (h10 == s13) {
            return s13;
        }
        g0.n(g0Var, "Failed to parse short for input '" + h10 + '\'', 0, null, 6);
        throw null;
    }

    @Override // kh2.m2, po2.c
    public final float r() {
        g0 g0Var = this.f114767f;
        String j13 = g0Var.j();
        try {
            float parseFloat = Float.parseFloat(j13);
            if (this.f114765d.f108976a.f109022k || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            j1.C1(g0Var, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            g0.n(g0Var, s1.b("Failed to parse type 'float' for input '", j13, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // kh2.m2, po2.c
    public final double s() {
        g0 g0Var = this.f114767f;
        String j13 = g0Var.j();
        try {
            double parseDouble = Double.parseDouble(j13);
            if (this.f114765d.f108976a.f109022k || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            j1.C1(g0Var, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            g0.n(g0Var, s1.b("Failed to parse type 'double' for input '", j13, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // kh2.m2, po2.c
    public final boolean t() {
        boolean z13;
        boolean z14;
        g0 g0Var = this.f114767f;
        int u13 = g0Var.u();
        String str = g0Var.f114793e;
        if (u13 == str.length()) {
            g0.n(g0Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(u13) == '\"') {
            u13++;
            z13 = true;
        } else {
            z13 = false;
        }
        int t13 = g0Var.t(u13);
        if (t13 >= str.length() || t13 == -1) {
            g0.n(g0Var, "EOF", 0, null, 6);
            throw null;
        }
        int i13 = t13 + 1;
        int charAt = str.charAt(t13) | ' ';
        if (charAt == 102) {
            g0Var.c(i13, "alse");
            z14 = false;
        } else {
            if (charAt != 116) {
                g0.n(g0Var, "Expected valid boolean literal prefix, but had '" + g0Var.j() + '\'', 0, null, 6);
                throw null;
            }
            g0Var.c(i13, "rue");
            z14 = true;
        }
        if (z13) {
            if (g0Var.f114789a == str.length()) {
                g0.n(g0Var, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(g0Var.f114789a) != '\"') {
                g0.n(g0Var, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            g0Var.f114789a++;
        }
        return z14;
    }

    @Override // kh2.m2, po2.c
    public final char u() {
        g0 g0Var = this.f114767f;
        String j13 = g0Var.j();
        if (j13.length() == 1) {
            return j13.charAt(0);
        }
        g0.n(g0Var, s1.b("Expected single char, but got '", j13, '\''), 0, null, 6);
        throw null;
    }

    @Override // kh2.m2, po2.c
    public final int w(oo2.g enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return n.c(enumDescriptor, this.f114765d, z(), " at path " + this.f114767f.f114790b.c());
    }

    @Override // kh2.m2, po2.c
    public final String z() {
        boolean z13 = this.f114771j.f109014c;
        g0 g0Var = this.f114767f;
        return z13 ? g0Var.k() : g0Var.i();
    }
}
