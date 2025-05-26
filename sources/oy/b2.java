package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f98011a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98012b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98013c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98014d;

    /* renamed from: e, reason: collision with root package name */
    public final long f98015e;

    /* renamed from: f, reason: collision with root package name */
    public final int f98016f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f98017g;

    public b2(String uniqueIdentifier, int i13, String pageId, String fileUri, long j13, int i14, Boolean bool) {
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        this.f98011a = uniqueIdentifier;
        this.f98012b = i13;
        this.f98013c = pageId;
        this.f98014d = fileUri;
        this.f98015e = j13;
        this.f98016f = i14;
        this.f98017g = bool;
    }

    public final long a() {
        return this.f98015e;
    }

    public final String b() {
        return this.f98014d;
    }

    public final Boolean c() {
        return this.f98017g;
    }

    public final String d() {
        return this.f98013c;
    }

    public final int e() {
        return this.f98016f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.d(this.f98011a, b2Var.f98011a) && this.f98012b == b2Var.f98012b && Intrinsics.d(this.f98013c, b2Var.f98013c) && Intrinsics.d(this.f98014d, b2Var.f98014d) && this.f98015e == b2Var.f98015e && this.f98016f == b2Var.f98016f && Intrinsics.d(this.f98017g, b2Var.f98017g);
    }

    public final int f() {
        return this.f98012b;
    }

    public final String g() {
        return this.f98011a;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f98016f, a.a.c(this.f98015e, cb.d(this.f98014d, cb.d(this.f98013c, ep.b.b(this.f98012b, this.f98011a.hashCode() * 31, 31), 31), 31), 31), 31);
        Boolean bool = this.f98017g;
        return b13 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StartEvent(uniqueIdentifier=");
        sb3.append(this.f98011a);
        sb3.append(", retryCount=");
        sb3.append(this.f98012b);
        sb3.append(", pageId=");
        sb3.append(this.f98013c);
        sb3.append(", fileUri=");
        sb3.append(this.f98014d);
        sb3.append(", fileSizeInBytes=");
        sb3.append(this.f98015e);
        sb3.append(", postRegistrationTimeDurationInMin=");
        sb3.append(this.f98016f);
        sb3.append(", mediaExportSkipped=");
        return a.c.h(sb3, this.f98017g, ")");
    }
}
