package dx0;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import o82.a0;
import o82.y0;

/* loaded from: classes5.dex */
public final class f implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f56427a;

    /* renamed from: b, reason: collision with root package name */
    public final List f56428b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f56429c;

    /* renamed from: d, reason: collision with root package name */
    public final String f56430d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56431e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.b f56432f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f56433g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f56434h;

    /* renamed from: i, reason: collision with root package name */
    public final mj0.g f56435i;

    /* renamed from: j, reason: collision with root package name */
    public final int f56436j;

    /* renamed from: k, reason: collision with root package name */
    public final int f56437k;

    public f(String str, ArrayList arrayList, String str2, a0 a0Var, boolean z13, mj0.g gVar, int i13, int i14) {
        this(str, (i14 & 2) != 0 ? q0.f80391a : arrayList, new a0(e0.b(new y0(null, null, false, 7))), (i14 & 8) != 0 ? "complete_the_look" : str2, true, zy.b.f143058a, (i14 & 64) != 0 ? new a0() : a0Var, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z13, gVar, i13, -1);
    }

    public static f e(f fVar, a0 a0Var, boolean z13, int i13, int i14) {
        String title = fVar.f56427a;
        List recyclerItems = fVar.f56428b;
        a0 listDisplayState = (i14 & 4) != 0 ? fVar.f56429c : a0Var;
        String storyTypeForLogging = fVar.f56430d;
        boolean z14 = fVar.f56431e;
        zy.b impressionDisplayState = fVar.f56432f;
        a0 pinListDisplayState = fVar.f56433g;
        boolean z15 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? fVar.f56434h : z13;
        mj0.g oneTapSaveListener = fVar.f56435i;
        int i15 = fVar.f56436j;
        int i16 = (i14 & 1024) != 0 ? fVar.f56437k : i13;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(recyclerItems, "recyclerItems");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(storyTypeForLogging, "storyTypeForLogging");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        Intrinsics.checkNotNullParameter(pinListDisplayState, "pinListDisplayState");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        return new f(title, recyclerItems, listDisplayState, storyTypeForLogging, z14, impressionDisplayState, pinListDisplayState, z15, oneTapSaveListener, i15, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f56427a, fVar.f56427a) && Intrinsics.d(this.f56428b, fVar.f56428b) && Intrinsics.d(this.f56429c, fVar.f56429c) && Intrinsics.d(this.f56430d, fVar.f56430d) && this.f56431e == fVar.f56431e && Intrinsics.d(this.f56432f, fVar.f56432f) && Intrinsics.d(this.f56433g, fVar.f56433g) && this.f56434h == fVar.f56434h && Intrinsics.d(this.f56435i, fVar.f56435i) && this.f56436j == fVar.f56436j && this.f56437k == fVar.f56437k;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f56431e, cb.d(this.f56430d, ep.b.c(this.f56429c.f93524a, ep.b.c(this.f56428b, this.f56427a.hashCode() * 31, 31), 31), 31), 31);
        this.f56432f.getClass();
        return Integer.hashCode(this.f56437k) + ep.b.b(this.f56436j, (this.f56435i.hashCode() + ep.b.e(this.f56434h, ep.b.c(this.f56433g.f93524a, (e13 + 172602875) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShopTheLookCarouselDisplayState(title=");
        sb3.append(this.f56427a);
        sb3.append(", recyclerItems=");
        sb3.append(this.f56428b);
        sb3.append(", listDisplayState=");
        sb3.append(this.f56429c);
        sb3.append(", storyTypeForLogging=");
        sb3.append(this.f56430d);
        sb3.append(", shouldAddSwipeListener=");
        sb3.append(this.f56431e);
        sb3.append(", impressionDisplayState=");
        sb3.append(this.f56432f);
        sb3.append(", pinListDisplayState=");
        sb3.append(this.f56433g);
        sb3.append(", showLoadingSpinner=");
        sb3.append(this.f56434h);
        sb3.append(", oneTapSaveListener=");
        sb3.append(this.f56435i);
        sb3.append(", pinWidth=");
        sb3.append(this.f56436j);
        sb3.append(", forceReload=");
        return a.a.n(sb3, this.f56437k, ")");
    }

    public f(String title, List recyclerItems, a0 listDisplayState, String storyTypeForLogging, boolean z13, zy.b impressionDisplayState, a0 pinListDisplayState, boolean z14, mj0.g oneTapSaveListener, int i13, int i14) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(recyclerItems, "recyclerItems");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(storyTypeForLogging, "storyTypeForLogging");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        Intrinsics.checkNotNullParameter(pinListDisplayState, "pinListDisplayState");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        this.f56427a = title;
        this.f56428b = recyclerItems;
        this.f56429c = listDisplayState;
        this.f56430d = storyTypeForLogging;
        this.f56431e = z13;
        this.f56432f = impressionDisplayState;
        this.f56433g = pinListDisplayState;
        this.f56434h = z14;
        this.f56435i = oneTapSaveListener;
        this.f56436j = i13;
        this.f56437k = i14;
    }
}
