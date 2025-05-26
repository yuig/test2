package r72;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l2 {

    /* renamed from: h, reason: collision with root package name */
    public static final l2 f106537h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f106538i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f106539j;

    /* renamed from: a, reason: collision with root package name */
    public final String f106540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106541b;

    /* renamed from: c, reason: collision with root package name */
    public final String f106542c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106543d;

    /* renamed from: e, reason: collision with root package name */
    public final k2 f106544e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f106545f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f106546g;

    static {
        k2 k2Var = k2.HELVETICA;
        i2 i2Var = i2.LEFT;
        f106537h = new l2("", "", null, 0.0f, k2Var, i2Var, false);
        f106538i = kotlin.collections.f0.j(k2.GraphikBoldItalic, k2.Unbounded, k2.Chakra, k2.Quicksand, k2.PublicoBannerBold, k2.OldStandardTT, k2.HeptaSlab, k2.CourierPrime, k2.MartianMono, k2.MisterFirley, k2.LuckiestGuy, k2.GraphikXCondensedBlack, k2.LexendPeta, k2.Pixel, k2.LemonYellowSunExtraBold, k2.Meddon, k2.Janitor, k2.Grandstander, k2.NewRocker);
        f106539j = kotlin.collections.f0.j(i2.CENTER, i2Var, i2.RIGHT);
    }

    public l2(String text, String color, String str, float f13, k2 fontType, i2 alignment, boolean z13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f106540a = text;
        this.f106541b = color;
        this.f106542c = str;
        this.f106543d = f13;
        this.f106544e = fontType;
        this.f106545f = alignment;
        this.f106546g = z13;
    }

    public static l2 a(l2 l2Var, String str, String str2, String str3, float f13, k2 k2Var, i2 i2Var, boolean z13, int i13) {
        String text = (i13 & 1) != 0 ? l2Var.f106540a : str;
        String color = (i13 & 2) != 0 ? l2Var.f106541b : str2;
        String str4 = (i13 & 4) != 0 ? l2Var.f106542c : str3;
        float f14 = (i13 & 8) != 0 ? l2Var.f106543d : f13;
        k2 fontType = (i13 & 16) != 0 ? l2Var.f106544e : k2Var;
        i2 alignment = (i13 & 32) != 0 ? l2Var.f106545f : i2Var;
        boolean z14 = (i13 & 64) != 0 ? l2Var.f106546g : z13;
        l2Var.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new l2(text, color, str4, f14, fontType, alignment, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return Intrinsics.d(this.f106540a, l2Var.f106540a) && Intrinsics.d(this.f106541b, l2Var.f106541b) && Intrinsics.d(this.f106542c, l2Var.f106542c) && Float.compare(this.f106543d, l2Var.f106543d) == 0 && this.f106544e == l2Var.f106544e && this.f106545f == l2Var.f106545f && this.f106546g == l2Var.f106546g;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f106541b, this.f106540a.hashCode() * 31, 31);
        String str = this.f106542c;
        return Boolean.hashCode(this.f106546g) + ((this.f106545f.hashCode() + ((this.f106544e.hashCode() + a.a.a(this.f106543d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextData(text=");
        sb3.append(this.f106540a);
        sb3.append(", color=");
        sb3.append(this.f106541b);
        sb3.append(", backgroundColor=");
        sb3.append(this.f106542c);
        sb3.append(", fontSize=");
        sb3.append(this.f106543d);
        sb3.append(", fontType=");
        sb3.append(this.f106544e);
        sb3.append(", alignment=");
        sb3.append(this.f106545f);
        sb3.append(", darkModeStrokeEnabled=");
        return a.a.r(sb3, this.f106546g, ")");
    }
}
