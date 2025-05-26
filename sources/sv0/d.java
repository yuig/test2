package sv0;

import ao2.m0;
import com.amazonaws.http.HttpRequest;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import wo2.y;

/* loaded from: classes5.dex */
public final class d extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f115329b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f115330c;

    public d(HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        this.f115330c = httpRequest;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        switch (this.f115329b) {
            case 0:
                return ((HttpRequest) this.f115330c).a();
            default:
                return -1L;
        }
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b */
    public final MediaType getF95712b() {
        switch (this.f115329b) {
            case 0:
                return null;
            default:
                return ah2.i.f15208f;
        }
    }

    @Override // okhttp3.RequestBody
    public final void d(wo2.k sink) {
        int i13 = this.f115329b;
        Object obj = this.f115330c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                InputStream inputStream = ((HttpRequest) obj).f28601d;
                if (inputStream != null) {
                    wo2.d l03 = m0.l0(inputStream);
                    try {
                        sink.i2(l03);
                        dl2.b.J(l03, null);
                        return;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            dl2.b.J(l03, th3);
                            throw th4;
                        }
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                y i14 = m0.i(m0.l0((InputStream) ((Function0) obj).invoke()));
                try {
                    sink.i2(i14);
                    dl2.b.J(i14, null);
                    return;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        dl2.b.J(i14, th5);
                        throw th6;
                    }
                }
        }
    }

    public d(nd2.a payloadStream) {
        Intrinsics.checkNotNullParameter(payloadStream, "payloadStream");
        this.f115330c = payloadStream;
    }
}
