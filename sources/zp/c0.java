package zp;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142342i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f142343j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f142344k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i13, boolean z13, boolean z14) {
        super(1);
        this.f142342i = i13;
        this.f142343j = z13;
        this.f142344k = z14;
    }

    public final on1.k b(on1.k it) {
        switch (this.f142342i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.k.e(it, on1.b.e(it.f96740a, this.f142343j, this.f142344k, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER), null, d7.b.Z(true), RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.k.e(it, on1.b.e(it.f96740a, this.f142343j, !this.f142344k, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f142342i;
        boolean z13 = this.f142344k;
        boolean z14 = this.f142343j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, z13 ? 4 : 10, d7.b.Z(z14), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097055);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z14 && !z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142342i;
        boolean z13 = this.f142344k;
        boolean z14 = this.f142343j;
        switch (i13) {
            case 0:
                return b((on1.k) obj);
            case 1:
                return b((on1.k) obj);
            case 2:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, (z14 && z13) ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            case 3:
                return e((rn1.a) obj);
            case 4:
                om1.c state = (om1.c) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return om1.c.e(state, null, null, null, null, null, z14 || z13, 0, 991);
            default:
                return e((rn1.a) obj);
        }
    }
}
