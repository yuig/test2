package mm1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f87588a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87589b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87590c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87591d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87592e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f87593f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87594g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f87595h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f87596i;

    /* renamed from: j, reason: collision with root package name */
    public final hn1.o f87597j;

    public /* synthetic */ d(int i13, boolean z13, int i14, int i15, boolean z14, boolean z15, Function0 function0, int i16) {
        this(i13, (i16 & 2) != 0 ? false : z13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15, (i16 & 16) != 0 ? false : z14, (i16 & 32) != 0 ? false : z15, true, (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0, function0, hn1.o.DEFAULT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f87588a == dVar.f87588a && this.f87589b == dVar.f87589b && this.f87590c == dVar.f87590c && this.f87591d == dVar.f87591d && this.f87592e == dVar.f87592e && this.f87593f == dVar.f87593f && this.f87594g == dVar.f87594g && this.f87595h == dVar.f87595h && Intrinsics.d(this.f87596i, dVar.f87596i) && this.f87597j == dVar.f87597j;
    }

    public final int hashCode() {
        return this.f87597j.hashCode() + d7.g.b(this.f87596i, ep.b.e(this.f87595h, ep.b.e(this.f87594g, ep.b.e(this.f87593f, ep.b.e(this.f87592e, ep.b.b(this.f87591d, ep.b.b(this.f87590c, ep.b.e(this.f87589b, Integer.hashCode(this.f87588a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Configuration(sheetContentLayout=" + this.f87588a + ", isScrollable=" + this.f87589b + ", minimumHeightPercentage=" + this.f87590c + ", maximumHeightPercentage=" + this.f87591d + ", shouldAnimateHide=" + this.f87592e + ", isCollapsible=" + this.f87593f + ", isDismissibleOnOutsideTouch=" + this.f87594g + ", isDraggable=" + this.f87595h + ", closeFragment=" + this.f87596i + ", scrimType=" + this.f87597j + ")";
    }

    public d(int i13, boolean z13, int i14, int i15, boolean z14, boolean z15, boolean z16, boolean z17, Function0 closeFragment, hn1.o scrimType) {
        Intrinsics.checkNotNullParameter(closeFragment, "closeFragment");
        Intrinsics.checkNotNullParameter(scrimType, "scrimType");
        this.f87588a = i13;
        this.f87589b = z13;
        this.f87590c = i14;
        this.f87591d = i15;
        this.f87592e = z14;
        this.f87593f = z15;
        this.f87594g = z16;
        this.f87595h = z17;
        this.f87596i = closeFragment;
        this.f87597j = scrimType;
    }
}
