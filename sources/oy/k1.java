package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f98128a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98129b;

    public k1(String partNumber, String pageId) {
        Intrinsics.checkNotNullParameter(partNumber, "partNumber");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.f98128a = partNumber;
        this.f98129b = pageId;
    }

    public final String a() {
        return this.f98129b;
    }

    public final String b() {
        return this.f98128a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.d(this.f98128a, k1Var.f98128a) && Intrinsics.d(this.f98129b, k1Var.f98129b);
    }

    public final int hashCode() {
        return this.f98129b.hashCode() + (this.f98128a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StartEvent(partNumber=");
        sb3.append(this.f98128a);
        sb3.append(", pageId=");
        return a.a.p(sb3, this.f98129b, ")");
    }
}
