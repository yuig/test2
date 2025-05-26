package hk2;

import uj2.f0;

/* loaded from: classes4.dex */
public final class f extends uj2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69403a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f69404b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69405c;

    public f(int i13, Object obj, Object obj2) {
        this.f69403a = i13;
        this.f69404b = obj;
        this.f69405c = obj2;
    }

    @Override // uj2.l
    public final void g(uj2.m mVar) {
        int i13 = this.f69403a;
        Object obj = this.f69405c;
        Object obj2 = this.f69404b;
        switch (i13) {
            case 0:
                ((uj2.b) ((uj2.f) obj)).j(new e(mVar, (uj2.n) obj2));
                break;
            case 1:
                ((uj2.b0) ((f0) obj2)).p(new l(mVar, (ak2.g) obj));
                break;
            default:
                ((uj2.b0) ((f0) obj2)).p(new kk2.p(mVar, (ak2.f) obj));
                break;
        }
    }
}
