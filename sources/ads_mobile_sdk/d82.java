package ads_mobile_sdk;

import ao2.m0;
import com.google.common.base.VerifyException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes2.dex */
public final class d82 extends UploadDataProvider {

    /* renamed from: a, reason: collision with root package name */
    public final RequestBody f4202a;

    /* renamed from: b, reason: collision with root package name */
    public final yw2 f4203b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.common.util.concurrent.d0 f4204c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4205d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.common.util.concurrent.c0 f4206e;

    /* renamed from: f, reason: collision with root package name */
    public long f4207f;

    public d82(RequestBody requestBody, yw2 yw2Var, ExecutorService executorService, long j13) {
        this.f4202a = requestBody;
        this.f4203b = yw2Var;
        if (executorService instanceof com.google.common.util.concurrent.d0) {
            this.f4204c = (com.google.common.util.concurrent.d0) executorService;
        } else {
            this.f4204c = df.j1.j1(executorService);
        }
        this.f4205d = j13 == 0 ? 2147483647L : j13;
    }

    public final void a() {
        if (this.f4206e == null) {
            com.google.common.util.concurrent.c0 submit = this.f4204c.submit((Callable) new a.k1(this, 0));
            this.f4206e = submit;
            dl2.b.n(submit, new c82(this), com.google.common.util.concurrent.r.INSTANCE);
        }
    }

    public final /* synthetic */ Void b() {
        wo2.x h10 = m0.h(this.f4203b);
        this.f4202a.d(h10);
        h10.flush();
        this.f4203b.a();
        return null;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f4202a.a();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        a();
        if (this.f4202a.a() == -1) {
            try {
                int position = byteBuffer.position();
                xw2 xw2Var = (xw2) com.bumptech.glide.c.b0(this.f4203b.a(byteBuffer), this.f4205d, TimeUnit.MILLISECONDS);
                this.f4207f += byteBuffer.position() - position;
                uploadDataSink.onReadSucceeded(xw2Var.equals(xw2.END_OF_BODY));
                return;
            } catch (ExecutionException | TimeoutException e13) {
                this.f4206e.cancel(true);
                uploadDataSink.onReadError(new IOException(e13));
                return;
            }
        }
        try {
            int position2 = byteBuffer.position();
            xw2 xw2Var2 = (xw2) com.bumptech.glide.c.b0(this.f4203b.a(byteBuffer), this.f4205d, TimeUnit.MILLISECONDS);
            long position3 = this.f4207f + (byteBuffer.position() - position2);
            this.f4207f = position3;
            if (position3 > this.f4202a.a()) {
                throw new IOException("Expected " + this.f4202a.a() + " bytes but got at least " + this.f4207f);
            }
            if (this.f4207f >= this.f4202a.a()) {
                a(uploadDataSink, byteBuffer);
                return;
            }
            int ordinal = xw2Var2.ordinal();
            if (ordinal == 0) {
                uploadDataSink.onReadSucceeded(false);
            } else if (ordinal == 1) {
                throw new IOException("The source has been exhausted but we expected more data!");
            }
        } catch (ExecutionException | TimeoutException e14) {
            this.f4206e.cancel(true);
            uploadDataSink.onReadError(new IOException(e14));
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new UnsupportedOperationException("Rewind is not supported!"));
    }

    public final void a(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byteBuffer.position(0);
        int position2 = byteBuffer.position();
        xw2 xw2Var = (xw2) com.bumptech.glide.c.b0(this.f4203b.a(byteBuffer), this.f4205d, TimeUnit.MILLISECONDS);
        this.f4207f += byteBuffer.position() - position2;
        if (xw2Var.equals(xw2.END_OF_BODY)) {
            Object[] objArr = new Object[0];
            if (byteBuffer.position() == 0) {
                byteBuffer.position(position);
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new VerifyException(bs1.c.q1("END_OF_BODY reads shouldn't write anything to the buffer", objArr));
        }
        long a13 = this.f4202a.a();
        long j13 = this.f4207f;
        StringBuilder u13 = a.a.u("Expected ", a13, " bytes but got at least ");
        u13.append(j13);
        throw new IOException(u13.toString());
    }
}
