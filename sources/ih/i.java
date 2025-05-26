package ih;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.w0;

/* loaded from: classes3.dex */
public class i extends androidx.fragment.app.q {

    /* renamed from: q, reason: collision with root package name */
    public Dialog f72268q;

    /* renamed from: r, reason: collision with root package name */
    public DialogInterface.OnCancelListener f72269r;

    /* renamed from: s, reason: collision with root package name */
    public AlertDialog f72270s;

    public static i T6(AlertDialog alertDialog, DialogInterface.OnCancelListener onCancelListener) {
        i iVar = new i();
        com.bumptech.glide.d.u(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        iVar.f72268q = alertDialog;
        if (onCancelListener != null) {
            iVar.f72269r = onCancelListener;
        }
        return iVar;
    }

    @Override // androidx.fragment.app.q
    public final Dialog O6(Bundle bundle) {
        Dialog dialog = this.f72268q;
        if (dialog != null) {
            return dialog;
        }
        this.f18412h = false;
        if (this.f72270s == null) {
            Context context = getContext();
            com.bumptech.glide.d.t(context);
            this.f72270s = new AlertDialog.Builder(context).create();
        }
        return this.f72270s;
    }

    @Override // androidx.fragment.app.q
    public final void S6(w0 w0Var, String str) {
        super.S6(w0Var, str);
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f72269r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
