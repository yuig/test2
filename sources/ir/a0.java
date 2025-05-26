package ir;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 implements p000do.c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f73447a;

    public a0(p000do.c actualHandler) {
        Intrinsics.checkNotNullParameter(actualHandler, "actualHandler");
        this.f73447a = new WeakReference(actualHandler);
    }

    @Override // p000do.c
    public final void a(Bundle state, Object target) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(state, "state");
        p000do.c cVar = (p000do.c) this.f73447a.get();
        if (cVar != null) {
            cVar.a(state, target);
        }
    }

    @Override // p000do.c
    public final void f(Bundle bundle, Object target) {
        Intrinsics.checkNotNullParameter(target, "target");
        p000do.c cVar = (p000do.c) this.f73447a.get();
        if (cVar != null) {
            cVar.f(bundle, target);
        }
    }
}
