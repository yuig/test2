package xz;

import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class f extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f136221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pq2.i f136222b;

    public f(g gVar, pq2.i iVar) {
        this.f136221a = gVar;
        this.f136222b = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        g gVar = this.f136221a;
        gVar.p(og0.b.a(gVar.j(), gVar.q(), gVar.m().get()));
        pq2.i iVar = this.f136222b;
        if (iVar.f()) {
            return;
        }
        iVar.mo233clone().x1(gVar);
    }
}
