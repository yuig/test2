package q91;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import yq1.q1;
import yq1.s1;

/* loaded from: classes5.dex */
public final /* synthetic */ class l0 implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nl1.d f103142b;

    public /* synthetic */ l0(nl1.d dVar, int i13) {
        this.f103141a = i13;
        this.f103142b = dVar;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i13, int i14, int i15) {
        int i16 = this.f103141a;
        nl1.d dVar = this.f103142b;
        switch (i16) {
            case 0:
                o0 this$0 = (o0) dVar;
                int i17 = o0.f103151s0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GestaltButton gestaltButton = this$0.f103164o0;
                if (gestaltButton == null) {
                    Intrinsics.r("btnUpdate");
                    throw null;
                }
                gestaltButton.setEnabled(true);
                Calendar calendar = this$0.f103165p0;
                if (calendar == null) {
                    Intrinsics.r("cal");
                    throw null;
                }
                calendar.set(i13, i14, i15, 12, 0, 0);
                GestaltText gestaltText = this$0.f103163n0;
                if (gestaltText == null) {
                    Intrinsics.r("dateTextView");
                    throw null;
                }
                pk.a0.p(gestaltText, this$0.b8(false));
                this$0.a8(null, h32.u0.DATE_PICKER_OK_BUTTON);
                return;
            default:
                s1 this$02 = (s1) dVar;
                int i18 = s1.I0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (this$02.f139916v0) {
                    this$02.b8();
                }
                this$02.E0.set(i13, i14, i15, 12, 0, 0);
                this$02.d8().i(new q1(this$02, 0));
                this$02.e8().X(new pn1.g(this$02.n8(), 6));
                this$02.s7().h(null, h32.u0.DATE_PICKER_OK_BUTTON, this$02.getO0());
                return;
        }
    }
}
