package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class za {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f133815a;

    /* renamed from: b, reason: collision with root package name */
    public final ya f133816b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f133817c;

    public za(Integer num, ya yaVar, Boolean bool) {
        this.f133815a = num;
        this.f133816b = yaVar;
        this.f133817c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        return Intrinsics.d(this.f133815a, zaVar.f133815a) && Intrinsics.d(this.f133816b, zaVar.f133816b) && Intrinsics.d(this.f133817c, zaVar.f133817c);
    }

    public final int hashCode() {
        Integer num = this.f133815a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ya yaVar = this.f133816b;
        int hashCode2 = (hashCode + (yaVar == null ? 0 : yaVar.hashCode())) * 31;
        Boolean bool = this.f133817c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f133815a);
        sb3.append(", metadata=");
        sb3.append(this.f133816b);
        sb3.append(", isDeleted=");
        return a.c.h(sb3, this.f133817c, ")");
    }
}
