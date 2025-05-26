package mw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends m {

    /* renamed from: c, reason: collision with root package name */
    public final n f88441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n selectedSubtype) {
        super("SOURCE", com.pinterest.partnerAnalytics.g.source_label);
        Intrinsics.checkNotNullParameter(selectedSubtype, "selectedSubtype");
        this.f88441c = selectedSubtype;
    }

    @Override // mw1.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f88441c == ((l) obj).f88441c;
    }

    @Override // mw1.m
    public final int hashCode() {
        return this.f88441c.hashCode();
    }

    public final String toString() {
        return "SourceType(selectedSubtype=" + this.f88441c + ")";
    }

    public /* synthetic */ l() {
        this(n.NON_PROFILE);
    }
}
