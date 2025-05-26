package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f98171a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98172b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98173c;

    public q1(String uniqueIdentifier, int i13, String pageId) {
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.f98171a = uniqueIdentifier;
        this.f98172b = i13;
        this.f98173c = pageId;
    }

    public final String a() {
        return this.f98173c;
    }

    public final int b() {
        return this.f98172b;
    }

    public final String c() {
        return this.f98171a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.d(this.f98171a, q1Var.f98171a) && this.f98172b == q1Var.f98172b && Intrinsics.d(this.f98173c, q1Var.f98173c);
    }

    public final int hashCode() {
        return this.f98173c.hashCode() + ep.b.b(this.f98172b, this.f98171a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StartEvent(uniqueIdentifier=");
        sb3.append(this.f98171a);
        sb3.append(", retryCount=");
        sb3.append(this.f98172b);
        sb3.append(", pageId=");
        return a.a.p(sb3, this.f98173c, ")");
    }
}
