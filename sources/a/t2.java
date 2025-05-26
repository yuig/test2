package a;

import ads_mobile_sdk.af1;
import ads_mobile_sdk.bf1;
import ads_mobile_sdk.cf1;
import ads_mobile_sdk.cn;
import ads_mobile_sdk.hy1;
import ads_mobile_sdk.j72;
import ads_mobile_sdk.k81;
import ads_mobile_sdk.kp0;
import ads_mobile_sdk.kr2;
import ads_mobile_sdk.l61;
import ads_mobile_sdk.lp0;
import ads_mobile_sdk.mp0;
import ads_mobile_sdk.np0;
import ads_mobile_sdk.op0;
import ads_mobile_sdk.q41;
import ads_mobile_sdk.rp0;
import ads_mobile_sdk.tb0;
import ads_mobile_sdk.ve1;
import ads_mobile_sdk.xe1;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class t2 {
    static {
        int i13 = j72.f6721c;
        try {
            a();
        } catch (GeneralSecurityException e13) {
            throw new ExceptionInInitializerError(e13);
        }
    }

    public static void a() {
        k81 k81Var = k81.f7161a;
        bf1 bf1Var = bf1.f2867b;
        bf1Var.a(k81.f7161a);
        bf1Var.a(k81.f7162b);
        bf1Var.a(cn.f3969a);
        int i13 = kp0.f7435f;
        if (!(i13 != 1 ? l3.c.o() : l3.c.k())) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        tb0 tb0Var = rp0.f10736a;
        cf1 cf1Var = cf1.f3890b;
        cf1Var.a(rp0.f10738c);
        cf1Var.a(rp0.f10739d);
        cf1Var.a(rp0.f10740e);
        cf1Var.a(rp0.f10741f);
        bf1Var.a(kp0.f7430a);
        bf1Var.a(kp0.f7431b);
        af1 af1Var = af1.f2383b;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", hy1.f6140a);
        lp0 lp0Var = new lp0();
        lp0Var.f7912a = 32;
        lp0Var.f7913b = 16;
        np0 np0Var = np0.f8909e;
        lp0Var.f7915d = np0Var;
        mp0 mp0Var = mp0.f8320d;
        lp0Var.f7914c = mp0Var;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", lp0Var.a());
        lp0 lp0Var2 = new lp0();
        lp0Var2.f7912a = 32;
        lp0Var2.f7913b = 32;
        np0 np0Var2 = np0.f8906b;
        lp0Var2.f7915d = np0Var2;
        lp0Var2.f7914c = mp0Var;
        hashMap.put("HMAC_SHA256_256BITTAG", lp0Var2.a());
        lp0 lp0Var3 = new lp0();
        lp0Var3.f7912a = 32;
        lp0Var3.f7913b = 32;
        lp0Var3.f7915d = np0Var;
        lp0Var3.f7914c = mp0Var;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", lp0Var3.a());
        lp0 lp0Var4 = new lp0();
        lp0Var4.f7912a = 64;
        lp0Var4.f7913b = 16;
        lp0Var4.f7915d = np0Var2;
        mp0 mp0Var2 = mp0.f8322f;
        lp0Var4.f7914c = mp0Var2;
        hashMap.put("HMAC_SHA512_128BITTAG", lp0Var4.a());
        lp0 lp0Var5 = new lp0();
        lp0Var5.f7912a = 64;
        lp0Var5.f7913b = 16;
        lp0Var5.f7915d = np0Var;
        lp0Var5.f7914c = mp0Var2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", lp0Var5.a());
        lp0 lp0Var6 = new lp0();
        lp0Var6.f7912a = 64;
        lp0Var6.f7913b = 32;
        lp0Var6.f7915d = np0Var2;
        lp0Var6.f7914c = mp0Var2;
        hashMap.put("HMAC_SHA512_256BITTAG", lp0Var6.a());
        lp0 lp0Var7 = new lp0();
        lp0Var7.f7912a = 64;
        lp0Var7.f7913b = 32;
        lp0Var7.f7915d = np0Var;
        lp0Var7.f7914c = mp0Var2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", lp0Var7.a());
        hashMap.put("HMAC_SHA512_512BITTAG", hy1.f6141b);
        lp0 lp0Var8 = new lp0();
        lp0Var8.f7912a = 64;
        lp0Var8.f7913b = 64;
        lp0Var8.f7915d = np0Var;
        lp0Var8.f7914c = mp0Var2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", lp0Var8.a());
        af1Var.a(Collections.unmodifiableMap(hashMap));
        ve1 ve1Var = ve1.f12474b;
        ve1Var.a(kp0.f7434e, op0.class);
        xe1.f13623b.a(kp0.f7433d, op0.class);
        q41 q41Var = q41.f9943d;
        q41Var.a(kp0.f7432c, i13, true);
        if (kr2.f7463b.get()) {
            return;
        }
        sd sdVar = ads_mobile_sdk.c8.f3807a;
        if (!l3.c.k()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        cf1Var.a(ads_mobile_sdk.h8.f5874a);
        cf1Var.a(ads_mobile_sdk.h8.f5875b);
        cf1Var.a(ads_mobile_sdk.h8.f5876c);
        cf1Var.a(ads_mobile_sdk.h8.f5877d);
        ve1Var.a(ads_mobile_sdk.c8.f3807a, ads_mobile_sdk.e8.class);
        bf1Var.a(ads_mobile_sdk.c8.f3808b);
        bf1Var.a(ads_mobile_sdk.c8.f3809c);
        HashMap hashMap2 = new HashMap();
        ads_mobile_sdk.e8 e8Var = hy1.f6142c;
        hashMap2.put("AES_CMAC", e8Var);
        hashMap2.put("AES256_CMAC", e8Var);
        hashMap2.put("AES256_CMAC_RAW", new ads_mobile_sdk.e8(32, 16, ads_mobile_sdk.d8.f4194e));
        af1Var.a(Collections.unmodifiableMap(hashMap2));
        l61 l61Var = ads_mobile_sdk.c8.f3810d;
        synchronized (q41Var) {
            q41Var.a(l61Var, 1, true);
        }
    }
}
