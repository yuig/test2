package x7;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import df.j1;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f134044a;

    /* renamed from: b, reason: collision with root package name */
    public final i f134045b;

    /* renamed from: c, reason: collision with root package name */
    public LoudnessCodecController f134046c;

    public j() {
        a.e eVar = i.f134043dp;
        this.f134044a = new HashSet();
        this.f134045b = eVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f134046c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            bf.b.t(this.f134044a.add(mediaCodec));
        }
    }

    public final void b() {
        this.f134044a.clear();
        LoudnessCodecController loudnessCodecController = this.f134046c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f134044a.remove(mediaCodec) || (loudnessCodecController = this.f134046c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i13) {
        LoudnessCodecController loudnessCodecController = this.f134046c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f134046c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i13, j1.M(), new h(this));
        this.f134046c = create;
        Iterator it = this.f134044a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
