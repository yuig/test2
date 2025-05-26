package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f18382a;

    public n(q qVar) {
        this.f18382a = qVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        q qVar = this.f18382a;
        Dialog dialog = qVar.f18416l;
        if (dialog != null) {
            qVar.onDismiss(dialog);
        }
    }
}
