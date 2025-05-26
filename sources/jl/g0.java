package jl;

import el.h0;
import el.l0;
import el.n0;
import il.q5;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class g0 {
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
        g0Var.d(p.f76884a);
        g0Var.c(p.f76885b);
        g0Var.d(r.f76888a);
        g0Var.c(r.f76889b);
        yk.d dVar = h.f76853f;
        if (!dVar.isCompatible()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        l0 l0Var = kl.b.f80004a;
        h0 h0Var = h0.f59491b;
        h0Var.f(kl.b.f80004a);
        h0Var.e(kl.b.f80005b);
        h0Var.d(kl.b.f80006c);
        h0Var.c(kl.b.f80007d);
        h0Var.d(kl.b.f80008e);
        h0Var.c(kl.b.f80009f);
        el.f0 f0Var = el.f0.f59486b;
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", n.f76872a);
        hashMap.put("ECDSA_P256_IEEE_P1363", n.f76875d);
        m.h b13 = e.b();
        b13.f85199d = b.f76797b;
        b13.f85198c = a.f76788c;
        b13.f85197b = c.f76806b;
        b13.f85200e = d.f76819e;
        hashMap.put("ECDSA_P256_RAW", b13.s());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", n.f76877f);
        hashMap.put("ECDSA_P384", n.f76873b);
        hashMap.put("ECDSA_P384_IEEE_P1363", n.f76876e);
        m.h b14 = e.b();
        b14.f85199d = b.f76799d;
        a aVar = a.f76789d;
        b14.f85198c = aVar;
        c cVar = c.f76807c;
        b14.f85197b = cVar;
        d dVar2 = d.f76816b;
        b14.f85200e = dVar2;
        hashMap.put("ECDSA_P384_SHA512", b14.s());
        m.h b15 = e.b();
        b15.f85199d = b.f76798c;
        b15.f85198c = aVar;
        b15.f85197b = cVar;
        b15.f85200e = dVar2;
        hashMap.put("ECDSA_P384_SHA384", b15.s());
        hashMap.put("ECDSA_P521", n.f76874c);
        hashMap.put("ECDSA_P521_IEEE_P1363", n.f76878g);
        f0Var.b(Collections.unmodifiableMap(hashMap));
        g0Var.c(h.f76848a);
        g0Var.c(h.f76849b);
        el.a0 a0Var = el.a0.f59451b;
        a0Var.a(h.f76852e, e.class);
        el.k kVar = el.k.f59500d;
        kVar.d(h.f76850c, dVar, true);
        kVar.d(h.f76851d, dVar, false);
        yk.d dVar3 = y.f76926f;
        if (!dVar3.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        h0Var.f(kl.g.f80021a);
        h0Var.e(kl.g.f80022b);
        h0Var.d(kl.g.f80023c);
        h0Var.c(kl.g.f80024d);
        h0Var.d(kl.g.f80025e);
        h0Var.c(kl.g.f80026f);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4", n.f76879h);
        s b16 = v.b();
        b16.f76894c = t.f76896b;
        b16.f76892a = 3072;
        BigInteger bigInteger = v.f76905e;
        b16.f76893b = bigInteger;
        u uVar = u.f76903e;
        b16.f76895d = uVar;
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", b16.a());
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", n.f76880i);
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4", n.f76881j);
        s b17 = v.b();
        b17.f76894c = t.f76898d;
        b17.f76892a = 4096;
        b17.f76893b = bigInteger;
        b17.f76895d = uVar;
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", b17.a());
        f0Var.b(hashMap2);
        g0Var.c(y.f76921a);
        g0Var.c(y.f76922b);
        a0Var.a(y.f76925e, v.class);
        kVar.d(y.f76923c, dVar3, true);
        kVar.d(y.f76924d, dVar3, false);
        yk.d dVar4 = f0.f76843f;
        if (!dVar4.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        h0Var.f(kl.i.f80037a);
        h0Var.e(kl.i.f80038b);
        h0Var.d(kl.i.f80039c);
        h0Var.c(kl.i.f80040d);
        h0Var.d(kl.i.f80041e);
        h0Var.c(kl.i.f80042f);
        HashMap hashMap3 = new HashMap();
        z b18 = c0.b();
        a0 a0Var2 = a0.f76793b;
        b18.f76931c = a0Var2;
        b18.f76932d = a0Var2;
        b18.b(32);
        b18.f76929a = 3072;
        BigInteger bigInteger2 = c0.f76809g;
        b18.f76930b = bigInteger2;
        b0 b0Var = b0.f76801b;
        b18.f76934f = b0Var;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4", b18.a());
        z b19 = c0.b();
        b19.f76931c = a0Var2;
        b19.f76932d = a0Var2;
        b19.b(32);
        b19.f76929a = 3072;
        b19.f76930b = bigInteger2;
        b0 b0Var2 = b0.f76804e;
        b19.f76934f = b0Var2;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", b19.a());
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", n.f76882k);
        z b23 = c0.b();
        a0 a0Var3 = a0.f76795d;
        b23.f76931c = a0Var3;
        b23.f76932d = a0Var3;
        b23.b(64);
        b23.f76929a = 4096;
        b23.f76930b = bigInteger2;
        b23.f76934f = b0Var;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4", b23.a());
        z b24 = c0.b();
        b24.f76931c = a0Var3;
        b24.f76932d = a0Var3;
        b24.b(64);
        b24.f76929a = 4096;
        b24.f76930b = bigInteger2;
        b24.f76934f = b0Var2;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", b24.a());
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", n.f76883l);
        f0Var.b(Collections.unmodifiableMap(hashMap3));
        el.g0 g0Var2 = el.g0.f59489b;
        g0Var2.c(f0.f76838a);
        g0Var2.c(f0.f76839b);
        a0Var.a(f0.f76842e, c0.class);
        kVar.d(f0.f76840c, dVar4, true);
        kVar.d(f0.f76841d, dVar4, false);
        if (yk.e.f139223b.get()) {
            return;
        }
        n0 n0Var = l.f76862a;
        if (!yk.d.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        h0Var.f(kl.c.f80010a);
        h0Var.e(kl.c.f80011b);
        h0Var.d(kl.c.f80012c);
        h0Var.c(kl.c.f80013d);
        h0Var.d(kl.c.f80014e);
        h0Var.c(kl.c.f80015f);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("ED25519", new j(i.f76854b));
        i iVar = i.f76857e;
        hashMap4.put("ED25519_RAW", new j(iVar));
        hashMap4.put("ED25519WithRawOutput", new j(iVar));
        f0Var.b(Collections.unmodifiableMap(hashMap4));
        a0Var.a(l.f76867f, j.class);
        el.c0.f59461b.a(l.f76866e, j.class);
        g0Var2.c(l.f76862a);
        g0Var2.c(l.f76863b);
        kVar.c(l.f76864c, true);
        kVar.c(l.f76865d, false);
    }
}
