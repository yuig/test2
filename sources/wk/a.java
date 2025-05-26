package wk;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import el.b1;
import el.h0;
import el.k0;
import el.l0;
import el.m0;
import el.o0;
import el.u0;
import el.v0;
import il.a0;
import il.a1;
import il.c0;
import il.d0;
import il.f3;
import il.g1;
import il.g3;
import il.g4;
import il.i0;
import il.i4;
import il.j0;
import il.j4;
import il.n4;
import il.o4;
import il.o5;
import il.p0;
import il.q6;
import il.r0;
import il.r6;
import il.t6;
import il.z;
import java.security.GeneralSecurityException;
import vk.b0;
import vk.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k0, el.o, el.m, m0, b1, o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130042a;

    public /* synthetic */ a(int i13) {
        this.f130042a = i13;
    }

    @Override // el.m
    public final se.l b(u0 u0Var) {
        uk.l lVar = uk.l.f122370b;
        d7.g gVar = null;
        Integer num = u0Var.f59542f;
        o5 o5Var = u0Var.f59541e;
        com.google.crypto.tink.shaded.protobuf.k kVar = u0Var.f59539c;
        String str = u0Var.f59537a;
        switch (this.f130042a) {
            case 2:
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    il.l H = il.l.H(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (H.F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (H.D().F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (H.E().G() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    androidx.appcompat.widget.x b13 = vk.l.b();
                    b13.x(H.D().D().size());
                    b13.z(H.E().E().size());
                    b13.A(H.D().E().C());
                    b13.C(H.E().F().E());
                    b13.f16712e = c.b(H.E().F().D());
                    b13.f16713f = c.d(o5Var);
                    vk.l e13 = b13.e();
                    m.h hVar = new m.h();
                    hVar.f85197b = e13;
                    hVar.f85198c = ll.j.h(H.D().D().i(), lVar);
                    hVar.f85199d = ll.j.h(H.E().E().i(), lVar);
                    hVar.f85200e = num;
                    return hVar.t();
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 6:
                l0 l0Var = e.f130050a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    a0 H2 = a0.H(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (H2.F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    com.google.firebase.messaging.q b14 = vk.p.b();
                    b14.D(H2.D().size());
                    b14.B(H2.E().C());
                    b14.L();
                    b14.f33806d = e.c(o5Var);
                    vk.p f13 = b14.f();
                    gi.m mVar = new gi.m();
                    mVar.f65093b = f13;
                    mVar.f65095d = ll.j.h(H2.D().i(), lVar);
                    mVar.f65094c = num;
                    return mVar.o();
                } catch (InvalidProtocolBufferException unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 10:
                l0 l0Var2 = h.f130056a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    j0 F = j0.F(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (F.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    com.google.firebase.messaging.q b15 = vk.t.b();
                    b15.E(F.C().size());
                    b15.C();
                    b15.M();
                    b15.f33806d = h.b(o5Var);
                    vk.t g13 = b15.g();
                    gi.m mVar2 = new gi.m((Object) gVar);
                    mVar2.f65093b = g13;
                    mVar2.f65095d = ll.j.h(F.C().i(), lVar);
                    mVar2.f65094c = num;
                    return mVar2.p();
                } catch (InvalidProtocolBufferException unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 14:
                l0 l0Var3 = j.f130061a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    p0 F2 = p0.F(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (F2.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    tb.l b16 = vk.x.b();
                    b16.D(F2.C().size());
                    b16.f116987c = j.b(o5Var);
                    vk.x b17 = b16.b();
                    gi.m mVar3 = new gi.m(gVar);
                    mVar3.f65093b = b17;
                    mVar3.f65095d = ll.j.h(F2.C().i(), lVar);
                    mVar3.f65094c = num;
                    return mVar3.q();
                } catch (InvalidProtocolBufferException unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 18:
                l0 l0Var4 = m.f130073a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    il.b1 F3 = il.b1.F(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (F3.D() == 0) {
                        return vk.y.j(m.b(o5Var), ll.j.h(F3.C().i(), lVar), num);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            default:
                l0 l0Var5 = y.f130098a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    r6 F4 = r6.F(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (F4.D() == 0) {
                        return s0.j(y.b(o5Var), ll.j.h(F4.C().i(), lVar), num);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused6) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // el.o
    public final u0 d(se.l lVar) {
        uk.l lVar2 = uk.l.f122370b;
        switch (this.f130042a) {
            case 1:
                vk.f fVar = (vk.f) lVar;
                il.k G = il.l.G();
                il.q G2 = il.r.G();
                il.w D = il.x.D();
                D.i(fVar.f125944b.f125986c);
                G2.j((il.x) D.a());
                byte[] J2 = fVar.f125945c.J(lVar2);
                G2.i(com.google.crypto.tink.shaded.protobuf.k.d(J2, 0, J2.length));
                G.i((il.r) G2.a());
                f3 H = g3.H();
                vk.l lVar3 = fVar.f125944b;
                H.j(c.a(lVar3));
                byte[] J3 = fVar.f125946d.J(lVar2);
                H.i(com.google.crypto.tink.shaded.protobuf.k.d(J3, 0, J3.length));
                G.j((g3) H.a());
                return u0.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((il.l) G.a()).e(), i4.SYMMETRIC, c.c(lVar3.f125988e), fVar.f125948f);
            case 5:
                vk.m mVar = (vk.m) lVar;
                l0 l0Var = e.f130050a;
                z G3 = a0.G();
                G3.j(e.a(mVar.f125993b));
                byte[] J4 = mVar.f125994c.J(lVar2);
                G3.i(com.google.crypto.tink.shaded.protobuf.k.d(J4, 0, J4.length));
                return u0.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((a0) G3.a()).e(), i4.SYMMETRIC, e.b(mVar.f125993b.f126016d), mVar.f125996e);
            case 9:
                vk.q qVar = (vk.q) lVar;
                l0 l0Var2 = h.f130056a;
                h.c(qVar.f126023b);
                i0 E = j0.E();
                byte[] J5 = qVar.f126024c.J(lVar2);
                E.i(com.google.crypto.tink.shaded.protobuf.k.d(J5, 0, J5.length));
                return u0.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((j0) E.a()).e(), i4.SYMMETRIC, h.a(qVar.f126023b.f126046d), qVar.f126026e);
            case 13:
                vk.u uVar = (vk.u) lVar;
                l0 l0Var3 = j.f130061a;
                il.o0 E2 = p0.E();
                byte[] J6 = uVar.f126052c.J(lVar2);
                E2.i(com.google.crypto.tink.shaded.protobuf.k.d(J6, 0, J6.length));
                return u0.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((p0) E2.a()).e(), i4.SYMMETRIC, j.a(uVar.f126051b.f126069b), uVar.f126054e);
            case 17:
                vk.y yVar = (vk.y) lVar;
                l0 l0Var4 = m.f130073a;
                a1 E3 = il.b1.E();
                byte[] J7 = yVar.f126071c.J(lVar2);
                E3.i(com.google.crypto.tink.shaded.protobuf.k.d(J7, 0, J7.length));
                return u0.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((il.b1) E3.a()).e(), i4.SYMMETRIC, m.a(yVar.f126070b.f125930a), yVar.f126073e);
            case 21:
                s0 s0Var = (s0) lVar;
                l0 l0Var5 = y.f130098a;
                q6 E4 = r6.E();
                byte[] J8 = s0Var.f126040c.J(lVar2);
                E4.i(com.google.crypto.tink.shaded.protobuf.k.d(J8, 0, J8.length));
                return u0.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((r6) E4.a()).e(), i4.SYMMETRIC, y.a(s0Var.f126039b.f126063a), s0Var.f126042e);
            default:
                u0 u0Var = ((el.s) lVar).f59529b;
                el.s.j(u0Var);
                return u0Var;
        }
    }

    @Override // el.o0
    public final Object g(se.l lVar) {
        byte[] b13;
        switch (this.f130042a) {
            case 25:
                vk.h hVar = fl.b.f62500a;
                if (((fl.a) lVar).f62496b.f62509a == 32) {
                    return new gl.c();
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 26:
                fl.a aVar = (fl.a) lVar;
                vk.h hVar2 = fl.b.f62500a;
                if (aVar.f62496b.f62509a == 32) {
                    return new ll.z(aVar);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 27:
                gl.d dVar = new gl.d();
                if (gl.d.f65726a.isCompatible()) {
                    return dVar;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 28:
                return new ll.z((fl.h) lVar);
            default:
                el.s sVar = (el.s) lVar;
                u0 u0Var = sVar.f59529b;
                el.s.j(u0Var);
                g4 H = j4.H();
                H.j(u0Var.f59537a);
                H.k(u0Var.f59539c);
                H.i(u0Var.f59540d);
                uk.p pVar = (uk.p) uk.t.a((j4) H.a(), uk.p.class);
                int[] iArr = gl.f.f65733a;
                o5 o5Var = u0Var.f59541e;
                int i13 = iArr[o5Var.ordinal()];
                if (i13 != 1) {
                    u0 u0Var2 = sVar.f59529b;
                    if (i13 == 2 || i13 == 3) {
                        b13 = el.i0.a(u0Var2.f59542f.intValue()).b();
                    } else {
                        if (i13 != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                        b13 = el.i0.b(u0Var2.f59542f.intValue()).b();
                    }
                } else {
                    b13 = el.i0.f59494a.b();
                }
                return new gl.g(pVar, o5Var, b13);
        }
    }

    @Override // el.b1
    public final Object get() {
        h0 h0Var = new h0();
        h0Var.d(new el.n(new a(24), el.s.class));
        return h0Var;
    }

    @Override // el.m0
    public final v0 l(uk.q qVar) {
        switch (this.f130042a) {
            case 3:
                vk.p pVar = (vk.p) qVar;
                l0 l0Var = e.f130050a;
                n4 H = o4.H();
                H.j("type.googleapis.com/google.crypto.tink.AesEaxKey");
                c0 E = d0.E();
                E.j(e.a(pVar));
                E.i(pVar.f126013a);
                H.k(((d0) E.a()).e());
                H.i(e.b(pVar.f126016d));
                return v0.a((o4) H.a());
            case 7:
                vk.t tVar = (vk.t) qVar;
                h.c(tVar);
                n4 H2 = o4.H();
                H2.j("type.googleapis.com/google.crypto.tink.AesGcmKey");
                il.l0 D = il.m0.D();
                D.i(tVar.f126043a);
                H2.k(((il.m0) D.a()).e());
                H2.i(h.a(tVar.f126046d));
                return v0.a((o4) H2.a());
            case 11:
                vk.x xVar = (vk.x) qVar;
                l0 l0Var2 = j.f130061a;
                n4 H3 = o4.H();
                H3.j("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                r0 D2 = il.s0.D();
                D2.i(xVar.f126068a);
                H3.k(((il.s0) D2.a()).e());
                H3.i(j.a(xVar.f126069b));
                return v0.a((o4) H3.a());
            case 15:
                l0 l0Var3 = m.f130073a;
                n4 H4 = o4.H();
                H4.j("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                H4.k(g1.B().e());
                H4.i(m.a(((b0) qVar).f125930a));
                return v0.a((o4) H4.a());
            default:
                l0 l0Var4 = y.f130098a;
                n4 H5 = o4.H();
                H5.j("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                H5.k(t6.B().e());
                H5.i(y.a(((vk.v0) qVar).f126063a));
                return v0.a((o4) H5.a());
        }
    }

    @Override // el.k0
    public final uk.q o(v0 v0Var) {
        o4 o4Var = v0Var.f59546b;
        switch (this.f130042a) {
            case 0:
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    il.o F = il.o.F(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a());
                    if (F.D().F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    androidx.appcompat.widget.x b13 = vk.l.b();
                    b13.x(F.C().D());
                    b13.z(F.D().D());
                    b13.A(F.C().E().C());
                    b13.C(F.D().E().E());
                    b13.f16712e = c.b(F.D().E().D());
                    b13.f16713f = c.d(o4Var.E());
                    return b13.e();
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e13);
                }
            case 4:
                l0 l0Var = e.f130050a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    d0 F2 = d0.F(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a());
                    com.google.firebase.messaging.q b14 = vk.p.b();
                    b14.D(F2.C());
                    b14.B(F2.D().C());
                    b14.L();
                    b14.f33806d = e.c(o4Var.E());
                    return b14.f();
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e14);
                }
            case 8:
                l0 l0Var2 = h.f130056a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    il.m0 E = il.m0.E(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a());
                    if (E.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    com.google.firebase.messaging.q b15 = vk.t.b();
                    b15.E(E.B());
                    b15.C();
                    b15.M();
                    b15.f33806d = h.b(o4Var.E());
                    return b15.g();
                } catch (InvalidProtocolBufferException e15) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e15);
                }
            case 12:
                l0 l0Var3 = j.f130061a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    il.s0 E2 = il.s0.E(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a());
                    if (E2.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    tb.l b16 = vk.x.b();
                    b16.D(E2.B());
                    b16.f116987c = j.b(o4Var.E());
                    return b16.b();
                } catch (InvalidProtocolBufferException e16) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e16);
                }
            case 16:
                l0 l0Var4 = m.f130073a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    g1.C(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a());
                    return new b0(m.b(o4Var.E()));
                } catch (InvalidProtocolBufferException e17) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e17);
                }
            default:
                l0 l0Var5 = y.f130098a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    if (t6.D(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a()).C() == 0) {
                        return new vk.v0(y.b(o4Var.E()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (InvalidProtocolBufferException e18) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e18);
                }
        }
    }
}
