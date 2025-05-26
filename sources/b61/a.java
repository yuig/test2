package b61;

import android.content.Context;
import android.net.Uri;
import bk.m;
import bk.o;
import bs1.c;
import com.google.android.material.imageview.ShapeableImageView;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import df.j1;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import ll.j;
import pk.a0;
import uk1.d;
import va.f;
import yk1.b;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final d f22015a;

    /* renamed from: b, reason: collision with root package name */
    public vh f22016b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f22017c;

    /* renamed from: d, reason: collision with root package name */
    public final j f22018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d presenterPinalytics) {
        super(0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f22015a = presenterPinalytics;
        this.f22018d = new j(16, 0);
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        o a13;
        o a14;
        String text;
        String text2;
        a61.a view = (a61.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        d61.b bVar = (d61.b) view;
        bVar.A = this;
        vh vhVar = this.f22016b;
        if (vhVar != null) {
            kj kjVar = vhVar.f42855m;
            if (kjVar != null && (text2 = kjVar.a()) != null) {
                Intrinsics.checkNotNullParameter(text2, "text");
                a0.p(bVar.f53744h, text2);
            }
            kj kjVar2 = vhVar.f42856n;
            if (kjVar2 != null && (text = kjVar2.a()) != null) {
                Intrinsics.checkNotNullParameter(text, "text");
                a0.p(bVar.f53743g, text);
            }
            if (!Intrinsics.d(p3(), "slp_rec_seasonal")) {
                List images = vhVar.M;
                if (images != null) {
                    Intrinsics.checkNotNullParameter(images, "images");
                    bVar.f53742f.setVisibility(0);
                    String str = (String) CollectionsKt.U(0, images);
                    if (str != null) {
                        bVar.f53746j.loadUrl(str);
                    }
                    String str2 = (String) CollectionsKt.U(1, images);
                    if (str2 != null) {
                        bVar.f53747k.loadUrl(str2);
                    }
                    String str3 = (String) CollectionsKt.U(2, images);
                    if (str3 != null) {
                        bVar.f53748l.loadUrl(str3);
                    }
                    String str4 = (String) CollectionsKt.U(3, images);
                    if (str4 != null) {
                        bVar.f53749m.loadUrl(str4);
                        return;
                    }
                    return;
                }
                return;
            }
            Map a15 = vhVar.a();
            String seasonalKey = String.valueOf(a15 != null ? a15.get("seasonal_key") : null);
            Intrinsics.checkNotNullParameter(seasonalKey, "seasonalKey");
            bVar.f53750n.setVisibility(0);
            Context context = bVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            boolean Y0 = j1.Y0(context);
            ShapeableImageView shapeableImageView = bVar.f53751o;
            float f13 = bVar.f53741e;
            if (Y0) {
                m h10 = shapeableImageView.f32651i.h();
                c u13 = d7.b.u(0);
                h10.f23079b = u13;
                m.b(u13);
                h10.h(f13);
                c u14 = d7.b.u(0);
                h10.f23080c = u14;
                m.b(u14);
                h10.f(f13);
                c u15 = d7.b.u(0);
                h10.f23078a = u15;
                m.b(u15);
                h10.g(0.0f);
                c u16 = d7.b.u(0);
                h10.f23081d = u16;
                m.b(u16);
                h10.e(0.0f);
                a13 = h10.a();
            } else {
                m h13 = shapeableImageView.f32651i.h();
                c u17 = d7.b.u(0);
                h13.f23078a = u17;
                m.b(u17);
                h13.g(f13);
                c u18 = d7.b.u(0);
                h13.f23081d = u18;
                m.b(u18);
                h13.e(f13);
                c u19 = d7.b.u(0);
                h13.f23079b = u19;
                m.b(u19);
                h13.h(0.0f);
                c u23 = d7.b.u(0);
                h13.f23080c = u23;
                m.b(u23);
                h13.f(0.0f);
                a13 = h13.a();
            }
            Context context2 = bVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            boolean Y02 = j1.Y0(context2);
            ShapeableImageView shapeableImageView2 = bVar.f53754r;
            if (Y02) {
                m h14 = shapeableImageView2.f32651i.h();
                c u24 = d7.b.u(0);
                h14.f23078a = u24;
                m.b(u24);
                h14.g(f13);
                c u25 = d7.b.u(0);
                h14.f23081d = u25;
                m.b(u25);
                h14.e(f13);
                c u26 = d7.b.u(0);
                h14.f23079b = u26;
                m.b(u26);
                h14.h(0.0f);
                c u27 = d7.b.u(0);
                h14.f23080c = u27;
                m.b(u27);
                h14.f(0.0f);
                a14 = h14.a();
            } else {
                m h15 = shapeableImageView2.f32651i.h();
                c u28 = d7.b.u(0);
                h15.f23079b = u28;
                m.b(u28);
                h15.h(f13);
                c u29 = d7.b.u(0);
                h15.f23080c = u29;
                m.b(u29);
                h15.f(f13);
                c u33 = d7.b.u(0);
                h15.f23078a = u33;
                m.b(u33);
                h15.g(0.0f);
                c u34 = d7.b.u(0);
                h15.f23081d = u34;
                m.b(u34);
                h15.e(0.0f);
                a14 = h15.a();
            }
            boolean d2 = Intrinsics.d(seasonalKey, "Winter Holiday");
            f fVar = bVar.f53755s;
            f fVar2 = bVar.f53759w;
            shapeableImageView.setImageDrawable(d2 ? fVar : fVar2);
            shapeableImageView.Y0(a13);
            boolean d13 = Intrinsics.d(seasonalKey, "Winter Holiday");
            f fVar3 = bVar.f53756t;
            f fVar4 = bVar.f53760x;
            bVar.f53752p.setImageDrawable(d13 ? fVar3 : fVar4);
            boolean d14 = Intrinsics.d(seasonalKey, "Winter Holiday");
            f fVar5 = bVar.f53757u;
            f fVar6 = bVar.f53761y;
            bVar.f53753q.setImageDrawable(d14 ? fVar5 : fVar6);
            boolean d15 = Intrinsics.d(seasonalKey, "Winter Holiday");
            f fVar7 = bVar.f53758v;
            f fVar8 = bVar.f53762z;
            shapeableImageView2.setImageDrawable(d15 ? fVar7 : fVar8);
            shapeableImageView2.Y0(a14);
            if (Intrinsics.d(seasonalKey, "Winter Holiday")) {
                bVar.i(fVar);
                bVar.i(fVar3);
                bVar.i(fVar5);
                bVar.i(fVar7);
                return;
            }
            bVar.i(fVar2);
            bVar.i(fVar4);
            bVar.i(fVar6);
            bVar.i(fVar8);
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        ((d61.b) ((a61.a) getView())).A = null;
        d61.b bVar = (d61.b) ((a61.a) getView());
        bVar.getClass();
        Intrinsics.checkNotNullParameter("", "text");
        a0.p(bVar.f53744h, "");
        d61.b bVar2 = (d61.b) ((a61.a) getView());
        bVar2.getClass();
        Intrinsics.checkNotNullParameter("", "text");
        a0.p(bVar2.f53743g, "");
        d61.b bVar3 = (d61.b) ((a61.a) getView());
        bVar3.f53742f.setVisibility(8);
        bVar3.f53746j.clear();
        bVar3.f53747k.clear();
        bVar3.f53748l.clear();
        bVar3.f53749m.clear();
        d61.b bVar4 = (d61.b) ((a61.a) getView());
        bVar4.f53750n.setVisibility(8);
        f fVar = bVar4.f53755s;
        if (fVar != null) {
            fVar.a();
        }
        f fVar2 = bVar4.f53756t;
        if (fVar2 != null) {
            fVar2.a();
        }
        f fVar3 = bVar4.f53757u;
        if (fVar3 != null) {
            fVar3.a();
        }
        f fVar4 = bVar4.f53758v;
        if (fVar4 != null) {
            fVar4.a();
        }
        f fVar5 = bVar4.f53759w;
        if (fVar5 != null) {
            fVar5.a();
        }
        f fVar6 = bVar4.f53760x;
        if (fVar6 != null) {
            fVar6.a();
        }
        f fVar7 = bVar4.f53761y;
        if (fVar7 != null) {
            fVar7.a();
        }
        f fVar8 = bVar4.f53762z;
        if (fVar8 != null) {
            fVar8.a();
        }
        super.onUnbind();
    }

    public final String p3() {
        ih ihVar;
        String e13;
        vh vhVar = this.f22016b;
        String str = vhVar != null ? vhVar.A : null;
        if (str != null && !z.j(str)) {
            vh vhVar2 = this.f22016b;
            if (vhVar2 != null) {
                return vhVar2.A;
            }
            return null;
        }
        vh vhVar3 = this.f22016b;
        if (vhVar3 == null || (ihVar = vhVar3.f42857o) == null || (e13 = ihVar.e()) == null) {
            return null;
        }
        return Uri.parse(e13).getQueryParameter("rs");
    }
}
