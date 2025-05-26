package vy;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f126844b;

    public /* synthetic */ a(byte[] bArr, int i13) {
        this.f126843a = i13;
        this.f126844b = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f126843a;
        byte[] thrift = this.f126844b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(thrift, "$thrift");
                RequestBody.Companion companion = RequestBody.f95711a;
                MediaType.f95651d.getClass();
                return zh0.d.a(RequestBody.Companion.e(companion, thrift, MediaType.Companion.a("application/x-thrift"), 6), "event_batch", "binary", "null");
            default:
                Intrinsics.checkNotNullParameter(thrift, "$data");
                RequestBody.Companion companion2 = RequestBody.f95711a;
                MediaType.f95651d.getClass();
                return zh0.d.a(RequestBody.Companion.e(companion2, thrift, MediaType.Companion.a("application/vnd.apache.thrift.binary"), 6), "event", "binary", "event.thrift");
        }
    }
}
