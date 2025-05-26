package bx0;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f24065a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24066b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24067c;

    /* renamed from: d, reason: collision with root package name */
    public final List f24068d;

    /* renamed from: e, reason: collision with root package name */
    public final z f24069e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24070f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24071g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24072h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f24073i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f24074j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f24075k;

    /* renamed from: l, reason: collision with root package name */
    public final String f24076l;

    /* renamed from: m, reason: collision with root package name */
    public final mj0.g f24077m;

    public l(String str, String str2, String str3, List recyclerItems, z moduleVariant, String str4, int i13, boolean z13, boolean z14, boolean z15, boolean z16, String titleButtonText, mj0.g oneTapSaveListener) {
        Intrinsics.checkNotNullParameter(recyclerItems, "recyclerItems");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(titleButtonText, "titleButtonText");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        this.f24065a = str;
        this.f24066b = str2;
        this.f24067c = str3;
        this.f24068d = recyclerItems;
        this.f24069e = moduleVariant;
        this.f24070f = str4;
        this.f24071g = i13;
        this.f24072h = z13;
        this.f24073i = z14;
        this.f24074j = z15;
        this.f24075k = z16;
        this.f24076l = titleButtonText;
        this.f24077m = oneTapSaveListener;
    }

    public static l e(l lVar, int i13, boolean z13, int i14) {
        String str = lVar.f24065a;
        String str2 = lVar.f24066b;
        String str3 = lVar.f24067c;
        List recyclerItems = lVar.f24068d;
        z moduleVariant = lVar.f24069e;
        String str4 = lVar.f24070f;
        int i15 = (i14 & 64) != 0 ? lVar.f24071g : i13;
        boolean z14 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? lVar.f24072h : false;
        boolean z15 = lVar.f24074j;
        boolean z16 = lVar.f24075k;
        String titleButtonText = lVar.f24076l;
        mj0.g oneTapSaveListener = lVar.f24077m;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(recyclerItems, "recyclerItems");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(titleButtonText, "titleButtonText");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        return new l(str, str2, str3, recyclerItems, moduleVariant, str4, i15, z14, z13, z15, z16, titleButtonText, oneTapSaveListener);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f24065a, lVar.f24065a) && Intrinsics.d(this.f24066b, lVar.f24066b) && Intrinsics.d(this.f24067c, lVar.f24067c) && Intrinsics.d(this.f24068d, lVar.f24068d) && this.f24069e == lVar.f24069e && Intrinsics.d(this.f24070f, lVar.f24070f) && this.f24071g == lVar.f24071g && this.f24072h == lVar.f24072h && this.f24073i == lVar.f24073i && this.f24074j == lVar.f24074j && this.f24075k == lVar.f24075k && Intrinsics.d(this.f24076l, lVar.f24076l) && Intrinsics.d(this.f24077m, lVar.f24077m);
    }

    public final int hashCode() {
        String str = this.f24065a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f24066b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24067c;
        int hashCode3 = (this.f24069e.hashCode() + ep.b.c(this.f24068d, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31)) * 31;
        String str4 = this.f24070f;
        return this.f24077m.hashCode() + cb.d(this.f24076l, ep.b.e(this.f24075k, ep.b.e(this.f24074j, ep.b.e(this.f24073i, ep.b.e(this.f24072h, ep.b.b(this.f24071g, (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "STLFocusModuleDisplayState(title=" + this.f24065a + ", productTitle=" + this.f24066b + ", currentProductImageUrl=" + this.f24067c + ", recyclerItems=" + this.f24068d + ", moduleVariant=" + this.f24069e + ", storyTypeForLogging=" + this.f24070f + ", recyclerIndex=" + this.f24071g + ", shouldAddSwipeListener=" + this.f24072h + ", shouldUpdateCompleteTheLookStory=" + this.f24073i + ", shouldUseStaticSubtitle=" + this.f24074j + ", titleButtonShowing=" + this.f24075k + ", titleButtonText=" + this.f24076l + ", oneTapSaveListener=" + this.f24077m + ")";
    }
}
