package so;

import com.pinterest.api.model.f30;
import java.util.Date;

/* loaded from: classes3.dex */
public final class j1 implements jw1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bf2.d f113473b;

    public /* synthetic */ j1(bf2.d dVar, int i13) {
        this.f113472a = i13;
        this.f113473b = dVar;
    }

    public final jw1.e a(f30 f30Var, Date date, nx.d0 d0Var) {
        int i13 = this.f113472a;
        bf2.d dVar = this.f113473b;
        switch (i13) {
            case 0:
                r8 r8Var = (r8) dVar;
                return new jw1.e(f30Var, date, d0Var, s8.S4(r8Var.f114091b), (m60.w) r8Var.f114090a.f113885r0.get());
            default:
                qb qbVar = (qb) dVar;
                rb rbVar = qbVar.f114078c;
                rbVar.getClass();
                return new jw1.e(f30Var, date, d0Var, new lh0.m2((lh0.z0) rbVar.f114096a.D0.get()), (m60.w) qbVar.f114076a.f113885r0.get());
        }
    }
}
