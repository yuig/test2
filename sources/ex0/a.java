package ex0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f60375a;

    /* renamed from: b, reason: collision with root package name */
    public final e f60376b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f60377c;

    /* renamed from: d, reason: collision with root package name */
    public final long f60378d;

    /* renamed from: e, reason: collision with root package name */
    public final c f60379e;

    /* renamed from: f, reason: collision with root package name */
    public final g f60380f;

    /* renamed from: g, reason: collision with root package name */
    public final String f60381g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f60382h;

    public a(String ideaPinPageId, e eVar, Long l13, long j13, c networkType, g status, String ideaPinCreationId, boolean z13) {
        Intrinsics.checkNotNullParameter(ideaPinPageId, "ideaPinPageId");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ideaPinCreationId, "ideaPinCreationId");
        this.f60375a = ideaPinPageId;
        this.f60376b = eVar;
        this.f60377c = l13;
        this.f60378d = j13;
        this.f60379e = networkType;
        this.f60380f = status;
        this.f60381g = ideaPinCreationId;
        this.f60382h = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f60375a, aVar.f60375a) && this.f60376b == aVar.f60376b && Intrinsics.d(this.f60377c, aVar.f60377c) && this.f60378d == aVar.f60378d && this.f60379e == aVar.f60379e && this.f60380f == aVar.f60380f && Intrinsics.d(this.f60381g, aVar.f60381g) && this.f60382h == aVar.f60382h;
    }

    public final int hashCode() {
        int hashCode = this.f60375a.hashCode() * 31;
        e eVar = this.f60376b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Long l13 = this.f60377c;
        return Boolean.hashCode(this.f60382h) + cb.d(this.f60381g, (this.f60380f.hashCode() + ((this.f60379e.hashCode() + a.a.c(this.f60378d, (hashCode2 + (l13 != null ? l13.hashCode() : 0)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "NetworkSpeed(ideaPinPageId=" + this.f60375a + ", uploadBucket=" + this.f60376b + ", bytesWritten=" + this.f60377c + ", timestamp=" + this.f60378d + ", networkType=" + this.f60379e + ", status=" + this.f60380f + ", ideaPinCreationId=" + this.f60381g + ", isVideo=" + this.f60382h + ")";
    }
}
