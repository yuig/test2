package jl;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class k extends bl.w {

    /* renamed from: c, reason: collision with root package name */
    public final m f76860c;

    /* renamed from: d, reason: collision with root package name */
    public final ll.j f76861d;

    public k(m mVar, ll.j jVar) {
        super(2);
        this.f76860c = mVar;
        this.f76861d = jVar;
    }

    public static k n(m mVar, ll.j jVar) {
        if (jVar.I() == 32) {
            if (Arrays.equals(mVar.f76869d.b(), el.a.z2(el.a.N(((ml.a) jVar.f83754b).b())).H())) {
                return new k(mVar, jVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + jVar.I());
    }

    @Override // bl.w
    public final bl.w m() {
        return this.f76860c;
    }
}
