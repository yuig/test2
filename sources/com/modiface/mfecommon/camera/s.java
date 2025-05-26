package com.modiface.mfecommon.camera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import com.modiface.mfecommon.camera.MFEAndroidCameraParameters;
import com.modiface.mfecommon.camera.d;

/* loaded from: classes7.dex */
public final class s implements Camera.PictureCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f34245a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f34246b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MFEAndroidCameraParameters.CameraRotation f34247c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d.InterfaceC0001d f34248d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f34249e;

    public s(f fVar, boolean z13, int i13, MFEAndroidCameraParameters.CameraRotation cameraRotation, d.InterfaceC0001d interfaceC0001d) {
        this.f34249e = fVar;
        this.f34245a = z13;
        this.f34246b = i13;
        this.f34247c = cameraRotation;
        this.f34248d = interfaceC0001d;
    }

    @Override // android.hardware.Camera.PictureCallback
    public void onPictureTaken(byte[] bArr, Camera camera) {
        Bitmap decodeByteArray = bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null;
        b a13 = c.a(this.f34245a, this.f34246b, this.f34247c);
        if (a13 == null) {
            a13 = b.ROTATE0_NOFLIP;
        }
        this.f34248d.a(decodeByteArray, a13);
    }
}
