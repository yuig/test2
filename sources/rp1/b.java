package rp1;

import android.webkit.JavascriptInterface;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;
import mx.h;
import nm.o;
import org.jetbrains.annotations.NotNull;
import qp1.x;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f109056a;

    /* renamed from: b, reason: collision with root package name */
    public final o f109057b;

    public b(h messageCallbacks) {
        Intrinsics.checkNotNullParameter(messageCallbacks, "messageCallbacks");
        this.f109056a = messageCallbacks;
        this.f109057b = new o();
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            e message2 = (e) this.f109057b.b(e.class, message);
            a aVar = this.f109056a;
            Intrinsics.f(message2);
            h hVar = (h) aVar;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            j.x2(hVar.a8(), new x(message2));
        } catch (Exception unused) {
        }
    }
}
