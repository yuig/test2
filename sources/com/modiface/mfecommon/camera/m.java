package com.modiface.mfecommon.camera;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.modiface.mfecommon.camera.d;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f34238a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34239b;

    public m(a aVar, AtomicReference atomicReference) {
        this.f34239b = aVar;
        this.f34238a = atomicReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.a aVar = (d.a) this.f34238a.get();
        if (aVar == null) {
            return;
        }
        SurfaceTexture surfaceTexture = aVar.f34194a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        int i13 = aVar.f34195b;
        if (i13 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i13}, 0);
        }
    }
}
