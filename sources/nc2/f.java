package nc2;

import ac2.p1;
import com.pinterest.video.view.BaseVideoView;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f90401a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f90402b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f90403c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f90404d;

    public f() {
        ac2.f videoManagerUtils = ac2.f.f1945a;
        Intrinsics.checkNotNullParameter(videoManagerUtils, "videoManagerUtils");
        this.f90401a = videoManagerUtils;
        this.f90402b = new LinkedHashMap();
        this.f90403c = new LinkedHashMap();
        this.f90404d = new LinkedHashMap();
    }

    public static void b(oc2.i videoView) {
        String str;
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        BaseVideoView baseVideoView = (BaseVideoView) videoView;
        if (baseVideoView.K.getShouldAutoplay()) {
            videoView.play();
            return;
        }
        h hVar = h.f90405a;
        bc2.k kVar = baseVideoView.L;
        if (kVar == null || (str = kVar.f22657a) == null) {
            return;
        }
        com.bumptech.glide.d.t0(str, new ha2.j(videoView, 21));
    }

    public final boolean a(oc2.i videoView) {
        bc2.k kVar;
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        BaseVideoView baseVideoView = (BaseVideoView) videoView;
        if ((baseVideoView.K.getShouldCheckNetwork() && !((ac2.f) this.f90401a).c()) || (kVar = baseVideoView.L) == null) {
            return false;
        }
        if (baseVideoView.K.getShouldBePlayable()) {
            return true;
        }
        boolean isPromoted = kVar.f22661e.f22679h.isPromoted();
        List list = (List) (isPromoted ? this.f90404d : this.f90403c).get(Integer.valueOf(baseVideoView.S));
        if (list == null) {
            return true;
        }
        return list.size() < (isPromoted ? 3 : 1) || list.contains(kVar.f22657a);
    }
}
