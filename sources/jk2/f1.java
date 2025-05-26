package jk2;

/* loaded from: classes2.dex */
public final class f1 implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76457a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.v f76458b;

    public /* synthetic */ f1(pn.a aVar, int i13) {
        this.f76457a = i13;
        this.f76458b = aVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f76457a;
        uj2.v vVar = this.f76458b;
        switch (i13) {
            case 0:
                vVar.onError((Throwable) obj);
                break;
            default:
                vVar.c(obj);
                break;
        }
    }
}
