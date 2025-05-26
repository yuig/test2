package j51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f74703a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74704b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f74705c;

    public a(String header, String str, Integer num, int i13) {
        str = (i13 & 2) != 0 ? null : str;
        num = (i13 & 4) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(header, "header");
        this.f74703a = header;
        this.f74704b = str;
        this.f74705c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f74703a, aVar.f74703a) && Intrinsics.d(this.f74704b, aVar.f74704b) && Intrinsics.d(this.f74705c, aVar.f74705c);
    }

    public final int hashCode() {
        int hashCode = this.f74703a.hashCode() * 31;
        String str = this.f74704b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f74705c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(header=");
        sb3.append(this.f74703a);
        sb3.append(", subHeader=");
        sb3.append(this.f74704b);
        sb3.append(", startPadding=");
        return a.c.i(sb3, this.f74705c, ")");
    }
}
