package t02;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes4.dex */
public final class n implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final m02.b f115733a;

    public n(m02.b sensitivityData) {
        Intrinsics.checkNotNullParameter(sensitivityData, "sensitivityData");
        this.f115733a = sensitivityData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f115733a, ((n) obj).f115733a);
    }

    public final int hashCode() {
        return this.f115733a.hashCode();
    }

    public final String toString() {
        return "ReportSensitivityNoticeVMState(sensitivityData=" + this.f115733a + ")";
    }
}
