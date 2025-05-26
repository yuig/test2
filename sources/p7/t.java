package p7;

import a7.n0;
import android.os.Handler;
import androidx.media3.common.ParserException;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import d7.d0;
import g8.a1;
import g8.x0;
import q8.j0;
import q8.k0;

/* loaded from: classes3.dex */
public final class t implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f99046a;

    /* renamed from: b, reason: collision with root package name */
    public final qq2.c f99047b = new qq2.c(2);

    /* renamed from: c, reason: collision with root package name */
    public final y8.a f99048c = new y8.a(1);

    /* renamed from: d, reason: collision with root package name */
    public long f99049d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f99050e;

    public t(u uVar, l8.m mVar) {
        this.f99050e = uVar;
        this.f99046a = new a1(mVar, null, null);
    }

    @Override // q8.k0
    public final void a(long j13, int i13, int i14, int i15, j0 j0Var) {
        long h10;
        long j14;
        this.f99046a.a(j13, i13, i14, i15, j0Var);
        while (this.f99046a.x(false)) {
            y8.a aVar = this.f99048c;
            aVar.n();
            if (this.f99046a.C(this.f99047b, aVar, 0, false) == -4) {
                aVar.q();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j15 = aVar.f78456g;
                n0 d03 = this.f99050e.f99053c.d0(aVar);
                if (d03 != null) {
                    a9.a aVar2 = (a9.a) d03.f1152a[0];
                    String str = aVar2.f1560a;
                    String str2 = aVar2.f1561b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && (SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j14 = d7.n0.b0(d7.n0.q(aVar2.f1564e));
                        } catch (ParserException unused) {
                            j14 = -9223372036854775807L;
                        }
                        if (j14 != -9223372036854775807L) {
                            s sVar = new s(j15, j14);
                            Handler handler = this.f99050e.f99054d;
                            handler.sendMessage(handler.obtainMessage(1, sVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.f99046a;
        x0 x0Var = a1Var.f64186a;
        synchronized (a1Var) {
            int i16 = a1Var.f64204s;
            h10 = i16 == 0 ? -1L : a1Var.h(i16);
        }
        x0Var.b(h10);
    }

    @Override // q8.k0
    public final void b(androidx.media3.common.b bVar) {
        this.f99046a.b(bVar);
    }

    @Override // q8.k0
    public final void d(int i13, int i14, d0 d0Var) {
        this.f99046a.d(i13, 0, d0Var);
    }

    @Override // q8.k0
    public final int e(a7.k kVar, int i13, boolean z13) {
        return this.f99046a.e(kVar, i13, z13);
    }

    public final void f(h8.f fVar) {
        long j13 = this.f99049d;
        if (j13 == -9223372036854775807L || fVar.f68030h > j13) {
            this.f99049d = fVar.f68030h;
        }
        this.f99050e.f99057g = true;
    }

    public final void g() {
        this.f99046a.D();
    }
}
