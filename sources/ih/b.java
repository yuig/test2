package ih;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f72253a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f72254b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f72255c;

    public static b a(AlertDialog alertDialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        com.bumptech.glide.d.u(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f72253a = alertDialog;
        if (onCancelListener != null) {
            bVar.f72254b = onCancelListener;
        }
        return bVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f72254b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f72253a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f72255c == null) {
            Activity activity = getActivity();
            com.bumptech.glide.d.t(activity);
            this.f72255c = new AlertDialog.Builder(activity).create();
        }
        return this.f72255c;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
