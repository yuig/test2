package z10;

import ao2.m0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import wo2.k;
import wo2.r;
import wo2.x;

/* loaded from: classes.dex */
public final class d extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f140587b;

    /* renamed from: c, reason: collision with root package name */
    public final RequestBody f140588c;

    /* renamed from: d, reason: collision with root package name */
    public final long f140589d;

    public d(RequestBody body, int i13) {
        this.f140587b = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.f140588c = body;
            this.f140589d = -1L;
        } else {
            Intrinsics.checkNotNullParameter(body, "body");
            this.f140588c = body;
            this.f140589d = -1L;
        }
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        switch (this.f140587b) {
        }
        return this.f140589d;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b */
    public final MediaType getF95665d() {
        int i13 = this.f140587b;
        RequestBody requestBody = this.f140588c;
        switch (i13) {
        }
        return requestBody.getF95665d();
    }

    @Override // okhttp3.RequestBody
    public final void d(k sink) {
        int i13 = this.f140587b;
        RequestBody requestBody = this.f140588c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                x h10 = m0.h(new r(sink));
                requestBody.d(h10);
                h10.close();
                break;
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                x h13 = m0.h(new r(sink));
                requestBody.d(h13);
                h13.flush();
                break;
        }
    }
}
