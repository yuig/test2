package kb;

import android.net.NetworkRequest;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final g f78988j = new g();

    /* renamed from: a, reason: collision with root package name */
    public final c0 f78989a;

    /* renamed from: b, reason: collision with root package name */
    public final ub.g f78990b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78991c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f78992d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f78993e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f78994f;

    /* renamed from: g, reason: collision with root package name */
    public final long f78995g;

    /* renamed from: h, reason: collision with root package name */
    public final long f78996h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f78997i;

    public g(g other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f78991c = other.f78991c;
        this.f78992d = other.f78992d;
        this.f78990b = other.f78990b;
        this.f78989a = other.f78989a;
        this.f78993e = other.f78993e;
        this.f78994f = other.f78994f;
        this.f78997i = other.f78997i;
        this.f78995g = other.f78995g;
        this.f78996h = other.f78996h;
    }

    public final long a() {
        return this.f78996h;
    }

    public final long b() {
        return this.f78995g;
    }

    public final Set c() {
        return this.f78997i;
    }

    public final NetworkRequest d() {
        return (NetworkRequest) this.f78990b.f121662a;
    }

    public final c0 e() {
        return this.f78989a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(g.class, obj.getClass())) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f78991c == gVar.f78991c && this.f78992d == gVar.f78992d && this.f78993e == gVar.f78993e && this.f78994f == gVar.f78994f && this.f78995g == gVar.f78995g && this.f78996h == gVar.f78996h && Intrinsics.d(d(), gVar.d()) && this.f78989a == gVar.f78989a) {
            return Intrinsics.d(this.f78997i, gVar.f78997i);
        }
        return false;
    }

    public final boolean f() {
        return !this.f78997i.isEmpty();
    }

    public final boolean g() {
        return this.f78993e;
    }

    public final boolean h() {
        return this.f78991c;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f78989a.hashCode() * 31) + (this.f78991c ? 1 : 0)) * 31) + (this.f78992d ? 1 : 0)) * 31) + (this.f78993e ? 1 : 0)) * 31) + (this.f78994f ? 1 : 0)) * 31;
        long j13 = this.f78995g;
        int i13 = (hashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f78996h;
        int hashCode2 = (this.f78997i.hashCode() + ((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31)) * 31;
        NetworkRequest d2 = d();
        return hashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f78992d;
    }

    public final boolean j() {
        return this.f78994f;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f78989a + ", requiresCharging=" + this.f78991c + ", requiresDeviceIdle=" + this.f78992d + ", requiresBatteryNotLow=" + this.f78993e + ", requiresStorageNotLow=" + this.f78994f + ", contentTriggerUpdateDelayMillis=" + this.f78995g + ", contentTriggerMaxDelayMillis=" + this.f78996h + ", contentUriTriggers=" + this.f78997i + ", }";
    }

    public g(ub.g requiredNetworkRequestCompat, c0 requiredNetworkType, boolean z13, boolean z14, boolean z15, boolean z16, long j13, long j14, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f78990b = requiredNetworkRequestCompat;
        this.f78989a = requiredNetworkType;
        this.f78991c = z13;
        this.f78992d = z14;
        this.f78993e = z15;
        this.f78994f = z16;
        this.f78995g = j13;
        this.f78996h = j14;
        this.f78997i = contentUriTriggers;
    }

    public g() {
        c0 requiredNetworkType = c0.NOT_REQUIRED;
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        kotlin.collections.s0 contentUriTriggers = kotlin.collections.s0.f80394a;
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f78990b = new ub.g(null);
        this.f78989a = requiredNetworkType;
        this.f78991c = false;
        this.f78992d = false;
        this.f78993e = false;
        this.f78994f = false;
        this.f78995g = -1L;
        this.f78996h = -1L;
        this.f78997i = contentUriTriggers;
    }
}
