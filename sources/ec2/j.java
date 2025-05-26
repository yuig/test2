package ec2;

import a11.p;
import a7.d0;
import a7.i0;
import ac2.m0;
import ac2.v;
import ac2.w;
import android.content.Context;
import androidx.media3.common.PlaybackException;
import com.pinterest.video.core.view.PinterestVideoView;
import ey.j3;
import ey.v2;
import ey.x2;
import ey.z2;
import g8.a0;
import i2.a2;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.c0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.u;

/* loaded from: classes2.dex */
public final class j extends ic2.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PinterestVideoView f58455c;

    public j(PinterestVideoView pinterestVideoView) {
        this.f58455c = pinterestVideoView;
    }

    @Override // n7.c
    public final void E(n7.b eventTime, i0 i0Var, int i13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        if (i13 != 0 || i0Var == null) {
            return;
        }
        d0 d0Var = i0Var.f1073b;
        Object obj = d0Var != null ? d0Var.f975g : null;
        if (obj instanceof hc2.j) {
            hc2.j jVar = (hc2.j) obj;
            int i14 = jVar.f68766d;
            if (i14 > 0) {
                jVar.a(i14 - 1);
            } else if (i14 == 0) {
                this.f58455c.O(false);
            }
        }
    }

    @Override // n7.c
    public final void F(n7.b eventTime, PlaybackException error) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(error, "error");
        PinterestVideoView pinterestVideoView = this.f58455c;
        bc2.k kVar = pinterestVideoView.L;
        if (error.f18745a < 1000 || kVar == null || !((Boolean) pinterestVideoView.P0.getValue()).booleanValue()) {
            if (!c0.y(PinterestVideoView.f52749c1, Integer.valueOf(error.f18745a)) || kVar == null) {
                return;
            }
            tk2.e.f118017c.b(new p(28, kVar, pinterestVideoView));
            return;
        }
        String str = kVar.f22663g;
        String b13 = m0.b(str);
        v vVar = w.f2066a;
        Context context = pinterestVideoView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        h7.w wVar = (h7.w) w.b(context);
        wVar.o(str);
        if (b13 != null) {
            HashSet j13 = wVar.j();
            Intrinsics.checkNotNullExpressionValue(j13, "getKeys(...)");
            Iterator it = j13.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (StringsKt.E(str2, b13, true)) {
                    wVar.o(str2);
                }
            }
        }
    }

    @Override // n7.c
    public final void L(n7.b eventTime, g8.v loadEventInfo, a0 mediaLoadData, IOException error, boolean z13) {
        bc2.k kVar;
        String pinUid;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        Intrinsics.checkNotNullParameter(error, "error");
        if (!z13 || (kVar = this.f58455c.L) == null || (pinUid = kVar.f22657a) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        new ty.b(pinUid, 1, 0).i();
    }

    @Override // ic2.d
    public final void j(n7.b eventTime, boolean z13, int i13) {
        boolean z14;
        bc2.k kVar;
        String pinUid;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        if (((Boolean) PinterestVideoView.f52750d1.getValue()).booleanValue() && z13 && i13 == 3) {
            m60.w wVar = u.f85943a;
            Boolean bool = Boolean.FALSE;
            Long f13 = ep.b.f(1000L);
            j3 j3Var = j3.f60510a;
            wVar.d(new a2(f0.l(new re2.j(Long.valueOf(j3.a()), "video_starts_playing", null, null, null, null, bool, f13, null, null)), 10));
        }
        PinterestVideoView pinterestVideoView = this.f58455c;
        if (z13) {
            pinterestVideoView.getClass();
            if (pinterestVideoView.O.isVisible(pinterestVideoView.N)) {
                z14 = true;
                kVar = pinterestVideoView.L;
                if (kVar != null || (pinUid = kVar.f22657a) == null) {
                }
                if (i13 == 2) {
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new ty.c(pinUid, 1, 0).i();
                    if (!pinterestVideoView.L0) {
                        new v2(kVar.f22657a, kVar.f22663g, kVar.f22661e.f22678g, kVar.f22659c, kVar.f22660d).i();
                        pinterestVideoView.L0 = true;
                    }
                }
                if (z14) {
                    new ty.g(pinUid).i();
                }
                if (i13 == 3) {
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new ty.d(pinUid, 1, 0).i();
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new z2(pinUid, 1).i();
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new x2(pinUid, 0).i();
                    if (pinterestVideoView.M0) {
                        return;
                    }
                    pinterestVideoView.M0 = true;
                    if (!ao2.m0.f20172b || ao2.m0.K()) {
                        pinterestVideoView.o0().d(new ky.b());
                        return;
                    } else {
                        pinterestVideoView.o0().d(new my.l());
                        return;
                    }
                }
                return;
            }
        }
        z14 = false;
        kVar = pinterestVideoView.L;
        if (kVar != null) {
        }
    }

    @Override // n7.c
    public final void t(n7.b eventTime, g8.v loadEventInfo, a0 mediaLoadData) {
        String pinUid;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        bc2.k kVar = this.f58455c.L;
        if (kVar == null || (pinUid = kVar.f22657a) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        new ty.a(pinUid, 1, 0).i();
    }

    @Override // n7.c
    public final void v(n7.b eventTime, Object output) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(output, "output");
        this.f58455c.U(true);
    }
}
