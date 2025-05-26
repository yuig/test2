package jl;

import a.h5;
import el.n0;
import il.i4;
import il.l6;
import il.o6;

/* loaded from: classes3.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f76838a = new n0(new h5(23), d0.class, uk.r.class);

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f76839b = new n0(new h5(24), e0.class, uk.s.class);

    /* renamed from: c, reason: collision with root package name */
    public static final el.p f76840c;

    /* renamed from: d, reason: collision with root package name */
    public static final el.q f76841d;

    /* renamed from: e, reason: collision with root package name */
    public static final zk.c f76842e;

    /* renamed from: f, reason: collision with root package name */
    public static final yk.d f76843f;

    static {
        l6.S();
        f76840c = el.q.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", uk.r.class);
        i4 i4Var = i4.ASYMMETRIC_PUBLIC;
        o6.L();
        f76841d = new el.q("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", uk.s.class, i4Var);
        f76842e = new zk.c(6);
        f76843f = yk.d.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }
}
