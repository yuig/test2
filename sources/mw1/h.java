package mw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends m {

    /* renamed from: c, reason: collision with root package name */
    public final b f88437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b selectedSubtype) {
        super("APP_TYPE", com.pinterest.partnerAnalytics.g.device_label);
        Intrinsics.checkNotNullParameter(selectedSubtype, "selectedSubtype");
        this.f88437c = selectedSubtype;
    }

    @Override // mw1.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f88437c == ((h) obj).f88437c;
    }

    @Override // mw1.m
    public final int hashCode() {
        return this.f88437c.hashCode();
    }

    public final String toString() {
        return "AppType(selectedSubtype=" + this.f88437c + ")";
    }

    public /* synthetic */ h() {
        this(b.WEB);
    }
}
