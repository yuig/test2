package tu1;

import android.util.Pair;
import com.google.common.base.VerifyException;
import df.j1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes2.dex */
public final class x0 extends UploadDataProvider {

    /* renamed from: g, reason: collision with root package name */
    public final RequestBody f119466g;

    /* renamed from: h, reason: collision with root package name */
    public final b1 f119467h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.common.util.concurrent.d0 f119468i;

    /* renamed from: j, reason: collision with root package name */
    public final long f119469j;

    /* renamed from: k, reason: collision with root package name */
    public com.google.common.util.concurrent.c0 f119470k;

    /* renamed from: l, reason: collision with root package name */
    public long f119471l;

    public x0(RequestBody requestBody, b1 b1Var, ExecutorService executorService, long j13) {
        this.f119466g = requestBody;
        this.f119467h = b1Var;
        if (executorService instanceof com.google.common.util.concurrent.d0) {
            this.f119468i = (com.google.common.util.concurrent.d0) executorService;
        } else {
            this.f119468i = j1.j1(executorService);
        }
        this.f119469j = j13 == 0 ? 2147483647L : j13;
    }

    public static IOException d(long j13, long j14) {
        StringBuilder u13 = a.a.u("Expected ", j13, " bytes but got at least ");
        u13.append(j14);
        return new IOException(u13.toString());
    }

    public final void c(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byteBuffer.position(0);
        if (!e(byteBuffer).equals(a1.END_OF_BODY)) {
            throw d(this.f119466g.a(), this.f119471l);
        }
        Object[] objArr = new Object[0];
        if (!(byteBuffer.position() == 0)) {
            throw new VerifyException(bs1.c.q1("END_OF_BODY reads shouldn't write anything to the buffer", objArr));
        }
        byteBuffer.position(position);
        uploadDataSink.onReadSucceeded(false);
    }

    public final a1 e(ByteBuffer byteBuffer) {
        com.google.common.util.concurrent.c0 c0Var;
        int position = byteBuffer.position();
        b1 b1Var = this.f119467h;
        AtomicReference atomicReference = b1Var.f119355c;
        Throwable th3 = (Throwable) atomicReference.get();
        if (th3 != null) {
            c0Var = new com.google.common.util.concurrent.x(th3);
        } else {
            com.google.common.util.concurrent.k0 k0Var = new com.google.common.util.concurrent.k0();
            b1Var.f119353a.add(Pair.create(byteBuffer, k0Var));
            Throwable th4 = (Throwable) atomicReference.get();
            if (th4 != null) {
                k0Var.w(th4);
            }
            c0Var = k0Var;
        }
        a1 a1Var = (a1) com.bumptech.glide.c.b0(c0Var, this.f119469j, TimeUnit.MILLISECONDS);
        this.f119471l += byteBuffer.position() - position;
        return a1Var;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f119466g.a();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (this.f119470k == null) {
            com.google.common.util.concurrent.c0 submit = this.f119468i.submit((Callable) new le.t(this, 5));
            this.f119470k = submit;
            dl2.b.n(submit, new b20.c(this), com.google.common.util.concurrent.r.INSTANCE);
        }
        RequestBody requestBody = this.f119466g;
        if (requestBody.a() == -1) {
            try {
                uploadDataSink.onReadSucceeded(e(byteBuffer).equals(a1.END_OF_BODY));
                return;
            } catch (ExecutionException | TimeoutException e13) {
                this.f119470k.cancel(true);
                uploadDataSink.onReadError(new IOException(e13));
                return;
            }
        }
        try {
            a1 e14 = e(byteBuffer);
            if (this.f119471l > requestBody.a()) {
                throw d(requestBody.a(), this.f119471l);
            }
            if (this.f119471l >= requestBody.a()) {
                c(uploadDataSink, byteBuffer);
                return;
            }
            int i13 = w0.f119463a[e14.ordinal()];
            if (i13 == 1) {
                uploadDataSink.onReadSucceeded(false);
            } else if (i13 == 2) {
                throw new IOException("The source has been exhausted but we expected more data!");
            }
        } catch (ExecutionException e15) {
            e = e15;
            this.f119470k.cancel(true);
            uploadDataSink.onReadError(new IOException(e));
        } catch (TimeoutException e16) {
            e = e16;
            this.f119470k.cancel(true);
            uploadDataSink.onReadError(new IOException(e));
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        if (this.f119466g.c()) {
            uploadDataSink.onRewindError(new UnsupportedOperationException("Rewind is not supported!"));
            return;
        }
        try {
            this.f119471l = 0L;
            this.f119470k = null;
            b1 b1Var = this.f119467h;
            b1Var.f119353a.clear();
            b1Var.f119354b.set(false);
            b1Var.f119355c.set(null);
            if (this.f119470k == null) {
                com.google.common.util.concurrent.c0 submit = this.f119468i.submit((Callable) new le.t(this, 5));
                this.f119470k = submit;
                dl2.b.n(submit, new b20.c(this), com.google.common.util.concurrent.r.INSTANCE);
            }
            uploadDataSink.onRewindSucceeded();
        } catch (Exception e13) {
            uploadDataSink.onRewindError(e13);
        }
    }
}
