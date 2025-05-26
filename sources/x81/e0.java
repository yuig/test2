package x81;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134190i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f134191j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0 f134192k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(boolean z13, f0 f0Var, int i13) {
        super(0);
        this.f134190i = i13;
        this.f134191j = z13;
        this.f134192k = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f134190i;
        f0 f0Var = this.f134192k;
        boolean z13 = this.f134191j;
        switch (i13) {
            case 0:
                if (z13) {
                    f0Var.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.LENS_PERMISSIONS_REQUEST, (r18 & 2) != 0 ? null : u0.LENS_PERMISSION_SETTINGS_BUTTON, (r18 & 4) != 0 ? null : h32.g0.CAMERA_PERMISSIONS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                break;
            default:
                if (z13) {
                    f0Var.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.LENS_PERMISSIONS_REQUEST, (r18 & 2) != 0 ? null : u0.LENS_PERMISSION_SETTINGS_BUTTON, (r18 & 4) != 0 ? null : h32.g0.PHOTO_LIBRARY_PERMISSIONS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                break;
        }
        return Boolean.valueOf(!z13);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f134190i) {
        }
        return invoke();
    }
}
