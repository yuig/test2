package a;

import ads_mobile_sdk.t60;
import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class kc implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t60 f75b;

    public /* synthetic */ kc(t60 t60Var, int i13) {
        this.f74a = i13;
        this.f75b = t60Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        int i14 = this.f74a;
        t60 t60Var = this.f75b;
        switch (i14) {
            case 0:
                t60.c(t60Var, dialogInterface, i13);
                break;
            case 1:
                t60.b(t60Var, dialogInterface, i13);
                break;
            case 2:
                t60.b(t60Var, dialogInterface, i13);
                break;
            case 3:
                t60.a(t60Var, dialogInterface, i13);
                break;
            case 4:
                t60.a(t60Var, dialogInterface, i13);
                break;
            default:
                t60.d(t60Var, dialogInterface, i13);
                break;
        }
    }
}
