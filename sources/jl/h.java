package jl;

import a.h5;
import el.n0;
import il.i4;
import il.r1;
import il.u1;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f76848a = new n0(new h5(1), f.class, uk.r.class);

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f76849b = new n0(new h5(2), g.class, uk.s.class);

    /* renamed from: c, reason: collision with root package name */
    public static final el.p f76850c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.q f76851d;

    /* renamed from: e, reason: collision with root package name */
    public static final zk.c f76852e;

    /* renamed from: f, reason: collision with root package name */
    public static final yk.d f76853f;

    static {
        r1.H();
        f76850c = el.q.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", uk.r.class);
        i4 i4Var = i4.ASYMMETRIC_PUBLIC;
        u1.K();
        f76851d = new el.q("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", uk.s.class, i4Var);
        f76852e = new zk.c(3);
        f76853f = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }
}
