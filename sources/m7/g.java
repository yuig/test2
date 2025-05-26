package m7;

import a.cb;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ok.g0 f86155a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f86156b;

    /* renamed from: c, reason: collision with root package name */
    public f f86157c;

    /* renamed from: d, reason: collision with root package name */
    public a7.f f86158d;

    /* renamed from: f, reason: collision with root package name */
    public int f86160f;

    /* renamed from: h, reason: collision with root package name */
    public b7.b f86162h;

    /* renamed from: g, reason: collision with root package name */
    public float f86161g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f86159e = 0;

    public g(Context context, Looper looper, f fVar) {
        this.f86155a = ao2.m0.Z(new e(context, 0));
        this.f86157c = fVar;
        this.f86156b = new Handler(looper);
    }

    public static int b(a7.f fVar) {
        if (fVar == null) {
            return 0;
        }
        int i13 = fVar.f990c;
        switch (i13) {
            case 0:
                d7.u.g("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (fVar.f988a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                d7.u.g("AudioFocusManager", "Unidentified audio usage: " + i13);
                return 0;
            case 16:
                return 4;
        }
    }

    public final void a() {
        int i13 = this.f86159e;
        if (i13 == 1 || i13 == 0 || this.f86162h == null) {
            return;
        }
        b7.c.i((AudioManager) this.f86155a.get(), this.f86162h);
    }

    public final void c(int i13) {
        f fVar = this.f86157c;
        if (fVar != null) {
            ((u0) fVar).f86417h.a(33, i13, 0).b();
        }
    }

    public final void d(int i13) {
        if (this.f86159e == i13) {
            return;
        }
        this.f86159e = i13;
        float f13 = i13 == 4 ? 0.2f : 1.0f;
        if (this.f86161g == f13) {
            return;
        }
        this.f86161g = f13;
        f fVar = this.f86157c;
        if (fVar != null) {
            ((u0) fVar).t0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [m7.d] */
    public final int e(int i13, boolean z13) {
        int i14;
        int requestAudioFocus;
        int i15 = 0;
        if (i13 == 1 || (i14 = this.f86160f) != 1) {
            a();
            d(0);
            return 1;
        }
        if (!z13) {
            int i16 = this.f86159e;
            if (i16 != 1) {
                return i16 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f86159e == 2) {
            return 1;
        }
        b7.b bVar = this.f86162h;
        if (bVar == null) {
            v.f1 f1Var = bVar == null ? new v.f1(i14) : bVar.a();
            a7.f fVar = this.f86158d;
            boolean z14 = fVar != null && fVar.f988a == 1;
            fVar.getClass();
            f1Var.f123453f = fVar;
            f1Var.f123450c = z14;
            f1Var.c(new AudioManager.OnAudioFocusChangeListener() { // from class: m7.d
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i17) {
                    g gVar = g.this;
                    gVar.getClass();
                    if (i17 == -3 || i17 == -2) {
                        if (i17 != -2) {
                            a7.f fVar2 = gVar.f86158d;
                            if (!(fVar2 != null && fVar2.f988a == 1)) {
                                gVar.d(4);
                                return;
                            }
                        }
                        gVar.c(0);
                        gVar.d(3);
                        return;
                    }
                    if (i17 == -1) {
                        gVar.c(-1);
                        gVar.a();
                        gVar.d(1);
                    } else if (i17 != 1) {
                        cb.t("Unknown focus change type: ", i17, "AudioFocusManager");
                    } else {
                        gVar.d(2);
                        gVar.c(1);
                    }
                }
            }, this.f86156b);
            this.f86162h = f1Var.a();
        }
        AudioManager audioManager = (AudioManager) this.f86155a.get();
        b7.b bVar2 = this.f86162h;
        if (d7.n0.f53866a >= 26) {
            AudioFocusRequest audioFocusRequest = bVar2.f22026f;
            audioFocusRequest.getClass();
            requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
        } else {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = bVar2.f22022b;
            a7.f fVar2 = bVar2.f22024d;
            if ((fVar2.f989b & 1) != 1) {
                switch (fVar2.f990c) {
                    case 2:
                        break;
                    case 3:
                        i15 = 8;
                        break;
                    case 4:
                        i15 = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i15 = 5;
                        break;
                    case 6:
                        i15 = 2;
                        break;
                    case 11:
                        i15 = 10;
                        break;
                    case 12:
                    default:
                        i15 = 3;
                        break;
                    case 13:
                        break;
                }
                requestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener, i15, bVar2.f22021a);
            }
            i15 = 1;
            requestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener, i15, bVar2.f22021a);
        }
        if (requestAudioFocus == 1) {
            d(2);
            return 1;
        }
        d(1);
        return -1;
    }
}
