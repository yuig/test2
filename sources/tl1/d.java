package tl1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f118078a;

    /* renamed from: b, reason: collision with root package name */
    public final n f118079b;

    /* renamed from: c, reason: collision with root package name */
    public final m f118080c;

    /* renamed from: d, reason: collision with root package name */
    public final int f118081d;

    /* renamed from: e, reason: collision with root package name */
    public final float f118082e;

    /* renamed from: f, reason: collision with root package name */
    public final k f118083f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f118084g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f118085h;

    /* renamed from: i, reason: collision with root package name */
    public final i f118086i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f118087j;

    public d(a avatarChip, n overflowChip, m iconChip, int i13, float f13, k chipOverlapStyle, boolean z13, boolean z14, boolean z15, int i14) {
        avatarChip = (i14 & 1) != 0 ? g.f118091b : avatarChip;
        overflowChip = (i14 & 2) != 0 ? g.f118092c : overflowChip;
        iconChip = (i14 & 4) != 0 ? g.f118093d : iconChip;
        i13 = (i14 & 8) != 0 ? 6 : i13;
        f13 = (i14 & 16) != 0 ? 0.33f : f13;
        chipOverlapStyle = (i14 & 32) != 0 ? k.StartBelow : chipOverlapStyle;
        z13 = (i14 & 64) != 0 ? false : z13;
        z14 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z14;
        h chipIdPlacement = h.f118094b;
        z15 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? true : z15;
        Intrinsics.checkNotNullParameter(avatarChip, "avatarChip");
        Intrinsics.checkNotNullParameter(overflowChip, "overflowChip");
        Intrinsics.checkNotNullParameter(iconChip, "iconChip");
        Intrinsics.checkNotNullParameter(chipOverlapStyle, "chipOverlapStyle");
        Intrinsics.checkNotNullParameter(chipIdPlacement, "chipIdPlacement");
        this.f118078a = avatarChip;
        this.f118079b = overflowChip;
        this.f118080c = iconChip;
        this.f118081d = i13;
        this.f118082e = f13;
        this.f118083f = chipOverlapStyle;
        this.f118084g = z13;
        this.f118085h = z14;
        this.f118086i = chipIdPlacement;
        this.f118087j = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f118078a, dVar.f118078a) && Intrinsics.d(this.f118079b, dVar.f118079b) && Intrinsics.d(this.f118080c, dVar.f118080c) && this.f118081d == dVar.f118081d && Float.compare(this.f118082e, dVar.f118082e) == 0 && this.f118083f == dVar.f118083f && this.f118084g == dVar.f118084g && this.f118085h == dVar.f118085h && Intrinsics.d(this.f118086i, dVar.f118086i) && this.f118087j == dVar.f118087j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118087j) + ((this.f118086i.hashCode() + ep.b.e(this.f118085h, ep.b.e(this.f118084g, (this.f118083f.hashCode() + a.a.a(this.f118082e, ep.b.b(this.f118081d, (this.f118080c.hashCode() + ((this.f118079b.hashCode() + (this.f118078a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarGroupViewModel(avatarChip=");
        sb3.append(this.f118078a);
        sb3.append(", overflowChip=");
        sb3.append(this.f118079b);
        sb3.append(", iconChip=");
        sb3.append(this.f118080c);
        sb3.append(", maxNumChips=");
        sb3.append(this.f118081d);
        sb3.append(", chipOverlapPercentage=");
        sb3.append(this.f118082e);
        sb3.append(", chipOverlapStyle=");
        sb3.append(this.f118083f);
        sb3.append(", allowOverflowChip=");
        sb3.append(this.f118084g);
        sb3.append(", allowIconChip=");
        sb3.append(this.f118085h);
        sb3.append(", chipIdPlacement=");
        sb3.append(this.f118086i);
        sb3.append(", supportsRtl=");
        return a.a.r(sb3, this.f118087j, ")");
    }
}
