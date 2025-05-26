package xc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f134559a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134560b;

    /* renamed from: c, reason: collision with root package name */
    public final p f134561c;

    public l(long j13, int i13, p widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.f134559a = j13;
        this.f134560b = i13;
        this.f134561c = widgetType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f134559a == lVar.f134559a && this.f134560b == lVar.f134560b && this.f134561c == lVar.f134561c;
    }

    public final int hashCode() {
        return this.f134561c.hashCode() + ep.b.b(this.f134560b, Long.hashCode(this.f134559a) * 31, 31);
    }

    public final String toString() {
        return "WidgetRefreshWorkerParams(refreshMillis=" + this.f134559a + ", widgetId=" + this.f134560b + ", widgetType=" + this.f134561c + ")";
    }
}
