package vi2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class i extends wi2.d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f125880d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f125881c;

    public i(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
        this.f125881c = concurrentHashMap;
        Thread thread = new Thread(this);
        thread.setName("weak-ref-cleaner-strictcontextstorage");
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted()) {
            try {
                Reference remove = remove();
                if (remove != null) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f125881c.remove(remove));
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
