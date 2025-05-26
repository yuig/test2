package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xk2.f;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final IOException f95949a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f95950b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f95949a = firstConnectException;
        this.f95950b = firstConnectException;
    }

    public final void a(IOException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        f.a(this.f95949a, e13);
        this.f95950b = e13;
    }

    /* renamed from: b, reason: from getter */
    public final IOException getF95949a() {
        return this.f95949a;
    }

    /* renamed from: c, reason: from getter */
    public final IOException getF95950b() {
        return this.f95950b;
    }
}
