package aq2;

import java.math.BigInteger;
import java.util.Hashtable;
import yp2.c;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Hashtable f20359a;

    /* renamed from: b, reason: collision with root package name */
    public static final Hashtable f20360b;

    static {
        zp2.a aVar = new zp2.a(1);
        zp2.a aVar2 = new zp2.a(2);
        Hashtable hashtable = new Hashtable();
        f20359a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f20360b = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        c cVar = b.f20362b;
        hashtable.put(nq2.c.a("wapip192v1"), cVar);
        hashtable3.put(cVar, "wapip192v1");
        hashtable2.put(cVar, aVar2);
        c cVar2 = b.f20361a;
        hashtable.put(nq2.c.a("sm2p256v1"), cVar2);
        hashtable3.put(cVar2, "sm2p256v1");
        hashtable2.put(cVar2, aVar);
    }

    public static BigInteger a(String str) {
        return new BigInteger(1, oq2.a.a(str));
    }
}
