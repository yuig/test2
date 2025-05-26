package yc2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f138702a;

    /* renamed from: b, reason: collision with root package name */
    public final String f138703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f138704c;

    /* renamed from: d, reason: collision with root package name */
    public final String f138705d;

    public a(String event, String widgetType, String str, String str2) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.f138702a = event;
        this.f138703b = widgetType;
        this.f138704c = str;
        this.f138705d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f138702a, aVar.f138702a) && Intrinsics.d(this.f138703b, aVar.f138703b) && Intrinsics.d(this.f138704c, aVar.f138704c) && Intrinsics.d(this.f138705d, aVar.f138705d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f138703b, this.f138702a.hashCode() * 31, 31);
        String str = this.f138704c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f138705d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WidgetEventData(event=");
        sb3.append(this.f138702a);
        sb3.append(", widgetType=");
        sb3.append(this.f138703b);
        sb3.append(", source=");
        sb3.append(this.f138704c);
        sb3.append(", error=");
        return a.a.p(sb3, this.f138705d, ")");
    }
}
