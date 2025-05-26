package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.r;
import androidx.camera.core.impl.x1;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface SurfaceProcessingQuirk extends x1 {
    static boolean c(r rVar) {
        Iterator it = rVar.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    default boolean d() {
        return true;
    }
}
