package d71;

import bm1.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final String f53902h;

    /* renamed from: i, reason: collision with root package name */
    public final int f53903i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f53904j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f53905k;

    /* renamed from: l, reason: collision with root package name */
    public final l f53906l;

    /* renamed from: m, reason: collision with root package name */
    public final String f53907m;

    public a(String str, int i13, boolean z13, Integer num, l buttonType, String str2) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f53902h = str;
        this.f53903i = i13;
        this.f53904j = z13;
        this.f53905k = num;
        this.f53906l = buttonType;
        this.f53907m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f53902h, aVar.f53902h) && this.f53903i == aVar.f53903i && this.f53904j == aVar.f53904j && Intrinsics.d(this.f53905k, aVar.f53905k) && Intrinsics.d(this.f53906l, aVar.f53906l) && Intrinsics.d(this.f53907m, aVar.f53907m);
    }

    public final int hashCode() {
        String str = this.f53902h;
        int e13 = ep.b.e(this.f53904j, ep.b.b(this.f53903i, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        Integer num = this.f53905k;
        int hashCode = (this.f53906l.hashCode() + ((e13 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str2 = this.f53907m;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GestaltSkinToneFilterViewModel(display=");
        sb3.append(this.f53902h);
        sb3.append(", skinToneIndex=");
        sb3.append(this.f53903i);
        sb3.append(", isPrevouslySelected=");
        sb3.append(this.f53904j);
        sb3.append(", screenWidth=");
        sb3.append(this.f53905k);
        sb3.append(", buttonType=");
        sb3.append(this.f53906l);
        sb3.append(", skinToneTerm=");
        return a.a.p(sb3, this.f53907m, ")");
    }
}
