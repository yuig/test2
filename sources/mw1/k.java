package mw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends m {

    /* renamed from: c, reason: collision with root package name */
    public final d f88440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d selectedSubtype) {
        super("PIN_FORMAT", com.pinterest.partnerAnalytics.g.format_label);
        Intrinsics.checkNotNullParameter(selectedSubtype, "selectedSubtype");
        this.f88440c = selectedSubtype;
    }

    @Override // mw1.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f88440c == ((k) obj).f88440c;
    }

    @Override // mw1.m
    public final int hashCode() {
        return this.f88440c.hashCode();
    }

    public final String toString() {
        return "PinFormatType(selectedSubtype=" + this.f88440c + ")";
    }
}
