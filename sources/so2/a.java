package so2;

import java.util.NoSuchElementException;
import kh2.j1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.json.internal.JsonDecodingException;
import qo2.r0;

/* loaded from: classes4.dex */
public abstract class a extends r0 implements ro2.l {

    /* renamed from: c, reason: collision with root package name */
    public final ro2.c f114752c;

    /* renamed from: d, reason: collision with root package name */
    public final ro2.k f114753d;

    public a(ro2.c cVar) {
        this.f114752c = cVar;
        this.f114753d = cVar.f108976a;
    }

    @Override // po2.c
    public boolean A() {
        return !(S() instanceof ro2.z);
    }

    @Override // qo2.r0
    public final boolean F(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            Boolean d2 = ro2.o.d(T(tag));
            if (d2 != null) {
                return d2.booleanValue();
            }
            V("boolean");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("boolean");
            throw null;
        }
    }

    @Override // qo2.r0
    public final byte G(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int e13 = ro2.o.e(T(tag));
            Byte valueOf = (-128 > e13 || e13 > 127) ? null : Byte.valueOf((byte) e13);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            V("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("byte");
            throw null;
        }
    }

    @Override // qo2.r0
    public final char H(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            String b13 = T(tag).b();
            Intrinsics.checkNotNullParameter(b13, "<this>");
            int length = b13.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return b13.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            V("char");
            throw null;
        }
    }

    @Override // qo2.r0
    public final double I(Object obj) {
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "tag");
        ro2.h0 T = T(key);
        try {
            qo2.b0 b0Var = ro2.o.f109027a;
            Intrinsics.checkNotNullParameter(T, "<this>");
            double parseDouble = Double.parseDouble(T.b());
            if (this.f114752c.f108976a.f109022k || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            Double value = Double.valueOf(parseDouble);
            String output = S().toString();
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(output, "output");
            throw j1.h(-1, j1.L1(value, key, output));
        } catch (IllegalArgumentException unused) {
            V("double");
            throw null;
        }
    }

    @Override // qo2.r0
    public final float J(Object obj) {
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "tag");
        ro2.h0 T = T(key);
        try {
            qo2.b0 b0Var = ro2.o.f109027a;
            Intrinsics.checkNotNullParameter(T, "<this>");
            float parseFloat = Float.parseFloat(T.b());
            if (this.f114752c.f108976a.f109022k || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            Float value = Float.valueOf(parseFloat);
            String output = S().toString();
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(output, "output");
            throw j1.h(-1, j1.L1(value, key, output));
        } catch (IllegalArgumentException unused) {
            V("float");
            throw null;
        }
    }

    @Override // qo2.r0
    public final po2.c K(Object obj, oo2.g inlineDescriptor) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (f0.a(inlineDescriptor)) {
            return new k(new g0(T(tag).b()), this.f114752c);
        }
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        this.f104615a.add(tag);
        return this;
    }

    @Override // qo2.r0
    public final long L(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        ro2.h0 T = T(tag);
        try {
            qo2.b0 b0Var = ro2.o.f109027a;
            Intrinsics.checkNotNullParameter(T, "<this>");
            try {
                return new g0(T.b()).h();
            } catch (JsonDecodingException e13) {
                throw new NumberFormatException(e13.getMessage());
            }
        } catch (IllegalArgumentException unused) {
            V("long");
            throw null;
        }
    }

    @Override // qo2.r0
    public final short M(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int e13 = ro2.o.e(T(tag));
            Short valueOf = (-32768 > e13 || e13 > 32767) ? null : Short.valueOf((short) e13);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            V("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("short");
            throw null;
        }
    }

    @Override // qo2.r0
    public final String N(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        ro2.h0 T = T(tag);
        if (!this.f114752c.f108976a.f109014c) {
            ro2.v vVar = T instanceof ro2.v ? (ro2.v) T : null;
            if (vVar == null) {
                throw j1.h(-1, "Unexpected 'null' literal when non-nullable string was expected");
            }
            if (!vVar.f109040a) {
                throw j1.i(-1, a.a.k("String literal for key '", tag, "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."), S().toString());
            }
        }
        if (T instanceof ro2.z) {
            throw j1.i(-1, "Unexpected 'null' value instead of string literal", S().toString());
        }
        return T.b();
    }

    public abstract ro2.n R(String str);

    public final ro2.n S() {
        ro2.n R;
        String str = (String) CollectionsKt.d0(this.f104615a);
        return (str == null || (R = R(str)) == null) ? U() : R;
    }

    public final ro2.h0 T(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        ro2.n R = R(tag);
        ro2.h0 h0Var = R instanceof ro2.h0 ? (ro2.h0) R : null;
        if (h0Var != null) {
            return h0Var;
        }
        throw j1.i(-1, "Expected JsonPrimitive at " + tag + ", found " + R, S().toString());
    }

    public abstract ro2.n U();

    public final void V(String str) {
        throw j1.i(-1, a.a.k("Failed to parse literal as '", str, "' value"), S().toString());
    }

    @Override // po2.a
    public void a(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // po2.c
    public po2.a b(oo2.g descriptor) {
        po2.a tVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ro2.n S = S();
        oo2.n c13 = descriptor.c();
        boolean d2 = Intrinsics.d(c13, oo2.o.f96904b);
        ro2.c cVar = this.f114752c;
        if (d2 || (c13 instanceof oo2.d)) {
            if (!(S instanceof ro2.e)) {
                StringBuilder sb3 = new StringBuilder("Expected ");
                l0 l0Var = k0.f80436a;
                sb3.append(l0Var.b(ro2.e.class));
                sb3.append(" as the serialized body of ");
                sb3.append(descriptor.i());
                sb3.append(", but had ");
                sb3.append(l0Var.b(S.getClass()));
                throw j1.h(-1, sb3.toString());
            }
            tVar = new t(cVar, (ro2.e) S);
        } else if (Intrinsics.d(c13, oo2.o.f96905c)) {
            oo2.g r13 = f0.h.r(descriptor.h(0), cVar.f108977b);
            oo2.n c14 = r13.c();
            if ((c14 instanceof oo2.f) || Intrinsics.d(c14, oo2.m.f96902a)) {
                if (!(S instanceof ro2.c0)) {
                    StringBuilder sb4 = new StringBuilder("Expected ");
                    l0 l0Var2 = k0.f80436a;
                    sb4.append(l0Var2.b(ro2.c0.class));
                    sb4.append(" as the serialized body of ");
                    sb4.append(descriptor.i());
                    sb4.append(", but had ");
                    sb4.append(l0Var2.b(S.getClass()));
                    throw j1.h(-1, sb4.toString());
                }
                tVar = new u(cVar, (ro2.c0) S);
            } else {
                if (!cVar.f108976a.f109015d) {
                    throw j1.g(r13);
                }
                if (!(S instanceof ro2.e)) {
                    StringBuilder sb5 = new StringBuilder("Expected ");
                    l0 l0Var3 = k0.f80436a;
                    sb5.append(l0Var3.b(ro2.e.class));
                    sb5.append(" as the serialized body of ");
                    sb5.append(descriptor.i());
                    sb5.append(", but had ");
                    sb5.append(l0Var3.b(S.getClass()));
                    throw j1.h(-1, sb5.toString());
                }
                tVar = new t(cVar, (ro2.e) S);
            }
        } else {
            if (!(S instanceof ro2.c0)) {
                StringBuilder sb6 = new StringBuilder("Expected ");
                l0 l0Var4 = k0.f80436a;
                sb6.append(l0Var4.b(ro2.c0.class));
                sb6.append(" as the serialized body of ");
                sb6.append(descriptor.i());
                sb6.append(", but had ");
                sb6.append(l0Var4.b(S.getClass()));
                throw j1.h(-1, sb6.toString());
            }
            tVar = new s(cVar, (ro2.c0) S, null, null);
        }
        return tVar;
    }

    @Override // po2.a
    public final to2.d c() {
        return this.f114752c.f108977b;
    }

    @Override // ro2.l
    public final ro2.c d() {
        return this.f114752c;
    }

    @Override // ro2.l
    public final ro2.n f() {
        return S();
    }

    @Override // qo2.r0, po2.c
    public final Object m(no2.a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return kh2.r.B(this, deserializer);
    }

    @Override // po2.c
    public final po2.c p(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (CollectionsKt.d0(this.f104615a) != null) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return K(Q(), descriptor);
        }
        return new p(this.f114752c, U()).p(descriptor);
    }
}
