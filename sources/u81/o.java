package u81;

import o82.v2;

/* loaded from: classes5.dex */
public final class o implements eb2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yq0.t f121053b;

    public /* synthetic */ o(yq0.t tVar, int i13) {
        this.f121052a = i13;
        this.f121053b = tVar;
    }

    @Override // eb2.b
    public final int a() {
        int i13 = this.f121052a;
        yq0.t tVar = this.f121053b;
        switch (i13) {
            case 0:
                int i14 = r.f121059l2;
                return ((r) tVar).p8();
            case 1:
                int i15 = wk1.k.L0;
                return ((wk1.k) tVar).p8();
            default:
                int i16 = v2.F0;
                return ((v2) tVar).p8();
        }
    }
}
