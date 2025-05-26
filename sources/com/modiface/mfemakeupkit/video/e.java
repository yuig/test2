package com.modiface.mfemakeupkit.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.os.Handler;
import android.os.Message;
import android.util.Range;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfecommon.utils.p;
import com.modiface.mfemakeupkit.video.MFEVideoRecordingError;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class e implements p.c {

    /* renamed from: n, reason: collision with root package name */
    private static final int f34690n = 51;

    /* renamed from: o, reason: collision with root package name */
    private static final int f34691o = 52;

    /* renamed from: p, reason: collision with root package name */
    private static final p f34692p = new p();

    /* renamed from: a, reason: collision with root package name */
    private final com.modiface.mfecommon.utils.p f34693a;

    /* renamed from: b, reason: collision with root package name */
    private final com.modiface.mfemakeupkit.c f34694b;

    /* renamed from: c, reason: collision with root package name */
    private final q f34695c;

    /* renamed from: d, reason: collision with root package name */
    private final b f34696d;

    /* renamed from: e, reason: collision with root package name */
    private final c f34697e;

    /* renamed from: f, reason: collision with root package name */
    private final o f34698f;

    /* renamed from: g, reason: collision with root package name */
    private AtomicBoolean f34699g;

    /* renamed from: h, reason: collision with root package name */
    private long f34700h;

    /* renamed from: i, reason: collision with root package name */
    private Long f34701i;

    /* renamed from: j, reason: collision with root package name */
    public final File f34702j;

    /* renamed from: k, reason: collision with root package name */
    public h f34703k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f34704l;

    /* renamed from: m, reason: collision with root package name */
    private final List<MFEVideoRecordingError> f34705m;

    public e(File file, boolean z13) {
        com.modiface.mfecommon.utils.p pVar = new com.modiface.mfecommon.utils.p("MFEMakeupRecord");
        this.f34693a = pVar;
        this.f34694b = new i(this, true);
        this.f34699g = new AtomicBoolean(false);
        this.f34700h = System.nanoTime();
        this.f34701i = null;
        this.f34703k = new h();
        this.f34705m = Collections.synchronizedList(new ArrayList());
        if (file == null || !file.exists() || com.modiface.mfecommon.utils.h.a(file.getAbsolutePath()).equalsIgnoreCase(".mp4")) {
            throw new IllegalArgumentException("invalid video file path");
        }
        this.f34702j = file;
        p pVar2 = f34692p;
        this.f34695c = new q(pVar2);
        this.f34696d = new b(pVar2);
        this.f34698f = new o(pVar2);
        this.f34697e = new c(pVar2);
        this.f34704l = z13;
        pVar.a(this);
        pVar.a(new j(this));
        pVar.b().sendEmptyMessage(51);
    }

    @Override // com.modiface.mfecommon.utils.p.c
    public boolean handleMessage(Message message) {
        int i13;
        int i14;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Range<Integer> supportedWidths;
        Range<Integer> supportedHeights;
        int intValue;
        int intValue2;
        if (message != null) {
            int i15 = message.what;
            if (i15 == 51) {
                if (!this.f34699g.get()) {
                    g();
                    j();
                    p pVar = f34692p;
                    long j13 = (((pVar.f34756j * 8) / 16) * 1000) / pVar.f34754h;
                    long j14 = 1000 / pVar.f34748b;
                    if (this.f34704l) {
                        j14 = Math.min(j14, j13);
                    }
                    this.f34693a.b().sendEmptyMessageDelayed(51, j14);
                }
                return true;
            }
            if (i15 == 52) {
                if (!this.f34699g.get() && this.f34695c.d() && !this.f34695c.e() && (i13 = message.arg1) > 0 && (i14 = message.arg2) > 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34695c.f34762g;
                    if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null && (supportedWidths = videoCapabilities.getSupportedWidths()) != null && (supportedHeights = videoCapabilities.getSupportedHeights()) != null && (intValue = supportedWidths.clamp(Integer.valueOf(i13)).intValue()) > 0 && (intValue2 = supportedHeights.clamp(Integer.valueOf(i14)).intValue()) > 0) {
                        i14 = intValue2;
                        i13 = intValue;
                    }
                    try {
                        try {
                            this.f34695c.a(i13, i14);
                        } catch (IllegalStateException e13) {
                            try {
                                this.f34705m.add(new MFEVideoRecordingError(new Throwable("failed to configure width, height: " + i13 + "x" + i14, e13), new MFEVideoRecordingError.Consequence[0]));
                                this.f34695c.f();
                                this.f34695c.a(480, 360);
                            } catch (IllegalStateException e14) {
                                e = e14;
                                this.f34705m.add(new MFEVideoRecordingError(e, MFEVideoRecordingError.Consequence.RecordingFailed));
                                return true;
                            }
                        }
                        this.f34694b.a(this.f34695c.b(), i13, i14);
                    } catch (MediaCodec.CryptoException e15) {
                        e = e15;
                        this.f34705m.add(new MFEVideoRecordingError(e, MFEVideoRecordingError.Consequence.RecordingFailed));
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ long a(e eVar, long j13) {
        long j14 = eVar.f34700h + j13;
        eVar.f34700h = j14;
        return j14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f34697e.b();
        this.f34695c.f();
        this.f34696d.f();
    }

    private void g() {
        int a13;
        if (this.f34704l) {
            try {
                g i13 = this.f34696d.i();
                if (i13 == null || !i13.a() || (a13 = this.f34697e.a(i13)) < 0) {
                    return;
                }
                this.f34696d.a(i13, 0, a13, d() / 1000);
            } catch (MediaCodec.CryptoException | IllegalStateException e13) {
                this.f34705m.add(new MFEVideoRecordingError(e13, MFEVideoRecordingError.Consequence.NoAudio));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        g gVar;
        while (true) {
            g gVar2 = null;
            try {
                gVar = this.f34695c.h();
            } catch (IllegalStateException e13) {
                this.f34705m.add(new MFEVideoRecordingError(e13, MFEVideoRecordingError.Consequence.RecordingFailed));
                gVar = null;
            }
            try {
                gVar2 = this.f34696d.h();
            } catch (IllegalStateException e14) {
                this.f34705m.add(new MFEVideoRecordingError(e14, MFEVideoRecordingError.Consequence.NoAudio));
            }
            if (gVar != null && gVar.f34711a == -2) {
                try {
                    if (this.f34698f.b(this.f34695c.c())) {
                        gVar = this.f34695c.h();
                    }
                } catch (IllegalArgumentException | IllegalStateException e15) {
                    this.f34705m.add(new MFEVideoRecordingError(e15, MFEVideoRecordingError.Consequence.RecordingFailed));
                }
            }
            if (gVar2 != null && gVar2.f34711a == -2) {
                try {
                    if (this.f34698f.a(this.f34696d.c())) {
                        gVar2 = this.f34696d.h();
                    }
                } catch (IllegalArgumentException | IllegalStateException e16) {
                    this.f34705m.add(new MFEVideoRecordingError(e16, MFEVideoRecordingError.Consequence.NoAudio));
                }
            }
            if (gVar != null && gVar.a()) {
                try {
                    this.f34698f.b(gVar, this.f34695c.a());
                } catch (IllegalArgumentException | IllegalStateException e17) {
                    this.f34705m.add(new MFEVideoRecordingError(e17, MFEVideoRecordingError.Consequence.SkippedVideoFrame));
                }
                try {
                    this.f34695c.a(gVar);
                } catch (IllegalStateException e18) {
                    this.f34705m.add(new MFEVideoRecordingError(e18, new MFEVideoRecordingError.Consequence[0]));
                }
            }
            if (gVar2 != null && gVar2.a()) {
                try {
                    this.f34698f.a(gVar2, this.f34696d.a());
                } catch (IllegalArgumentException | IllegalStateException e19) {
                    this.f34705m.add(new MFEVideoRecordingError(e19, MFEVideoRecordingError.Consequence.SkippedAudioFrame));
                }
                try {
                    this.f34696d.a(gVar2);
                } catch (IllegalStateException e23) {
                    this.f34705m.add(new MFEVideoRecordingError(e23, new MFEVideoRecordingError.Consequence[0]));
                }
            }
            if (gVar == null || !gVar.a()) {
                if (gVar2 == null || !gVar2.a()) {
                    return;
                }
            }
        }
    }

    @NonNull
    public List<MFEVideoRecordingError> c() {
        ArrayList arrayList;
        synchronized (this.f34705m) {
            arrayList = new ArrayList(this.f34705m);
            this.f34705m.clear();
        }
        return arrayList;
    }

    public long d() {
        return System.nanoTime() - this.f34700h;
    }

    public com.modiface.mfemakeupkit.c e() {
        return this.f34694b;
    }

    public void f() {
        this.f34699g.set(true);
        this.f34693a.b(new k(this));
    }

    public void h() {
        this.f34693a.a(new l(this));
    }

    public void i() {
        this.f34693a.b(new m(this));
        this.f34693a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        b();
        try {
            this.f34695c.i();
        } catch (IOException e13) {
            this.f34705m.add(new MFEVideoRecordingError(e13, MFEVideoRecordingError.Consequence.RecordingFailed));
        }
        if (this.f34704l) {
            if (this.f34697e.a()) {
                try {
                    this.f34696d.j();
                    this.f34696d.k();
                    return;
                } catch (MediaCodec.CryptoException | IOException | IllegalStateException e14) {
                    this.f34705m.add(new MFEVideoRecordingError(e14, MFEVideoRecordingError.Consequence.NoAudio));
                    return;
                }
            }
            this.f34705m.add(new MFEVideoRecordingError(new Throwable("audio recording failed to start"), MFEVideoRecordingError.Consequence.NoAudio));
        }
    }

    public void a(MFEGLFramebuffer mFEGLFramebuffer) {
        int i13;
        int i14;
        if (mFEGLFramebuffer == null || !mFEGLFramebuffer.isValid()) {
            i13 = 0;
            i14 = 0;
        } else {
            i13 = mFEGLFramebuffer.getWidth();
            i14 = mFEGLFramebuffer.getHeight();
        }
        Handler b13 = this.f34693a.b();
        if (b13 != null) {
            b13.sendMessage(Message.obtain(b13, 52, i13, i14));
        }
    }
}
