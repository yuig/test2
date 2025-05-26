package zc0;

import android.view.View;
import ao2.g0;
import ao2.j0;
import ao2.m2;
import ao2.o1;
import ao2.v0;
import bo2.e;
import ho2.q;
import java.util.concurrent.CancellationException;
import ko2.f;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements j0, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f141582a;

    public c() {
        m2 b13 = ue.c.b();
        f fVar = v0.f20219a;
        this.f141582a = g.d(((e) q.f69782a).f23612f, b13);
    }

    @Override // ao2.j0
    public final CoroutineContext getCoroutineContext() {
        return this.f141582a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnAttachStateChangeListener(this);
        view.setTag(d.f141583a, null);
        o1 o1Var = (o1) this.f141582a.get(g0.f20154b);
        if (o1Var != null) {
            o1Var.cancel((CancellationException) null);
        }
    }
}
