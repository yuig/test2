package hh1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends l {

    /* renamed from: f, reason: collision with root package name */
    public final vn1.c f69199f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69200g;

    /* renamed from: h, reason: collision with root package name */
    public final String f69201h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f69202i;

    public o(vn1.c textColorRes, boolean z13, String text, Integer num) {
        Intrinsics.checkNotNullParameter(textColorRes, "textColorRes");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f69199f = textColorRes;
        this.f69200g = z13;
        this.f69201h = text;
        this.f69202i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f69199f == oVar.f69199f && this.f69200g == oVar.f69200g && Intrinsics.d(this.f69201h, oVar.f69201h) && Intrinsics.d(this.f69202i, oVar.f69202i);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f69201h, ep.b.e(this.f69200g, this.f69199f.hashCode() * 31, 31), 31);
        Integer num = this.f69202i;
        return d2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "BoardStickerData(textColorRes=" + this.f69199f + ", showArrow=" + this.f69200g + ", text=" + this.f69201h + ", pinCount=" + this.f69202i + ")";
    }
}
