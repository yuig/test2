package co0;

import android.content.Context;
import android.widget.TextView;
import ao2.m;
import bc2.q;
import bi1.b0;
import bi1.h;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hx;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import di1.g;
import fk2.x;
import h32.a4;
import h32.d4;
import h32.i0;
import hk2.u;
import i92.k;
import java.util.ArrayList;
import java.util.List;
import kh2.c3;
import kh2.j;
import kotlin.Pair;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.x0;
import oc2.i;
import uj2.d0;
import uj2.l;
import x02.z0;
import xk2.s;
import zp.y0;

/* loaded from: classes5.dex */
public final class c implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28275b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f28274a = i13;
        this.f28275b = obj;
    }

    public final void a(f30 pin) {
        ArrayList arrayList;
        TextView textView;
        int i13;
        int i14 = this.f28274a;
        Object obj = this.f28275b;
        ArrayList arrayList2 = null;
        switch (i14) {
            case 1:
                Intrinsics.checkNotNullParameter(pin, "pin");
                ai1.a aVar = (ai1.a) obj;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                aVar.f15245j = pin;
                q videoTracks = dl2.b.S0(pin, null);
                if (videoTracks == null) {
                    g gVar = (g) ((zh1.a) aVar.getView());
                    gVar.getClass();
                    String message = aVar.f15237b;
                    Intrinsics.checkNotNullParameter(message, "message");
                    k kVar = gVar.f55065n0;
                    if (kVar != null) {
                        kVar.b(message);
                        return;
                    } else {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                }
                zh1.a aVar2 = (zh1.a) aVar.getView();
                boolean C0 = b40.C0(pin);
                List B = b40.B(pin);
                if (B != null) {
                    List<hx> list = B;
                    arrayList = new ArrayList(g0.q(list, 10));
                    for (hx hxVar : list) {
                        String g13 = hxVar.g();
                        Intrinsics.checkNotNullExpressionValue(g13, "getArtist(...)");
                        String l13 = hxVar.l();
                        Intrinsics.checkNotNullExpressionValue(l13, "getTitle(...)");
                        arrayList.add(new tp0.a(g13, l13));
                    }
                } else {
                    arrayList = null;
                }
                g gVar2 = (g) aVar2;
                gVar2.getClass();
                String uid = aVar.f15236a;
                Intrinsics.checkNotNullParameter(uid, "pinId");
                Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
                PinterestVideoView b83 = gVar2.b8();
                b83.h0(qc2.c.FullyVisible);
                b83.A(true);
                b83.t0(C0);
                SimplePlayerControlView simplePlayerControlView = b83.F;
                if (simplePlayerControlView != null && (textView = (TextView) simplePlayerControlView.findViewById(t0.music_attribution)) != null) {
                    Context context = b83.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    String E = c3.E(context, arrayList, C0);
                    boolean z13 = E.length() > 0;
                    textView.setVisibility(z13 ? 0 : 8);
                    if (z13) {
                        textView.setCompoundDrawables(C0 ? gVar2.f55064m0 : gVar2.f55063l0, null, null, null);
                        textView.setText(E);
                        i13 = 1;
                        textView.setSelected(true);
                    } else {
                        i13 = 1;
                    }
                    if (!C0 && arrayList != null && arrayList.size() > i13) {
                        textView.setOnClickListener(new y0(gVar2, b83, uid, 25));
                    }
                }
                i0 p13 = gVar2.s7().p();
                d4 d4Var = p13 != null ? p13.f67081a : null;
                a4 a4Var = p13 != null ? p13.f67082b : null;
                Intrinsics.checkNotNullParameter(uid, "uid");
                Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
                i.g(b83, new bc2.k(uid, videoTracks.a(), d4Var, a4Var, videoTracks, null), new ec2.g(0, videoTracks.f22673b.f22670g, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL), 4);
                nx.d0 d0Var = aVar.getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                String uid2 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                Boolean p63 = pin.p6();
                Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
                c3.g0(d0Var, uid2, p63.booleanValue(), null, null);
                return;
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                q S0 = dl2.b.S0(pin, null);
                if (S0 != null) {
                    l82.c e13 = ((b0) obj).f22835f.e();
                    S0.f22680i = 49;
                    boolean C02 = b40.C0(pin);
                    Boolean p64 = pin.p6();
                    Intrinsics.checkNotNullExpressionValue(p64, "getShouldMute(...)");
                    boolean booleanValue = p64.booleanValue();
                    List B2 = b40.B(pin);
                    if (B2 != null) {
                        List<hx> list2 = B2;
                        arrayList2 = new ArrayList(g0.q(list2, 10));
                        for (hx hxVar2 : list2) {
                            String g14 = hxVar2.g();
                            Intrinsics.checkNotNullExpressionValue(g14, "getArtist(...)");
                            String l14 = hxVar2.l();
                            Intrinsics.checkNotNullExpressionValue(l14, "getTitle(...)");
                            arrayList2.add(new tp0.a(g14, l14));
                        }
                    }
                    e13.a(new h(S0, C02, booleanValue, arrayList2));
                    return;
                }
                return;
        }
    }

    @Override // uj2.d0
    public final void b(xj2.c d2) {
        int i13 = this.f28274a;
        Object obj = this.f28275b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((d) obj).addDisposable(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "disposable");
                ((ai1.a) obj).addDisposable(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                break;
            default:
                j.A((m) obj, d2);
                break;
        }
    }

    @Override // uj2.d0
    public final void onError(Throwable e13) {
        int i13 = this.f28274a;
        Object obj = this.f28275b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                d dVar = (d) obj;
                dVar.f28279d.i(((yk1.a) dVar.f28280e).f139224a.getString(x0.generic_error));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(e13, "throwable");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(e13, "e");
                break;
            default:
                xk2.q qVar = s.f135225b;
                ((m) obj).resumeWith(ue.c.m(e13));
                break;
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        int i13 = this.f28274a;
        Object obj2 = this.f28275b;
        switch (i13) {
            case 0:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "pair");
                d dVar = (d) obj2;
                z0 z0Var = dVar.f28277b;
                ba sourceSection = (ba) pair.f80346a;
                ba destinationSection = (ba) pair.f80347b;
                z0Var.getClass();
                Intrinsics.checkNotNullParameter(sourceSection, "sourceSection");
                Intrinsics.checkNotNullParameter(destinationSection, "destinationSection");
                String uid = sourceSection.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                String uid2 = destinationSection.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                l G = z0Var.G(new j12.d(uid2, uid), destinationSection);
                G.getClass();
                x e13 = new u(G).e(new xo.c((Object) z0Var, (Object) sourceSection, uid, 19));
                Intrinsics.checkNotNullExpressionValue(e13, "doOnComplete(...)");
                e13.i(new fp.a(10, dVar, pair), new tn0.a(24, new sk0.x(20, this, dVar)));
                break;
            case 1:
                a((f30) obj);
                break;
            case 2:
                a((f30) obj);
                break;
            default:
                xk2.q qVar = s.f135225b;
                ((m) obj2).resumeWith(obj);
                break;
        }
    }
}
