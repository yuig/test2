package hd0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f68867a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68868b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f68869c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68870d;

    /* renamed from: e, reason: collision with root package name */
    public final String f68871e;

    /* renamed from: f, reason: collision with root package name */
    public final List f68872f;

    /* renamed from: g, reason: collision with root package name */
    public final String f68873g;

    /* renamed from: h, reason: collision with root package name */
    public final String f68874h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f68875i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f68876j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f68877k;

    public j(@NotNull String id3, int i13, boolean z13, boolean z14, String str, @NotNull List<fd0.h> stats, String str2, String str3, @NotNull Function0<Unit> showStatsAction, @NotNull Function1<? super Integer, Unit> showIdeaStreamAction, @NotNull Function1<? super md0.a, Unit> logAction) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(showStatsAction, "showStatsAction");
        Intrinsics.checkNotNullParameter(showIdeaStreamAction, "showIdeaStreamAction");
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        this.f68867a = id3;
        this.f68868b = i13;
        this.f68869c = z13;
        this.f68870d = z14;
        this.f68871e = str;
        this.f68872f = stats;
        this.f68873g = str2;
        this.f68874h = str3;
        this.f68875i = showStatsAction;
        this.f68876j = showIdeaStreamAction;
        this.f68877k = logAction;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f68867a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f68867a, jVar.f68867a) && this.f68868b == jVar.f68868b && this.f68869c == jVar.f68869c && this.f68870d == jVar.f68870d && Intrinsics.d(this.f68871e, jVar.f68871e) && Intrinsics.d(this.f68872f, jVar.f68872f) && Intrinsics.d(this.f68873g, jVar.f68873g) && Intrinsics.d(this.f68874h, jVar.f68874h) && Intrinsics.d(this.f68875i, jVar.f68875i) && Intrinsics.d(this.f68876j, jVar.f68876j) && Intrinsics.d(this.f68877k, jVar.f68877k);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f68870d, ep.b.e(this.f68869c, ep.b.b(this.f68868b, this.f68867a.hashCode() * 31, 31), 31), 31);
        String str = this.f68871e;
        int c13 = ep.b.c(this.f68872f, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f68873g;
        int hashCode = (c13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f68874h;
        return this.f68877k.hashCode() + d7.g.c(this.f68876j, d7.g.b(this.f68875i, (hashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "RecentPinState(id=" + this.f68867a + ", position=" + this.f68868b + ", isThumbnailClickShowingStats=" + this.f68869c + ", isIdeaPin=" + this.f68870d + ", imageUrl=" + this.f68871e + ", stats=" + this.f68872f + ", publishDate=" + this.f68873g + ", contentDescription=" + this.f68874h + ", showStatsAction=" + this.f68875i + ", showIdeaStreamAction=" + this.f68876j + ", logAction=" + this.f68877k + ")";
    }

    public /* synthetic */ j(String str, int i13, boolean z13, boolean z14, String str2, List list, String str3, String str4, Function0 function0, Function1 function1, Function1 function12, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, z13, z14, str2, list, (i14 & 64) != 0 ? null : str3, str4, (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? h.f68863i : function0, (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? i.f68864j : function1, (i14 & 1024) != 0 ? i.f68865k : function12);
    }
}
