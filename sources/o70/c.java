package o70;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final vh f93227a;

    public c(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f93227a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f93227a, ((c) obj).f93227a);
    }

    public final int hashCode() {
        return this.f93227a.hashCode();
    }

    public final String toString() {
        return "StoryItemVMState(model=" + this.f93227a + ")";
    }
}
