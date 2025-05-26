package sa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final u62.c f112163a;

    public e(u62.c model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112163a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f112163a, ((e) obj).f112163a);
    }

    public final int hashCode() {
        return this.f112163a.hashCode();
    }

    public final String toString() {
        return "CutoutUpdated(model=" + this.f112163a + ")";
    }
}
