package ez1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f60716a;

    /* renamed from: b, reason: collision with root package name */
    public final String f60717b;

    /* renamed from: c, reason: collision with root package name */
    public String f60718c;

    public g(String eventTime, String eventType, String eventDetails) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventDetails, "eventDetails");
        this.f60716a = eventTime;
        this.f60717b = eventType;
        this.f60718c = eventDetails;
    }

    public final String a() {
        return this.f60718c;
    }

    public final String b() {
        return this.f60716a;
    }

    public final String c() {
        return this.f60717b;
    }

    public final void d(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f60718c = str;
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f60716a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f60716a, gVar.f60716a) && Intrinsics.d(this.f60717b, gVar.f60717b) && Intrinsics.d(this.f60718c, gVar.f60718c);
    }

    public final int hashCode() {
        return this.f60718c.hashCode() + cb.d(this.f60717b, this.f60716a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f60716a;
        return a.a.q(cb.o("PinalyticsEventData(eventTime=", str, ", eventType="), this.f60717b, ", eventDetails=", this.f60718c, ")");
    }
}
