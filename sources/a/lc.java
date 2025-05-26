package a;

import ads_mobile_sdk.t60;
import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class lc implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t60 f107b;

    public /* synthetic */ lc(t60 t60Var, int i13) {
        this.f106a = i13;
        this.f107b = t60Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i13 = this.f106a;
        t60 t60Var = this.f107b;
        switch (i13) {
            case 0:
                t60.c(t60Var, dialogInterface);
                break;
            case 1:
                t60.a(t60Var, dialogInterface);
                break;
            case 2:
                t60.a(t60Var, dialogInterface);
                break;
            default:
                t60.d(t60Var, dialogInterface);
                break;
        }
    }
}
