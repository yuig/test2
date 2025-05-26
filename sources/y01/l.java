package y01;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f136428a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136429b;

    /* renamed from: c, reason: collision with root package name */
    public final tb0.p f136430c;

    public l(Throwable exception, String detailedMessage, tb0.p productFlow) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(detailedMessage, "detailedMessage");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        this.f136428a = exception;
        this.f136429b = detailedMessage;
        this.f136430c = productFlow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f136428a, lVar.f136428a) && Intrinsics.d(this.f136429b, lVar.f136429b) && this.f136430c == lVar.f136430c;
    }

    public final int hashCode() {
        return this.f136430c.hashCode() + cb.d(this.f136429b, this.f136428a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LogHandledException(exception=" + this.f136428a + ", detailedMessage=" + this.f136429b + ", productFlow=" + this.f136430c + ")";
    }
}
