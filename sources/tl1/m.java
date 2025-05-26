package tl1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sl1.r;
import sl1.s;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f118099a;

    /* renamed from: b, reason: collision with root package name */
    public final int f118100b;

    /* renamed from: c, reason: collision with root package name */
    public final int f118101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f118102d;

    /* renamed from: e, reason: collision with root package name */
    public final int f118103e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f118104f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f118105g;

    public m(int i13, int i14, int i15, int i16, lq0.d dVar, int i17) {
        i13 = (i17 & 1) != 0 ? s.avatar_group_default_chip_background : i13;
        i14 = (i17 & 2) != 0 ? s.ic_avatar_group_plus_gestalt : i14;
        i15 = (i17 & 4) != 0 ? eo1.b.color_themed_text_default : i15;
        i16 = (i17 & 8) != 0 ? r.avatar_group_icon_chip_padding_default : i16;
        int i18 = (i17 & 16) != 0 ? -1 : 0;
        Function1 contentDescriptionProvider = dVar;
        if ((i17 & 32) != 0) {
            int i19 = g.f118090a;
            contentDescriptionProvider = e.f118088i;
        }
        l tapAction = l.f118096j;
        Intrinsics.checkNotNullParameter(contentDescriptionProvider, "contentDescriptionProvider");
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        this.f118099a = i13;
        this.f118100b = i14;
        this.f118101c = i15;
        this.f118102d = i16;
        this.f118103e = i18;
        this.f118104f = contentDescriptionProvider;
        this.f118105g = tapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f118099a == mVar.f118099a && this.f118100b == mVar.f118100b && this.f118101c == mVar.f118101c && this.f118102d == mVar.f118102d && this.f118103e == mVar.f118103e && Intrinsics.d(this.f118104f, mVar.f118104f) && Intrinsics.d(this.f118105g, mVar.f118105g);
    }

    public final int hashCode() {
        return this.f118105g.hashCode() + d7.g.c(this.f118104f, ep.b.b(this.f118103e, ep.b.b(this.f118102d, ep.b.b(this.f118101c, ep.b.b(this.f118100b, Integer.hashCode(this.f118099a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IconChipViewModel(backgroundResId=");
        sb3.append(this.f118099a);
        sb3.append(", iconResId=");
        sb3.append(this.f118100b);
        sb3.append(", iconTintColorResId=");
        sb3.append(this.f118101c);
        sb3.append(", iconPadding=");
        sb3.append(this.f118102d);
        sb3.append(", index=");
        sb3.append(this.f118103e);
        sb3.append(", contentDescriptionProvider=");
        sb3.append(this.f118104f);
        sb3.append(", tapAction=");
        return pk2.f.i(sb3, this.f118105g, ")");
    }
}
