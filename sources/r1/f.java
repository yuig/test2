package r1;

import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import c50.z7;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wn0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import com.pinterest.education.ActionPromptView;
import com.pinterest.feature.board.common.newideas.view.OneTapSavePinVideoGridCell;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinTextEditor;
import com.pinterest.feature.ideaPinCreation.closeup.view.n2;
import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import com.pinterest.feature.ideaPinCreation.producttagging.view.IdeaPinProductTagsItemView;
import com.pinterest.feature.minicell.view.PinMiniCellView;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.g1;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w0;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105885i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f105886j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f105887k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, boolean z13, int i13) {
        super(1);
        this.f105885i = i13;
        this.f105887k = obj;
        this.f105886j = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [rm1.m] */
    public final om1.c b(om1.c it) {
        om1.f fVar;
        lh0.t tVar;
        om1.f fVar2;
        int i13 = this.f105885i;
        boolean z13 = this.f105886j;
        Object obj = this.f105887k;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                ?? r43 = z13 ? rm1.q.CHECK : ((tj0.z) obj).f117918j;
                if (z13) {
                    fVar = om1.f.DEFAULT_DARK_GRAY;
                } else {
                    lh0.t tVar2 = ((tj0.z) obj).f117913e;
                    if (tVar2 == null) {
                        Intrinsics.r("experiment");
                        throw null;
                    }
                    fVar = tVar2.c() ? om1.f.WASH_50_OPACITY_LIGHT : om1.f.DEFAULT_WHITE;
                }
                return om1.c.e(it, r43, null, fVar, null, null, false, 0, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                rm1.m mVar = z13 ? rm1.q.CHECK : ((OneTapSavePinVideoGridCell) obj).oneTapSaveIcon;
                if (z13) {
                    fVar2 = om1.f.DEFAULT_DARK_GRAY;
                } else {
                    tVar = ((OneTapSavePinVideoGridCell) obj).experiments;
                    fVar2 = tVar.c() ? om1.f.WASH_50_OPACITY_LIGHT : om1.f.DEFAULT_WHITE;
                }
                return om1.c.e(it, mVar, null, fVar2, null, null, false, 0, 1018);
        }
    }

    public final rn1.a e(rn1.a it) {
        String str;
        u50.i0 i0Var = u50.h0.f120562a;
        int i13 = this.f105885i;
        str = "";
        boolean z13 = this.f105886j;
        Object obj = this.f105887k;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence text = ((GestaltText) obj).getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                return rn1.a.y(it, bs1.c.h2(text), vn1.c.DEFAULT, kotlin.collections.e0.b(vn1.b.START), z13 ? kotlin.collections.e0.b(vn1.e.BOLD) : kotlin.collections.q0.f80391a, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097120);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, (u50.i0) obj, null, null, kotlin.collections.e0.b(z13 ? vn1.e.BOLD : vn1.e.REGULAR), null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097078);
            case 8:
                Intrinsics.checkNotNullParameter(it, "state");
                dc0.l lVar = (dc0.l) obj;
                if (lVar != null) {
                    int i14 = lVar.f54329c;
                    if (i14 != 0) {
                        str = a.a.d("+ ", i14);
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    i0Var = bs1.c.p2(str);
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(((ActionPromptView) obj).k().f58861d), null, kotlin.collections.e0.b(z13 ? vn1.b.CENTER_HORIZONTAL : vn1.b.START), null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097082);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = ((vk0.b) ((uk0.b) obj)).f126081d;
                if (str2 != null) {
                    i0Var = bs1.c.p2(str2);
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence charSequence = (SpannableStringBuilder) obj;
                u50.f0 h23 = bs1.c.h2(charSequence != null ? charSequence : "");
                int i15 = IdeaPinProductTagsItemView.f46551k;
                return rn1.a.y(it, h23, vt1.a.s(z13), null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                PinMiniCellView pinMiniCellView = (PinMiniCellView) obj;
                return rn1.a.y(it, bs1.c.h2(z13 ? pinMiniCellView.f46766l : pinMiniCellView.f46767m), z13 ? vn1.c.DEFAULT : vn1.c.SUBTLE, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
        }
    }

    public final yl1.b f(yl1.b it) {
        int i13 = this.f105885i;
        Object obj = this.f105887k;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f105886j, null, null, (yl1.g) obj, null, null, null, 0, null, 1005);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f105886j, null, (u50.k0) obj, null, null, null, null, 0, null, 1013);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f105885i;
        int i14 = 2;
        boolean z13 = false;
        int i15 = 0;
        z13 = false;
        int i16 = 1;
        boolean z14 = this.f105886j;
        Object obj2 = this.f105887k;
        switch (i13) {
            case 0:
                b0 b0Var = (b0) ((m) ((List) obj2).get(((Number) obj).intValue()));
                return Integer.valueOf(z14 ? b0Var.f105867r : b0Var.f105868s);
            case 1:
                z3.y yVar = (z3.y) obj;
                if (!z14) {
                    rl2.u[] uVarArr = z3.w.f140760a;
                    ((z3.j) yVar).e(z3.t.f140741j, Unit.f80348a);
                }
                f2.w wVar = new f2.w((f2.e0) obj2, i16);
                rl2.u[] uVarArr2 = z3.w.f140760a;
                ((z3.j) yVar).e(z3.i.f140680g, new z3.a(null, wVar));
                return Unit.f80348a;
            case 2:
                on1.k it = (on1.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c Z = d7.b.Z(z14);
                on1.b bVar = it.f96740a;
                aq.j jVar = (aq.j) obj2;
                jVar.getClass();
                return on1.k.e(it, on1.b.e(bVar, Boolean.parseBoolean(jVar.z(aq.d.IS_COMMENTING_ALLOWED)), false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null, Z, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL);
            case 3:
                return e((rn1.a) obj);
            case 4:
                zs zsVar = (zs) obj;
                rr.q0 q0Var = (rr.q0) obj2;
                Intrinsics.f(zsVar);
                q0Var.getClass();
                NavigationImpl r03 = Navigation.r0(g1.m(), zsVar);
                if (z14) {
                    r03.z(wp.a.getValue(wp.a.KLP), "com.pinterest.EXTRA_INTEREST_TYPE");
                }
                q0Var.f109723a.m(r03);
                return Unit.f80348a;
            case 5:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                sr.d dVar = (sr.d) obj2;
                lu1.b bVar2 = dVar.f115046c;
                us1.a aVar = dVar.f115044a;
                Intent intent = ((lu1.c) bVar2).h(aVar.getContext(), navigation);
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (z14) {
                    intent.putExtra("com.pinterest.EXTRA_OCF_FLAG", true);
                }
                aVar.startActivity(intent);
                return Unit.f80348a;
            case 6:
                return f((yl1.b) obj);
            case 7:
                return e((rn1.a) obj);
            case 8:
                return e((rn1.a) obj);
            case 9:
                ((Boolean) obj).getClass();
                ((Function1) obj2).invoke(Boolean.valueOf(!z14));
                return Unit.f80348a;
            case 10:
                return e((rn1.a) obj);
            case 11:
                return b((om1.c) obj);
            case 12:
                return b((om1.c) obj);
            case 13:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.i(d7.b.Z(z14));
                String string = ((fk0.k) obj2).getString(d70.g.board_create_visibility);
                bind.f108898m = string != null ? new u50.f0(string) : null;
                return Unit.f80348a;
            case 14:
                return e((rn1.a) obj);
            case 15:
                return f((yl1.b) obj);
            case 16:
                uj2.q it2 = (uj2.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return z14 ? ((uq0.h) obj2).f123054d.i(it2) : it2;
            case 17:
                if (z14) {
                    ((fs0.k) obj2).f62863g.d(new jc0.t());
                }
                fs0.k kVar = (fs0.k) obj2;
                kVar.getClass();
                kVar.f62863g.d(new jc0.s(true, 0));
                return Unit.f80348a;
            case 18:
                f30 f30Var = (f30) obj;
                fs0.w wVar2 = (fs0.w) obj2;
                Intrinsics.f(f30Var);
                uj2.l t33 = fs0.w.t3(wVar2, f30Var, z14);
                fs0.q qVar = new fs0.q(9, new s1.w(z14, wVar2, f30Var, 9));
                fs0.q qVar2 = new fs0.q(10, new fs0.s(wVar2, i14));
                ck2.c cVar = ck2.i.f27923c;
                t33.getClass();
                t33.f(new hk2.b(qVar, qVar2, cVar));
                wVar2.u3();
                return Unit.f80348a;
            case 19:
                cw0.a aVar2 = (cw0.a) obj;
                if (z14) {
                    n2 n2Var = (n2) ((au0.j) obj2).getView();
                    Intrinsics.f(aVar2);
                    ((IdeaPinTextEditor) n2Var).g(aVar2);
                }
                return Unit.f80348a;
            case 20:
                Pair it3 = (Pair) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                bv0.d dVar2 = (bv0.d) obj2;
                String str = dVar2.f23914o.f46541g;
                Object obj3 = it3.f80347b;
                Intrinsics.checkNotNullExpressionValue(obj3, "<get-second>(...)");
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                PinEditAdvanceMeta pinEditAdvanceMeta = dVar2.f23914o;
                boolean z15 = pinEditAdvanceMeta.f46537c;
                boolean z16 = pinEditAdvanceMeta.f46538d;
                wy0 wy0Var = (wy0) it3.f80346a;
                return dVar2.v(str, booleanValue, z15, this.f105886j, z16, wy0Var.getUid() != null ? wy0Var : null);
            case 21:
                dv0.k kVar2 = (dv0.k) obj2;
                if ((((v7) obj) != null) != false && z14) {
                    z13 = true;
                }
                kVar2.z3(z13);
                return Unit.f80348a;
            case 22:
                ln0 data = (ln0) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                bv0.g gVar = (bv0.g) ((dv0.o) obj2).f56376f;
                ln0 storyPinData = ln0.a(data, wn0.a(data.getMetadata(), null, null, null, null, this.f105886j, null, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO), null, null, null, null, null, false, null, null, null, null, 16381);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(storyPinData, "storyPinData");
                Iterator it4 = CollectionsKt.F0(gVar.f135191h).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i15 = -1;
                    } else if (!(((dl1.s) it4.next()) instanceof cv0.x)) {
                        i15++;
                    }
                }
                if (i15 > 0) {
                    gVar.removeItem(i15);
                    gVar.r(i15, gVar.v(storyPinData));
                }
                return storyPinData;
            case 23:
                return e((rn1.a) obj);
            case 24:
                return e((rn1.a) obj);
            case 25:
                String count = (String) obj;
                Intrinsics.checkNotNullParameter(count, "shareText");
                b11.j0 j0Var = (b11.j0) obj2;
                Resources resources = j0Var.getResources();
                int i17 = w0.content_description_story_pin_share_and_count;
                int i18 = j0Var.D;
                String contentDescription = resources.getQuantityString(i17, i18, Integer.valueOf(i18));
                Intrinsics.checkNotNullExpressionValue(contentDescription, "getQuantityString(...)");
                Intrinsics.checkNotNullParameter(count, "count");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                j0Var.f21034l.setContentDescription(contentDescription);
                GestaltText gestaltText = j0Var.f21036n;
                gestaltText.setText(count);
                if (count.length() <= 0 || !z14) {
                    bs1.c.X0(gestaltText);
                } else {
                    bs1.c.U1(gestaltText);
                }
                return Unit.f80348a;
            case 26:
                ((u50.r) obj2).a(z14 ? ea1.d.f58042a : ea1.c.f58037a);
                return Unit.f80348a;
            case 27:
                bm1.v bind2 = (bm1.v) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bm1.n selectedState = z14 ? bm1.n.SELECTED : bm1.n.UNSELECTED;
                bind2.getClass();
                Intrinsics.checkNotNullParameter(selectedState, "selectedState");
                bind2.f23525b = selectedState;
                if (z14) {
                    ((lc1.p) obj2).setOnClickListener(null);
                }
                return Unit.f80348a;
            case 28:
                l82.n start = (l82.n) obj;
                Intrinsics.checkNotNullParameter(start, "$this$start");
                kd1.b bVar3 = (kd1.b) obj2;
                mb0.a aVar3 = (mb0.a) kd1.b.h(bVar3, z14).f63225b;
                start.a(aVar3, new z7(z13 ? 1 : 0), aVar3.a());
                w60.d dVar3 = bVar3.f79231d;
                start.a(dVar3, new z7(i16), dVar3.a());
                nu.b bVar4 = bVar3.f79232e;
                start.a(bVar4, new z7(i14), bVar4.a());
                zy.d0 a13 = bVar3.f79233f.a();
                start.a(a13, new z7(3), a13.a());
                return Unit.f80348a;
            default:
                em1.d it5 = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return em1.d.e(it5, z14 ? em1.b.CHECKED : em1.b.UNCHECKED, !c0.d.a2((GestaltCheckBox) obj2) ? em1.e.ENABLED : em1.e.DISABLED, null, null, null, null, 0, null, false, 0, 1020);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(boolean z13, Object obj, int i13) {
        super(1);
        this.f105885i = i13;
        this.f105886j = z13;
        this.f105887k = obj;
    }
}
