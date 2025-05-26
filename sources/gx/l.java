package gx;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import so.i6;

/* loaded from: classes3.dex */
public final class l extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66258i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f66259j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i13) {
        super(0);
        this.f66258i = i13;
        this.f66259j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        uk1.d f13;
        int i13 = this.f66258i;
        m mVar = this.f66259j;
        switch (i13) {
            case 0:
                return (ConstraintLayout) mVar.findViewById(pv.a.container_stack_left);
            case 1:
                ni0.e eVar = mVar.f66264d;
                f13 = ((uk1.a) mVar.f66265e).f(mVar.f66262b, "");
                return ((i6) eVar).a(f13, mVar.f66263c);
            default:
                LinearLayout linearLayout = new LinearLayout(mVar.f66261a);
                linearLayout.setBackground(mVar.f66266f.b() ? null : bs1.c.f0(linearLayout, r80.b.pin_closeup_redesign_module_background, null, null, 6));
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                return linearLayout;
        }
    }
}
