package k7;

/* loaded from: classes3.dex */
public final class g extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f78462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f78462a = hVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        h hVar = this.f78462a;
        hVar.getClass();
        do {
            try {
            } catch (InterruptedException e13) {
                throw new IllegalStateException(e13);
            }
        } while (hVar.k());
    }
}
