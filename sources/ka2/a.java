package ka2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.g;
import dc0.q;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.b0;
import u50.n;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: q, reason: collision with root package name */
    public static final a f78935q = new a(null, false, false, null, true, false, true, true, dc0.f.SUBTLE, false, false, true, true, false, 38447);

    /* renamed from: a, reason: collision with root package name */
    public final q f78936a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f78937b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78938c;

    /* renamed from: d, reason: collision with root package name */
    public final dc0.e f78939d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f78940e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f78941f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f78942g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f78943h;

    /* renamed from: i, reason: collision with root package name */
    public final dc0.f f78944i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f78945j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f78946k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f78947l;

    /* renamed from: m, reason: collision with root package name */
    public final n f78948m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f78949n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f78950o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f78951p;

    public a(q boardRepSize, boolean z13, boolean z14, dc0.e imagesStyle, boolean z15, boolean z16, boolean z17, boolean z18, dc0.f metadataStyle, boolean z19, boolean z23, boolean z24, n titleCreatorsSpacing, boolean z25, boolean z26, boolean z27) {
        Intrinsics.checkNotNullParameter(boardRepSize, "boardRepSize");
        Intrinsics.checkNotNullParameter(imagesStyle, "imagesStyle");
        Intrinsics.checkNotNullParameter(metadataStyle, "metadataStyle");
        Intrinsics.checkNotNullParameter(titleCreatorsSpacing, "titleCreatorsSpacing");
        this.f78936a = boardRepSize;
        this.f78937b = z13;
        this.f78938c = z14;
        this.f78939d = imagesStyle;
        this.f78940e = z15;
        this.f78941f = z16;
        this.f78942g = z17;
        this.f78943h = z18;
        this.f78944i = metadataStyle;
        this.f78945j = z19;
        this.f78946k = z23;
        this.f78947l = z24;
        this.f78948m = titleCreatorsSpacing;
        this.f78949n = z25;
        this.f78950o = z26;
        this.f78951p = z27;
    }

    public static a a(a aVar, q qVar, boolean z13, boolean z14, int i13) {
        q boardRepSize = (i13 & 1) != 0 ? aVar.f78936a : qVar;
        boolean z15 = aVar.f78937b;
        boolean z16 = aVar.f78938c;
        dc0.e imagesStyle = aVar.f78939d;
        boolean z17 = aVar.f78940e;
        boolean z18 = aVar.f78941f;
        boolean z19 = aVar.f78942g;
        boolean z23 = aVar.f78943h;
        dc0.f metadataStyle = aVar.f78944i;
        boolean z24 = aVar.f78945j;
        boolean z25 = aVar.f78946k;
        boolean z26 = aVar.f78947l;
        n titleCreatorsSpacing = aVar.f78948m;
        boolean z27 = (i13 & 8192) != 0 ? aVar.f78949n : false;
        boolean z28 = (i13 & 16384) != 0 ? aVar.f78950o : z13;
        boolean z29 = (i13 & 32768) != 0 ? aVar.f78951p : z14;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(boardRepSize, "boardRepSize");
        Intrinsics.checkNotNullParameter(imagesStyle, "imagesStyle");
        Intrinsics.checkNotNullParameter(metadataStyle, "metadataStyle");
        Intrinsics.checkNotNullParameter(titleCreatorsSpacing, "titleCreatorsSpacing");
        return new a(boardRepSize, z15, z16, imagesStyle, z17, z18, z19, z23, metadataStyle, z24, z25, z26, titleCreatorsSpacing, z27, z28, z29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f78936a == aVar.f78936a && this.f78937b == aVar.f78937b && this.f78938c == aVar.f78938c && this.f78939d == aVar.f78939d && this.f78940e == aVar.f78940e && this.f78941f == aVar.f78941f && this.f78942g == aVar.f78942g && this.f78943h == aVar.f78943h && this.f78944i == aVar.f78944i && this.f78945j == aVar.f78945j && this.f78946k == aVar.f78946k && this.f78947l == aVar.f78947l && Intrinsics.d(this.f78948m, aVar.f78948m) && this.f78949n == aVar.f78949n && this.f78950o == aVar.f78950o && this.f78951p == aVar.f78951p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78951p) + ep.b.e(this.f78950o, ep.b.e(this.f78949n, g.e(this.f78948m, ep.b.e(this.f78947l, ep.b.e(this.f78946k, ep.b.e(this.f78945j, (this.f78944i.hashCode() + ep.b.e(this.f78943h, ep.b.e(this.f78942g, ep.b.e(this.f78941f, ep.b.e(this.f78940e, (this.f78939d.hashCode() + ep.b.e(this.f78938c, ep.b.e(this.f78937b, this.f78936a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardPreviewConfig(boardRepSize=");
        sb3.append(this.f78936a);
        sb3.append(", showPinterestIcon=");
        sb3.append(this.f78937b);
        sb3.append(", showUpdateIndicator=");
        sb3.append(this.f78938c);
        sb3.append(", imagesStyle=");
        sb3.append(this.f78939d);
        sb3.append(", isShortPinCount=");
        sb3.append(this.f78940e);
        sb3.append(", showPinCount=");
        sb3.append(this.f78941f);
        sb3.append(", showSections=");
        sb3.append(this.f78942g);
        sb3.append(", showLastUpdateDate=");
        sb3.append(this.f78943h);
        sb3.append(", metadataStyle=");
        sb3.append(this.f78944i);
        sb3.append(", showBoardTopic=");
        sb3.append(this.f78945j);
        sb3.append(", showUpcomingUpdateText=");
        sb3.append(this.f78946k);
        sb3.append(", twoLinesTitle=");
        sb3.append(this.f78947l);
        sb3.append(", titleCreatorsSpacing=");
        sb3.append(this.f78948m);
        sb3.append(", showCreator=");
        sb3.append(this.f78949n);
        sb3.append(", showAvatars=");
        sb3.append(this.f78950o);
        sb3.append(", forceShowCollaborators=");
        return a.a.r(sb3, this.f78951p, ")");
    }

    public a(q qVar, boolean z13, boolean z14, dc0.e eVar, boolean z15, boolean z16, boolean z17, boolean z18, dc0.f fVar, boolean z19, boolean z23, boolean z24, boolean z25, boolean z26, int i13) {
        this((i13 & 1) != 0 ? q.Compact : qVar, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? dc0.e.MONTAGE : eVar, (i13 & 16) != 0 ? false : z15, (i13 & 32) != 0 ? true : z16, (i13 & 64) != 0 ? true : z17, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? true : z18, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? dc0.f.DEFAULT : fVar, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z19, (i13 & 1024) != 0 ? false : z23, (i13 & 2048) != 0 ? false : z24, new b0(eo1.c.space_200), (i13 & 8192) != 0 ? false : z25, (i13 & 16384) != 0 ? true : z26, false);
    }
}
