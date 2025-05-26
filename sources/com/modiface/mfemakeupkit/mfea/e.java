package com.modiface.mfemakeupkit.mfea;

import com.modiface.mfecommon.utils.k;
import com.modiface.mfemakeupkit.effects.MFEMakeupLook;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: k, reason: collision with root package name */
    private long f34530k;

    static {
        k.a("MFEMakeupKit");
        registerNatives();
    }

    public e(MFEMakeupLook mFEMakeupLook) {
        this.f34530k = 0L;
        this.f34530k = a(mFEMakeupLook);
    }

    private native long a(MFEMakeupLook mFEMakeupLook);

    private native void b();

    private long getNativeState() {
        return this.f34530k;
    }

    private static native void registerNatives();

    public void finalize() {
        try {
            if (this.f34530k != 0) {
                b();
                this.f34530k = 0L;
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        super.finalize();
    }
}
