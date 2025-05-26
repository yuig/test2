package rq;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.api.model.AggregatedCommentFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.selectList.GestaltSelectList;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109074i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f109075j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f109076k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f109077l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i13, GestaltSelectList gestaltSelectList, String str) {
        super(1);
        this.f109074i = 24;
        this.f109077l = str;
        this.f109076k = gestaltSelectList;
        this.f109075j = i13;
    }

    public final rn1.a b(rn1.a it) {
        String quantityString;
        int i13 = this.f109074i;
        int i14 = this.f109075j;
        Object obj = this.f109077l;
        Object obj2 = this.f109076k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = ((GestaltText) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                CharSequence[] texts = {(String) obj};
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(texts, "texts");
                CharSequence a03 = df.j1.a0(context.getString(i14, Arrays.copyOf(texts, 1)));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.p2(a03), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(bs1.c.f2((qv0.z) obj2, i14)), (vn1.c) obj, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.f0 h23 = bs1.c.h2(i14 > 0 ? qb0.j.b(i14) : "");
                Resources resources = ((GestaltText) obj2).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                v32.c reactionByMe = (v32.c) obj;
                Intrinsics.checkNotNullParameter(resources, "resources");
                Intrinsics.checkNotNullParameter(reactionByMe, "reactionByMe");
                if (reactionByMe == v32.c.NONE || i14 <= 1) {
                    quantityString = resources.getQuantityString(cz1.d.pin_reaction_others_plural_a11y, i14, qb0.j.b(i14));
                    Intrinsics.f(quantityString);
                } else {
                    int i15 = i14 - 1;
                    quantityString = resources.getQuantityString(cz1.d.pin_reaction_you_and_others_plural_a11y, i15, qb0.j.b(i15));
                    Intrinsics.f(quantityString);
                }
                return rn1.a.y(it, h23, null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.h2(quantityString), null, null, null, null, false, null, null, 2093054);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, (u50.i0) obj, vn1.c.DEFAULT, null, kotlin.collections.e0.b((vn1.e) obj2), null, 0, null, null, null, null, false, this.f109075j, null, null, null, null, null, false, null, null, 2095092);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(((re1.r) obj2).f107642d), null, null, kotlin.collections.e0.b(vn1.e.BOLD), (vn1.g) ((kotlin.jvm.internal.j0) obj).f80434a, this.f109075j, fm1.c.VISIBLE, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096902);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = (String) obj;
                u50.f0 h24 = bs1.c.h2(str);
                fn1.e eVar = ((GestaltSelectList) obj2).f49569k;
                if (eVar != null) {
                    return rn1.a.y(it, h24, null, null, null, fn1.g.f62688b[eVar.ordinal()] == 1 ? vn1.g.UI_100 : vn1.g.BODY_100, this.f109075j, d7.b.Z(str.length() > 0), rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096910);
                }
                Intrinsics.r("labelVariant");
                throw null;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.i0 i0Var = (u50.i0) obj2;
                vn1.g gVar = vn1.g.BODY_100;
                Context context2 = ((GestaltTextField) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return rn1.a.y(it, i0Var, null, null, null, gVar, this.f109075j, d7.b.Z(bs1.c.i1(i0Var, context2)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097038);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final uj2.f0 e(kotlin.Pair r20) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.a0.e(kotlin.Pair):uj2.f0");
    }

    public final void f(f30 f30Var) {
        int i13 = this.f109074i;
        Object obj = this.f109077l;
        int i14 = this.f109075j;
        Object obj2 = this.f109076k;
        switch (i13) {
            case 11:
                ed1.i iVar = (ed1.i) obj2;
                i91.n nVar = iVar.f58636n;
                Intrinsics.f(f30Var);
                if (nVar.b(f30Var)) {
                    Context context = iVar.f58625c;
                    if (dl2.b.P1(context, "com.facebook.katana")) {
                        ((List) obj).add(i14, ig1.b.z(context));
                    }
                    if (dl2.b.P1(context, "com.instagram.android")) {
                        ((List) obj).add(i14, ig1.b.B(context));
                    }
                    iVar.f58636n.getClass();
                    if (i91.n.a(f30Var)) {
                        ((List) obj).add(i14, ig1.b.y(context));
                        break;
                    }
                }
                break;
            default:
                ed1.x xVar = (ed1.x) obj2;
                i91.n nVar2 = xVar.f58737m;
                Intrinsics.f(f30Var);
                if (nVar2.b(f30Var)) {
                    Context context2 = xVar.f58727c;
                    if (dl2.b.P1(context2, "com.facebook.katana")) {
                        ((List) obj).add(i14, ig1.b.z(context2));
                    }
                    if (dl2.b.P1(context2, "com.instagram.android")) {
                        ((List) obj).add(i14, ig1.b.B(context2));
                    }
                    xVar.f58737m.getClass();
                    if (i91.n.a(f30Var)) {
                        ((List) obj).add(i14, ig1.b.y(context2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109074i;
        int i14 = this.f109075j;
        Object obj2 = this.f109077l;
        Object obj3 = this.f109076k;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                h4.f0 value = (h4.f0) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                String str = value.f67559a.f21571a;
                if (str.length() >= i14) {
                    str = str.substring(0, i14);
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                }
                ((i2.q1) obj2).setValue(h4.f0.b(value, str));
                ((Function1) obj3).invoke(str);
                return Unit.f80348a;
            case 2:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar = fm1.c.GONE;
                om1.f fVar = om1.f.TRANSPARENT_DARK_GRAY;
                CharSequence string = (CharSequence) obj3;
                Intrinsics.checkNotNullParameter(string, "string");
                return om1.c.e(it, (rm1.m) obj2, null, fVar, cVar, new u50.f0(string), false, this.f109075j, 738);
            case 3:
                int intValue = ((Number) obj).intValue();
                if (i14 == 0) {
                    return (ScreenDescription) ((List) obj3).get(intValue);
                }
                return (ScreenDescription) (intValue == 0 ? ((com.pinterest.feature.home.viewpager.a) obj2).f77529f.get(0) : ((List) obj3).get(intValue - 1));
            case 4:
                return b((rn1.a) obj);
            case 5:
                y01.n1 it2 = (y01.n1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                int i15 = ((kotlin.jvm.internal.h0) obj3).f80426a;
                if (i14 == ((y01.n1) ((l82.e) obj2).f82219b).f136453k) {
                    i14 = -1;
                }
                return y01.n1.b(it2, null, null, false, null, i14, i15, null, 29695);
            case 6:
                return b((rn1.a) obj);
            case 7:
                return b((rn1.a) obj);
            case 8:
                return e((Pair) obj);
            case 9:
                return e((Pair) obj);
            case 10:
                ((fb1.c) obj3).f61611c.u1(i14, (db1.e) obj2);
                return Unit.f80348a;
            case 11:
                f((f30) obj);
                return Unit.f80348a;
            case 12:
                f((f30) obj);
                return Unit.f80348a;
            case 13:
                return b((rn1.a) obj);
            case 14:
                AggregatedCommentFeed aggregatedCommentFeed = (AggregatedCommentFeed) obj;
                Intrinsics.f(aggregatedCommentFeed);
                ((oh1.m) obj3).Q3(aggregatedCommentFeed, (rp0.d) obj2, i14, null);
                return Unit.f80348a;
            case 15:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltAvatarGroup gestaltAvatarGroup = new GestaltAvatarGroup(fc0.k.a(context, i14), (sl1.i) obj3);
                gm1.a aVar = (gm1.a) obj2;
                if (aVar != null) {
                    gestaltAvatarGroup.b(aVar);
                }
                return gestaltAvatarGroup;
            case 16:
                Context context2 = (Context) obj;
                Intrinsics.checkNotNullParameter(context2, "context");
                GestaltButtonGroup gestaltButtonGroup = new GestaltButtonGroup(fc0.k.a(context2, i14), (cm1.d) obj3);
                gm1.a aVar2 = (gm1.a) obj2;
                if (aVar2 != null) {
                    gestaltButtonGroup.b(aVar2);
                }
                return gestaltButtonGroup;
            case 17:
                Context context3 = (Context) obj;
                Intrinsics.checkNotNullParameter(context3, "context");
                GestaltButton gestaltButton = new GestaltButton(fc0.k.a(context3, i14), (yl1.b) obj3);
                gm1.a aVar3 = (gm1.a) obj2;
                if (aVar3 != null) {
                    gestaltButton.e(aVar3);
                }
                return gestaltButton;
            case 18:
                Context context4 = (Context) obj;
                Intrinsics.checkNotNullParameter(context4, "context");
                GestaltButtonToggle gestaltButtonToggle = new GestaltButtonToggle(fc0.k.a(context4, i14), (bm1.m) obj3);
                gm1.a aVar4 = (gm1.a) obj2;
                if (aVar4 != null) {
                    gestaltButtonToggle.t(aVar4);
                }
                return gestaltButtonToggle;
            case 19:
                Context context5 = (Context) obj;
                Intrinsics.checkNotNullParameter(context5, "context");
                GestaltDivider gestaltDivider = new GestaltDivider(fc0.k.a(context5, i14), (jm1.b) obj3);
                gm1.a eventHandler = (gm1.a) obj2;
                if (eventHandler != null) {
                    Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                }
                return gestaltDivider;
            case 20:
                Context context6 = (Context) obj;
                Intrinsics.checkNotNullParameter(context6, "context");
                GestaltIconButton gestaltIconButton = new GestaltIconButton(fc0.k.a(context6, i14), (om1.c) obj3);
                gm1.a aVar5 = (gm1.a) obj2;
                if (aVar5 != null) {
                    gestaltIconButton.u(aVar5);
                }
                return gestaltIconButton;
            case 21:
                Context context7 = (Context) obj;
                Intrinsics.checkNotNullParameter(context7, "context");
                GestaltPreviewTextView gestaltPreviewTextView = new GestaltPreviewTextView(fc0.k.a(context7, i14), (un1.c) obj3);
                gm1.a aVar6 = (gm1.a) obj2;
                if (aVar6 != null) {
                    gestaltPreviewTextView.j(aVar6);
                }
                return gestaltPreviewTextView;
            case 22:
                Context context8 = (Context) obj;
                Intrinsics.checkNotNullParameter(context8, "context");
                GestaltSwitchWithLabel gestaltSwitchWithLabel = new GestaltSwitchWithLabel(fc0.k.a(context8, i14), (on1.k) obj3);
                gm1.a aVar7 = (gm1.a) obj2;
                if (aVar7 != null) {
                    gestaltSwitchWithLabel.X(aVar7);
                }
                return gestaltSwitchWithLabel;
            case 23:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f96684i = i14;
                cn1.f fVar2 = (cn1.f) obj3;
                bind.a(fVar2.f28189a);
                bind.f96680e = fVar2.f28190b;
                bind.d(dn1.c.values()[dl2.b.O0((Context) obj2, eo1.a.comp_searchfield_inner_trailing_iconbutton_style)].getValue());
                bind.c(om1.e.MD);
                bind.e(fm1.c.VISIBLE);
                return Unit.f80348a;
            case 24:
                return b((rn1.a) obj);
            case 25:
                return b((rn1.a) obj);
            default:
                List boards = (List) obj;
                yx1.e eVar = (yx1.e) ((yx1.p) obj3).getView();
                String pinId = b40.g((f30) obj2);
                Intrinsics.f(boards);
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                Intrinsics.checkNotNullParameter(boards, "boards");
                ((yx1.j) eVar).f8((!(boards.isEmpty() ^ true) || i14 <= 0) ? yx1.x.f140416a : new yx1.y(pinId, CollectionsKt.y0(boards, i14)));
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i13, Object obj, Object obj2, int i14) {
        super(1);
        this.f109074i = i14;
        this.f109075j = i13;
        this.f109076k = obj;
        this.f109077l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, int i13, Object obj2, int i14) {
        super(1);
        this.f109074i = i14;
        this.f109076k = obj;
        this.f109075j = i13;
        this.f109077l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, Object obj2, int i13, int i14) {
        super(1);
        this.f109074i = i14;
        this.f109076k = obj;
        this.f109077l = obj2;
        this.f109075j = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String str, int i13, no1.e eVar) {
        super(1);
        this.f109074i = 8;
        this.f109077l = str;
        this.f109075j = i13;
        this.f109076k = eVar;
    }
}
