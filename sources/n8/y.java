package n8;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class y implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f89918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f89919b;

    public y(a0 a0Var, DisplayManager displayManager) {
        this.f89919b = a0Var;
        this.f89918a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i13) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i13) {
        if (i13 == 0) {
            a0.a(this.f89919b, this.f89918a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i13) {
    }
}
