package pq;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.o;

/* loaded from: classes3.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f100955a;

    /* renamed from: b, reason: collision with root package name */
    public final qq.e f100956b;

    /* renamed from: c, reason: collision with root package name */
    public final qq.a f100957c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f100958d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f100959e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f100960f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f100961g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f100962h;

    /* renamed from: i, reason: collision with root package name */
    public final i81.b f100963i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f100964j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f100965k;

    public /* synthetic */ b(f30 f30Var, qq.e eVar, qq.a aVar, boolean z13, boolean z14, int i13) {
        this((i13 & 1) != 0 ? null : f30Var, (i13 & 2) != 0 ? qq.e.NONE : eVar, (i13 & 4) != 0 ? qq.a.NONE : aVar, (i13 & 8) != 0 ? false : z13, false, false, false, false, i81.b.NONE, false, (i13 & 1024) != 0 ? true : z14);
    }

    public static b e(b bVar, f30 f30Var, qq.e eVar, qq.a aVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, i81.b bVar2, boolean z18, boolean z19, int i13) {
        f30 f30Var2 = (i13 & 1) != 0 ? bVar.f100955a : f30Var;
        qq.e visualAction = (i13 & 2) != 0 ? bVar.f100956b : eVar;
        qq.a collageAction = (i13 & 4) != 0 ? bVar.f100957c : aVar;
        boolean z23 = (i13 & 8) != 0 ? bVar.f100958d : z13;
        boolean z24 = (i13 & 16) != 0 ? bVar.f100959e : z14;
        boolean z25 = (i13 & 32) != 0 ? bVar.f100960f : z15;
        boolean z26 = (i13 & 64) != 0 ? bVar.f100961g : z16;
        boolean z27 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? bVar.f100962h : z17;
        i81.b flashLightBackgroundGlowFadeAnimations = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? bVar.f100963i : bVar2;
        boolean z28 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? bVar.f100964j : z18;
        boolean z29 = (i13 & 1024) != 0 ? bVar.f100965k : z19;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(visualAction, "visualAction");
        Intrinsics.checkNotNullParameter(collageAction, "collageAction");
        Intrinsics.checkNotNullParameter(flashLightBackgroundGlowFadeAnimations, "flashLightBackgroundGlowFadeAnimations");
        return new b(f30Var2, visualAction, collageAction, z23, z24, z25, z26, z27, flashLightBackgroundGlowFadeAnimations, z28, z29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f100955a, bVar.f100955a) && this.f100956b == bVar.f100956b && this.f100957c == bVar.f100957c && this.f100958d == bVar.f100958d && this.f100959e == bVar.f100959e && this.f100960f == bVar.f100960f && this.f100961g == bVar.f100961g && this.f100962h == bVar.f100962h && this.f100963i == bVar.f100963i && this.f100964j == bVar.f100964j && this.f100965k == bVar.f100965k;
    }

    public final int hashCode() {
        f30 f30Var = this.f100955a;
        return Boolean.hashCode(this.f100965k) + ep.b.e(this.f100964j, (this.f100963i.hashCode() + ep.b.e(this.f100962h, ep.b.e(this.f100961g, ep.b.e(this.f100960f, ep.b.e(this.f100959e, ep.b.e(this.f100958d, (this.f100957c.hashCode() + ((this.f100956b.hashCode() + ((f30Var == null ? 0 : f30Var.hashCode()) * 31)) * 31)) * 31, 31), 31), 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContainerDisplayState(pin=");
        sb3.append(this.f100955a);
        sb3.append(", visualAction=");
        sb3.append(this.f100956b);
        sb3.append(", collageAction=");
        sb3.append(this.f100957c);
        sb3.append(", isVisualizationEnabled=");
        sb3.append(this.f100958d);
        sb3.append(", isVisualActionAnimated=");
        sb3.append(this.f100959e);
        sb3.append(", shouldUseLottieDrawable=");
        sb3.append(this.f100960f);
        sb3.append(", useAsyncUpdates=");
        sb3.append(this.f100961g);
        sb3.append(", isGlowAnimationEnabled=");
        sb3.append(this.f100962h);
        sb3.append(", flashLightBackgroundGlowFadeAnimations=");
        sb3.append(this.f100963i);
        sb3.append(", isCollageActionAnimated=");
        sb3.append(this.f100964j);
        sb3.append(", isVisible=");
        return a.a.r(sb3, this.f100965k, ")");
    }

    public b(f30 f30Var, qq.e visualAction, qq.a collageAction, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, i81.b flashLightBackgroundGlowFadeAnimations, boolean z18, boolean z19) {
        Intrinsics.checkNotNullParameter(visualAction, "visualAction");
        Intrinsics.checkNotNullParameter(collageAction, "collageAction");
        Intrinsics.checkNotNullParameter(flashLightBackgroundGlowFadeAnimations, "flashLightBackgroundGlowFadeAnimations");
        this.f100955a = f30Var;
        this.f100956b = visualAction;
        this.f100957c = collageAction;
        this.f100958d = z13;
        this.f100959e = z14;
        this.f100960f = z15;
        this.f100961g = z16;
        this.f100962h = z17;
        this.f100963i = flashLightBackgroundGlowFadeAnimations;
        this.f100964j = z18;
        this.f100965k = z19;
    }
}
