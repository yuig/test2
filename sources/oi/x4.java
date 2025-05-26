package oi;

import android.content.ContentValues;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.measurement.internal.zzo;

/* loaded from: classes3.dex */
public final class x4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f95259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w4 f95260c;

    public /* synthetic */ x4(w4 w4Var, zzo zzoVar, int i13) {
        this.f95258a = i13;
        this.f95260c = w4Var;
        this.f95259b = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f95258a;
        zzo zzoVar = this.f95259b;
        w4 w4Var = this.f95260c;
        switch (i13) {
            case 0:
                w4Var.f95246a.M();
                w4Var.f95246a.D(zzoVar);
                break;
            case 1:
                w4Var.f95246a.M();
                a7 a7Var = w4Var.f95246a;
                a7Var.zzl().p();
                a7Var.N();
                com.bumptech.glide.d.o(zzoVar.f32044f);
                a7Var.d(zzoVar);
                break;
            case 2:
                w4Var.f95246a.M();
                w4Var.f95246a.F(zzoVar);
                break;
            default:
                w4Var.f95246a.M();
                a7 a7Var2 = w4Var.f95246a;
                a7Var2.zzl().p();
                a7Var2.N();
                com.bumptech.glide.d.o(zzoVar.f32044f);
                r8.a();
                e G = a7Var2.G();
                s3 s3Var = s.J0;
                g5 c13 = g5.c(G.x(null, s3Var) ? zzoVar.F : 100, zzoVar.A);
                String str = zzoVar.f32044f;
                g5 x13 = a7Var2.x(str);
                a7Var2.zzj().f95276n.a(str, c13, "Setting consent, package, consent");
                a7Var2.o(str, c13);
                if (c13.h(x13, (f5[]) c13.f94791a.keySet().toArray(new f5[0]))) {
                    a7Var2.F(zzoVar);
                }
                r8.a();
                if (a7Var2.G().x(null, s3Var)) {
                    m b13 = m.b(zzoVar.G);
                    if (!m.f94941f.equals(b13)) {
                        a7Var2.zzj().f95276n.a(str, b13, "Setting DMA consent. package, consent");
                        a7Var2.zzl().p();
                        a7Var2.N();
                        r8.a();
                        a7Var2.C.put(str, b13);
                        i iVar = a7Var2.f94657c;
                        a7.p(iVar);
                        r8.a();
                        if (iVar.l().x(null, s3Var)) {
                            com.bumptech.glide.d.t(b13);
                            iVar.p();
                            iVar.t();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("dma_consent_settings", b13.f94943b);
                            iVar.I(contentValues);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
