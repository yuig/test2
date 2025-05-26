package m60;

/* loaded from: classes5.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f85941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f85942c;

    public /* synthetic */ s(w wVar, Object obj, int i13) {
        this.f85940a = i13;
        this.f85941b = wVar;
        this.f85942c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f85940a;
        Object obj = this.f85942c;
        w wVar = this.f85941b;
        switch (i13) {
            case 0:
                wVar.f85944a.e(obj);
                break;
            default:
                wVar.i(obj);
                break;
        }
    }
}
