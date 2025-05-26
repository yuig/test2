package tu1;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public abstract class z0 extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final ResponseBody f119477d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f119478e;

    public z0(ResponseBody delegate, boolean z13) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f119477d = delegate;
        this.f119478e = z13;
    }

    public abstract void a();

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z13 = this.f119478e;
        ResponseBody responseBody = this.f119477d;
        if (z13) {
            long f95752e = responseBody.getF95752e();
            if (0 <= f95752e && f95752e < 512) {
                try {
                    wo2.l f95753f = responseBody.getF95753f();
                    try {
                        f95753f.f0(new wo2.f());
                        dl2.b.J(f95753f, null);
                    } finally {
                    }
                } catch (Throwable unused) {
                }
            }
        }
        responseBody.close();
        a();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getF95752e() {
        return this.f119477d.getF95752e();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF95751d() {
        return this.f119477d.getF95751d();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final wo2.l getF95753f() {
        return this.f119477d.getF95753f();
    }
}
