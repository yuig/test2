package ma;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final i f86759a;

    /* renamed from: b, reason: collision with root package name */
    public final g f86760b = new g();

    /* renamed from: c, reason: collision with root package name */
    public boolean f86761c;

    public h(i iVar) {
        this.f86759a = iVar;
    }

    public final void a() {
        i iVar = this.f86759a;
        s lifecycle = iVar.getLifecycle();
        if (((b0) lifecycle).f18588d != r.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new c(iVar));
        final g gVar = this.f86760b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!(!gVar.f86754b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new x() { // from class: ma.d
            @Override // androidx.lifecycle.x
            public final void c(z zVar, q event) {
                g this$0 = g.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(zVar, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == q.ON_START) {
                    this$0.f86758f = true;
                } else if (event == q.ON_STOP) {
                    this$0.f86758f = false;
                }
            }
        });
        gVar.f86754b = true;
        this.f86761c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f86761c) {
            a();
        }
        b0 b0Var = (b0) this.f86759a.getLifecycle();
        if (!(!b0Var.f18588d.isAtLeast(r.STARTED))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + b0Var.f18588d).toString());
        }
        g gVar = this.f86760b;
        if (!gVar.f86754b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!gVar.f86756d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        gVar.f86755c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        gVar.f86756d = true;
    }

    public final void c(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        g gVar = this.f86760b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = gVar.f86755c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        p.g gVar2 = gVar.f86753a;
        gVar2.getClass();
        p.d dVar = new p.d(gVar2);
        gVar2.f98293c.put(dVar, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(dVar, "this.components.iteratorWithAdditions()");
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle.putBundle((String) entry.getKey(), ((f) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
