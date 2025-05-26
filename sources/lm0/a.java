package lm0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f83831a;

    /* renamed from: b, reason: collision with root package name */
    public final om0.o f83832b;

    /* renamed from: c, reason: collision with root package name */
    public final zo.c f83833c;

    /* renamed from: d, reason: collision with root package name */
    public final b f83834d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f83835e;

    /* renamed from: f, reason: collision with root package name */
    public final wm0.a f83836f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f83837g;

    /* renamed from: h, reason: collision with root package name */
    public final sk0.d f83838h;

    /* renamed from: i, reason: collision with root package name */
    public final um0.e f83839i;

    /* renamed from: j, reason: collision with root package name */
    public final o82.a0 f83840j;

    /* renamed from: k, reason: collision with root package name */
    public final zy.a0 f83841k;

    public a(u50.i0 title, om0.o metadata, zo.c viewType, b emptyState, boolean z13, wm0.a toolsMode, boolean z14, sk0.d boardToolsDisplayState, um0.e organizeDisplayState, o82.a0 sectionDisplayState, zy.a0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(toolsMode, "toolsMode");
        Intrinsics.checkNotNullParameter(boardToolsDisplayState, "boardToolsDisplayState");
        Intrinsics.checkNotNullParameter(organizeDisplayState, "organizeDisplayState");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f83831a = title;
        this.f83832b = metadata;
        this.f83833c = viewType;
        this.f83834d = emptyState;
        this.f83835e = z13;
        this.f83836f = toolsMode;
        this.f83837g = z14;
        this.f83838h = boardToolsDisplayState;
        this.f83839i = organizeDisplayState;
        this.f83840j = sectionDisplayState;
        this.f83841k = pinalyticsState;
    }

    public static a e(a aVar, om0.o oVar, zo.c cVar, b bVar, boolean z13, wm0.a aVar2, boolean z14, sk0.d dVar, um0.e eVar, o82.a0 a0Var, zy.a0 a0Var2, int i13) {
        u50.i0 title = aVar.f83831a;
        om0.o metadata = (i13 & 2) != 0 ? aVar.f83832b : oVar;
        zo.c viewType = (i13 & 4) != 0 ? aVar.f83833c : cVar;
        b emptyState = (i13 & 8) != 0 ? aVar.f83834d : bVar;
        boolean z15 = (i13 & 16) != 0 ? aVar.f83835e : z13;
        wm0.a toolsMode = (i13 & 32) != 0 ? aVar.f83836f : aVar2;
        boolean z16 = (i13 & 64) != 0 ? aVar.f83837g : z14;
        sk0.d boardToolsDisplayState = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? aVar.f83838h : dVar;
        um0.e organizeDisplayState = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? aVar.f83839i : eVar;
        o82.a0 sectionDisplayState = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? aVar.f83840j : a0Var;
        zy.a0 pinalyticsState = (i13 & 1024) != 0 ? aVar.f83841k : a0Var2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(toolsMode, "toolsMode");
        Intrinsics.checkNotNullParameter(boardToolsDisplayState, "boardToolsDisplayState");
        Intrinsics.checkNotNullParameter(organizeDisplayState, "organizeDisplayState");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new a(title, metadata, viewType, emptyState, z15, toolsMode, z16, boardToolsDisplayState, organizeDisplayState, sectionDisplayState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f83831a, aVar.f83831a) && Intrinsics.d(this.f83832b, aVar.f83832b) && this.f83833c == aVar.f83833c && Intrinsics.d(this.f83834d, aVar.f83834d) && this.f83835e == aVar.f83835e && this.f83836f == aVar.f83836f && this.f83837g == aVar.f83837g && Intrinsics.d(this.f83838h, aVar.f83838h) && Intrinsics.d(this.f83839i, aVar.f83839i) && Intrinsics.d(this.f83840j, aVar.f83840j) && Intrinsics.d(this.f83841k, aVar.f83841k);
    }

    public final int hashCode() {
        return this.f83841k.hashCode() + ep.b.c(this.f83840j.f93524a, (this.f83839i.hashCode() + ((this.f83838h.hashCode() + ep.b.e(this.f83837g, (this.f83836f.hashCode() + ep.b.e(this.f83835e, (this.f83834d.hashCode() + ((this.f83833c.hashCode() + ((this.f83832b.hashCode() + (this.f83831a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "AllSavesDisplayState(title=" + this.f83831a + ", metadata=" + this.f83832b + ", viewType=" + this.f83833c + ", emptyState=" + this.f83834d + ", filterOptionsEnabled=" + this.f83835e + ", toolsMode=" + this.f83836f + ", pullToRefreshEnabled=" + this.f83837g + ", boardToolsDisplayState=" + this.f83838h + ", organizeDisplayState=" + this.f83839i + ", sectionDisplayState=" + this.f83840j + ", pinalyticsState=" + this.f83841k + ")";
    }
}
