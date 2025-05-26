package gl;

import el.c1;
import el.j0;
import el.l;
import el.l0;
import el.n;
import fl.h;
import fl.j;
import fl.k;
import fl.q;
import il.d3;
import il.o5;
import pd.d0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f65727a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f65728b;

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f65729c;

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f65730d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f65731e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f65732f;

    static {
        ml.a c13 = c1.c("type.googleapis.com/google.crypto.tink.HmacKey");
        qq2.c a13 = d0.a();
        a13.a(o5.RAW, k.f62532e);
        a13.a(o5.TINK, k.f62529b);
        a13.a(o5.LEGACY, k.f62531d);
        a13.a(o5.CRUNCHY, k.f62530c);
        f65727a = a13.b();
        qq2.c a14 = d0.a();
        a14.a(d3.SHA1, j.f62523b);
        a14.a(d3.SHA224, j.f62524c);
        a14.a(d3.SHA256, j.f62525d);
        a14.a(d3.SHA384, j.f62526e);
        a14.a(d3.SHA512, j.f62527f);
        f65728b = a14.b();
        f65729c = new l0(new q(9), fl.l.class);
        f65730d = new j0(new q(10), c13);
        f65731e = new n(new q(11), h.class);
        f65732f = new l(new q(12), c13);
    }
}
