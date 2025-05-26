package androidx.lifecycle;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e1 implements x, Closeable {

    /* renamed from: a */
    public final String f18615a;

    /* renamed from: b */
    public final c1 f18616b;

    /* renamed from: c */
    public boolean f18617c;

    public e1(String key, c1 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f18615a = key;
        this.f18616b = handle;
    }

    public final void a(s lifecycle, ma.g registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!(!this.f18617c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f18617c = true;
        lifecycle.a(this);
        registry.c(this.f18615a, this.f18616b.f18605e);
    }

    @Override // androidx.lifecycle.x
    public final void c(z source, q event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == q.ON_DESTROY) {
            this.f18617c = false;
            source.getLifecycle().b(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
