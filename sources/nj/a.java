package nj;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import ex1.l;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;
import oi.u6;
import ub1.a0;
import ub1.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90933b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f90932a = i13;
        this.f90933b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
        int i13 = this.f90932a;
        Object obj = this.f90933b;
        switch (i13) {
            case 0:
                Chip chip = (Chip) obj;
                u6 u6Var = chip.f32447i;
                if (u6Var != null) {
                    com.google.android.material.internal.a aVar = (com.google.android.material.internal.a) u6Var.f95225b;
                    if (!z13 ? aVar.c(chip, aVar.f32695c) : aVar.a(chip)) {
                        ((com.google.android.material.internal.a) u6Var.f95225b).b();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f32446h;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z13);
                    break;
                }
                break;
            case 1:
                o this$0 = (o) obj;
                int i14 = o.f121730i0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                j.x2((a0) this$0.f121731c0.getValue(), ub1.b.f121712a);
                break;
            default:
                dx1.f this$02 = (dx1.f) obj;
                int i15 = dx1.f.A0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                l lVar = this$02.f56506y0;
                if (lVar != null) {
                    lVar.t3(compoundButton.isChecked());
                    break;
                }
                break;
        }
    }
}
