package xs0;

import android.widget.CompoundButton;
import com.pinterest.feature.home.tuner.sba.SbaHfBoardToggleSettingCellView;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f135821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f135822c;

    public /* synthetic */ i(int i13, Object obj, Object obj2) {
        this.f135820a = i13;
        this.f135821b = obj;
        this.f135822c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
        int i13 = this.f135820a;
        Object obj = this.f135822c;
        Object obj2 = this.f135821b;
        switch (i13) {
            case 0:
                a displayState = (a) obj2;
                SbaHfBoardToggleSettingCellView this$0 = (SbaHfBoardToggleSettingCellView) obj;
                int i14 = SbaHfBoardToggleSettingCellView.f45813k;
                Intrinsics.checkNotNullParameter(displayState, "$displayState");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (displayState.f135771f != z13) {
                    u50.r rVar = this$0.f45817d;
                    if (rVar != null) {
                        rVar.a(b.f135780a);
                        return;
                    } else {
                        Intrinsics.r("eventIntake");
                        throw null;
                    }
                }
                return;
            default:
                GestaltSwitch this_bindDefaultEventHandler = (GestaltSwitch) obj2;
                Function1 invokeAfterStateMutation = (Function1) obj;
                Intrinsics.checkNotNullParameter(this_bindDefaultEventHandler, "$this_bindDefaultEventHandler");
                Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "$invokeAfterStateMutation");
                this_bindDefaultEventHandler.i(new mm1.i(z13, 4));
                invokeAfterStateMutation.invoke(z13 ? new on1.g(this_bindDefaultEventHandler.getId()) : new on1.h(this_bindDefaultEventHandler.getId()));
                return;
        }
    }
}
