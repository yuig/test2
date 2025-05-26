package c8;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f26937b;

    public /* synthetic */ b(c cVar, int i13) {
        this.f26936a = i13;
        this.f26937b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f26936a;
        c cVar = this.f26937b;
        switch (i13) {
            case 0:
                d dVar = cVar.f26940c;
                if (((c) dVar.f26947g) != null) {
                    dVar.a();
                    break;
                }
                break;
            default:
                d dVar2 = cVar.f26940c;
                if (((c) dVar2.f26947g) != null && (dVar2.f26942b & 3) != 0) {
                    dVar2.a();
                    break;
                }
                break;
        }
    }
}
