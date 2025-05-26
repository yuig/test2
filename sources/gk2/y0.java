package gk2;

/* loaded from: classes2.dex */
public final class y0 implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65703a;

    /* renamed from: b, reason: collision with root package name */
    public final xp2.b f65704b;

    public /* synthetic */ y0(pn.a aVar, int i13) {
        this.f65703a = i13;
        this.f65704b = aVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f65703a;
        xp2.b bVar = this.f65704b;
        switch (i13) {
            case 0:
                bVar.onError((Throwable) obj);
                break;
            default:
                bVar.c(obj);
                break;
        }
    }
}
