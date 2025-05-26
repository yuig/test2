package b2;

import android.content.Context;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadHeader;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.screens.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21213i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f21214j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f21215k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, int i13, int i14) {
        super(0);
        this.f21213i = i14;
        this.f21215k = obj;
        this.f21214j = i13;
    }

    public final Integer b() {
        int i13 = this.f21213i;
        int i14 = this.f21214j;
        Object obj = this.f21215k;
        switch (i13) {
            case 0:
                return Integer.valueOf(((m) obj).f21178d.f(i14));
            case 4:
                return Integer.valueOf(((com.pinterest.feature.pin.closeup.datasource.k) obj).f46950l.getItemViewType(i14));
            default:
                vo.i iVar = com.pinterest.feature.pin.closeup.datasource.l.V;
                return Integer.valueOf(((com.pinterest.feature.pin.closeup.datasource.l) obj).E.getItemViewType(i14));
        }
    }

    public final View e() {
        c42.c cVar = null;
        int i13 = this.f21213i;
        int i14 = this.f21214j;
        Object obj = this.f21215k;
        switch (i13) {
            case 3:
                Context context = ((dx0.y) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                we1.c cVar2 = new we1.c(context, i14);
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, GridLayout.FILL, 1.0f);
                layoutParams.rowSpec = GridLayout.spec(Integer.MIN_VALUE, GridLayout.START, 1.0f);
                layoutParams.height = -1;
                layoutParams.width = i14;
                cVar2.setLayoutParams(layoutParams);
                return cVar2;
            case 9:
                com.pinterest.feature.todaytab.articlefeed.j jVar = (com.pinterest.feature.todaytab.articlefeed.j) obj;
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner = jVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                nx.d0 s73 = jVar.s7();
                uj2.q p73 = jVar.p7();
                switch (i14) {
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO /* 197 */:
                        cVar = c42.c.HERO;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION /* 198 */:
                        cVar = c42.c.THREE_PIN_COLLECTION;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO /* 199 */:
                        cVar = c42.c.SINGLE_VIDEO;
                        break;
                    case 200:
                        cVar = c42.c.SINGLE_PIN;
                        break;
                    case 201:
                        cVar = c42.c.IDEA_STREAM;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN /* 202 */:
                        cVar = c42.c.STORY_PIN;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER /* 203 */:
                        cVar = c42.c.CUSTOM_COVER;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR /* 204 */:
                        cVar = c42.c.SINGLE_CREATOR;
                        break;
                }
                return kh2.b0.w0(requireContext, S, s73, p73, cVar);
            default:
                com.pinterest.feature.todaytab.tab.view.k kVar = (com.pinterest.feature.todaytab.tab.view.k) obj;
                Context requireContext2 = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner2 = kVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S2 = bf.b.S(viewLifecycleOwner2);
                nx.d0 s74 = kVar.s7();
                uj2.q p74 = kVar.p7();
                switch (i14) {
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO /* 197 */:
                        cVar = c42.c.HERO;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION /* 198 */:
                        cVar = c42.c.THREE_PIN_COLLECTION;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO /* 199 */:
                        cVar = c42.c.SINGLE_VIDEO;
                        break;
                    case 200:
                        cVar = c42.c.SINGLE_PIN;
                        break;
                    case 201:
                        cVar = c42.c.IDEA_STREAM;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN /* 202 */:
                        cVar = c42.c.STORY_PIN;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER /* 203 */:
                        cVar = c42.c.CUSTOM_COVER;
                        break;
                    case RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR /* 204 */:
                        cVar = c42.c.SINGLE_CREATOR;
                        break;
                }
                return kh2.b0.w0(requireContext2, S2, s74, p74, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f21214j;
        int i14 = this.f21213i;
        Object obj = this.f21215k;
        switch (i14) {
            case 0:
                return b();
            case 1:
                m71invoke();
                return Unit.f80348a;
            case 2:
                m71invoke();
                return Unit.f80348a;
            case 3:
                return e();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return new SearchTypeaheadHeader((Context) obj, i13, true, 4);
            case 7:
                m71invoke();
                return Unit.f80348a;
            case 8:
                m71invoke();
                return Unit.f80348a;
            case 9:
                return e();
            case 10:
                return e();
            default:
                Object obj2 = ((am2.d) obj).x().get(i13);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return (am2.p0) obj2;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m71invoke() {
        int i13 = this.f21213i;
        int i14 = this.f21214j;
        Object obj = this.f21215k;
        switch (i13) {
            case 1:
                ((s2.t) obj).set(i14, Boolean.valueOf(!((Boolean) r1.get(i14)).booleanValue()));
                break;
            case 2:
                bv0.l lVar = (bv0.l) obj;
                av0.f.a2(lVar.f23949s, i14 > 0 ? IdeaPinCreationLocation.IDEA_PIN_CREATION_PRODUCT_TAG_LIST : d2.p(), h32.u0.STORY_PIN_PRODUCT_TAGS_SECTION, lVar.f23942l, null, 20);
                break;
            case 7:
                int i15 = q91.g.f103100c;
                ((q91.g) obj).a().t(new zx0.d(i14, 17));
                break;
            default:
                ContactSearchListCell contactSearchListCell = (ContactSearchListCell) obj;
                fd1.j jVar = contactSearchListCell.f48392i;
                if (jVar != null) {
                    dr.k kVar = (dr.k) jVar;
                    Object obj2 = kVar.f56200o.get(i14);
                    LinearLayout linearLayout = (LinearLayout) contactSearchListCell.findViewById(vc0.b.view_chat_button_container);
                    GestaltText gestaltText = (GestaltText) contactSearchListCell.findViewById(vc0.b.inline_send_confirmation);
                    if (obj2 instanceof TypeAheadItem) {
                        TypeAheadItem typeAheadItem = (TypeAheadItem) obj2;
                        g91.c cVar = g91.c.RECIPIENT;
                        m60.w wVar = kVar.C;
                        if (kVar.f56190e == cVar) {
                            contactSearchListCell.a(false);
                            if (gestaltText != null) {
                                gestaltText.i(new xo.j(19));
                            }
                            wVar.d(new dr.e(kVar, typeAheadItem, i14, contactSearchListCell, gestaltText, linearLayout));
                        } else {
                            wVar.d(new dr.f(kVar, typeAheadItem, i14, contactSearchListCell, gestaltText));
                        }
                        ig1.b.N0(linearLayout);
                        break;
                    }
                }
                break;
        }
    }
}
