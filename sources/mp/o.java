package mp;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f87874a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f87875b;

    public o(Integer num, int i13) {
        this.f87874a = i13;
        this.f87875b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f87874a == oVar.f87874a && Intrinsics.d(this.f87875b, oVar.f87875b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f87874a) * 31;
        Integer num = this.f87875b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ConversationNotificationSelectEvent(titleRes=" + this.f87874a + ", snoozeTime=" + this.f87875b + ")";
    }
}
