package cv0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public abstract class y extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f53299b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f53300c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f53301d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f53302e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f53303f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f53304g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f53305h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f53306i;

    /* renamed from: j, reason: collision with root package name */
    public final int f53307j;

    /* renamed from: k, reason: collision with root package name */
    public final vn1.g f53308k;

    private y(int i13, Integer num, Integer num2, Integer num3, Function0<Unit> function0, boolean z13, boolean z14, Function1<? super Boolean, Unit> function1, int i14, vn1.g gVar) {
        super(3, null);
        this.f53299b = i13;
        this.f53300c = num;
        this.f53301d = num2;
        this.f53302e = num3;
        this.f53303f = function0;
        this.f53304g = z13;
        this.f53305h = z14;
        this.f53306i = function1;
        this.f53307j = i14;
        this.f53308k = gVar;
    }

    public /* synthetic */ y(int i13, Integer num, Integer num2, Integer num3, Function0 function0, boolean z13, boolean z14, Function1 function1, int i14, vn1.g gVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? null : num2, (i15 & 8) != 0 ? null : num3, (i15 & 16) != 0 ? b.f53262l : function0, (i15 & 32) != 0 ? false : z13, (i15 & 64) != 0 ? true : z14, (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? u.f53294j : function1, (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 0 : i14, (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? vn1.g.BODY_400 : gVar, null);
    }

    public /* synthetic */ y(int i13, Integer num, Integer num2, Integer num3, Function0 function0, boolean z13, boolean z14, Function1 function1, int i14, vn1.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, num, num2, num3, function0, z13, z14, function1, i14, gVar);
    }
}
