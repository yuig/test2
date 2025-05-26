package z7;

import android.net.Uri;
import d7.e0;
import d7.n0;
import l8.y;

/* loaded from: classes3.dex */
public final class q extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g7.f f140963h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g7.i f140964i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f140965j;

    public q(u uVar, h7.e eVar, g7.i iVar) {
        this.f140965j = uVar;
        this.f140963h = eVar;
        this.f140964i = iVar;
    }

    @Override // d7.e0
    public final Object c() {
        y yVar = this.f140965j.f140979b;
        g7.f fVar = this.f140963h;
        g7.y yVar2 = new g7.y(fVar);
        g8.v.f64440d.getAndIncrement();
        yVar2.f63852b = 0L;
        g7.g gVar = new g7.g(yVar2, this.f140964i);
        try {
            gVar.a();
            Uri r13 = fVar.r();
            r13.getClass();
            Object k13 = yVar.k(r13, gVar);
            n0.g(gVar);
            k13.getClass();
            return (n) k13;
        } catch (Throwable th3) {
            n0.g(gVar);
            throw th3;
        }
    }
}
