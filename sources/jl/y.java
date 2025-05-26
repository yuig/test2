package jl;

import a.h5;
import el.n0;
import il.c6;
import il.i4;
import il.z5;

/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f76921a = new n0(new h5(21), w.class, uk.r.class);

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f76922b = new n0(new h5(22), x.class, uk.s.class);

    /* renamed from: c, reason: collision with root package name */
    public static final el.p f76923c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.q f76924d;

    /* renamed from: e, reason: collision with root package name */
    public static final zk.c f76925e;

    /* renamed from: f, reason: collision with root package name */
    public static final yk.d f76926f;

    static {
        z5.S();
        f76923c = el.q.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", uk.r.class);
        i4 i4Var = i4.ASYMMETRIC_PUBLIC;
        c6.K();
        f76924d = new el.q("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", uk.s.class, i4Var);
        f76925e = new zk.c(5);
        f76926f = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }
}
