package lg2;

import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;
import i1.u;
import k1.p;
import kotlin.Unit;
import m7.r;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f83276b;

    public /* synthetic */ a(d dVar, int i13) {
        this.f83275a = i13;
        this.f83276b = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [lg2.b] */
    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f83275a;
        final d dVar = this.f83276b;
        switch (i13) {
            case 0:
                try {
                    c0.d.M2("thermal-service-registration");
                    dVar.f83281f = new PowerManager$OnThermalStatusChangedListener() { // from class: lg2.b
                        public final void onThermalStatusChanged(int i14) {
                            d dVar2 = d.this;
                            Integer valueOf = Integer.valueOf(i14);
                            long now = dVar2.f83280e.now();
                            oi2.b bVar = dVar2.f83283h;
                            uf2.c cVar = uf2.c.f122114k;
                            if (bVar != null) {
                                dVar2.g(cVar, new p(dVar2, now, 10), false);
                            }
                            dVar2.g(cVar, new u(valueOf, now, dVar2, 4), true);
                        }
                    };
                    PowerManager powerManager = (PowerManager) dVar.f83282g.getValue();
                    if (powerManager != null) {
                        r rVar = new r(dVar, 2);
                        b bVar = dVar.f83281f;
                        if (bVar != null) {
                            powerManager.addThermalStatusListener(rVar, bVar);
                        }
                    }
                    Unit unit = Unit.f80348a;
                    return;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } finally {
                        c0.d.N();
                    }
                }
            default:
                b bVar2 = dVar.f83281f;
                if (bVar2 != null) {
                    PowerManager powerManager2 = (PowerManager) dVar.f83282g.getValue();
                    if (powerManager2 != null) {
                        powerManager2.removeThermalStatusListener(bVar2);
                    }
                    dVar.f83281f = null;
                    return;
                }
                return;
        }
    }
}
