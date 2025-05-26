package com.modiface.mfecommon.camera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.camera.d;
import java.io.IOException;

/* loaded from: classes7.dex */
public class i implements r {

    /* renamed from: a, reason: collision with root package name */
    private MediaPlayer f34228a;

    /* renamed from: b, reason: collision with root package name */
    private SurfaceTexture f34229b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f34230c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f34231d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f34232e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34233f = true;

    public i(@NonNull Context context, int i13) {
        this.f34228a = MediaPlayer.create(context, i13);
    }

    @Override // com.modiface.mfecommon.camera.r
    public void a(@NonNull Context context) {
    }

    @Override // com.modiface.mfecommon.camera.r
    public d.f b() {
        SurfaceTexture surfaceTexture = this.f34229b;
        if (surfaceTexture == null) {
            return null;
        }
        surfaceTexture.updateTexImage();
        int i13 = this.f34231d;
        int i14 = this.f34232e;
        if (i13 <= 0 || i14 <= 0) {
            return null;
        }
        b bVar = b.ROTATE0_NOFLIP;
        d.f fVar = new d.f();
        fVar.f34205a = this.f34230c;
        fVar.f34206b = bVar.d() ? i14 : i13;
        if (!bVar.d()) {
            i13 = i14;
        }
        fVar.f34207c = i13;
        fVar.f34208d = c.a(bVar);
        return fVar;
    }

    @Override // com.modiface.mfecommon.camera.r
    public void c() {
    }

    @Override // com.modiface.mfecommon.camera.r
    public void close() {
        MediaPlayer mediaPlayer = this.f34228a;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.release();
        this.f34228a = null;
    }

    @Override // com.modiface.mfecommon.camera.r
    public boolean d() {
        return false;
    }

    @Override // com.modiface.mfecommon.camera.r
    public d.a e() {
        d.a aVar = new d.a();
        aVar.f34194a = this.f34229b;
        aVar.f34195b = this.f34230c;
        this.f34229b = null;
        this.f34230c = 0;
        return aVar;
    }

    public void f() {
        MediaPlayer mediaPlayer = this.f34228a;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(0);
            this.f34228a.start();
        }
    }

    public void a(boolean z13) {
        this.f34233f = z13;
        MediaPlayer mediaPlayer = this.f34228a;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z13);
        }
    }

    @Override // com.modiface.mfecommon.camera.r
    @NonNull
    public d.c a(@NonNull d.b bVar) {
        d.c cVar = new d.c();
        cVar.f34200a = false;
        if (this.f34228a == null) {
            cVar.f34201b = "media player not initialized";
            return cVar;
        }
        int i13 = this.f34230c;
        if (i13 == 0) {
            int[] iArr = {i13};
            GLES20.glGenTextures(1, iArr, 0);
            this.f34230c = iArr[0];
        }
        if (this.f34229b == null && this.f34230c != 0) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f34230c);
            this.f34229b = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(bVar.f34197b);
        }
        if (this.f34229b == null) {
            cVar.f34201b = "Failed to start camera preview due to fail to initialize surface";
            return cVar;
        }
        Surface surface = new Surface(this.f34229b);
        this.f34228a.setSurface(surface);
        surface.release();
        try {
            this.f34228a.prepare();
            this.f34231d = this.f34228a.getVideoWidth();
            this.f34232e = this.f34228a.getVideoHeight();
            this.f34228a.setLooping(this.f34233f);
            this.f34228a.start();
            cVar.f34200a = true;
            return cVar;
        } catch (IOException e13) {
            cVar.f34202c = e13;
            cVar.f34201b = "media player prepare failed";
            return cVar;
        }
    }

    @Override // com.modiface.mfecommon.camera.r
    public void a() {
        MediaPlayer mediaPlayer = this.f34228a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f34228a.setSurface(null);
        }
        this.f34231d = 0;
        this.f34232e = 0;
    }

    @Override // com.modiface.mfecommon.camera.r
    @NonNull
    public d.e a(boolean z13, @NonNull d.InterfaceC0001d interfaceC0001d) {
        d.e eVar = new d.e();
        eVar.f34203a = false;
        eVar.f34204b = new IllegalStateException("Take picture unsupported for video");
        return eVar;
    }
}
