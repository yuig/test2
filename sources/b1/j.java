package b1;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.view.PreviewView;

/* loaded from: classes2.dex */
public final class j implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreviewView f20810a;

    public j(PreviewView previewView) {
        this.f20810a = previewView;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i13) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i13) {
        PreviewView previewView = this.f20810a;
        Display display = previewView.getDisplay();
        if (display == null || display.getDisplayId() != i13) {
            return;
        }
        previewView.b();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i13) {
    }
}
