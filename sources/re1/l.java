package re1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ue1.l f107613a;

    public l(ue1.l contentItemRepData) {
        Intrinsics.checkNotNullParameter(contentItemRepData, "contentItemRepData");
        this.f107613a = contentItemRepData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f107613a, ((l) obj).f107613a);
    }

    public final int hashCode() {
        return this.f107613a.hashCode();
    }

    public final String toString() {
        return "FreeformModel(contentItemRepData=" + this.f107613a + ")";
    }
}
