package vl1;

import com.pinterest.gestalt.banner.GestaltBanner;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126127i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltBanner f126128j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(GestaltBanner gestaltBanner, int i13) {
        super(0);
        this.f126127i = i13;
        this.f126128j = gestaltBanner;
    }

    public final Integer b() {
        int i13 = this.f126127i;
        GestaltBanner gestaltBanner = this.f126128j;
        switch (i13) {
            case 0:
                return Integer.valueOf(dl2.b.G0(gestaltBanner, eo1.a.comp_banner_end_padding));
            case 1:
                return Integer.valueOf(dl2.b.G0(gestaltBanner, eo1.a.comp_banner_start_padding));
            case 2:
                return Integer.valueOf(dl2.b.G0(gestaltBanner, eo1.a.comp_banner_dismiss_padding));
            case 3:
                return Integer.valueOf(dl2.b.G0(gestaltBanner, eo1.a.comp_banner_buttons_text_vertical_gap));
            case 4:
                return Integer.valueOf(dl2.b.G0(gestaltBanner, eo1.a.comp_banner_close_text_horizontal_gap));
            case 5:
                return Integer.valueOf(dl2.b.G0(gestaltBanner, eo1.a.comp_banner_icon_text_horizontal_gap));
            default:
                return Integer.valueOf(dl2.b.G0(gestaltBanner, eo1.a.comp_banner_header_body_vertical_gap));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f126127i) {
        }
        return b();
    }
}
