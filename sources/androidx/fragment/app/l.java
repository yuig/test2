package androidx.fragment.app;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18376b;

    public /* synthetic */ l(Object obj, int i13) {
        this.f18375a = i13;
        this.f18376b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f18375a;
        Object obj = this.f18376b;
        switch (i13) {
            case 0:
                q qVar = (q) obj;
                qVar.f18408d.onDismiss(qVar.f18416l);
                break;
            case 1:
                ((Fragment) obj).startPostponedEnterTransition();
                break;
            default:
                ((w0) obj).A(true);
                break;
        }
    }
}
