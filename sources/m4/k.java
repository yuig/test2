package m4;

import java.util.ArrayList;
import kh2.g0;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f85798b = new k(0);

    /* renamed from: c, reason: collision with root package name */
    public static final k f85799c = new k(1);

    /* renamed from: d, reason: collision with root package name */
    public static final k f85800d = new k(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f85801a;

    public k(int i13) {
        this.f85801a = i13;
    }

    public final boolean a(k kVar) {
        int i13 = this.f85801a;
        return (kVar.f85801a | i13) == i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f85801a == ((k) obj).f85801a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f85801a;
    }

    public final String toString() {
        int i13 = this.f85801a;
        if (i13 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i13 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i13 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + g0.o(arrayList, ", ") + ']';
    }
}
