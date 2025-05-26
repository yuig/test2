package au0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Editable;
import bx0.l;
import c50.t4;
import com.pinterest.api.model.er;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.st;
import com.pinterest.api.model.uo;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinTextEditor;
import com.pinterest.feature.ideaPinCreation.closeup.view.l2;
import com.pinterest.feature.ideaPinCreation.closeup.view.p2;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import com.pinterest.feature.ideaPinCreation.worker.UploadIdeaPinImageMediaWorker;
import com.pinterest.navigation.Navigation;
import df.j1;
import dv0.o;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import jk2.u0;
import kh2.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kv0.x;
import kv0.y;
import m60.x0;
import pu0.r;
import qv0.z;
import rm1.q;
import sv0.n;
import tb0.p;
import u50.f0;
import u50.k0;
import uv0.k;
import xk2.v;
import zy.d0;
import zy.q0;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20488i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20489j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i13) {
        super(1);
        this.f20488i = i13;
        this.f20489j = obj;
    }

    public final ln0 b(ln0 it) {
        int i13 = this.f20488i;
        Object obj = this.f20489j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return ln0.a(it, null, null, null, null, null, null, false, null, null, ((f11.j) obj).f60782a, null, 12287);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ln0.a(it, null, null, null, null, null, null, false, null, null, null, ((fg1.a) obj).f62127b, 8191);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f20488i;
        Object obj = this.f20489j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                int intValue = ((p2) obj).getTextRes().intValue();
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new k0(intValue, new ArrayList(0)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                r rVar = (r) obj;
                return rn1.a.y(it, bs1.c.j2(new String[0], rVar.f101416a), null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f(rVar.f101417b, rm1.i.XS), rm1.c.LIGHT, null, 0, null, 28), false, 0, null, null, null, null, null, false, null, null, 2096638);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = e0.b(vn1.b.CENTER);
                wk2.a aVar = ((z) obj).f105228e;
                if (aVar == null) {
                    Intrinsics.r("fontManagerProvider");
                    throw null;
                }
                Object obj2 = aVar.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return rn1.a.y(it, null, null, b13, ((zf1.e) obj2).d(zf1.f.REGULAR_ITALIC) == null ? e0.b(vn1.e.ITALIC) : e0.b(vn1.e.REGULAR), vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097123);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = ((yw0.e) obj).getResources().getString(f62.e.see_it_styled_product_title_v2);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final yl1.b f(yl1.b it) {
        int i13 = this.f20488i;
        Object obj = this.f20489j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], ((qu0.a) obj).f105145a), false, null, null, null, null, null, null, 0, null, 1022);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(((pu0.s) obj).f101423c), null, null, null, null, null, 0, null, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                l lVar = (l) obj;
                String str = lVar.f24076l;
                return yl1.b.f(it, ep.b.x(str, "string", str), false, d7.b.Z(lVar.f24075k), null, null, null, null, null, 0, null, 1018);
        }
    }

    public final void h(Throwable th3) {
        int i13 = this.f20488i;
        Object obj = this.f20489j;
        switch (i13) {
            case 0:
                ((tb0.h) ((g) obj).f20491b.get()).q(th3, "Exception when loading creation fonts.", p.IDEA_PINS_CREATION);
                break;
            case 1:
                ((tb0.h) ((j) obj).f20500b.get()).q(th3, "Exception when loading creation fonts", p.IDEA_PINS_CREATION);
                break;
            case 24:
                ((n) obj).f115372f.h("Failed to get network type in S3UploadListener");
                break;
            default:
                ((UploadIdeaPinImageMediaWorker) obj).f46702w.h("Failed to get network type in UploadIdeaPinImageMediaWorker");
                break;
        }
    }

    public final void i(l82.n buildAndStart) {
        int i13 = this.f20488i;
        Object obj = this.f20489j;
        switch (i13) {
            case 27:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                d0 a13 = ((q0) ((xs0.l) obj).f135830b).a();
                buildAndStart.a(a13, new t4(4), a13.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                l82.n.b(buildAndStart, ((ax0.i) obj).f20637c);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q qVar;
        uj2.q qVar2;
        Bitmap decodeStream;
        int i13 = this.f20488i;
        int i14 = 5;
        int i15 = 24;
        int i16 = 3;
        int i17 = 2;
        byte b13 = 0;
        int i18 = 0;
        int i19 = 1;
        Object obj2 = this.f20489j;
        switch (i13) {
            case 0:
                h((Throwable) obj);
                return Unit.f80348a;
            case 1:
                h((Throwable) obj);
                return Unit.f80348a;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                IdeaPinTextEditor ideaPinTextEditor = (IdeaPinTextEditor) obj2;
                int i23 = IdeaPinTextEditor.E;
                ideaPinTextEditor.getClass();
                Context context = ideaPinTextEditor.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float s22 = c0.d.s2(floatValue, (int) ideaPinTextEditor.f46040f.width(), context);
                ideaPinTextEditor.f46045k.setTextSize(0, s22);
                Context context2 = ideaPinTextEditor.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ideaPinTextEditor.f46042h.f46251f = j1.E(s22, context2) / 36;
                ideaPinTextEditor.n();
                return Unit.f80348a;
            case 3:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                er erVar = (er) obj2;
                int[] iArr = l2.f46228a;
                int i24 = iArr[erVar.ordinal()];
                if (i24 == 1) {
                    qVar = q.OVERLAY_TEXT_OUTLINE;
                } else if (i24 == 2) {
                    qVar = q.OVERLAY_TEXT;
                } else if (i24 == 3) {
                    qVar = q.OVERLAY_TEXT;
                } else if (i24 == 4) {
                    qVar = q.TEXT_INVERT;
                } else {
                    if (i24 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar = q.TEXT_INVERT;
                }
                int i25 = iArr[erVar.ordinal()];
                return om1.c.e(it, qVar, null, i25 != 3 ? i25 != 5 ? om1.f.TRANSPARENT_ALWAYS_LIGHT : om1.f.TRANSPARENT_GRAY : om1.f.TRANSPARENT_GRAY, null, null, false, 0, 1018);
            case 4:
                return e((rn1.a) obj);
            case 5:
                List models = (List) obj;
                Intrinsics.checkNotNullParameter(models, "models");
                List<uo> list = models;
                gd0.g gVar = (gd0.g) obj2;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                for (uo uoVar : list) {
                    gVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("idea_pin_draft_id", uoVar.f42598a);
                    hashMap.put("story_pin_page_count", String.valueOf(uoVar.f42601d));
                    hashMap.put("idea_pin_last_updated_at", String.valueOf(uoVar.f42603f.getTime()));
                    v vVar = k.f123176a;
                    Date date = uoVar.f42605h;
                    Intrinsics.checkNotNullParameter(date, "date");
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTime(date);
                    gregorianCalendar.add(i14, 23);
                    boolean z13 = vb0.g.b(vb0.g.a(new Date(), 1)).getTime() >= vb0.g.a(vb0.g.b(date), i15).getTime();
                    Intrinsics.checkNotNullParameter(date, "date");
                    long time = (vb0.g.a(vb0.g.b(date), 31).getTime() - System.currentTimeMillis()) / pb0.i.DAYS.getMilliseconds();
                    Object obj3 = gVar.f64823r;
                    arrayList.add(new ku0.a(uoVar.f42599b, z13, uoVar.f42600c, uoVar.f42601d, uoVar.f42602e, time == 1 ? ((yk1.a) ((yk1.v) obj3)).f139224a.getString(aq1.h.idea_pin_drafts_expiration_time_singlar, Long.valueOf(time)) : time > 1 ? ((yk1.a) ((yk1.v) obj3)).f139224a.getString(aq1.h.idea_pin_drafts_expiration_time, Long.valueOf(time)) : ((yk1.a) ((yk1.v) obj3)).f139224a.getString(aq1.h.idea_pin_drafts_expiration_time_today), new k1.q(gVar, hashMap, uoVar, 29), new ju0.a(gVar, hashMap, uoVar), new ju0.a(gVar, uoVar, hashMap)));
                    i14 = 5;
                    i15 = 24;
                }
                return arrayList;
            case 6:
                return f((yl1.b) obj);
            case 7:
                return f((yl1.b) obj);
            case 8:
                return e((rn1.a) obj);
            case 9:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                uu0.c cVar = (uu0.c) obj2;
                int i26 = uu0.c.f123130p0;
                lu1.d a73 = cVar.a7();
                Context requireContext = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                Intent b14 = a73.b(requireContext, lu1.a.MAIN_ACTIVITY);
                b14.putExtra("com.pinterest.EXTRA_PENDING_TASK", navigation);
                b14.putExtra("com.pinterest.EXTRA_SKIP_HOME_SCREEN", true);
                b14.putExtra("com.pinterest.EXTRA_NO_BOTTOM_NAV_INFLATION", true);
                cVar.requireContext().startActivity(b14);
                return Unit.f80348a;
            case 10:
                ln0 ln0Var = (ln0) obj;
                xu0.b bVar = (xu0.b) obj2;
                bVar.f135935h = ln0Var;
                bVar.f135936i = CollectionsKt.H0(ln0Var.getTags());
                if (bVar.f135937j == null) {
                    bVar.f135937j = CollectionsKt.H0(ln0Var.getTags());
                }
                bVar.B3();
                return Unit.f80348a;
            case 11:
                ln0 storyPinData = (ln0) obj;
                Intrinsics.checkNotNullParameter(storyPinData, "storyPinData");
                bv0.l lVar = (bv0.l) obj2;
                lVar.getClass();
                String boardId = storyPinData.getBoardId();
                if (boardId == null) {
                    qVar2 = uj2.q.y(new bv0.h((v7) (b13 == true ? 1 : 0), i16));
                    Intrinsics.checkNotNullExpressionValue(qVar2, "just(...)");
                } else {
                    u0 u0Var = new u0(lVar.f23947q.P(boardId).t(new wr0.l(25, new bv0.i(storyPinData, lVar))), new wr0.l(26, new bv0.i(lVar, storyPinData, i17)), i19);
                    Intrinsics.checkNotNullExpressionValue(u0Var, "onErrorReturn(...)");
                    qVar2 = u0Var;
                }
                return qVar2.t(new wr0.l(28, new bv0.i(lVar, storyPinData, i18)));
            case 12:
                return b((ln0) obj);
            case 13:
                return b((ln0) obj);
            case 14:
                if (!((Boolean) obj).booleanValue()) {
                    int i27 = ev0.s.f60273l;
                    ((ev0.s) obj2).Z();
                }
                return Unit.f80348a;
            case 15:
                xn1.i it2 = (xn1.i) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                av0.j jVar = ((cv0.a) obj2).f53259c;
                String altText = it2.f135454c;
                o oVar = (o) jVar;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(altText, "altText");
                PinEditAdvanceMeta pinEditAdvanceMeta = oVar.f56371a;
                if (pinEditAdvanceMeta != null) {
                    Intrinsics.checkNotNullParameter(altText, "<set-?>");
                    pinEditAdvanceMeta.f46541g = altText;
                } else {
                    o.x3(oVar, false, new zu0.c(altText, i16), 1);
                }
                return Unit.f80348a;
            case 16:
                Editable editable = (Editable) obj;
                av0.h hVar = ((cv0.o) obj2).f53286c;
                String newTitle = editable != null ? editable.toString() : null;
                if (newTitle == null) {
                    newTitle = "";
                }
                dv0.k kVar = (dv0.k) hVar;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(newTitle, "newTitle");
                dv0.k.H3(kVar, new zu0.c(newTitle, i19), null, null, false, 14);
                ln0 ln0Var2 = kVar.f56361t;
                if (ln0Var2 != null) {
                    kVar.D3(ln0Var2);
                }
                return Unit.f80348a;
            case 17:
                f30 it3 = (f30) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                Boolean p13 = ((st) obj2).p();
                Intrinsics.checkNotNullExpressionValue(p13, "getIsEditable(...)");
                return new x(it3, p13.booleanValue());
            case 18:
                f30 it4 = (f30) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return b0.R(((kv0.j) obj2).f80975a, it4, false);
            case 19:
                y tagConfig = (y) obj;
                Intrinsics.checkNotNullParameter(tagConfig, "tagConfig");
                kv0.c cVar2 = (kv0.c) obj2;
                return new u0(new jk2.j1(new jk2.j1(cVar2.f80942c.P(tagConfig.f81025a), new bv0.k(i15, new r0(18, cVar2, tagConfig)), i18).O().u(), new androidx.appcompat.widget.q(new t3.d0(2, kv0.h.f80966k), i17), i18), ck2.i.f27921a, i18);
            case 20:
                String str = (String) obj;
                try {
                    InputStream inputStream = new URL(str).openConnection().getInputStream();
                    if (inputStream != null && (decodeStream = BitmapFactory.decodeStream(inputStream)) != null) {
                        int width = decodeStream.getWidth();
                        int height = decodeStream.getHeight();
                        if (width > 200 && height > 300) {
                            ((ArrayList) obj2).add(str);
                        }
                    }
                } catch (Exception e13) {
                    e13.getMessage();
                }
                return Unit.f80348a;
            case 21:
                on1.b it5 = (on1.b) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return on1.b.e(it5, ((mv0.i) obj2).V0, false, null, 0, on1.c.ALWAYS_DARK, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL);
            case 22:
                cn1.n bind = (cn1.n) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f28227s = true;
                String helperText = ((mv0.k) obj2).getResources().getString(x0.msg_invalid_url);
                Intrinsics.checkNotNullExpressionValue(helperText, "getString(...)");
                Intrinsics.checkNotNullParameter(helperText, "helperText");
                bind.f28211c = new f0(helperText);
                return Unit.f80348a;
            case 23:
                return e((rn1.a) obj);
            case 24:
                h((Throwable) obj);
                return Unit.f80348a;
            case 25:
                h((Throwable) obj);
                return Unit.f80348a;
            case 26:
                return e((rn1.a) obj);
            case 27:
                i((l82.n) obj);
                return Unit.f80348a;
            case 28:
                i((l82.n) obj);
                return Unit.f80348a;
            default:
                return f((yl1.b) obj);
        }
    }
}
