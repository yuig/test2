package com.modiface.mfecommon.camera;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.camera.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class d implements h.d {

    /* renamed from: a */
    final /* synthetic */ com.modiface.mfecommon.camera.a f34193a;

    public final class a {

        /* renamed from: a */
        SurfaceTexture f34194a;

        /* renamed from: b */
        int f34195b;
    }

    public final class b {

        /* renamed from: a */
        MFEAndroidCameraParameters f34196a;

        /* renamed from: b */
        SurfaceTexture.OnFrameAvailableListener f34197b;

        /* renamed from: c */
        MFEAndroidCameraParametersCallback f34198c;

        /* renamed from: d */
        boolean f34199d;
    }

    public final class c {

        /* renamed from: a */
        boolean f34200a = false;

        /* renamed from: b */
        String f34201b;

        /* renamed from: c */
        Throwable f34202c;
    }

    /* renamed from: com.modiface.mfecommon.camera.d$d */
    public interface InterfaceC0001d {
        void a(Bitmap bitmap, @NonNull com.modiface.mfecommon.camera.b bVar);

        void a(@NonNull Camera.Parameters parameters);
    }

    public class e {

        /* renamed from: a */
        boolean f34203a;

        /* renamed from: b */
        Throwable f34204b;
    }

    public final class f {

        /* renamed from: a */
        int f34205a;

        /* renamed from: b */
        int f34206b;

        /* renamed from: c */
        int f34207c;

        /* renamed from: d */
        @NonNull
        Matrix f34208d = new Matrix();

        public boolean a() {
            return this.f34205a != 0 && this.f34206b > 0 && this.f34207c > 0;
        }
    }

    public d(com.modiface.mfecommon.camera.a aVar) {
        this.f34193a = aVar;
    }

    @Override // com.modiface.mfecommon.camera.h.d
    public void a() {
        this.f34193a.h();
    }

    @Override // com.modiface.mfecommon.camera.h.d
    public void b() {
        AtomicBoolean atomicBoolean;
        com.modiface.mfecommon.utils.n nVar;
        MFEAndroidCameraParameters mFEAndroidCameraParameters;
        com.modiface.mfecommon.utils.n nVar2;
        atomicBoolean = this.f34193a.f34171f;
        if (atomicBoolean.get()) {
            return;
        }
        nVar = this.f34193a.f34170e;
        Handler b13 = nVar.b();
        if (b13 == null) {
            return;
        }
        mFEAndroidCameraParameters = this.f34193a.f34173h;
        b13.sendMessage(Message.obtain(b13, 11, mFEAndroidCameraParameters));
        nVar2 = this.f34193a.f34170e;
        nVar2.b(com.modiface.mfecommon.utils.h.f34316b);
    }
}
