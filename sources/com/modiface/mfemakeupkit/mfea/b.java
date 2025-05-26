package com.modiface.mfemakeupkit.mfea;

import android.content.res.AssetManager;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.k;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFEFaceTrackingParameters;
import com.modiface.mfemakeupkit.data.MFETrackingData;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: k, reason: collision with root package name */
    private long f34528k = 0;

    static {
        k.a("MFEMakeupKit");
        registerNatives();
    }

    private native long a(String str, MFEMakeupEngine.Region region, MFEDebugInfo mFEDebugInfo);

    private native void b();

    private long getNativeState() {
        return this.f34528k;
    }

    private static native void registerNatives();

    public native void c(MFETrackingData mFETrackingData, MFEFaceTrackingParameters mFEFaceTrackingParameters, MFEDebugInfo mFEDebugInfo);

    public native void d();

    public void e(String str, MFEMakeupEngine.Region region, MFEDebugInfo mFEDebugInfo) {
        this.f34528k = a(str, region, mFEDebugInfo);
    }

    public void f() {
        if (this.f34528k != 0) {
            b();
            this.f34528k = 0L;
        }
    }

    public boolean g() {
        return this.f34528k != 0;
    }

    public native void h(String str, MFEDebugInfo mFEDebugInfo);

    public native void j(AssetManager assetManager, String str);

    public native void l(int i13);

    public native int m();

    public native void n(boolean z13);

    public native void o(int i13);
}
