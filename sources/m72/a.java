package m72;

import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n62.k;
import n72.l;
import n72.m;
import s1.c;
import tb0.h;
import tb0.p;

/* loaded from: classes4.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f86523a;

    public a(h hVar) {
        this.f86523a = hVar;
    }

    @Override // n72.m
    public final void a(Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w("ShuffleCoreLogger", (String) message.invoke());
    }

    @Override // n72.m
    public final void b(String message, l level) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f86523a.h(message);
    }

    @Override // n72.m
    public final void c(Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("ShuffleCoreLogger", (String) message.invoke());
    }

    @Override // n72.m
    public final void d(Throwable th3, Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (th3 == null) {
            th3 = new IllegalStateException((String) message.invoke());
        }
        this.f86523a.q(th3, (String) message.invoke(), p.COLLAGES);
    }

    @Override // n72.m
    public final void e(Throwable th3) {
        k message = k.f89372i;
        Intrinsics.checkNotNullParameter(message, "message");
        if (th3 == null) {
            th3 = new IllegalStateException("Renderer failed on effects screen");
        }
        this.f86523a.q(th3, "Renderer failed on effects screen", p.COLLAGES);
    }

    @Override // n72.m
    public final void f(Throwable th3) {
        a72.a message = a72.a.f1260i;
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w("ShuffleCoreLogger", "createMaskBitmap()", th3);
    }

    @Override // n72.m
    public final void g(c message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.v("ShuffleCoreLogger", (String) message.invoke());
    }
}
