package b1;

import kh2.m0;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements p5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20819b;

    public /* synthetic */ r(Object obj, int i13) {
        this.f20818a = i13;
        this.f20819b = obj;
    }

    @Override // p5.a
    public final void accept(Object obj) {
        int i13 = this.f20818a;
        Object obj2 = this.f20819b;
        switch (i13) {
            case 0:
                l0.d dVar = (l0.d) obj2;
                m0.p("SurfaceViewImpl", "Safe to release surface.");
                if (dVar != null) {
                    dVar.b();
                    break;
                }
                break;
            default:
                ((r4.i) obj2).b((c0.j) obj);
                break;
        }
    }
}
