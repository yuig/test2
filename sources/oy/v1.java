package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v1 extends a0 implements ey.b2 {

    /* renamed from: g, reason: collision with root package name */
    public final String f98221g;

    /* renamed from: h, reason: collision with root package name */
    public final int f98222h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f98223i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f98224j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(String uniqueIdentifier, int i13, Integer num, boolean z13) {
        super(uniqueIdentifier, 3, 0);
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        this.f98221g = uniqueIdentifier;
        this.f98222h = i13;
        this.f98223i = num;
        this.f98224j = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Intrinsics.d(this.f98221g, v1Var.f98221g) && this.f98222h == v1Var.f98222h && Intrinsics.d(this.f98223i, v1Var.f98223i) && this.f98224j == v1Var.f98224j;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f98222h, this.f98221g.hashCode() * 31, 31);
        Integer num = this.f98223i;
        return Boolean.hashCode(this.f98224j) + ((b13 + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinCreateStartEvent(uniqueIdentifier=");
        sb3.append(this.f98221g);
        sb3.append(", retryCount=");
        sb3.append(this.f98222h);
        sb3.append(", templateType=");
        sb3.append(this.f98223i);
        sb3.append(", isScheduled=");
        return a.a.r(sb3, this.f98224j, ")");
    }
}
