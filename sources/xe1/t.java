package xe1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import z32.f2;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final oe1.b f134760a;

    /* renamed from: b, reason: collision with root package name */
    public final u f134761b;

    /* renamed from: c, reason: collision with root package name */
    public final re1.e f134762c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f134763d;

    /* renamed from: e, reason: collision with root package name */
    public final ic0.a f134764e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f134765f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f134766g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f134767h;

    /* renamed from: i, reason: collision with root package name */
    public final float f134768i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f134769j;

    /* renamed from: k, reason: collision with root package name */
    public final String f134770k;

    /* renamed from: l, reason: collision with root package name */
    public final f2 f134771l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f134772m;

    public t(oe1.b loggingData, u storyNavigators, re1.e eVar, ed1.m renderNavigationBubble, ic0.a aVar, boolean z13, boolean z14, boolean z15, float f13, boolean z16, String str, f2 f2Var, Boolean bool, int i13) {
        ic0.a aVar2 = (i13 & 16) != 0 ? null : aVar;
        boolean z17 = (i13 & 32) != 0 ? false : z13;
        boolean z18 = (i13 & 64) != 0 ? false : z14;
        boolean z19 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z15;
        float f14 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 0.0f : f13;
        boolean z23 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0 ? z16 : false;
        String str2 = (i13 & 1024) != 0 ? null : str;
        f2 f2Var2 = (i13 & 2048) != 0 ? null : f2Var;
        Boolean bool2 = (i13 & 4096) == 0 ? bool : null;
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        Intrinsics.checkNotNullParameter(storyNavigators, "storyNavigators");
        Intrinsics.checkNotNullParameter(renderNavigationBubble, "renderNavigationBubble");
        this.f134760a = loggingData;
        this.f134761b = storyNavigators;
        this.f134762c = eVar;
        this.f134763d = renderNavigationBubble;
        this.f134764e = aVar2;
        this.f134765f = z17;
        this.f134766g = z18;
        this.f134767h = z19;
        this.f134768i = f14;
        this.f134769j = z23;
        this.f134770k = str2;
        this.f134771l = f2Var2;
        this.f134772m = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f134760a, tVar.f134760a) && Intrinsics.d(this.f134761b, tVar.f134761b) && Intrinsics.d(this.f134762c, tVar.f134762c) && Intrinsics.d(this.f134763d, tVar.f134763d) && Intrinsics.d(this.f134764e, tVar.f134764e) && this.f134765f == tVar.f134765f && this.f134766g == tVar.f134766g && this.f134767h == tVar.f134767h && Float.compare(this.f134768i, tVar.f134768i) == 0 && this.f134769j == tVar.f134769j && Intrinsics.d(this.f134770k, tVar.f134770k) && this.f134771l == tVar.f134771l && Intrinsics.d(this.f134772m, tVar.f134772m);
    }

    public final int hashCode() {
        int hashCode = (this.f134761b.hashCode() + (this.f134760a.hashCode() * 31)) * 31;
        re1.e eVar = this.f134762c;
        int c13 = d7.g.c(this.f134763d, (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31);
        ic0.a aVar = this.f134764e;
        int e13 = ep.b.e(this.f134769j, a.a.a(this.f134768i, ep.b.e(this.f134767h, ep.b.e(this.f134766g, ep.b.e(this.f134765f, (c13 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str = this.f134770k;
        int hashCode2 = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        f2 f2Var = this.f134771l;
        int hashCode3 = (hashCode2 + (f2Var == null ? 0 : f2Var.hashCode())) * 31;
        Boolean bool = this.f134772m;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryContentParams(loggingData=");
        sb3.append(this.f134760a);
        sb3.append(", storyNavigators=");
        sb3.append(this.f134761b);
        sb3.append(", actionModel=");
        sb3.append(this.f134762c);
        sb3.append(", renderNavigationBubble=");
        sb3.append(this.f134763d);
        sb3.append(", indicatorModel=");
        sb3.append(this.f134764e);
        sb3.append(", isInStlModule=");
        sb3.append(this.f134765f);
        sb3.append(", hasPromotedPin=");
        sb3.append(this.f134766g);
        sb3.append(", hasPromotedPinWithChin=");
        sb3.append(this.f134767h);
        sb3.append(", chinHeight=");
        sb3.append(this.f134768i);
        sb3.append(", isProductTag=");
        sb3.append(this.f134769j);
        sb3.append(", originPinId=");
        sb3.append(this.f134770k);
        sb3.append(", quickSaveIcon=");
        sb3.append(this.f134771l);
        sb3.append(", shouldShowSavedOverlay=");
        return a.c.h(sb3, this.f134772m, ")");
    }
}
