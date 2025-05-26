package jb2;

import kh2.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final Integer f75363b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f75364c;

    public c(Integer num, Integer num2) {
        this.f75363b = num;
        this.f75364c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f75363b, cVar.f75363b) && Intrinsics.d(this.f75364c, cVar.f75364c);
    }

    public final int hashCode() {
        Integer num = this.f75363b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f75364c;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Blur(overlayColor=" + this.f75363b + ", blurViewRootId=" + this.f75364c + ")";
    }
}
