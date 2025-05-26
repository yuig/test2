package do1;

import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55684i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltToast f55685j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(GestaltToast gestaltToast, int i13) {
        super(0);
        this.f55684i = i13;
        this.f55685j = gestaltToast;
    }

    public final Integer b() {
        int i13 = this.f55684i;
        GestaltToast gestaltToast = this.f55685j;
        switch (i13) {
            case 1:
                return Integer.valueOf(dl2.b.G0(gestaltToast, eo1.a.comp_toast_horizontal_padding));
            case 2:
                return Integer.valueOf(bs1.c.W(gestaltToast, eo1.c.space_800));
            case 3:
            default:
                return Integer.valueOf(dl2.b.G0(gestaltToast, eo1.a.comp_toast_vertical_padding));
            case 4:
                return Integer.valueOf(gestaltToast.getResources().getDimensionPixelSize(eo1.c.space_800));
            case 5:
                return Integer.valueOf(dl2.b.G0(gestaltToast, eo1.a.comp_toast_image_size));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f55684i;
        GestaltToast gestaltToast = this.f55685j;
        switch (i13) {
        }
        return b();
    }
}
