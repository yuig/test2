package k8;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import d7.n0;
import java.util.Objects;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements ok.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f78504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f78505b;

    public /* synthetic */ e(q qVar, j jVar) {
        this.f78504a = qVar;
        this.f78505b = jVar;
    }

    @Override // ok.w
    public final boolean apply(Object obj) {
        int i13;
        m7.c cVar;
        boolean isAvailable;
        boolean isEnabled;
        boolean canBeSpatialized;
        m7.c cVar2;
        androidx.media3.common.b bVar = (androidx.media3.common.b) obj;
        q qVar = this.f78504a;
        qVar.getClass();
        if (this.f78505b.Q && (i13 = bVar.E) != -1 && i13 > 2 && (!q.p(bVar) || (n0.f53866a >= 32 && (cVar2 = qVar.f78570g) != null && cVar2.f86115b))) {
            if (n0.f53866a >= 32 && (cVar = qVar.f78570g) != null && cVar.f86115b) {
                Spatializer spatializer = (Spatializer) cVar.f86116c;
                spatializer.getClass();
                isAvailable = k.a(spatializer).isAvailable();
                if (isAvailable) {
                    Spatializer spatializer2 = (Spatializer) qVar.f78570g.f86116c;
                    spatializer2.getClass();
                    isEnabled = k.a(spatializer2).isEnabled();
                    if (isEnabled) {
                        m7.c cVar3 = qVar.f78570g;
                        a7.f fVar = qVar.f78571h;
                        cVar3.getClass();
                        String str = bVar.f18765o;
                        boolean equals = Objects.equals(str, "audio/eac3-joc");
                        int i14 = bVar.E;
                        if (equals) {
                            if (i14 == 16) {
                                i14 = 12;
                            }
                        } else if (Objects.equals(str, "audio/iamf")) {
                            if (i14 == -1) {
                                i14 = 6;
                            }
                        } else if (Objects.equals(str, "audio/ac4") && (i14 == 18 || i14 == 21)) {
                            i14 = 24;
                        }
                        int t13 = n0.t(i14);
                        if (t13 != 0) {
                            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t13);
                            int i15 = bVar.F;
                            if (i15 != -1) {
                                channelMask.setSampleRate(i15);
                            }
                            Spatializer spatializer3 = (Spatializer) cVar3.f86116c;
                            spatializer3.getClass();
                            canBeSpatialized = k.a(spatializer3).canBeSpatialized((AudioAttributes) fVar.a().f66449b, channelMask.build());
                            if (canBeSpatialized) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
