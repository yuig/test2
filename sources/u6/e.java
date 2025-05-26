package u6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends c {
    public e(c initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        this.f120755a.putAll(initialExtras.f120755a);
    }

    public final Object a(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f120755a.get(key);
    }

    public final void b(b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f120755a.put(key, obj);
    }

    public /* synthetic */ e(int i13) {
        this(a.f120754b);
    }
}
