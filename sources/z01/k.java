package z01;

import android.content.Context;
import android.net.Uri;
import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.vh;
import h32.g0;
import h32.i0;
import h32.u0;
import is1.z;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import u50.r;
import x02.i2;
import y01.q;
import y01.s;
import y01.t;
import y01.u;
import y01.v;
import y01.w;
import zy.d0;

/* loaded from: classes5.dex */
public final class k implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140562a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f140563b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f140564c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f140565d;

    /* renamed from: e, reason: collision with root package name */
    public Object f140566e;

    /* renamed from: f, reason: collision with root package name */
    public Object f140567f;

    /* renamed from: g, reason: collision with root package name */
    public Object f140568g;

    /* renamed from: h, reason: collision with root package name */
    public Object f140569h;

    public k(d0 pinalyticsSEP, px.c analyticsRepository, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f140563b = pinalyticsSEP;
        this.f140564c = analyticsRepository;
        this.f140565d = activeUserManager;
        this.f140566e = gx1.d.TOTAL_AUDIENCE;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        gx1.f fVar;
        Float f13;
        Float f14;
        int i13 = this.f140562a;
        Object obj = this.f140564c;
        Object obj2 = this.f140565d;
        Object obj3 = this.f140563b;
        switch (i13) {
            case 0:
                w request = (w) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request instanceof t)) {
                    if (!(request instanceof u)) {
                        if (!(request instanceof v)) {
                            if (!(request instanceof q)) {
                                if (!(request instanceof y01.p)) {
                                    if (!(request instanceof y01.r)) {
                                        if (request instanceof s) {
                                            ((a11.q) this.f140567f).a(((s) request).f136491a);
                                            break;
                                        }
                                    } else {
                                        kotlin.jvm.internal.j.z(scope, null, null, new h(this, ((y01.r) request).f136488a, eventIntake, null), 3);
                                        break;
                                    }
                                } else {
                                    Uri parse = Uri.parse(((y01.p) request).f136469a);
                                    ((rw0.f) obj3).getClass();
                                    rw0.f.b(parse);
                                    break;
                                }
                            } else {
                                f fVar2 = new f(this, eventIntake);
                                this.f140569h = fVar2;
                                ((m60.w) obj2).h(fVar2);
                                break;
                            }
                        } else {
                            z zVar = (z) this.f140568g;
                            if (zVar != null) {
                                zVar.b();
                            }
                            ((m60.w) obj2).j((m60.t) this.f140569h);
                            break;
                        }
                    } else {
                        z zVar2 = new z(((u) request).f136496a);
                        zVar2.a((Context) obj, tb0.p.CLOSEUP);
                        this.f140568g = zVar2;
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    ko2.f fVar3 = v0.f20219a;
                    kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new j(sb3, this, eventIntake, null), 2);
                    break;
                }
                break;
            case 1:
                hw1.t request2 = (hw1.t) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request2 instanceof hw1.o)) {
                    if (!(request2 instanceof hw1.n)) {
                        if (!(request2 instanceof hw1.r)) {
                            if (!(request2 instanceof hw1.s)) {
                                Intrinsics.d(request2, hw1.p.f70488a);
                                break;
                            } else {
                                hw1.s sVar = (hw1.s) request2;
                                this.f140567f = sVar.f70490a;
                                rx.d j13 = j(sVar.f70491b);
                                if (j13 != null) {
                                    k(scope, j13, eventIntake);
                                    break;
                                }
                            }
                        } else {
                            rx.d j14 = j(((hw1.r) request2).f70489a);
                            if (j14 != null) {
                                k(scope, j14, eventIntake);
                                break;
                            }
                        }
                    } else {
                        k(scope, ((hw1.n) request2).f70486a, eventIntake);
                        break;
                    }
                } else {
                    String str = ((hw1.o) request2).f70487a;
                    ko2.f fVar4 = v0.f20219a;
                    kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new iw1.c(this, str, eventIntake, null), 2);
                    break;
                }
                break;
            default:
                jx1.r request3 = (jx1.r) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request3 instanceof jx1.n)) {
                    if (!(request3 instanceof jx1.m)) {
                        if (request3 instanceof jx1.q) {
                            jx1.q qVar = (jx1.q) request3;
                            this.f140567f = qVar.f77694a;
                            this.f140568g = qVar.f77695b;
                            i0 context = ((d0) obj3).f143069f.f143096a;
                            gx1.d dVar = (gx1.d) this.f140569h;
                            gx1.d currentAudienceType = (gx1.d) this.f140566e;
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(currentAudienceType, "currentAudienceType");
                            g0 g0Var = g0.ANALYTICS_AUDIENCE_MOBILE_SECTION;
                            u0 u0Var = u0.INSIGHTS_AUDIENCE_SELECT_LIST;
                            HashMap hashMap = new HashMap();
                            if (dVar != null) {
                                hashMap.put("analytics_previous_value", dVar.getParamName());
                            }
                            hashMap.put("analytics_next_value", currentAudienceType.getParamName());
                            Unit unit = Unit.f80348a;
                            kg.o.G(context, g0Var, u0Var, hashMap);
                            gx1.f fVar5 = (gx1.f) this.f140567f;
                            if (fVar5 != null && (fVar = (gx1.f) this.f140568g) != null) {
                                gx1.d dVar2 = (gx1.d) this.f140566e;
                                gx1.f fVar6 = dVar2 == gx1.d.TOTAL_AUDIENCE ? fVar5 : fVar;
                                this.f140569h = dVar2;
                                float f15 = 0.0f;
                                float floatValue = (fVar5 == null || (f14 = fVar5.f66294c) == null) ? 0.0f : f14.floatValue();
                                gx1.f fVar7 = (gx1.f) this.f140567f;
                                boolean z13 = fVar7 != null ? fVar7.f66297f : false;
                                gx1.f fVar8 = (gx1.f) this.f140568g;
                                if (fVar8 != null && (f13 = fVar8.f66294c) != null) {
                                    f15 = f13.floatValue();
                                }
                                gx1.f fVar9 = (gx1.f) this.f140568g;
                                eventIntake.a(new jx1.h(new gx1.e(Float.valueOf(floatValue), Float.valueOf(f15), fVar6, z13, fVar9 != null ? fVar9.f66297f : false, (fVar6.f66300i.f88472b.isEmpty() ^ true) && yb2.a.b(((b60.d) ((b60.b) obj2)).f()), dVar2)));
                                break;
                            }
                        }
                    } else {
                        b60.b bVar = (b60.b) obj2;
                        String userId = com.bumptech.glide.d.Q(bVar).getUid();
                        Intrinsics.checkNotNullExpressionValue(userId, "getUid(...)");
                        px.c cVar = (px.c) ((px.a) obj);
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(userId, "userId");
                        uj2.h s13 = cVar.g(userId).s();
                        Intrinsics.checkNotNullExpressionValue(s13, "toFlowable(...)");
                        io2.a[] aVarArr = io2.j.f73346a;
                        io2.i iVar = new io2.i(s13);
                        String userId2 = com.bumptech.glide.d.Q(bVar).getUid();
                        Intrinsics.checkNotNullExpressionValue(userId2, "getUid(...)");
                        Intrinsics.checkNotNullParameter(userId2, "userId");
                        uj2.h s14 = cVar.b(userId2).s();
                        Intrinsics.checkNotNullExpressionValue(s14, "toFlowable(...)");
                        io2.i iVar2 = new io2.i(s14);
                        this.f140566e = ((jx1.m) request3).f77691a;
                        ko2.f fVar10 = v0.f20219a;
                        kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new kx1.d(iVar, iVar2, eventIntake, null), 2);
                        break;
                    }
                } else {
                    ((d0) obj3).e(scope, ((jx1.n) request3).f77692a, eventIntake);
                    break;
                }
                break;
        }
    }

    public final rx.d j(String str) {
        vh vhVar = (vh) this.f140566e;
        if (vhVar != null) {
            return ph.a.Y(kh2.j.t2(((yx.c) this.f140569h).c(), true), str, ph.a.u(vhVar, (ww1.c) this.f140567f), (ww1.c) this.f140567f);
        }
        return null;
    }

    public final void k(j0 j0Var, rx.d dVar, r rVar) {
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(j0Var, ko2.e.f80326c, null, new iw1.b(this, dVar, rVar, null), 2);
    }

    public k(d0 pinalyticsSEP, px.c analyticsRepository, b60.b activeUserManager, yx.b filterRepositoryFactory, gw1.h productTagAdapterFactory) {
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(filterRepositoryFactory, "filterRepositoryFactory");
        Intrinsics.checkNotNullParameter(productTagAdapterFactory, "productTagAdapterFactory");
        this.f140563b = pinalyticsSEP;
        this.f140564c = analyticsRepository;
        this.f140565d = productTagAdapterFactory;
        this.f140567f = ww1.c.PRODUCT_TAG_IMPRESSION;
        this.f140568g = xk2.m.b(iw1.d.f73771i);
        this.f140569h = ((so.u0) filterRepositoryFactory).a(zx.a.FILTER_PIN_STATS, yb2.a.b(((b60.d) activeUserManager).f()));
    }

    public k(rw0.f mediaGalleryUtils, Context activityContext, m60.w eventManager, i2 pinRepository, a11.q closeupSendShareUtils) {
        Intrinsics.checkNotNullParameter(mediaGalleryUtils, "mediaGalleryUtils");
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(closeupSendShareUtils, "closeupSendShareUtils");
        this.f140563b = mediaGalleryUtils;
        this.f140564c = activityContext;
        this.f140565d = eventManager;
        this.f140566e = pinRepository;
        this.f140567f = closeupSendShareUtils;
    }
}
