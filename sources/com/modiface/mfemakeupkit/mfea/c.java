package com.modiface.mfemakeupkit.mfea;

import android.content.res.AssetManager;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfecommon.utils.k;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFEFoundationMatchStatus;
import com.modiface.mfemakeupkit.data.MFEMakeupRenderingParameters;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.effects.MFEMakeupTint;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: k, reason: collision with root package name */
    private long f34529k = 0;

    static {
        k.a("MFEMakeupKit");
        registerNatives();
    }

    private native long a(String str, MFEMakeupEngine.Region region, AssetManager assetManager, MFEDebugInfo mFEDebugInfo);

    private native void b();

    private long getNativeState() {
        return this.f34529k;
    }

    private static native void registerNatives();

    public native void c();

    public native void cs1776(MFEDebugInfo mFEDebugInfo);

    public native boolean d(e eVar, MFEDebugInfo mFEDebugInfo, long j13);

    public native void e(MFETrackingData mFETrackingData, MFEDebugInfo mFEDebugInfo, long j13);

    public native boolean f(MFEGLFramebuffer mFEGLFramebuffer, MFEGLFramebuffer mFEGLFramebuffer2, int i13, MFETrackingData mFETrackingData, MFEMakeupRenderingParameters mFEMakeupRenderingParameters, float f13, MFEDebugInfo mFEDebugInfo, long j13);

    public native MFEFoundationMatchStatus g(float f13, MFEDebugInfo mFEDebugInfo);

    public void h(String str, MFEMakeupEngine.Region region, AssetManager assetManager, MFEDebugInfo mFEDebugInfo) {
        this.f34529k = a(str, region, assetManager, mFEDebugInfo);
    }

    public void i() {
        if (this.f34529k != 0) {
            b();
            this.f34529k = 0L;
        }
    }

    public boolean j() {
        return this.f34529k != 0;
    }

    public native void k(MFEMakeupTint.Style style, MFEDebugInfo mFEDebugInfo);

    public native void l(String str, MFEDebugInfo mFEDebugInfo);

    public native void m(String str);
}
