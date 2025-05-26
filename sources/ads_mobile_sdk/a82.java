package ads_mobile_sdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes2.dex */
public final class a82 extends UploadDataProvider {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f2308a = false;

    /* renamed from: b, reason: collision with root package name */
    public final wo2.j f2309b = new wo2.j();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2310c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RequestBody f2311d;

    public a82(long j13, RequestBody requestBody) {
        this.f2310c = j13;
        this.f2311d = requestBody;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f2310c;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!this.f2308a) {
            this.f2311d.d(this.f2309b);
            this.f2309b.getClass();
            this.f2308a = true;
            long j13 = this.f2310c;
            long j14 = this.f2309b.f130711b;
            if (j14 != j13) {
                StringBuilder u13 = a.a.u("Expected ", j13, " bytes but got ");
                u13.append(j14);
                throw new IOException(u13.toString());
            }
        }
        if (this.f2309b.read(byteBuffer) == -1) {
            throw new IllegalStateException("The source has been exhausted but we expected more!");
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new UnsupportedOperationException());
    }
}
