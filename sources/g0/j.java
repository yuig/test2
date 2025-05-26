package g0;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r4.i f63207b;

    public /* synthetic */ j(r4.i iVar, int i13) {
        this.f63206a = i13;
        this.f63207b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f63206a;
        r4.i iVar = this.f63207b;
        switch (i13) {
            case 0:
                iVar.b(null);
                break;
            default:
                iVar.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
        }
    }
}
