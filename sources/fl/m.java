package fl;

import el.a0;
import el.c0;
import el.f0;
import el.g0;
import el.h0;
import il.q5;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import pd.d0;

/* loaded from: classes.dex */
public abstract class m {
    static {
        int i13 = q5.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e13) {
            throw new ExceptionInInitializerError(e13);
        }
    }

    public static void a() {
        g0 g0Var = g0.f59489b;
        g0Var.d(p.f62541a);
        g0Var.c(p.f62542b);
        g0Var.d(g.f62512a);
        yk.d dVar = i.f62522f;
        if (!dVar.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        d0 d0Var = gl.e.f65727a;
        h0 h0Var = h0.f59491b;
        h0Var.f(gl.e.f65729c);
        h0Var.e(gl.e.f65730d);
        h0Var.d(gl.e.f65731e);
        h0Var.c(gl.e.f65732f);
        g0Var.c(i.f62517a);
        g0Var.c(i.f62518b);
        f0 f0Var = f0.f59486b;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", r.f62544a);
        com.google.firebase.messaging.q b13 = l.b();
        b13.f33803a = 32;
        b13.f33804b = 16;
        k kVar = k.f62532e;
        b13.f33806d = kVar;
        j jVar = j.f62525d;
        b13.f33805c = jVar;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", b13.e());
        com.google.firebase.messaging.q b14 = l.b();
        b14.f33803a = 32;
        b14.f33804b = 32;
        k kVar2 = k.f62529b;
        b14.f33806d = kVar2;
        b14.f33805c = jVar;
        hashMap.put("HMAC_SHA256_256BITTAG", b14.e());
        com.google.firebase.messaging.q b15 = l.b();
        b15.f33803a = 32;
        b15.f33804b = 32;
        b15.f33806d = kVar;
        b15.f33805c = jVar;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", b15.e());
        com.google.firebase.messaging.q b16 = l.b();
        b16.f33803a = 64;
        b16.f33804b = 16;
        b16.f33806d = kVar2;
        j jVar2 = j.f62527f;
        b16.f33805c = jVar2;
        hashMap.put("HMAC_SHA512_128BITTAG", b16.e());
        com.google.firebase.messaging.q b17 = l.b();
        b17.f33803a = 64;
        b17.f33804b = 16;
        b17.f33806d = kVar;
        b17.f33805c = jVar2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", b17.e());
        com.google.firebase.messaging.q b18 = l.b();
        b18.f33803a = 64;
        b18.f33804b = 32;
        b18.f33806d = kVar2;
        b18.f33805c = jVar2;
        hashMap.put("HMAC_SHA512_256BITTAG", b18.e());
        com.google.firebase.messaging.q b19 = l.b();
        b19.f33803a = 64;
        b19.f33804b = 32;
        b19.f33806d = kVar;
        b19.f33805c = jVar2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", b19.e());
        hashMap.put("HMAC_SHA512_512BITTAG", r.f62545b);
        com.google.firebase.messaging.q b23 = l.b();
        b23.f33803a = 64;
        b23.f33804b = 64;
        b23.f33806d = kVar;
        b23.f33805c = jVar2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", b23.e());
        f0Var.b(Collections.unmodifiableMap(hashMap));
        a0 a0Var = a0.f59451b;
        a0Var.a(i.f62521e, l.class);
        c0.f59461b.a(i.f62520d, l.class);
        el.k kVar3 = el.k.f59500d;
        kVar3.d(i.f62519c, dVar, true);
        if (yk.e.f139223b.get()) {
            return;
        }
        vk.h hVar = b.f62500a;
        if (!yk.d.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        h0Var.f(gl.b.f65721a);
        h0Var.e(gl.b.f65722b);
        h0Var.d(gl.b.f65723c);
        h0Var.c(gl.b.f65724d);
        a0Var.a(b.f62500a, d.class);
        g0Var.c(b.f62501b);
        g0Var.c(b.f62502c);
        HashMap hashMap2 = new HashMap();
        d dVar2 = r.f62546c;
        hashMap2.put("AES_CMAC", dVar2);
        hashMap2.put("AES256_CMAC", dVar2);
        x92.b bVar = new x92.b();
        bVar.Q(32);
        bVar.R(16);
        bVar.f134367d = c.f62507e;
        hashMap2.put("AES256_CMAC_RAW", bVar.n());
        f0Var.b(Collections.unmodifiableMap(hashMap2));
        kVar3.c(b.f62503d, true);
    }
}
