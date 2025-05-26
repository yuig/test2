package fd;

import com.apollographql.apollo3.exception.ApolloWebSocketClosedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes3.dex */
public final class c extends WebSocketListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2.v f61753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bd.b f61754b;

    public c(ao2.w wVar, bd.b bVar) {
        this.f61753a = wVar;
        this.f61754b = bVar;
    }

    @Override // okhttp3.WebSocketListener
    public final void a(WebSocket webSocket, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f61754b.r(null);
    }

    @Override // okhttp3.WebSocketListener
    public final void b(WebSocket webSocket, int i13, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        ((ao2.w) this.f61753a).Q(Unit.f80348a);
        this.f61754b.r(new ApolloWebSocketClosedException(i13, reason));
    }

    @Override // okhttp3.WebSocketListener
    public final void c(WebSocket webSocket, Throwable t13) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t13, "t");
        ((ao2.w) this.f61753a).Q(Unit.f80348a);
        this.f61754b.r(t13);
    }

    @Override // okhttp3.WebSocketListener
    public final void d(WebSocket webSocket, String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f61754b.g(text);
    }

    @Override // okhttp3.WebSocketListener
    public final void e(WebSocket webSocket, wo2.m bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f61754b.g(bytes.j());
    }

    @Override // okhttp3.WebSocketListener
    public final void f(RealWebSocket webSocket, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        ((ao2.w) this.f61753a).Q(Unit.f80348a);
    }
}
