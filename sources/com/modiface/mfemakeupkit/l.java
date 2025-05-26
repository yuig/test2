package com.modiface.mfemakeupkit;

import android.graphics.Bitmap;
import android.hardware.Camera;
import com.modiface.mfecommon.camera.a;
import com.modiface.mfemakeupkit.MFEMakeupEngine;

/* loaded from: classes7.dex */
public final class l implements a.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.TakePictureCameraParametersCallback f34522a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.TakePictureFromCameraCompletionHandler f34523b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34524c;

    public l(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.TakePictureCameraParametersCallback takePictureCameraParametersCallback, MFEMakeupEngine.TakePictureFromCameraCompletionHandler takePictureFromCameraCompletionHandler) {
        this.f34524c = mFEMakeupEngine;
        this.f34522a = takePictureCameraParametersCallback;
        this.f34523b = takePictureFromCameraCompletionHandler;
    }

    @Override // com.modiface.mfecommon.camera.a.h
    public void a(Camera.Parameters parameters) {
        MFEMakeupEngine.TakePictureCameraParametersCallback takePictureCameraParametersCallback = this.f34522a;
        if (takePictureCameraParametersCallback != null) {
            takePictureCameraParametersCallback.onTakePictureFromCameraSetCameraParameters(parameters);
        }
    }

    @Override // com.modiface.mfecommon.camera.a.h
    public void a(Bitmap bitmap, Throwable th3) {
        if (th3 != null) {
            this.f34523b.onTakePictureFromCameraDone(null, null, th3);
            return;
        }
        if (bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            this.f34524c.applyMakeupToPhotoInBackground(bitmap, true, new k(this));
        } else {
            this.f34523b.onTakePictureFromCameraDone(null, null, new NullPointerException("take picture from camera image null or invalid"));
        }
    }
}
