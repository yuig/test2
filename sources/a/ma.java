package a;

import ads_mobile_sdk.a12;
import ads_mobile_sdk.a61;
import ads_mobile_sdk.af1;
import ads_mobile_sdk.bf1;
import ads_mobile_sdk.cf1;
import ads_mobile_sdk.e13;
import ads_mobile_sdk.g13;
import ads_mobile_sdk.g61;
import ads_mobile_sdk.gy1;
import ads_mobile_sdk.j13;
import ads_mobile_sdk.j72;
import ads_mobile_sdk.kr2;
import ads_mobile_sdk.l61;
import ads_mobile_sdk.nv1;
import ads_mobile_sdk.q41;
import ads_mobile_sdk.r13;
import ads_mobile_sdk.rm;
import ads_mobile_sdk.ve1;
import ads_mobile_sdk.xe1;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class ma {
    static {
        int i13 = j72.f6721c;
        try {
            a();
        } catch (GeneralSecurityException e13) {
            throw new ExceptionInInitializerError(e13);
        }
    }

    public static void a() {
        ads_mobile_sdk.v7 v7Var = ads_mobile_sdk.v7.f12380a;
        bf1 bf1Var = bf1.f2867b;
        bf1Var.a(ads_mobile_sdk.v7.f12380a);
        bf1Var.a(ads_mobile_sdk.v7.f12381b);
        t2.a();
        int i13 = ads_mobile_sdk.o8.f9172e;
        if (!(i13 != 1 ? l3.c.o() : l3.c.k())) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        nv1 nv1Var = ads_mobile_sdk.t8.f11446a;
        cf1 cf1Var = cf1.f3890b;
        cf1Var.a(ads_mobile_sdk.t8.f11446a);
        cf1Var.a(ads_mobile_sdk.t8.f11447b);
        cf1Var.a(ads_mobile_sdk.t8.f11448c);
        cf1Var.a(ads_mobile_sdk.t8.f11449d);
        bf1Var.a(ads_mobile_sdk.o8.f9168a);
        af1 af1Var = af1.f2383b;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", gy1.f5755e);
        ads_mobile_sdk.p8 c13 = new ads_mobile_sdk.p8().a(16).b(32).d(16).c(16);
        ads_mobile_sdk.q8 q8Var = ads_mobile_sdk.q8.f9985d;
        c13.f9589e = q8Var;
        ads_mobile_sdk.r8 r8Var = ads_mobile_sdk.r8.f10544d;
        c13.f9590f = r8Var;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", c13.a());
        hashMap.put("AES256_CTR_HMAC_SHA256", gy1.f5756f);
        ads_mobile_sdk.p8 c14 = new ads_mobile_sdk.p8().a(32).b(32).d(32).c(16);
        c14.f9589e = q8Var;
        c14.f9590f = r8Var;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", c14.a());
        af1Var.a(Collections.unmodifiableMap(hashMap));
        xe1 xe1Var = xe1.f13623b;
        xe1Var.a(ads_mobile_sdk.o8.f9170c, ads_mobile_sdk.s8.class);
        ve1 ve1Var = ve1.f12474b;
        ve1Var.a(ads_mobile_sdk.o8.f9171d, ads_mobile_sdk.s8.class);
        q41 q41Var = q41.f9943d;
        q41Var.a(ads_mobile_sdk.o8.f9169b, i13, true);
        int i14 = ads_mobile_sdk.ba.f2802e;
        if (!(i14 != 1 ? l3.c.o() : l3.c.k())) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        cf1Var.a(ads_mobile_sdk.ea.f4765a);
        cf1Var.a(ads_mobile_sdk.ea.f4766b);
        cf1Var.a(ads_mobile_sdk.ea.f4767c);
        cf1Var.a(ads_mobile_sdk.ea.f4768d);
        bf1Var.a(ads_mobile_sdk.ba.f2798a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", gy1.f5751a);
        ads_mobile_sdk.ca caVar = ads_mobile_sdk.ca.f3833d;
        hashMap2.put("AES128_GCM_RAW", new ads_mobile_sdk.da(16, 12, 16, caVar));
        hashMap2.put("AES256_GCM", gy1.f5752b);
        hashMap2.put("AES256_GCM_RAW", new ads_mobile_sdk.da(32, 12, 16, caVar));
        af1Var.a(Collections.unmodifiableMap(hashMap2));
        xe1Var.a(ads_mobile_sdk.ba.f2800c, ads_mobile_sdk.da.class);
        ve1Var.a(ads_mobile_sdk.ba.f2801d, ads_mobile_sdk.da.class);
        q41Var.a(ads_mobile_sdk.ba.f2799b, i14, true);
        if (kr2.f7463b.get()) {
            return;
        }
        a12 a12Var = ads_mobile_sdk.l9.f7732a;
        if (!l3.c.k()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        cf1Var.a(ads_mobile_sdk.r9.f10549a);
        cf1Var.a(ads_mobile_sdk.r9.f10550b);
        cf1Var.a(ads_mobile_sdk.r9.f10551c);
        cf1Var.a(ads_mobile_sdk.r9.f10552d);
        bf1Var.a(ads_mobile_sdk.l9.f7732a);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", gy1.f5753c);
        ads_mobile_sdk.m9 b13 = new ads_mobile_sdk.m9().a(16).b(16);
        b13.f8136c = 16;
        ads_mobile_sdk.n9 n9Var = ads_mobile_sdk.n9.f8723d;
        b13.f8137d = n9Var;
        hashMap3.put("AES128_EAX_RAW", b13.a());
        hashMap3.put("AES256_EAX", gy1.f5754d);
        ads_mobile_sdk.m9 b14 = new ads_mobile_sdk.m9().a(16).b(32);
        b14.f8136c = 16;
        b14.f8137d = n9Var;
        hashMap3.put("AES256_EAX_RAW", b14.a());
        af1Var.a(Collections.unmodifiableMap(hashMap3));
        ve1Var.a(ads_mobile_sdk.l9.f7734c, ads_mobile_sdk.o9.class);
        l61 l61Var = ads_mobile_sdk.l9.f7733b;
        synchronized (q41Var) {
            q41Var.a(l61Var, 1, true);
        }
        ads_mobile_sdk.pa.a();
        rm.a();
        a61.a();
        g61.a();
        r13.a();
        sd sdVar = e13.f4575a;
        cf1Var.a(j13.f6603a);
        cf1Var.a(j13.f6604b);
        cf1Var.a(j13.f6605c);
        cf1Var.a(j13.f6606d);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("XAES_256_GCM_192_BIT_NONCE", gy1.f5757g);
        hashMap4.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", gy1.f5758h);
        hashMap4.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", gy1.f5759i);
        hashMap4.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", gy1.f5760j);
        af1Var.a(Collections.unmodifiableMap(hashMap4));
        bf1Var.a(e13.f4576b);
        ve1Var.a(e13.f4575a, g13.class);
    }
}
