package l7;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f81732b;

    public /* synthetic */ b(c cVar, int i13) {
        this.f81731a = i13;
        this.f81732b = cVar;
    }

    @Override // l7.y0
    public final void run() {
        int i13 = this.f81731a;
        c cVar = this.f81732b;
        switch (i13) {
            case 0:
                if (cVar.f81736d.isEmpty()) {
                    i0 i0Var = cVar.f81737e;
                    i0Var.getClass();
                    ((a) i0Var).c();
                    g.a();
                    return;
                }
                return;
            case 1:
                cVar.f81739g++;
                LinkedBlockingQueue linkedBlockingQueue = cVar.f81736d;
                if (linkedBlockingQueue.isEmpty() || cVar.f81739g == 0) {
                    return;
                }
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(linkedBlockingQueue.element());
                throw null;
            default:
                a7.t tVar = cVar.f81738f;
                if (tVar != null) {
                    tVar.a();
                }
                cVar.f81736d.clear();
                return;
        }
    }
}
