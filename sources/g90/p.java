package g90;

import android.content.res.Resources;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64554i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Resources f64555j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i13, Resources resources) {
        super(0);
        this.f64554i = i13;
        this.f64555j = resources;
    }

    public final Integer b() {
        int i13 = this.f64554i;
        Resources resources = this.f64555j;
        switch (i13) {
            case 0:
                int U = bs1.c.U(a90.a.collages_bottom_sheet_carousel_item_width, resources);
                int i14 = eo1.c.space_400;
                Intrinsics.checkNotNullParameter(resources, "<this>");
                return Integer.valueOf(resources.getDimensionPixelOffset(i14) + U);
            default:
                int U2 = bs1.c.U(ps.n.ads_qcm_drawer_carousel_item_width, resources);
                int i15 = eo1.c.space_400;
                Intrinsics.checkNotNullParameter(resources, "<this>");
                return Integer.valueOf(resources.getDimensionPixelOffset(i15) + U2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f64554i) {
        }
        return b();
    }
}
