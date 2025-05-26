package df;

import android.content.DialogInterface;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f54805b;

    public /* synthetic */ m1(View.OnCreateContextMenuListener onCreateContextMenuListener, int i13) {
        this.f54804a = i13;
        this.f54805b = onCreateContextMenuListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i13 = this.f54804a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f54805b;
        switch (i13) {
            case 0:
                t1 this$0 = (t1) onCreateContextMenuListener;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.cancel();
                break;
            case 1:
                q91.o0 this$02 = (q91.o0) onCreateContextMenuListener;
                int i14 = q91.o0.f103151s0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.a8(null, h32.u0.DATE_PICKER_CANCEL_BUTTON);
                break;
            default:
                yq1.s1 this$03 = (yq1.s1) onCreateContextMenuListener;
                int i15 = yq1.s1.I0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (kotlin.text.z.j(this$03.d8().l().f108849g.toString())) {
                    pk.a0.p(this$03.d8(), this$03.o8(false));
                }
                this$03.s7().h(null, h32.u0.DATE_PICKER_CANCEL_BUTTON, this$03.getO0());
                break;
        }
    }
}
