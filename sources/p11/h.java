package p11;

import android.app.TimePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.TimePicker;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.v;
import com.google.android.material.datepicker.w;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f98653b;

    public /* synthetic */ h(l lVar, int i13) {
        this.f98652a = i13;
        this.f98653b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f98652a;
        final l this$0 = this.f98653b;
        switch (i13) {
            case 0:
                int i14 = l.f98658y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                hf0.b.l(this$0.requireActivity());
                this$0.P7();
                return;
            case 1:
                int i15 = l.f98658y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                v b13 = v.b();
                Intrinsics.checkNotNullExpressionValue(b13, "datePicker(...)");
                b13.f32577d = ry1.f.date_picker_dialog_description;
                b13.f32575b = ry1.g.CalendarDatePickerDialog;
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar.setTime(this$0.f98670u0.getTime());
                com.google.android.material.datepicker.b bVar = new com.google.android.material.datepicker.b();
                DateValidatorPointBackward dateValidatorPointBackward = new DateValidatorPointBackward(TimeUnit.DAYS.toMillis(30L) + calendar2.getTimeInMillis());
                Intrinsics.checkNotNullExpressionValue(dateValidatorPointBackward, "before(...)");
                DateValidatorPointForward a13 = DateValidatorPointForward.a();
                Intrinsics.checkNotNullExpressionValue(a13, "now(...)");
                bVar.f32507e = CompositeDateValidator.a(f0.j(dateValidatorPointBackward, a13));
                Intrinsics.checkNotNullExpressionValue(bVar, "setValidator(...)");
                b13.f32578e = Long.valueOf(calendar.getTime().getTime());
                b13.f32576c = bVar.a();
                w a14 = b13.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                a14.T6(new j(new ky0.b(25, calendar, this$0)));
                a14.S6(this$0.getChildFragmentManager(), "datePicker");
                return;
            default:
                int i16 = l.f98658y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: p11.k
                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public final void onTimeSet(TimePicker timePicker, int i17, int i18) {
                        int i19 = l.f98658y0;
                        l this$02 = l.this;
                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                        o11.a aVar = this$02.f98663n0;
                        if (aVar != null) {
                            aVar.s3(i17, i18);
                        } else {
                            Intrinsics.r("pageListener");
                            throw null;
                        }
                    }
                };
                Context requireContext = this$0.requireContext();
                int i17 = ry1.g.TimePickerDialog;
                Calendar calendar3 = this$0.f98670u0;
                TimePickerDialog timePickerDialog = new TimePickerDialog(requireContext, i17, onTimeSetListener, calendar3.get(11), calendar3.get(12), false);
                this$0.f98662m0 = timePickerDialog;
                timePickerDialog.setCanceledOnTouchOutside(false);
                TimePickerDialog timePickerDialog2 = this$0.f98662m0;
                if (timePickerDialog2 != null) {
                    timePickerDialog2.show();
                    return;
                } else {
                    Intrinsics.r("timePickerDialog");
                    throw null;
                }
        }
    }
}
