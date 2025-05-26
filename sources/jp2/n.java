package jp2;

import org.chromium.net.impl.CronetUploadDataStream;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CronetUploadDataStream f77371a;

    public n(CronetUploadDataStream cronetUploadDataStream) {
        this.f77371a = cronetUploadDataStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f77371a.f97384i) {
            try {
                CronetUploadDataStream cronetUploadDataStream = this.f77371a;
                if (cronetUploadDataStream.f97385j == 0) {
                    return;
                }
                cronetUploadDataStream.a(3);
                CronetUploadDataStream cronetUploadDataStream2 = this.f77371a;
                if (cronetUploadDataStream2.f97383h == null) {
                    throw new IllegalStateException("Unexpected readData call. Buffer is null");
                }
                cronetUploadDataStream2.f97386k = 0;
                try {
                    cronetUploadDataStream2.f97378c.d();
                    CronetUploadDataStream cronetUploadDataStream3 = this.f77371a;
                    cronetUploadDataStream3.f97377b.read(cronetUploadDataStream3, cronetUploadDataStream3.f97383h);
                } catch (Exception e13) {
                    this.f77371a.d(e13);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
