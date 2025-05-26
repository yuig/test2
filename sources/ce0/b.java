package ce0;

import a.cb;
import ex0.c;
import ex0.e;
import ex0.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f27591a;

    /* renamed from: b, reason: collision with root package name */
    public final e f27592b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f27593c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27594d;

    /* renamed from: e, reason: collision with root package name */
    public final c f27595e;

    /* renamed from: f, reason: collision with root package name */
    public final g f27596f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27597g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27598h;

    public b(String ideaPinPageId, e eVar, Long l13, long j13, c networkType, g status, String ideaPinCreationId, boolean z13) {
        Intrinsics.checkNotNullParameter(ideaPinPageId, "ideaPinPageId");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ideaPinCreationId, "ideaPinCreationId");
        this.f27591a = ideaPinPageId;
        this.f27592b = eVar;
        this.f27593c = l13;
        this.f27594d = j13;
        this.f27595e = networkType;
        this.f27596f = status;
        this.f27597g = ideaPinCreationId;
        this.f27598h = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f27591a, bVar.f27591a) && this.f27592b == bVar.f27592b && Intrinsics.d(this.f27593c, bVar.f27593c) && this.f27594d == bVar.f27594d && this.f27595e == bVar.f27595e && this.f27596f == bVar.f27596f && Intrinsics.d(this.f27597g, bVar.f27597g) && this.f27598h == bVar.f27598h;
    }

    public final int hashCode() {
        int hashCode = this.f27591a.hashCode() * 31;
        e eVar = this.f27592b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Long l13 = this.f27593c;
        return Boolean.hashCode(this.f27598h) + cb.d(this.f27597g, (this.f27596f.hashCode() + ((this.f27595e.hashCode() + a.a.c(this.f27594d, (hashCode2 + (l13 != null ? l13.hashCode() : 0)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "NetworkSpeedEntity(ideaPinPageId=" + this.f27591a + ", uploadBucket=" + this.f27592b + ", bytesWritten=" + this.f27593c + ", timestamp=" + this.f27594d + ", networkType=" + this.f27595e + ", status=" + this.f27596f + ", ideaPinCreationId=" + this.f27597g + ", isVideo=" + this.f27598h + ")";
    }
}
