package xi1;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import rm1.q;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final q f135030a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f135031b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f135032c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint.Style f135033d;

    /* renamed from: e, reason: collision with root package name */
    public final int f135034e;

    /* renamed from: f, reason: collision with root package name */
    public final String f135035f;

    public b(q icon, i0 customString, Integer num, Paint.Style style, int i13, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(customString, "customString");
        this.f135030a = icon;
        this.f135031b = customString;
        this.f135032c = num;
        this.f135033d = style;
        this.f135034e = i13;
        this.f135035f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f135030a == bVar.f135030a && Intrinsics.d(this.f135031b, bVar.f135031b) && Intrinsics.d(this.f135032c, bVar.f135032c) && this.f135033d == bVar.f135033d && this.f135034e == bVar.f135034e && Intrinsics.d(this.f135035f, bVar.f135035f);
    }

    public final int hashCode() {
        int d2 = ep.b.d(this.f135031b, this.f135030a.hashCode() * 31, 31);
        Integer num = this.f135032c;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Paint.Style style = this.f135033d;
        int b13 = ep.b.b(this.f135034e, (hashCode + (style == null ? 0 : style.hashCode())) * 31, 31);
        String str = this.f135035f;
        return b13 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ChinCTADrawableDisplayState(icon=" + this.f135030a + ", customString=" + this.f135031b + ", gridBgColor=" + this.f135032c + ", style=" + this.f135033d + ", maxLines=" + this.f135034e + ", thumbnailUrl=" + this.f135035f + ")";
    }
}
