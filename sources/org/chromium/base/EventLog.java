package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public class EventLog {
    @CalledByNative
    public static void writeEvent(int i13, int i14) {
        android.util.EventLog.writeEvent(i13, i14);
    }
}
