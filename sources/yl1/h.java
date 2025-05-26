package yl1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class h extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f139326j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f139327k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f139328l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f139329m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f139330n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f139331o = new h(5);

    /* renamed from: p, reason: collision with root package name */
    public static final h f139332p = new h(6);

    /* renamed from: q, reason: collision with root package name */
    public static final h f139333q = new h(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139334i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(0);
        this.f139334i = i13;
    }

    public final g b() {
        switch (this.f139334i) {
            case 0:
                return new g(xl1.c.always_dark_button_background_colors_gestalt, xl1.c.always_dark_button_text_colors_gestalt);
            case 1:
                return new g(xl1.c.always_light_button_background_colors_gestalt, xl1.c.always_light_button_text_colors_gestalt);
            case 2:
                return new g(xl1.c.primary_button_background_colors_gestalt, xl1.c.primary_button_text_colors_gestalt);
            case 3:
                return new g(xl1.c.secondary_button_background_colors_gestalt, xl1.c.secondary_button_text_colors_gestalt);
            case 4:
                return new g(xl1.c.selected_button_background_colors_gestalt, xl1.c.selected_button_text_colors_gestalt);
            case 5:
                return new g(xl1.c.shopping_button_background_colors_gestalt, xl1.c.shopping_button_text_colors_gestalt);
            case 6:
                return new g(xl1.c.tertiary_button_background_colors_gestalt, xl1.c.tertiary_button_text_colors_gestalt);
            default:
                return new g(xl1.c.transparent_button_background_colors_gestalt, xl1.c.transparent_button_text_colors_gestalt);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f139334i) {
        }
        return b();
    }
}
