package ol0;

import android.view.View;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f96349b;

    public /* synthetic */ a(f fVar, int i13) {
        this.f96348a = i13;
        this.f96349b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f96348a;
        f this$0 = this.f96349b;
        switch (i13) {
            case 0:
                int i14 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ll0.f fVar = this$0.Q0;
                if (fVar != null) {
                    fVar.w3();
                    break;
                }
                break;
            case 1:
                int i15 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ll0.f fVar2 = this$0.Q0;
                if (fVar2 != null) {
                    fVar2.v3();
                    break;
                }
                break;
            case 2:
                int i16 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ll0.f fVar3 = this$0.Q0;
                if (fVar3 != null) {
                    fVar3.t3();
                    break;
                }
                break;
            case 3:
                int i17 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ll0.f fVar4 = this$0.Q0;
                if (fVar4 != null) {
                    fVar4.f83816o = true;
                    break;
                }
                break;
            case 4:
                int i18 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GestaltSwitch gestaltSwitch = this$0.F0;
                if (gestaltSwitch != null) {
                    gestaltSwitch.i(e.f96364q);
                    this$0.f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                    break;
                }
                break;
            case 5:
                int i19 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GestaltSwitch gestaltSwitch2 = this$0.F0;
                if (gestaltSwitch2 != null) {
                    gestaltSwitch2.i(e.f96365r);
                    break;
                }
                break;
            case 6:
                int i23 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GestaltSwitch gestaltSwitch3 = this$0.F0;
                if (gestaltSwitch3 != null) {
                    gestaltSwitch3.i(e.f96366s);
                    this$0.f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                    break;
                }
                break;
            default:
                int i24 = f.V0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GestaltSwitch gestaltSwitch4 = this$0.F0;
                if (gestaltSwitch4 != null) {
                    gestaltSwitch4.i(e.f96367t);
                    break;
                }
                break;
        }
    }
}
