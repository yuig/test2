package ue1;

import a.cb;
import com.pinterest.api.model.xk;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;
import z32.n1;

/* loaded from: classes5.dex */
public final class h implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final xk f122005a;

    /* renamed from: b, reason: collision with root package name */
    public final uo0.c f122006b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122007c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i f122008d;

    /* renamed from: e, reason: collision with root package name */
    public final String f122009e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f122010f;

    /* renamed from: g, reason: collision with root package name */
    public final String f122011g;

    /* renamed from: h, reason: collision with root package name */
    public final String f122012h;

    /* renamed from: i, reason: collision with root package name */
    public final n1 f122013i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f122014j;

    /* renamed from: k, reason: collision with root package name */
    public final k f122015k;

    /* renamed from: l, reason: collision with root package name */
    public final Function1 f122016l;

    /* renamed from: m, reason: collision with root package name */
    public final m f122017m;

    /* renamed from: n, reason: collision with root package name */
    public final ze0.a f122018n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f122019o;

    /* renamed from: p, reason: collision with root package name */
    public final int f122020p;

    /* renamed from: q, reason: collision with root package name */
    public final int f122021q;

    /* renamed from: r, reason: collision with root package name */
    public final List f122022r;

    /* renamed from: s, reason: collision with root package name */
    public final xo0.b f122023s;

    /* renamed from: t, reason: collision with root package name */
    public final String f122024t;

    public h(@NotNull xk bubble, @NotNull uo0.c bubbleViewListener, @NotNull String imageUrl, @NotNull u50.i placeHolderColor, String str, Integer num, @NotNull String bubbleTitle, @NotNull String bubbleSubTitle, n1 n1Var, boolean z13, @NotNull k repStyle, @NotNull Function1<? super n1, Unit> renderNavigationBubble, m mVar, @NotNull ze0.a userRepStyle, boolean z14, int i13, int i14, List<String> list, xo0.b bVar, String str2) {
        Intrinsics.checkNotNullParameter(bubble, "bubble");
        Intrinsics.checkNotNullParameter(bubbleViewListener, "bubbleViewListener");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(placeHolderColor, "placeHolderColor");
        Intrinsics.checkNotNullParameter(bubbleTitle, "bubbleTitle");
        Intrinsics.checkNotNullParameter(bubbleSubTitle, "bubbleSubTitle");
        Intrinsics.checkNotNullParameter(repStyle, "repStyle");
        Intrinsics.checkNotNullParameter(renderNavigationBubble, "renderNavigationBubble");
        Intrinsics.checkNotNullParameter(userRepStyle, "userRepStyle");
        this.f122005a = bubble;
        this.f122006b = bubbleViewListener;
        this.f122007c = imageUrl;
        this.f122008d = placeHolderColor;
        this.f122009e = str;
        this.f122010f = num;
        this.f122011g = bubbleTitle;
        this.f122012h = bubbleSubTitle;
        this.f122013i = n1Var;
        this.f122014j = z13;
        this.f122015k = repStyle;
        this.f122016l = renderNavigationBubble;
        this.f122017m = mVar;
        this.f122018n = userRepStyle;
        this.f122019o = z14;
        this.f122020p = i13;
        this.f122021q = i14;
        this.f122022r = list;
        this.f122023s = bVar;
        this.f122024t = str2;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        String uid = this.f122005a.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }

    @Override // ue1.a0
    public final String d() {
        return this.f122007c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f122005a, hVar.f122005a) && Intrinsics.d(this.f122006b, hVar.f122006b) && Intrinsics.d(this.f122007c, hVar.f122007c) && Intrinsics.d(this.f122008d, hVar.f122008d) && Intrinsics.d(this.f122009e, hVar.f122009e) && Intrinsics.d(this.f122010f, hVar.f122010f) && Intrinsics.d(this.f122011g, hVar.f122011g) && Intrinsics.d(this.f122012h, hVar.f122012h) && this.f122013i == hVar.f122013i && this.f122014j == hVar.f122014j && this.f122015k == hVar.f122015k && Intrinsics.d(this.f122016l, hVar.f122016l) && Intrinsics.d(this.f122017m, hVar.f122017m) && this.f122018n == hVar.f122018n && this.f122019o == hVar.f122019o && this.f122020p == hVar.f122020p && this.f122021q == hVar.f122021q && Intrinsics.d(this.f122022r, hVar.f122022r) && this.f122023s == hVar.f122023s && Intrinsics.d(this.f122024t, hVar.f122024t);
    }

    @Override // ue1.a0
    public final boolean f() {
        return g.f122004a[this.f122015k.ordinal()] == 1;
    }

    public final int hashCode() {
        int hashCode = (this.f122008d.hashCode() + cb.d(this.f122007c, (this.f122006b.hashCode() + (this.f122005a.hashCode() * 31)) * 31, 31)) * 31;
        String str = this.f122009e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f122010f;
        int d2 = cb.d(this.f122012h, cb.d(this.f122011g, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        n1 n1Var = this.f122013i;
        int c13 = d7.g.c(this.f122016l, (this.f122015k.hashCode() + ep.b.e(this.f122014j, (d2 + (n1Var == null ? 0 : n1Var.hashCode())) * 31, 31)) * 31, 31);
        m mVar = this.f122017m;
        int b13 = ep.b.b(this.f122021q, ep.b.b(this.f122020p, ep.b.e(this.f122019o, (this.f122018n.hashCode() + ((c13 + (mVar == null ? 0 : mVar.hashCode())) * 31)) * 31, 31), 31), 31);
        List list = this.f122022r;
        int hashCode3 = (b13 + (list == null ? 0 : list.hashCode())) * 31;
        xo0.b bVar = this.f122023s;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f122024t;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ue1.a0
    public final p i() {
        return this.f122015k;
    }

    @Override // ue1.a0
    public final int m() {
        switch (g.f122004a[this.f122015k.ordinal()]) {
            case 1:
            case 2:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP;
            case 3:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP;
            case 4:
            default:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP;
            case 5:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP;
            case 6:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP;
            case 7:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP;
            case 8:
            case 9:
                return RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM;
            case 10:
            case 11:
            case 12:
            case 13:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE;
            case 14:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD;
            case 15:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD;
            case 16:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP;
            case 17:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP;
            case 18:
                return RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP;
            case 19:
                return 250;
            case 20:
                return RecyclerViewTypes.VIEW_TYPE_ATG_VISUALIZATION_BANNER;
            case 21:
                return RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY;
            case 22:
                return RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE;
        }
    }

    @Override // ue1.a0
    public final m p() {
        return this.f122017m;
    }

    @Override // ue1.a0
    public final int t() {
        return g.f122004a[this.f122015k.ordinal()] == 1 ? xe1.v.B : xe1.v.f134804s;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BubbleRepItemViewModel(bubble=");
        sb3.append(this.f122005a);
        sb3.append(", bubbleViewListener=");
        sb3.append(this.f122006b);
        sb3.append(", imageUrl=");
        sb3.append(this.f122007c);
        sb3.append(", placeHolderColor=");
        sb3.append(this.f122008d);
        sb3.append(", backgroundColor=");
        sb3.append(this.f122009e);
        sb3.append(", placeHolderColorRes=");
        sb3.append(this.f122010f);
        sb3.append(", bubbleTitle=");
        sb3.append(this.f122011g);
        sb3.append(", bubbleSubTitle=");
        sb3.append(this.f122012h);
        sb3.append(", storyIcon=");
        sb3.append(this.f122013i);
        sb3.append(", isVTOBubble=");
        sb3.append(this.f122014j);
        sb3.append(", repStyle=");
        sb3.append(this.f122015k);
        sb3.append(", renderNavigationBubble=");
        sb3.append(this.f122016l);
        sb3.append(", extraBubbleItemRepParams=");
        sb3.append(this.f122017m);
        sb3.append(", userRepStyle=");
        sb3.append(this.f122018n);
        sb3.append(", isMetadataVisible=");
        sb3.append(this.f122019o);
        sb3.append(", merchantTitleTintRes=");
        sb3.append(this.f122020p);
        sb3.append(", trailingImageSpan=");
        sb3.append(this.f122021q);
        sb3.append(", largeCoverImageList=");
        sb3.append(this.f122022r);
        sb3.append(", bubbleAlignment=");
        sb3.append(this.f122023s);
        sb3.append(", experience=");
        return a.a.p(sb3, this.f122024t, ")");
    }

    public /* synthetic */ h(xk xkVar, uo0.c cVar, String str, u50.i iVar, String str2, Integer num, String str3, String str4, n1 n1Var, boolean z13, k kVar, Function1 function1, m mVar, ze0.a aVar, boolean z14, int i13, int i14, List list, xo0.b bVar, String str5, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(xkVar, cVar, str, iVar, (i15 & 16) != 0 ? null : str2, num, str3, str4, n1Var, (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z13, kVar, function1, (i15 & 4096) != 0 ? null : mVar, aVar, z14, i13, i14, (131072 & i15) != 0 ? null : list, (262144 & i15) != 0 ? null : bVar, (i15 & 524288) != 0 ? null : str5);
    }
}
