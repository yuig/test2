package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.h0;
import r0.r;

/* loaded from: classes2.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean b(h0 h0Var, r rVar) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && h0Var.d() == 0 && rVar == r.f105629a;
    }
}
