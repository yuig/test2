package f00;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import e10.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lb.l0;
import lb0.m;
import so.oa;
import tb0.p;
import xk2.v;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60749b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f60748a = i13;
        this.f60749b = obj;
    }

    @Override // ak2.a
    public final void run() {
        switch (this.f60748a) {
            case 0:
                ((ak2.e) this.f60749b).accept(0);
                return;
            case 1:
                j this$0 = (j) this.f60749b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f56794f.F("GraphQLLogger stream should not close.", p.PLATFORM, new Object[0]);
                return;
            case 2:
                m this$02 = (m) this.f60749b;
                v vVar = m.f82718d;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.f82719a.commit();
                return;
            case 3:
                j0 configuration = (j0) this.f60749b;
                Intrinsics.checkNotNullParameter(configuration, "$configuration");
                Object obj = configuration.f80434a;
                if (obj != null) {
                    return;
                } else {
                    Intrinsics.r("configuration");
                    throw null;
                }
            default:
                cc2.b this$03 = (cc2.b) this.f60749b;
                boolean z13 = cc2.b.C;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Context context = this$03.f27482a;
                Intrinsics.checkNotNullParameter(context, "context");
                nc2.d dVar = (nc2.d) ((bc2.b) ((oa) ((bc2.a) l0.k0(context.getApplicationContext(), bc2.a.class))).D7.get());
                synchronized (dVar) {
                    vb0.j.f125466a.O("DeviceMediaCodecs", p.VIDEO_PLAYER);
                    if (!dVar.f90394d) {
                        try {
                            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                            Intrinsics.f(codecInfos);
                            dVar.f90392b = nc2.d.a(codecInfos, "video/avc");
                            dVar.f90393c = nc2.d.a(codecInfos, "video/hevc");
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                }
                cc2.b.D = Long.valueOf(((Number) ly1.d.f85159c.getValue()).intValue() * 1000);
                cc2.b.E = (String) ly1.c.f85155a.getValue();
                cc2.b.F = ((Number) ly1.c.f85156b.getValue()).intValue();
                cc2.b.G = (short) ((Number) this$03.f27498q.f81582e.getValue()).intValue();
                return;
        }
    }
}
