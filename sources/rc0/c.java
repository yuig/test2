package rc0;

import android.content.Context;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import df.j1;
import h32.f1;
import h32.h2;
import h32.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107279i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f107280j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f107281k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f107282l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f107283m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f107284n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f107285o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f107286p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f107287q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Long l13, String str, sf1.s sVar, hh1.s sVar2, hh1.l lVar, boolean z13, hh1.m mVar, String str2) {
        super(1);
        this.f107282l = l13;
        this.f107280j = str;
        this.f107283m = sVar;
        this.f107284n = sVar2;
        this.f107285o = lVar;
        this.f107281k = z13;
        this.f107286p = mVar;
        this.f107287q = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f107287q;
        int i13 = this.f107279i;
        Object obj3 = this.f107286p;
        Object obj4 = this.f107285o;
        Object obj5 = this.f107284n;
        Object obj6 = this.f107283m;
        Object obj7 = this.f107282l;
        switch (i13) {
            case 0:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                CharSequence a03 = j1.a0(context.getString(oc0.q.component_banner_overlay_state_message));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return new GestaltBannerOverlay(context, kg.t.p((u50.i0) obj7, bs1.c.h2(a03), (u50.i0) obj6, (u50.i0) obj5, (rm1.q) obj4, (rm1.c) obj3, this.f107280j, (Boolean) obj2, this.f107281k, 6656));
            default:
                sp0.d tapPosition = (sp0.d) obj;
                Intrinsics.checkNotNullParameter(tapPosition, "tapPosition");
                Long l13 = (Long) obj7;
                String pinId = String.valueOf(l13);
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                String parentPinId = this.f107280j;
                Intrinsics.checkNotNullParameter(parentPinId, "parentPinId");
                qf1.y d03 = kg.p.d0(h32.u0.PIN_STORY_PIN_PRODUCT, new uq.j(pinId, parentPinId, 8));
                qf1.x xVar = new qf1.x(d03, qf1.y.a(d03, null, h32.u0.PIN_STORY_PIN_PRODUCT_TOOLTIP, 5));
                sf1.s sVar = (sf1.s) obj6;
                boolean z13 = !Intrinsics.d(sVar.f112704k, "board");
                if (z13) {
                    nx.d0 d0Var = sVar.f112698e;
                    z1 pinImpression = new z1(l13, Long.valueOf(System.currentTimeMillis()), null, null, null, null, null, null, null, h2.PRODUCT_TAG, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    if (d0Var != null) {
                        f1 f1Var = f1.PIN_IMPRESSION_ONE_PIXEL;
                        String valueOf = String.valueOf(l13);
                        Boolean bool = Boolean.FALSE;
                        d0Var.u(f1Var, valueOf, new h32.c1(null, bool, kotlin.collections.e0.b(pinImpression), Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false);
                    }
                    nx.o0 o0Var = nx.o0.f92437i;
                    o0Var.getClass();
                    Intrinsics.checkNotNullParameter(pinImpression, "pinImpression");
                    o0Var.h(pinImpression);
                }
                hh1.l lVar = (hh1.l) obj4;
                sVar.m(tapPosition, (hh1.s) obj5, lVar, this.f107281k, xVar, new sf1.r(sVar, xVar, lVar, l13, this.f107280j, (String) obj2, z13), (hh1.m) obj3);
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u50.i0 i0Var, u50.i0 i0Var2, u50.i0 i0Var3, rm1.c cVar, rm1.q qVar, Boolean bool, String str, boolean z13) {
        super(1);
        this.f107282l = i0Var;
        this.f107283m = i0Var2;
        this.f107284n = i0Var3;
        this.f107285o = qVar;
        this.f107286p = cVar;
        this.f107280j = str;
        this.f107287q = bool;
        this.f107281k = z13;
    }
}
