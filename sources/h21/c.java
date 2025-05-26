package h21;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final int f66552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66553b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66554c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f66555d;

    /* renamed from: e, reason: collision with root package name */
    public final String f66556e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66557f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f66558g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f66559h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f66560i;

    /* renamed from: j, reason: collision with root package name */
    public final lm1.b f66561j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f66562k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f66563l;

    /* renamed from: m, reason: collision with root package name */
    public final re0.a f66564m;

    /* renamed from: n, reason: collision with root package name */
    public final int f66565n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i13, int i14, @NotNull String imageUrl, @NotNull Function0<Unit> action, String str, boolean z13, Integer num, Integer num2, Integer num3, lm1.b bVar, Integer num4, Integer num5, re0.a aVar) {
        super(null);
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f66552a = i13;
        this.f66553b = i14;
        this.f66554c = imageUrl;
        this.f66555d = action;
        this.f66556e = str;
        this.f66557f = z13;
        this.f66558g = num;
        this.f66559h = num2;
        this.f66560i = num3;
        this.f66561j = bVar;
        this.f66562k = num4;
        this.f66563l = num5;
        this.f66564m = aVar;
        if (i13 == 0 && i14 == 0 && aVar == null) {
            throw new IllegalStateException("Either width/height or widthHeightBasedOnImageSize has to be set");
        }
        this.f66565n = RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL;
    }

    @Override // h21.e, dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f66554c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f66552a == cVar.f66552a && this.f66553b == cVar.f66553b && Intrinsics.d(this.f66554c, cVar.f66554c) && Intrinsics.d(this.f66555d, cVar.f66555d) && Intrinsics.d(this.f66556e, cVar.f66556e) && this.f66557f == cVar.f66557f && Intrinsics.d(this.f66558g, cVar.f66558g) && Intrinsics.d(this.f66559h, cVar.f66559h) && Intrinsics.d(this.f66560i, cVar.f66560i) && this.f66561j == cVar.f66561j && Intrinsics.d(this.f66562k, cVar.f66562k) && Intrinsics.d(this.f66563l, cVar.f66563l) && this.f66564m == cVar.f66564m;
    }

    @Override // h21.e
    public final int getViewType() {
        return this.f66565n;
    }

    public final int hashCode() {
        int b13 = g.b(this.f66555d, cb.d(this.f66554c, ep.b.b(this.f66553b, Integer.hashCode(this.f66552a) * 31, 31), 31), 31);
        String str = this.f66556e;
        int e13 = ep.b.e(this.f66557f, (b13 + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.f66558g;
        int hashCode = (e13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f66559h;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f66560i;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        lm1.b bVar = this.f66561j;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num4 = this.f66562k;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f66563l;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        re0.a aVar = this.f66564m;
        return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ImageWithActionModel(width=" + this.f66552a + ", height=" + this.f66553b + ", imageUrl=" + this.f66554c + ", action=" + this.f66555d + ", actionText=" + this.f66556e + ", hideIcon=" + this.f66557f + ", backgroundColor=" + this.f66558g + ", actionTextColor=" + this.f66559h + ", actionTextSize=" + this.f66560i + ", actionTextFont=" + this.f66561j + ", actionIcon=" + this.f66562k + ", actionIconTint=" + this.f66563l + ", widthHeightBasedOnImageSize=" + this.f66564m + ")";
    }

    public /* synthetic */ c(int i13, int i14, String str, Function0 function0, String str2, boolean z13, Integer num, Integer num2, Integer num3, lm1.b bVar, Integer num4, Integer num5, re0.a aVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14, str, function0, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? false : z13, (i15 & 64) != 0 ? null : num, (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : num2, (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : num3, (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : bVar, (i15 & 1024) != 0 ? null : num4, (i15 & 2048) != 0 ? null : num5, (i15 & 4096) != 0 ? null : aVar);
    }
}
