package zp;

import com.pinterest.activity.library.modal.ManageVisibilityToggleItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142332i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ManageVisibilityToggleItemView f142333j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f142334k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(ManageVisibilityToggleItemView manageVisibilityToggleItemView, int i13, int i14) {
        super(1);
        this.f142332i = i14;
        this.f142333j = manageVisibilityToggleItemView;
        this.f142334k = i13;
    }

    public final void b(on1.r bind) {
        u50.i0 label = u50.h0.f120562a;
        int i13 = this.f142332i;
        int i14 = this.f142334k;
        ManageVisibilityToggleItemView manageVisibilityToggleItemView = this.f142333j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String string = manageVisibilityToggleItemView.getResources().getString(i14);
                if (string != null) {
                    label = new u50.f0(string);
                }
                bind.f96756c = label;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String string2 = manageVisibilityToggleItemView.getResources().getString(i14);
                if (string2 != null) {
                    label = new u50.f0(string2);
                }
                bind.getClass();
                Intrinsics.checkNotNullParameter(label, "label");
                bind.f96755b = label;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f142332i) {
            case 0:
                b((on1.r) obj);
                break;
            default:
                b((on1.r) obj);
                break;
        }
        return Unit.f80348a;
    }
}
