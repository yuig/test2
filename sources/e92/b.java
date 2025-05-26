package e92;

import android.webkit.JavascriptInterface;
import d92.u;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;
import nm.o;
import org.jetbrains.annotations.NotNull;
import w82.i;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f57916a;

    /* renamed from: b, reason: collision with root package name */
    public final o f57917b;

    public b(i messageCallbacks) {
        Intrinsics.checkNotNullParameter(messageCallbacks, "messageCallbacks");
        this.f57916a = messageCallbacks;
        this.f57917b = new o();
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            e message2 = (e) this.f57917b.b(e.class, message);
            a aVar = this.f57916a;
            Intrinsics.f(message2);
            i iVar = (i) aVar;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            j.x2(iVar.a8(), new u(message2));
        } catch (Exception unused) {
        }
    }
}
