package gb;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import l0.v;
import u0.n;
import u5.j;

/* loaded from: classes3.dex */
public final class a implements fb.a {
    @Override // fb.a
    public final void a(Activity context, j executor, v callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executor.execute(new n(callback, 27));
    }

    @Override // fb.a
    public final void b(p5.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
