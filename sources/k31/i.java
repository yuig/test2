package k31;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f78255a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f78256b;

    public i(Function0 tapAction, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        this.f78255a = label;
        this.f78256b = tapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f78255a, iVar.f78255a) && Intrinsics.d(this.f78256b, iVar.f78256b);
    }

    public final int hashCode() {
        return this.f78256b.hashCode() + (this.f78255a.hashCode() * 31);
    }

    public final String toString() {
        return "UnorganizedIdeasHeaderCtaState(label=" + this.f78255a + ", tapAction=" + this.f78256b + ")";
    }
}
