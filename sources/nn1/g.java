package nn1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f91566j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f91567k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f91568l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f91569m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f91570n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f91571o = new g(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g f91572p = new g(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91573i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(0);
        this.f91573i = i13;
    }

    public final f b() {
        switch (this.f91573i) {
            case 0:
                int i13 = xl1.c.always_dark_button_background_colors_gestalt;
                int i14 = xl1.c.always_dark_button_text_colors_gestalt;
                return new f(i13, i14, i13, i14);
            case 1:
                int i15 = xl1.c.always_light_button_background_colors_gestalt;
                int i16 = xl1.c.always_light_button_text_colors_gestalt;
                return new f(i15, i16, i15, i16);
            case 2:
                return new f(xl1.c.secondary_button_background_colors_gestalt, xl1.c.secondary_button_text_colors_gestalt, xl1.c.selected_button_background_colors_gestalt, xl1.c.selected_button_text_colors_gestalt);
            case 3:
                int i17 = xl1.c.primary_button_background_colors_gestalt;
                int i18 = xl1.c.primary_button_text_colors_gestalt;
                return new f(i17, i18, i17, i18);
            case 4:
                int i19 = xl1.c.secondary_button_background_colors_gestalt;
                int i23 = xl1.c.secondary_button_text_colors_gestalt;
                return new f(i19, i23, i19, i23);
            case 5:
                int i24 = xl1.c.selected_button_background_colors_gestalt;
                int i25 = xl1.c.selected_button_text_colors_gestalt;
                return new f(i24, i25, i24, i25);
            default:
                int i26 = xl1.c.tertiary_button_background_colors_gestalt;
                int i27 = xl1.c.tertiary_button_text_colors_gestalt;
                return new f(i26, i27, i26, i27);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f91573i) {
        }
        return b();
    }
}
