package h80;

import androidx.lifecycle.z;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.PinFeed;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import df.j1;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mq.u;
import uj2.b0;
import zp.n0;

/* loaded from: classes5.dex */
public final class h implements h01.b, os.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nl1.d f68090b;

    public /* synthetic */ h(nl1.d dVar, int i13) {
        this.f68089a = i13;
        this.f68090b = dVar;
    }

    @Override // h01.b
    public void T5() {
        switch (this.f68089a) {
            case 0:
                ((l) this.f68090b).f68105j0 = true;
                break;
        }
    }

    public void a() {
        Feed feed;
        String s13;
        Feed feed2;
        op.b bVar;
        Feed feed3;
        int i13 = this.f68089a;
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        nl1.d dVar = this.f68090b;
        switch (i13) {
            case 0:
                qp.k kVar = (qp.k) dVar;
                op.b bVar2 = kVar.f104694c0;
                if (bVar2 != null) {
                    if (bVar2.getCount() != 0 || (bVar = kVar.f104694c0) == null || (feed3 = bVar.f97490a) == null || !(!j1.d1(feed3.f105383c))) {
                        op.b bVar3 = kVar.f104694c0;
                        if (bVar3 != null && (feed2 = bVar3.f97490a) != null) {
                            String url = feed2.f35558j;
                            int r03 = j1.r0(hf0.b.q());
                            String.valueOf(r03 * 6);
                            String valueOf = String.valueOf(r03 * 12);
                            String valueOf2 = String.valueOf(r03 * 25);
                            Intrinsics.f(url);
                            if (url.length() > 0) {
                                Intrinsics.checkNotNullParameter(url, "url");
                                qb0.e eVar = qb0.d.f103396a;
                                String a13 = qb0.e.a(url);
                                if (sh.f.f112909d == null) {
                                    Intrinsics.r("device");
                                    throw null;
                                }
                                int r04 = j1.r0(hf0.b.q());
                                String valueOf3 = String.valueOf(r04 * 6);
                                String.valueOf(r04 * 12);
                                String.valueOf(r04 * 25);
                                if (Intrinsics.d(a13, valueOf3)) {
                                    url = qb0.e.f(url, "page_size", valueOf);
                                } else {
                                    Intrinsics.checkNotNullParameter(url, "url");
                                    String a14 = qb0.e.a(url);
                                    if (sh.f.f112909d == null) {
                                        Intrinsics.r("device");
                                        throw null;
                                    }
                                    int r05 = j1.r0(hf0.b.q());
                                    String.valueOf(r05 * 6);
                                    String valueOf4 = String.valueOf(r05 * 12);
                                    String.valueOf(r05 * 25);
                                    if (Intrinsics.d(a14, valueOf4)) {
                                        url = qb0.e.f(url, "page_size", valueOf2);
                                    }
                                }
                                feed2.f35558j = url;
                            }
                        }
                        op.b bVar4 = kVar.f104694c0;
                        if (bVar4 == null || (feed = bVar4.f97490a) == null || (s13 = feed.s()) == null) {
                            return;
                        }
                        try {
                            z12.d dVar2 = kVar.f104716y0;
                            if (dVar2 == null) {
                                Intrinsics.r("pinnableImageFeedPagingService");
                                throw null;
                            }
                            b0<PinnableImageFeed> a15 = dVar2.a(s13);
                            jp.d dVar3 = new jp.d(20, new qp.f(kVar, i16));
                            a15.getClass();
                            kk2.g gVar = new kk2.g(a15, dVar3, 2);
                            Intrinsics.checkNotNullExpressionValue(gVar, "doOnSubscribe(...)");
                            nl.b.q(gVar, new qp.f(kVar, i15), new qp.f(kVar, i14));
                            return;
                        } catch (Exception unused) {
                            Unit unit = Unit.f80348a;
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                u uVar = (u) dVar;
                int i17 = u.P0;
                kq.c cVar = (kq.c) uVar.Y;
                if (cVar != null) {
                    if (!uVar.i8()) {
                        cVar.f80634s = false;
                        return;
                    }
                    PinFeed pinFeed = uVar.f88019g0;
                    String s14 = pinFeed != null ? pinFeed.s() : null;
                    if (s14 == null) {
                        cVar.f80634s = false;
                        return;
                    }
                    if (uVar.h8()) {
                        z viewLifecycleOwner = uVar.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new mq.i(cVar, uVar, s14, null), 3);
                        return;
                    }
                    try {
                        se2.a aVar = uVar.A0;
                        if (aVar == null) {
                            Intrinsics.r("pinFeedPagingServiceV2");
                            throw null;
                        }
                        b0<PinFeed> a16 = ((z12.c) ((bf2.b) aVar).get()).a(s14);
                        n0 n0Var = new n0(21, new kq.b(cVar, i15));
                        a16.getClass();
                        t l13 = new kk2.g(a16, n0Var, 2).r(tk2.e.f118017c).l(wj2.c.a());
                        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
                        nl.b.t(l13, new ba.s(16, uVar, cVar), null, 2);
                        return;
                    } catch (Exception e13) {
                        uVar.j8("Swipe and load more pins from API is not working", e13);
                        cVar.f80634s = false;
                        return;
                    }
                }
                return;
        }
    }

    @Override // h01.b
    public void a2() {
        switch (this.f68089a) {
            case 0:
                break;
            default:
                iz0.n nVar = (iz0.n) this.f68090b;
                int i13 = iz0.n.Y0;
                nVar.k9().f73913f.e().a(iz0.c.f73899a);
                break;
        }
    }
}
