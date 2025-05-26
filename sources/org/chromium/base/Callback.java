package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public interface Callback {

    public static abstract class Helper {
        @CalledByNative
        public static void onBooleanResultFromNative(Callback callback, boolean z13) {
            callback.a();
        }

        @CalledByNative
        public static void onIntResultFromNative(Callback callback, int i13) {
            callback.a();
        }

        @CalledByNative
        public static void onLongResultFromNative(Callback callback, long j13) {
            callback.a();
        }

        @CalledByNative
        public static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.a();
        }

        @CalledByNative
        public static void onTimeResultFromNative(Callback callback, long j13) {
            callback.a();
        }

        @CalledByNative
        public static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }

    void a();
}
