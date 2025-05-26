package qf1;

import ac2.p1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fo0;
import com.pinterest.api.model.gm0;
import com.pinterest.api.model.kp0;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.sm0;
import com.pinterest.api.model.vg;
import com.pinterest.api.model.vq0;
import com.pinterest.api.model.wp0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kh2.j1;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import ni1.d1;
import ni1.x1;

/* loaded from: classes5.dex */
public final class b0 extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f103643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f103644c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Unit unit, int i13) {
        super(unit);
        this.f103643b = i13;
        this.f103644c = obj;
    }

    @Override // com.pinterest.api.model.vg
    public final Object b(gm0 value0) {
        switch (this.f103643b) {
            case 1:
                Intrinsics.checkNotNullParameter(value0, "value0");
                pg1.c cVar = (pg1.c) this.f103644c;
                String i13 = value0.i();
                Intrinsics.checkNotNullExpressionValue(i13, "getText(...)");
                pg1.c.x(cVar, i13, value0.h(), value0.g());
                return Unit.f80348a;
            default:
                return super.b(value0);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object d(sm0 value3) {
        String str;
        List<String> split$default;
        Unit unit;
        switch (this.f103643b) {
            case 2:
                Intrinsics.checkNotNullParameter(value3, "value3");
                lq1.b bVar = (lq1.b) this.f103644c;
                String f13 = value3.f();
                String h10 = value3.h();
                String name = value3.g();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                nq1.e eVar = (nq1.e) bVar;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                TableRow tableRow = new TableRow(eVar.getContext());
                Context context = tableRow.getContext();
                if (context != null) {
                    GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                    gestaltText.i(nq1.d.f91818l);
                    gestaltText.setWidth(gestaltText.getResources().getDimensionPixelSize(fq1.a.idea_pin_list_bottom_sheet_quantity_text_width));
                    if (f13 != null) {
                        split$default = StringsKt__StringsKt.split$default(f13, new String[]{" "}, false, 0, 6, null);
                        String str2 = "";
                        for (String str3 : split$default) {
                            lq1.c.f84465a.getClass();
                            Integer num = (Integer) lq1.a.f84464b.get(str3);
                            if (num != null) {
                                str2 = ((Object) str2) + eVar.getString(num.intValue());
                                unit = Unit.f80348a;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                str2 = ((Object) str2) + str3;
                            }
                        }
                        if (h10 == null) {
                            h10 = "";
                        }
                        str = ((Object) str2) + " " + h10;
                    } else {
                        str = null;
                    }
                    pk.a0.p(gestaltText, str != null ? str : "");
                    GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
                    gestaltText2.i(nq1.d.f91817k);
                    gestaltText2.setWidth(gestaltText2.getResources().getDimensionPixelSize(fq1.a.idea_pin_list_bottom_sheet_product_text_width));
                    pk.a0.p(gestaltText2, name);
                    tableRow.addView(gestaltText);
                    tableRow.addView(gestaltText2);
                }
                TableLayout tableLayout = eVar.f91828q0;
                if (tableLayout != null) {
                    tableLayout.addView(tableRow);
                    return Boolean.TRUE;
                }
                Intrinsics.r("ingredientsOrSuppliesTable");
                throw null;
            default:
                return super.d(value3);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object e(fo0 value8) {
        switch (this.f103643b) {
            case 0:
                Intrinsics.checkNotNullParameter(value8, "value8");
                if (Intrinsics.d(value8.l(), (String) this.f103644c)) {
                    return value8;
                }
                return null;
            default:
                return super.e(value8);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object g(kp0 value1) {
        switch (this.f103643b) {
            case 1:
                Intrinsics.checkNotNullParameter(value1, "value1");
                pg1.c cVar = (pg1.c) this.f103644c;
                String h10 = value1.h();
                Intrinsics.checkNotNullExpressionValue(h10, "getText(...)");
                pg1.c.x(cVar, h10, value1.g(), value1.f());
                return Unit.f80348a;
            default:
                return super.g(value1);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final Object i(wp0 value4) {
        switch (this.f103643b) {
            case 2:
                Intrinsics.checkNotNullParameter(value4, "value4");
                lq1.b bVar = (lq1.b) this.f103644c;
                String e13 = value4.e();
                String name = value4.f();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                nq1.e eVar = (nq1.e) bVar;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                TableRow tableRow = new TableRow(eVar.getContext());
                Context context = tableRow.getContext();
                if (context != null) {
                    GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                    gestaltText.i(nq1.d.f91818l);
                    gestaltText.setWidth(gestaltText.getResources().getDimensionPixelSize(fq1.a.idea_pin_list_bottom_sheet_quantity_text_width));
                    if (e13 == null) {
                        e13 = "";
                    }
                    pk.a0.p(gestaltText, e13);
                    GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
                    gestaltText2.i(nq1.d.f91817k);
                    gestaltText2.setWidth(gestaltText2.getResources().getDimensionPixelSize(fq1.a.idea_pin_list_bottom_sheet_product_text_width));
                    pk.a0.p(gestaltText2, name);
                    tableRow.addView(gestaltText);
                    tableRow.addView(gestaltText2);
                }
                TableLayout tableLayout = eVar.f91828q0;
                if (tableLayout != null) {
                    tableLayout.addView(tableRow);
                    return Boolean.TRUE;
                }
                Intrinsics.r("ingredientsOrSuppliesTable");
                throw null;
            default:
                return super.i(value4);
        }
    }

    @Override // com.pinterest.api.model.vg
    public final /* bridge */ /* synthetic */ Object j(pq0 pq0Var) {
        switch (this.f103643b) {
            case 1:
                l(pq0Var);
                return Unit.f80348a;
            case 2:
            default:
                return super.j(pq0Var);
            case 3:
                l(pq0Var);
                return Unit.f80348a;
        }
    }

    public final void l(pq0 value6) {
        bc2.l lVar;
        ArrayList arrayList;
        bc2.o oVar;
        boolean z13;
        f30 f30Var;
        u50.r rVar;
        bc2.l lVar2;
        h32.i0 p13;
        es.a aVar;
        bc2.o oVar2;
        boolean z14;
        f30 f30Var2;
        int i13 = this.f103643b;
        Object obj = this.f103644c;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(value6, "value6");
                pg1.c cVar = (pg1.c) obj;
                cVar.H = value6.f();
                cVar.L();
                String str = cVar.K;
                vq0 g13 = value6.g();
                Map c13 = g13 != null ? g13.c() : null;
                boolean b13 = j1.b1();
                f30 f30Var3 = cVar.f100112v;
                if (f30Var3 == null || (lVar = df.j1.z0(f30Var3)) == null) {
                    lVar = cVar.f100111u ? bc2.l.AD : bc2.l.ORGANIC;
                }
                bc2.l lVar3 = lVar;
                bc2.e eVar = cVar.f100101k;
                if (eVar == null) {
                    Intrinsics.r("mp4TrackSelector");
                    throw null;
                }
                bc2.q videoTracks = dl2.b.r0(str, c13, true, b13, null, lVar3, eVar, bc2.m.GRID);
                ArrayList arrayList2 = cVar.A;
                og1.a aVar2 = cVar.B;
                if (videoTracks == null) {
                    String h10 = value6.h();
                    Intrinsics.checkNotNullExpressionValue(h10, "getVideoSignature(...)");
                    if (h10.length() > 0) {
                        bs1.c.U1(aVar2);
                        cVar.C = true;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            bs1.c.X0((TextView) it.next());
                        }
                        return;
                    }
                    return;
                }
                String uid = cVar.K;
                h32.i0 p14 = cVar.f100100j.p();
                f30 f30Var4 = cVar.f100112v;
                bc2.o oVar3 = videoTracks.f22673b;
                if (f30Var4 != null) {
                    lh0.j Y = cVar.Y();
                    p1 p1Var = cVar.f100103m;
                    if (p1Var == null) {
                        Intrinsics.r("videoManagerUtil");
                        throw null;
                    }
                    boolean f03 = d7.b.f0(oVar3.f22665b);
                    kv.a aVar3 = cVar.f100106p;
                    if (aVar3 == null) {
                        Intrinsics.r("adsAudioOverlayPowerscoreExperimentManager");
                        throw null;
                    }
                    kv.c cVar2 = cVar.f100107q;
                    if (cVar2 == null) {
                        Intrinsics.r("organicAudioOverlayPowerscoreExperimentManager");
                        throw null;
                    }
                    arrayList = arrayList2;
                    oVar = oVar3;
                    z13 = df.j1.D1(f30Var4, Y, p1Var, cVar.X(), f03, aVar3, cVar2, ((es.c) cVar.T()).G(cVar.f100112v));
                } else {
                    arrayList = arrayList2;
                    oVar = oVar3;
                    z13 = false;
                }
                PinterestVideoView pinterestVideoView = cVar.f100116z;
                pinterestVideoView.R = z13;
                if (z13) {
                    pinterestVideoView.f52775a0 = false;
                }
                d4 d4Var = p14 != null ? p14.f67081a : null;
                a4 a4Var = p14 != null ? p14.f67082b : null;
                Intrinsics.checkNotNullParameter(uid, "uid");
                Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
                bc2.k kVar = new bc2.k(uid, videoTracks.a(), d4Var, a4Var, videoTracks, null);
                ec2.g gVar = new ec2.g((int) (hf0.b.f69002b / hf0.b.f69004d), oVar.f22670g, true, 58);
                if (!(!cVar.f100111u)) {
                    gVar = null;
                }
                oc2.i.g(pinterestVideoView, kVar, gVar, 4);
                if (!pinterestVideoView.isAttachedToWindow()) {
                    pinterestVideoView.addOnAttachStateChangeListener(new t3.a4(3, pinterestVideoView, cVar));
                } else if (!cVar.f100114x.a(pinterestVideoView) && (f30Var = cVar.f100112v) != null) {
                    lh0.j Y2 = cVar.Y();
                    p1 p1Var2 = cVar.f100103m;
                    if (p1Var2 == null) {
                        Intrinsics.r("videoManagerUtil");
                        throw null;
                    }
                    kv.a aVar4 = cVar.f100106p;
                    if (aVar4 == null) {
                        Intrinsics.r("adsAudioOverlayPowerscoreExperimentManager");
                        throw null;
                    }
                    kv.c cVar3 = cVar.f100107q;
                    if (cVar3 == null) {
                        Intrinsics.r("organicAudioOverlayPowerscoreExperimentManager");
                        throw null;
                    }
                    if (df.j1.Q1(cVar.X(), aVar4, cVar3, f30Var, Y2, p1Var2, ((es.c) cVar.T()).G(cVar.f100112v)) && (rVar = cVar.f100113w) != null) {
                        rVar.a(new x1(new gk1.a0(false)));
                    }
                }
                bs1.c.X0(aVar2);
                cVar.C = false;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bs1.c.U1((TextView) it2.next());
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(value6, "value6");
                ab2.n nVar = (ab2.n) obj;
                value6.getClass();
                nVar.getClass();
                String str2 = nVar.f1781o;
                vq0 g14 = value6.g();
                Map c14 = g14 != null ? g14.c() : null;
                boolean b14 = j1.b1();
                f30 f30Var5 = nVar.f1779m;
                if (f30Var5 == null || (lVar2 = df.j1.z0(f30Var5)) == null) {
                    lVar2 = nVar.f1783q ? bc2.l.AD : bc2.l.ORGANIC;
                }
                bc2.l lVar4 = lVar2;
                PinterestVideoView pinterestVideoView2 = nVar.f1768b;
                bc2.e eVar2 = pinterestVideoView2.f52761p0;
                if (eVar2 == null) {
                    Intrinsics.r("mp4TrackSelector");
                    throw null;
                }
                bc2.q videoTracks2 = dl2.b.r0(str2, c14, true, b14, null, lVar4, eVar2, bc2.m.GRID);
                if (videoTracks2 != null) {
                    String uid2 = nVar.f1781o;
                    nx.a aVar5 = nVar.f1770d;
                    if (aVar5 == null || (p13 = aVar5.generateLoggingContext()) == null) {
                        p13 = nVar.f1767a.p();
                    }
                    f30 f30Var6 = nVar.f1779m;
                    bc2.o oVar4 = videoTracks2.f22673b;
                    es.a aVar6 = nVar.f1775i;
                    if (f30Var6 != null) {
                        aVar = aVar6;
                        oVar2 = oVar4;
                        z14 = df.j1.D1(f30Var6, nVar.f1771e, nVar.f1773g, nVar.f1778l, d7.b.f0(oVar4.f22665b), nVar.f1776j, nVar.f1777k, ((es.c) aVar6).G(nVar.f1779m));
                    } else {
                        aVar = aVar6;
                        oVar2 = oVar4;
                        z14 = false;
                    }
                    pinterestVideoView2.R = z14;
                    d4 d4Var2 = p13 != null ? p13.f67081a : null;
                    a4 a4Var2 = p13 != null ? p13.f67082b : null;
                    Intrinsics.checkNotNullParameter(uid2, "uid");
                    Intrinsics.checkNotNullParameter(videoTracks2, "videoTracks");
                    oc2.i.g(pinterestVideoView2, new bc2.k(uid2, videoTracks2.a(), d4Var2, a4Var2, videoTracks2, null), new ec2.g((int) (hf0.b.f69002b / hf0.b.f69004d), oVar2.f22670g, true, 58), 4);
                    if (!pinterestVideoView2.isAttachedToWindow()) {
                        pinterestVideoView2.addOnAttachStateChangeListener(new t3.a4(4, pinterestVideoView2, nVar));
                        return;
                    }
                    boolean a13 = nVar.f1774h.a(pinterestVideoView2);
                    u50.r rVar2 = nVar.f1769c;
                    if (!a13 && (f30Var2 = nVar.f1779m) != null) {
                        if (df.j1.Q1(nVar.f1778l, nVar.f1776j, nVar.f1777k, f30Var2, nVar.f1771e, nVar.f1773g, ((es.c) aVar).G(f30Var2))) {
                            s0.b1(rVar2, false);
                        }
                    }
                    rVar2.a(d1.f90637a);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(String str) {
        super(null);
        this.f103643b = 0;
        this.f103644c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lq1.b bVar) {
        super(Boolean.FALSE);
        this.f103643b = 2;
        this.f103644c = bVar;
    }
}
