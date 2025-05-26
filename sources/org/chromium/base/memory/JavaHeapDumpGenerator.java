package org.chromium.base.memory;

import android.os.Debug;
import android.util.Log;
import java.io.IOException;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public final class JavaHeapDumpGenerator {
    @CalledByNative
    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e13) {
            Log.i("cr_JavaHprofGenerator", "Error writing to file " + str + ". Error: " + e13.getMessage());
            return false;
        }
    }
}
