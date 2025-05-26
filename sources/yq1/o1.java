package yq1;

import android.app.DatePickerDialog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f139930b;

    public /* synthetic */ o1(s1 s1Var, int i13) {
        this.f139929a = i13;
        this.f139930b = s1Var;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f139929a;
        s1 this$0 = this.f139930b;
        switch (i13) {
            case 0:
                int i14 = s1.I0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xn1.i) {
                    this$0.k8(!kotlin.text.z.j(((xn1.i) it).f135454c));
                    return;
                }
                return;
            default:
                int i15 = s1.I0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                DatePickerDialog datePickerDialog = this$0.F0;
                if (datePickerDialog == null) {
                    Intrinsics.r("datePickerDialog");
                    throw null;
                }
                datePickerDialog.show();
                this$0.s7().h(null, h32.u0.DATE_PICKER_SELECTION, this$0.getO0());
                return;
        }
    }
}
