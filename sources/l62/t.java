package l62;

import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes4.dex */
public final class t extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f81689a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f81690b;

    public t(String id3, Integer num) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f81689a = id3;
        this.f81690b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        String str = tVar.f81689a;
        int i13 = a2.f106437b;
        return Intrinsics.d(this.f81689a, str) && Intrinsics.d(this.f81690b, tVar.f81690b);
    }

    public final int hashCode() {
        int i13 = a2.f106437b;
        int hashCode = this.f81689a.hashCode() * 31;
        Integer num = this.f81690b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MenuActionHovered(id=" + a2.a(this.f81689a) + ", actionId=" + this.f81690b + ")";
    }
}
