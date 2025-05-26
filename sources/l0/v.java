package l0;

import android.net.Uri;
import android.view.Surface;
import co2.y;
import co2.z;
import java.util.Map;
import kh2.m0;
import r0.a1;
import r0.j0;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements p5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81294b;

    public /* synthetic */ v(Object obj, int i13) {
        this.f81293a = i13;
        this.f81294b = obj;
    }

    @Override // p5.a
    public final void accept(Object obj) {
        int i13 = this.f81293a;
        Object obj2 = this.f81294b;
        switch (i13) {
            case 0:
                c0.k kVar = (c0.k) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i14 = kVar.f24272b - ((n0.c) entry.getKey()).f88738f;
                    if (((n0.c) entry.getKey()).f88739g) {
                        i14 = -i14;
                    }
                    int h10 = e0.u.h(i14);
                    s sVar = (s) entry.getValue();
                    sVar.getClass();
                    f0.h.m0(new p(sVar, h10, -1, 0));
                }
                return;
            case 1:
                ((j0) obj2).f105554J = (Uri) obj;
                return;
            case 2:
                sp2.i iVar = (sp2.i) obj2;
                r0.l lVar = (r0.l) obj;
                if (iVar != null) {
                    lVar.f105595a = iVar;
                    return;
                } else {
                    lVar.getClass();
                    throw new NullPointerException("Null qualitySelector");
                }
            case 3:
            case 4:
            default:
                ((y) ((z) obj2)).g((eb.p) obj);
                return;
            case 5:
                a1 a1Var = (a1) obj2;
                c0.j jVar = (c0.j) obj;
                a1Var.getClass();
                m0.p("VideoEncoderSession", "Surface can be closed: " + jVar.f24267b.hashCode());
                Surface surface = a1Var.f105482e;
                Surface surface2 = jVar.f24267b;
                if (surface2 != surface) {
                    surface2.release();
                    return;
                }
                a1Var.f105482e = null;
                a1Var.f105490m.b(a1Var.f105481d);
                a1Var.a();
                return;
        }
    }
}
