package a1;

import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.r;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a implements c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f229d;

    /* renamed from: a, reason: collision with root package name */
    public final c1 f230a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f231b;

    /* renamed from: c, reason: collision with root package name */
    public final r f232c;

    static {
        HashMap hashMap = new HashMap();
        f229d = hashMap;
        hashMap.put(1, r0.r.f105634f);
        hashMap.put(8, r0.r.f105632d);
        hashMap.put(6, r0.r.f105631c);
        hashMap.put(5, r0.r.f105630b);
        hashMap.put(4, r0.r.f105629a);
        hashMap.put(0, r0.r.f105633e);
    }

    public a(androidx.appcompat.app.d dVar, h0 h0Var, r rVar) {
        this.f230a = dVar;
        this.f231b = h0Var;
        this.f232c = rVar;
    }

    @Override // androidx.camera.core.impl.c1
    public final boolean b(int i13) {
        if (this.f230a.b(i13)) {
            r0.r rVar = (r0.r) f229d.get(Integer.valueOf(i13));
            if (rVar != null) {
                Iterator it = this.f232c.c(VideoQualityQuirk.class).iterator();
                while (it.hasNext()) {
                    VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
                    if (videoQualityQuirk == null || !videoQualityQuirk.b(this.f231b, rVar) || ((videoQualityQuirk instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) videoQualityQuirk).d())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.c1
    public final d1 k(int i13) {
        if (b(i13)) {
            return this.f230a.k(i13);
        }
        return null;
    }
}
