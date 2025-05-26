package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f131968a;

    /* renamed from: b, reason: collision with root package name */
    public final zf f131969b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f131970c;

    public ag(Integer num, zf zfVar, Boolean bool) {
        this.f131968a = num;
        this.f131969b = zfVar;
        this.f131970c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return Intrinsics.d(this.f131968a, agVar.f131968a) && Intrinsics.d(this.f131969b, agVar.f131969b) && Intrinsics.d(this.f131970c, agVar.f131970c);
    }

    public final int hashCode() {
        Integer num = this.f131968a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        zf zfVar = this.f131969b;
        int hashCode2 = (hashCode + (zfVar == null ? 0 : zfVar.hashCode())) * 31;
        Boolean bool = this.f131970c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f131968a);
        sb3.append(", metadata=");
        sb3.append(this.f131969b);
        sb3.append(", isDeleted=");
        return a.c.h(sb3, this.f131970c, ")");
    }
}
