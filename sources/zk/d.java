package zk;

import el.n0;
import el.q;
import il.i4;
import il.v0;
import java.security.InvalidAlgorithmParameterException;
import mj.m;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f142066a = new n0(new m(5), a.class, uk.d.class);

    /* renamed from: b, reason: collision with root package name */
    public static final q f142067b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f142068c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f142069d;

    static {
        i4 i4Var = i4.SYMMETRIC;
        v0.F();
        f142067b = new q("type.googleapis.com/google.crypto.tink.AesSivKey", uk.d.class, i4Var);
        f142068c = new b();
        f142069d = new c(0);
    }

    public static void a(f fVar) {
        if (fVar.f142074a != 64) {
            throw new InvalidAlgorithmParameterException(a.a.n(new StringBuilder("invalid key size: "), fVar.f142074a, ". Valid keys must have 64 bytes."));
        }
    }
}
