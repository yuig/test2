package bq2;

import cq2.c;
import java.util.Hashtable;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Hashtable f23701a = new Hashtable();

    /* renamed from: b, reason: collision with root package name */
    public static final Hashtable f23702b = new Hashtable();

    static {
        a("B-571", c.E);
        a("B-409", c.C);
        a("B-283", c.f53047m);
        a("B-233", c.f53053s);
        a("B-163", c.f53045k);
        a("K-571", c.D);
        a("K-409", c.B);
        a("K-283", c.f53046l);
        a("K-233", c.f53052r);
        a("K-163", c.f53035a);
        a("P-521", c.A);
        a("P-384", c.f53060z);
        a("P-256", c.G);
        a("P-224", c.f53059y);
        a("P-192", c.F);
    }

    public static void a(String str, yp2.c cVar) {
        f23701a.put(str, cVar);
        f23702b.put(cVar, str);
    }
}
