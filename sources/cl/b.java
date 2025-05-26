package cl;

import java.security.GeneralSecurityException;
import uk.q;
import vk.s;
import vk.t;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f27928a = new byte[0];

    public static a a(bl.f fVar) {
        q qVar = fVar.f23425e;
        if (!(qVar instanceof t)) {
            if (qVar instanceof vk.l) {
                return new l0.k((vk.l) qVar);
            }
            if (qVar instanceof zk.f) {
                return new l0.k((zk.f) qVar);
            }
            throw new GeneralSecurityException("Unsupported DEM parameters: " + qVar);
        }
        t tVar = (t) qVar;
        hc.m mVar = new hc.m();
        if (tVar.f126044b != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (tVar.f126045c != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (tVar.f126046d != s.f126037d) {
            throw new GeneralSecurityException("invalid variant");
        }
        mVar.f68664a = tVar.f126043a;
        return mVar;
    }
}
