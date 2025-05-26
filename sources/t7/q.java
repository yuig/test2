package t7;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116567b;

    public /* synthetic */ q(Object obj, int i13) {
        this.f116566a = i13;
        this.f116567b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f116566a;
        Object obj = this.f116567b;
        switch (i13) {
            case 0:
                ((t) obj).E();
                break;
            case 1:
                t tVar = (t) obj;
                tVar.C = true;
                tVar.E();
                break;
            default:
                ((t5.e) obj).w();
                break;
        }
    }
}
