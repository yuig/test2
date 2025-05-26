package a;

import ads_mobile_sdk.t60;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class nc implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f122b;

    public /* synthetic */ nc(Object obj, int i13) {
        this.f121a = i13;
        this.f122b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        int i14 = this.f121a;
        Object obj = this.f122b;
        switch (i14) {
            case 0:
                t60.a((AtomicInteger) obj, dialogInterface, i13);
                break;
            case 1:
                t60.a((AtomicInteger) obj, dialogInterface, i13);
                break;
            default:
                DeviceAuthDialog this$0 = (DeviceAuthDialog) obj;
                int i15 = DeviceAuthDialog.B;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View V6 = this$0.V6(false);
                Dialog dialog = this$0.f18416l;
                if (dialog != null) {
                    dialog.setContentView(V6);
                }
                LoginClient.Request request = this$0.A;
                if (request != null) {
                    this$0.c7(request);
                    break;
                }
                break;
        }
    }
}
