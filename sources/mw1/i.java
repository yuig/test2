package mw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends m {

    /* renamed from: c, reason: collision with root package name */
    public final c f88438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c selectedSubtype) {
        super("CONTENT_TYPE", com.pinterest.partnerAnalytics.g.content_type_label);
        Intrinsics.checkNotNullParameter(selectedSubtype, "selectedSubtype");
        this.f88438c = selectedSubtype;
    }

    @Override // mw1.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f88438c == ((i) obj).f88438c;
    }

    @Override // mw1.m
    public final int hashCode() {
        return this.f88438c.hashCode();
    }

    public final String toString() {
        return "ContentType(selectedSubtype=" + this.f88438c + ")";
    }

    public /* synthetic */ i() {
        this(c.PAID);
    }
}
