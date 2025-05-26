package am;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15505a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15506b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f15505a = str;
        this.f15506b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15505a.equals(aVar.f15505a) && this.f15506b.equals(aVar.f15506b);
    }

    public final int hashCode() {
        return ((this.f15505a.hashCode() ^ 1000003) * 1000003) ^ this.f15506b.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeartBeatResult{userAgent=");
        sb3.append(this.f15505a);
        sb3.append(", usedDates=");
        return a.c.j(sb3, this.f15506b, "}");
    }
}
