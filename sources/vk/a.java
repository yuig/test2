package vk;

import il.q5;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public abstract class a {
    static {
        int i13 = q5.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e13) {
            throw new ExceptionInInitializerError(e13);
        }
    }

    public static void a() {
        el.g0 g0Var = el.g0.f59489b;
        g0Var.d(e.f125940a);
        g0Var.c(e.f125941b);
        fl.m.a();
        yk.d dVar = i.f125960e;
        if (!dVar.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        el.l0 l0Var = wk.c.f130045a;
        el.h0 h0Var = el.h0.f59491b;
        h0Var.f(wk.c.f130045a);
        h0Var.e(wk.c.f130046b);
        h0Var.d(wk.c.f130047c);
        h0Var.c(wk.c.f130048d);
        g0Var.c(i.f125956a);
        el.f0 f0Var = el.f0.f59486b;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", p0.f126021e);
        androidx.appcompat.widget.x b13 = l.b();
        b13.x(16);
        b13.z(32);
        b13.C(16);
        b13.A(16);
        j jVar = j.f125967d;
        b13.f16712e = jVar;
        k kVar = k.f125975d;
        b13.f16713f = kVar;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", b13.e());
        hashMap.put("AES256_CTR_HMAC_SHA256", p0.f126022f);
        androidx.appcompat.widget.x b14 = l.b();
        b14.x(32);
        b14.z(32);
        b14.C(32);
        b14.A(16);
        b14.f16712e = jVar;
        b14.f16713f = kVar;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", b14.e());
        f0Var.b(Collections.unmodifiableMap(hashMap));
        el.c0 c0Var = el.c0.f59461b;
        c0Var.a(i.f125958c, l.class);
        el.a0 a0Var = el.a0.f59451b;
        a0Var.a(i.f125959d, l.class);
        el.k kVar2 = el.k.f59500d;
        kVar2.d(i.f125957b, dVar, true);
        yk.d dVar2 = r.f126032e;
        if (!dVar2.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        h0Var.f(wk.h.f130056a);
        h0Var.e(wk.h.f130057b);
        h0Var.d(wk.h.f130058c);
        h0Var.c(wk.h.f130059d);
        g0Var.c(r.f126028a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", p0.f126017a);
        com.google.firebase.messaging.q b15 = t.b();
        b15.C();
        b15.E(16);
        b15.M();
        s sVar = s.f126037d;
        b15.f33806d = sVar;
        hashMap2.put("AES128_GCM_RAW", b15.g());
        hashMap2.put("AES256_GCM", p0.f126018b);
        com.google.firebase.messaging.q b16 = t.b();
        b16.C();
        b16.E(32);
        b16.M();
        b16.f33806d = sVar;
        hashMap2.put("AES256_GCM_RAW", b16.g());
        f0Var.b(Collections.unmodifiableMap(hashMap2));
        c0Var.a(r.f126030c, t.class);
        a0Var.a(r.f126031d, t.class);
        kVar2.d(r.f126029b, dVar2, true);
        if (yk.e.f139223b.get()) {
            return;
        }
        el.n0 n0Var = n.f126001a;
        yk.d dVar3 = yk.d.ALGORITHM_NOT_FIPS;
        if (!dVar3.isCompatible()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        h0Var.f(wk.e.f130050a);
        h0Var.e(wk.e.f130051b);
        h0Var.d(wk.e.f130052c);
        h0Var.c(wk.e.f130053d);
        g0Var.c(n.f126001a);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", p0.f126019c);
        com.google.firebase.messaging.q b17 = p.b();
        b17.B(16);
        b17.D(16);
        b17.L();
        o oVar = o.f126007d;
        b17.f33806d = oVar;
        hashMap3.put("AES128_EAX_RAW", b17.f());
        hashMap3.put("AES256_EAX", p0.f126020d);
        com.google.firebase.messaging.q b18 = p.b();
        b18.B(16);
        b18.D(32);
        b18.L();
        b18.f33806d = oVar;
        hashMap3.put("AES256_EAX_RAW", b18.f());
        f0Var.b(Collections.unmodifiableMap(hashMap3));
        a0Var.a(n.f126003c, p.class);
        kVar2.c(n.f126002b, true);
        el.n0 n0Var2 = v.f126059a;
        if (!dVar3.isCompatible()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        h0Var.f(wk.j.f130061a);
        h0Var.e(wk.j.f130062b);
        h0Var.d(wk.j.f130063c);
        h0Var.c(wk.j.f130064d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            g0Var.c(v.f126059a);
            HashMap hashMap4 = new HashMap();
            tb.l b19 = x.b();
            b19.D(16);
            w wVar = w.f126064b;
            b19.f116987c = wVar;
            hashMap4.put("AES128_GCM_SIV", b19.b());
            tb.l b23 = x.b();
            b23.D(16);
            w wVar2 = w.f126066d;
            b23.f116987c = wVar2;
            hashMap4.put("AES128_GCM_SIV_RAW", b23.b());
            tb.l b24 = x.b();
            b24.D(32);
            b24.f116987c = wVar;
            hashMap4.put("AES256_GCM_SIV", b24.b());
            tb.l b25 = x.b();
            b25.D(32);
            b25.f116987c = wVar2;
            hashMap4.put("AES256_GCM_SIV_RAW", b25.b());
            f0Var.b(Collections.unmodifiableMap(hashMap4));
            c0Var.a(v.f126061c, x.class);
            a0Var.a(v.f126060b, x.class);
            kVar2.c(v.f126062d, true);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        el.n0 n0Var3 = z.f126074a;
        yk.d dVar4 = yk.d.ALGORITHM_NOT_FIPS;
        if (!dVar4.isCompatible()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        el.l0 l0Var2 = wk.m.f130073a;
        el.h0 h0Var2 = el.h0.f59491b;
        h0Var2.f(wk.m.f130073a);
        h0Var2.e(wk.m.f130074b);
        h0Var2.d(wk.m.f130075c);
        h0Var2.c(wk.m.f130076d);
        el.g0 g0Var2 = el.g0.f59489b;
        g0Var2.c(z.f126074a);
        el.a0 a0Var2 = el.a0.f59451b;
        a0Var2.a(z.f126075b, b0.class);
        el.f0 f0Var2 = el.f0.f59486b;
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new b0(a0.f125926b));
        hashMap5.put("CHACHA20_POLY1305_RAW", new b0(a0.f125928d));
        f0Var2.b(Collections.unmodifiableMap(hashMap5));
        el.k kVar3 = el.k.f59500d;
        kVar3.c(z.f126076c, true);
        el.n0 n0Var4 = c0.f125931a;
        if (!dVar4.isCompatible()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        h0Var2.f(i0.f125961a);
        h0Var2.e(i0.f125962b);
        h0Var2.d(i0.f125963c);
        h0Var2.c(i0.f125964d);
        g0Var2.c(c0.f125931a);
        a0Var2.a(c0.f125933c, g0.class);
        kVar3.c(c0.f125932b, true);
        el.q qVar = d0.f125937a;
        if (!dVar4.isCompatible()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        h0Var2.f(o0.f126009a);
        h0Var2.e(o0.f126010b);
        h0Var2.d(o0.f126011c);
        h0Var2.c(o0.f126012d);
        a0Var2.a(d0.f125938b, m0.class);
        g0Var2.c(d0.f125939c);
        kVar3.c(d0.f125937a, true);
        el.n0 n0Var5 = t0.f126047a;
        if (!dVar4.isCompatible()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        h0Var2.f(wk.y.f130098a);
        h0Var2.e(wk.y.f130099b);
        h0Var2.d(wk.y.f130100c);
        h0Var2.c(wk.y.f130101d);
        g0Var2.c(t0.f126047a);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new v0(u0.f126055b));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new v0(u0.f126057d));
        f0Var2.b(Collections.unmodifiableMap(hashMap6));
        a0Var2.a(t0.f126050d, v0.class);
        el.c0.f59461b.a(t0.f126049c, v0.class);
        kVar3.c(t0.f126048b, true);
    }
}
