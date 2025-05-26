package com.modiface.mfemakeupkit;

import android.graphics.Bitmap;
import android.hardware.Camera;
import com.modiface.mfecommon.camera.a;
import com.modiface.mfemakeupkit.MFEMakeupEngine;

/* loaded from: classes7.dex */
public final class o implements a.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.TakePictureCameraParametersCallback f34533a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.RunningWithPictureCompletionHandler f34534b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f34535c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34536d;

    public o(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.TakePictureCameraParametersCallback takePictureCameraParametersCallback, MFEMakeupEngine.RunningWithPictureCompletionHandler runningWithPictureCompletionHandler, boolean z13) {
        this.f34536d = mFEMakeupEngine;
        this.f34533a = takePictureCameraParametersCallback;
        this.f34534b = runningWithPictureCompletionHandler;
        this.f34535c = z13;
    }

    @Override // com.modiface.mfecommon.camera.a.h
    public void a(Camera.Parameters parameters) {
        MFEMakeupEngine.TakePictureCameraParametersCallback takePictureCameraParametersCallback = this.f34533a;
        if (takePictureCameraParametersCallback != null) {
            takePictureCameraParametersCallback.onTakePictureFromCameraSetCameraParameters(parameters);
        }
    }

    @Override // com.modiface.mfecommon.camera.a.h
    public void a(Bitmap bitmap, Throwable th3) {
        if (th3 != null) {
            this.f34534b.onRunningWithPictureDone(null, null, th3);
            return;
        }
        if (bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            com.modiface.mfecommon.utils.h.a(new n(this, bitmap));
        } else {
            this.f34534b.onRunningWithPictureDone(null, null, new NullPointerException("take picture from camera image null or invalid"));
        }
    }
}
