package n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes2.dex */
public final class p implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, z {

    /* renamed from: a, reason: collision with root package name */
    public o f88672a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.k f88673b;

    /* renamed from: c, reason: collision with root package name */
    public k f88674c;

    @Override // n.z
    public final void b(o oVar, boolean z13) {
        androidx.appcompat.app.k kVar;
        if ((z13 || oVar == this.f88672a) && (kVar = this.f88673b) != null) {
            kVar.dismiss();
        }
    }

    @Override // n.z
    public final boolean c(o oVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        this.f88672a.r(this.f88674c.a().getItem(i13), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f88674c.b(this.f88672a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i13, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        o oVar = this.f88672a;
        if (i13 == 82 || i13 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f88673b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f88673b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                oVar.d(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return oVar.performShortcut(i13, keyEvent, 0);
    }
}
