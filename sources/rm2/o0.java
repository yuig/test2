package rm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class o0 {

    /* renamed from: k, reason: collision with root package name */
    public static final o0 f108768k = new o0(false, false, false, false, false, new o0(false, false, false, false, false, null, false, null, null, false, 1023), false, null, null, false, 988);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f108769a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f108770b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f108771c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f108772d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f108773e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f108774f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f108775g;

    /* renamed from: h, reason: collision with root package name */
    public final o0 f108776h;

    /* renamed from: i, reason: collision with root package name */
    public final o0 f108777i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f108778j;

    public o0(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, o0 o0Var, boolean z18, o0 o0Var2, o0 o0Var3, boolean z19, int i13) {
        z13 = (i13 & 1) != 0 ? true : z13;
        z14 = (i13 & 2) != 0 ? true : z14;
        z15 = (i13 & 4) != 0 ? false : z15;
        z16 = (i13 & 8) != 0 ? false : z16;
        z17 = (i13 & 16) != 0 ? false : z17;
        o0Var = (i13 & 32) != 0 ? null : o0Var;
        z18 = (i13 & 64) != 0 ? true : z18;
        o0Var2 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? o0Var : o0Var2;
        o0Var3 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? o0Var : o0Var3;
        z19 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z19;
        this.f108769a = z13;
        this.f108770b = z14;
        this.f108771c = z15;
        this.f108772d = z16;
        this.f108773e = z17;
        this.f108774f = o0Var;
        this.f108775g = z18;
        this.f108776h = o0Var2;
        this.f108777i = o0Var3;
        this.f108778j = z19;
    }
}
