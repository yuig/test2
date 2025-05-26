package r0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.impl.r1;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class i implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final gc.c f105528a = gc.c.G();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f105529b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f105530c = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f105531d = new AtomicReference(null);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f105532e = new AtomicReference(new y.a(3));

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f105533f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final r1 f105534g = r1.r(Boolean.FALSE);

    /* renamed from: h, reason: collision with root package name */
    public final q f105535h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f105536i;

    /* renamed from: j, reason: collision with root package name */
    public final p5.a f105537j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f105538k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f105539l;

    /* renamed from: m, reason: collision with root package name */
    public final long f105540m;

    public i(q qVar, Executor executor, p5.a aVar, boolean z13, boolean z14, long j13) {
        if (qVar == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f105535h = qVar;
        this.f105536i = executor;
        this.f105537j = aVar;
        this.f105538k = z13;
        this.f105539l = z14;
        this.f105540m = j13;
    }

    @Override // java.lang.AutoCloseable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void close() {
        d(Uri.EMPTY);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void finalize() {
        try {
            ((e0.e) this.f105528a.f64764b).d();
            p5.a aVar = (p5.a) this.f105532e.getAndSet(null);
            if (aVar != null) {
                e(aVar, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final void d(Uri uri) {
        if (this.f105529b.get()) {
            e((p5.a) this.f105532e.getAndSet(null), uri);
        }
    }

    public final void e(p5.a aVar, Uri uri) {
        if (aVar == null) {
            throw new AssertionError("Recording " + this + " has already been finalized");
        }
        gc.c cVar = this.f105528a;
        switch (cVar.f64763a) {
            case 16:
                ((e0.e) cVar.f64764b).close();
                break;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) cVar.f64764b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    break;
                }
                break;
        }
        aVar.accept(uri);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f105535h.equals(iVar.f105535h)) {
            Executor executor = iVar.f105536i;
            Executor executor2 = this.f105536i;
            if (executor2 != null ? executor2.equals(executor) : executor == null) {
                p5.a aVar = iVar.f105537j;
                p5.a aVar2 = this.f105537j;
                if (aVar2 != null ? aVar2.equals(aVar) : aVar == null) {
                    if (this.f105538k == iVar.f105538k && this.f105539l == iVar.f105539l && this.f105540m == iVar.f105540m) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void f(Context context) {
        if (this.f105529b.getAndSet(true)) {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
        ((e0.e) this.f105528a.f64764b).a("finalizeRecording");
        this.f105530c.set(new d0(this.f105535h));
        if (this.f105538k) {
            int i13 = Build.VERSION.SDK_INT;
            AtomicReference atomicReference = this.f105531d;
            if (i13 >= 31) {
                atomicReference.set(new e0(this, context));
            } else {
                atomicReference.set(new f0(this));
            }
        }
    }

    public final MediaMuxer g(int i13, l0.v vVar) {
        if (!this.f105529b.get()) {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
        d0 d0Var = (d0) this.f105530c.getAndSet(null);
        if (d0Var == null) {
            throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
        }
        try {
            return d0Var.a(i13, vVar);
        } catch (RuntimeException e13) {
            throw new IOException("Failed to create MediaMuxer by " + e13, e13);
        }
    }

    public final void h(i1 i1Var) {
        int i13;
        String str;
        q qVar = i1Var.f105541a;
        q qVar2 = this.f105535h;
        if (!Objects.equals(qVar, qVar2)) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + qVar + ", Expected: " + qVar2 + "]");
        }
        String concat = "Sending VideoRecordEvent ".concat(i1Var.getClass().getSimpleName());
        boolean z13 = i1Var instanceof d1;
        if (z13 && (i13 = ((d1) i1Var).f105507c) != 0) {
            StringBuilder i14 = n60.o.i(concat);
            switch (i13) {
                case 0:
                    str = "ERROR_NONE";
                    break;
                case 1:
                    str = "ERROR_UNKNOWN";
                    break;
                case 2:
                    str = "ERROR_FILE_SIZE_LIMIT_REACHED";
                    break;
                case 3:
                    str = "ERROR_INSUFFICIENT_STORAGE";
                    break;
                case 4:
                    str = "ERROR_SOURCE_INACTIVE";
                    break;
                case 5:
                    str = "ERROR_INVALID_OUTPUT_OPTIONS";
                    break;
                case 6:
                    str = "ERROR_ENCODING_FAILED";
                    break;
                case 7:
                    str = "ERROR_RECORDER_ERROR";
                    break;
                case 8:
                    str = "ERROR_NO_VALID_DATA";
                    break;
                case 9:
                    str = "ERROR_DURATION_LIMIT_REACHED";
                    break;
                case 10:
                    str = "ERROR_RECORDING_GARBAGE_COLLECTED";
                    break;
                default:
                    str = a.a.e("Unknown(", i13, ")");
                    break;
            }
            i14.append(" [error: " + str + "]");
            concat = i14.toString();
        }
        kh2.m0.p("Recorder", concat);
        boolean z14 = i1Var instanceof g1;
        r1 r1Var = this.f105534g;
        if (z14 || (i1Var instanceof f1)) {
            r1Var.p(Boolean.TRUE);
        } else if ((i1Var instanceof e1) || z13) {
            r1Var.p(Boolean.FALSE);
        }
        Executor executor = this.f105536i;
        if (executor == null || this.f105537j == null) {
            return;
        }
        try {
            executor.execute(new l0.e(8, this, i1Var));
        } catch (RejectedExecutionException e13) {
            kh2.m0.t("Recorder", "The callback executor is invalid.", e13);
        }
    }

    public final int hashCode() {
        int hashCode = (((p) this.f105535h).f105617b.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f105536i;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        p5.a aVar = this.f105537j;
        int hashCode3 = (((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ (this.f105538k ? 1231 : 1237)) * 1000003;
        int i13 = this.f105539l ? 1231 : 1237;
        long j13 = this.f105540m;
        return ((hashCode3 ^ i13) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb3.append(this.f105535h);
        sb3.append(", getCallbackExecutor=");
        sb3.append(this.f105536i);
        sb3.append(", getEventListener=");
        sb3.append(this.f105537j);
        sb3.append(", hasAudioEnabled=");
        sb3.append(this.f105538k);
        sb3.append(", isPersistent=");
        sb3.append(this.f105539l);
        sb3.append(", getRecordingId=");
        return a.a.o(sb3, this.f105540m, "}");
    }
}
