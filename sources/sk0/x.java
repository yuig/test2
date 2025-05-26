package sk0;

import android.text.Html;
import android.text.Spanned;
import com.pinterest.api.model.b60;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.selectpins.BoardSelectPinsHeaderView;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl0.z;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lm0.c1;
import lm0.x0;
import lm0.z0;
import u50.f0;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113087i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f113088j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f113089k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i13, Object obj, Object obj2) {
        super(1);
        this.f113087i = i13;
        this.f113088j = obj;
        this.f113089k = obj2;
    }

    public final x0 b(x0 it) {
        int i13 = this.f113087i;
        Object obj = this.f113089k;
        Object obj2 = this.f113088j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, null, null, null, z0.a((z0) obj2, (c1) obj, null, 2), null, null, null, null, 991);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, null, null, null, z0.a((z0) obj2, null, (zo.c) obj, 1), null, null, null, null, 991);
        }
    }

    public final rn1.a e(rn1.a it) {
        vn1.c cVar;
        rm1.q qVar;
        rm1.c cVar2;
        int i13 = this.f113087i;
        Object obj = this.f113089k;
        Object obj2 = this.f113088j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                xm0.a aVar = (xm0.a) obj2;
                fm1.c Z = d7.b.Z(aVar.f135350b);
                int i14 = aVar.f135349a;
                String quantityString = i14 > 0 ? ((BoardSelectPinsHeaderView) obj).getResources().getQuantityString(d70.f.select_pins_quantity, i14, Integer.valueOf(i14)) : ((BoardSelectPinsHeaderView) obj).getResources().getString(m60.x0.select_or_reorder);
                Intrinsics.f(quantityString);
                return rn1.a.y(it, bs1.c.h2(quantityString), null, null, null, null, 0, Z, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence charSequence = (CharSequence) obj2;
                i0 p23 = charSequence != null ? bs1.c.p2(charSequence) : h0.f120562a;
                dl0.e eVar = (dl0.e) obj;
                if (eVar == null || (cVar = eVar.getTextColor()) == null) {
                    cVar = vn1.c.DEFAULT;
                }
                vn1.c cVar3 = cVar;
                fm1.c Z2 = d7.b.Z((eVar != null ? eVar.getStartIcon() : null) != null);
                if (eVar == null || (qVar = eVar.getStartIcon()) == null) {
                    qVar = GestaltIcon.f49401c;
                }
                rm1.f fVar = new rm1.f(qVar);
                if (eVar == null || (cVar2 = eVar.getStartIconColor()) == null) {
                    cVar2 = rm1.c.DEFAULT;
                }
                return rn1.a.y(it, p23, cVar3, null, null, null, 0, d7.b.Z(charSequence != null), null, null, new rm1.d(fVar, cVar2, Z2, 0, null, 24), false, 0, null, null, null, null, null, false, null, null, 2096572);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                Spanned fromHtml = Html.fromHtml(((do0.b) obj2).getString(k70.e.section_merge_content_view_message, (String) obj));
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(fromHtml), null, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar4 = fm1.c.VISIBLE;
                String string = ((ConversationMessageItemView) obj2).getContext().getString(xc0.i.shared_off_pinterest);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new f0(string), null, (List) obj, null, null, 0, cVar4, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097082);
        }
    }

    public final tk0.e f(tk0.e it) {
        int i13 = this.f113087i;
        Object obj = this.f113089k;
        Object obj2 = this.f113088j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                lt.j jVar = (lt.j) obj2;
                List list = it.f117955a;
                tk0.g gVar = (tk0.g) obj;
                boolean z13 = gVar.f117965d > 0;
                jVar.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a.e((a) it2.next(), z13));
                }
                boolean z14 = it.f117956b.f135350b;
                jl0.d boardViewState = gVar.f117962a;
                Intrinsics.checkNotNullParameter(boardViewState, "boardViewState");
                return tk0.e.e(it, arrayList, new xm0.a(gVar.f117965d, z14, boardViewState), null, false, 12);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                tk0.i0 i0Var = (tk0.i0) ((l82.e) obj).f82219b;
                ((lt.j) obj2).getClass();
                return lt.j.g(i0Var);
        }
    }

    public final void h(int i13) {
        int i14 = this.f113087i;
        Object obj = this.f113089k;
        Object obj2 = this.f113088j;
        switch (i14) {
            case 5:
                hl0.v vVar = (hl0.v) obj2;
                com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                if (aVar != null) {
                    ((z) aVar).x2();
                }
                Integer e13 = ((b60) ((List) obj).get(i13)).e();
                Intrinsics.checkNotNullExpressionValue(e13, "getPinType(...)");
                vVar.e4(e13.intValue());
                break;
            default:
                un0.h hVar = (un0.h) obj2;
                sn0.a aVar2 = (sn0.a) hVar.getViewIfBound();
                if (aVar2 != null) {
                    ((wn0.j) aVar2).x2();
                }
                Integer e14 = ((b60) ((List) obj).get(i13)).e();
                Intrinsics.checkNotNullExpressionValue(e14, "getPinType(...)");
                int intValue = e14.intValue();
                if (hVar.f122858z != null && hVar.C != intValue) {
                    hVar.C = intValue;
                    hVar.onRecyclerRefresh();
                    break;
                }
                break;
        }
    }

    public final void i(Throwable th3) {
        int i13 = this.f113087i;
        Object obj = this.f113088j;
        Object obj2 = this.f113089k;
        switch (i13) {
            case 8:
                xl0.d dVar = (xl0.d) obj;
                dVar.getClass();
                u7 G1 = ((v7) obj2).G1();
                G1.Q(Boolean.valueOf(!r2.D1().booleanValue()));
                v7 a13 = G1.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                dVar.p3(a13);
                break;
            case 16:
                pe.i.r1(((mn0.e) obj).f87773l, (f30) obj2);
                break;
            default:
                co0.d dVar2 = (co0.d) obj2;
                String message = th3.getMessage();
                if (message != null && message.length() != 0) {
                    dVar2.f28279d.i(th3.getMessage());
                    break;
                } else {
                    dVar2.f28279d.i(((yk1.a) dVar2.f28280e).f139224a.getString(m60.x0.generic_error));
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d8  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.CharSequence] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sk0.x.invoke(java.lang.Object):java.lang.Object");
    }
}
