package so2;

import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;

/* loaded from: classes4.dex */
public final class k extends m2 {

    /* renamed from: d, reason: collision with root package name */
    public final g0 f114800d;

    /* renamed from: e, reason: collision with root package name */
    public final to2.d f114801e;

    public k(g0 lexer, ro2.c json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f114800d = lexer;
        this.f114801e = json.f108977b;
    }

    @Override // kh2.m2, po2.c
    public final byte E() {
        g0 g0Var = this.f114800d;
        String j13 = g0Var.j();
        try {
            return kotlin.text.f0.b(j13);
        } catch (IllegalArgumentException unused) {
            g0.n(g0Var, s1.b("Failed to parse type 'UByte' for input '", j13, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // po2.a
    public final to2.d c() {
        return this.f114801e;
    }

    @Override // kh2.m2, po2.c
    public final int g() {
        g0 g0Var = this.f114800d;
        String j13 = g0Var.j();
        try {
            return kotlin.text.f0.c(j13);
        } catch (IllegalArgumentException unused) {
            g0.n(g0Var, s1.b("Failed to parse type 'UInt' for input '", j13, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // kh2.m2, po2.c
    public final long i() {
        g0 g0Var = this.f114800d;
        String j13 = g0Var.j();
        try {
            return kotlin.text.f0.e(j13);
        } catch (IllegalArgumentException unused) {
            g0.n(g0Var, s1.b("Failed to parse type 'ULong' for input '", j13, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // po2.a
    public final int o(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // kh2.m2, po2.c
    public final short q() {
        g0 g0Var = this.f114800d;
        String j13 = g0Var.j();
        try {
            return kotlin.text.f0.g(j13);
        } catch (IllegalArgumentException unused) {
            g0.n(g0Var, s1.b("Failed to parse type 'UShort' for input '", j13, '\''), 0, null, 6);
            throw null;
        }
    }
}
