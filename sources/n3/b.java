package n3;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f89033a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f89034b;

    public b(int i13, androidx.camera.core.impl.r rVar) {
        if (i13 == 1) {
            this.f89034b = false;
            this.f89033a = rVar.b(AutoFlashUnderExposedQuirk.class) != null;
            return;
        }
        if (i13 != 2) {
            this.f89033a = rVar.a(ImageCaptureFailWithAutoFlashQuirk.class);
            this.f89034b = y.b.f136245a.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
            return;
        }
        Iterator it = rVar.c(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                r0 = true;
                break;
            }
        }
        this.f89033a = r0;
        this.f89034b = rVar.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}
