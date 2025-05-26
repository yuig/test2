package xq0;

import com.pinterest.api.model.e40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.xi;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.zi;
import dc0.e;
import df.j1;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import z32.m0;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135654a;

    public /* synthetic */ a(int i13) {
        this.f135654a = i13;
    }

    public static ArrayList c(List list) {
        if (list != null) {
            list.isEmpty();
        }
        Intrinsics.checkNotNullParameter("prefetch a DynamicStory:ExploreArticle model", "message");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                if (sVar instanceof xk) {
                    String b13 = n10.b.b((xk) sVar);
                    if (b13.length() > 0) {
                        arrayList.add(b13);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // xq0.d
    public final boolean a(s model) {
        switch (this.f135654a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                return model instanceof v7;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                return model instanceof vh;
        }
    }

    @Override // xq0.d
    public final List b(s model) {
        List split$default;
        xi c13;
        zi contentVisibleItems;
        Float mobile;
        xi c14;
        zi contentVisibleItems2;
        Float tabletLandscape;
        xi c15;
        zi contentVisibleItems3;
        Float tabletPortrait;
        switch (this.f135654a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                if (!a(model)) {
                    return q0.f80391a;
                }
                v7 v7Var = (v7) model;
                Boolean Y0 = v7Var.Y0();
                Intrinsics.checkNotNullExpressionValue(Y0, "getHasCustomCover(...)");
                String v13 = Y0.booleanValue() ? kh2.d.v(v7Var) : "";
                List U0 = kh2.d.U0(v7Var);
                ArrayList arrayList = new ArrayList(g0.q(U0, 10));
                Iterator it = U0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e40) it.next()).c());
                }
                if (!z.j(v13)) {
                    List b13 = e0.b(v13);
                    split$default = StringsKt__StringsKt.split$default(v13, new String[]{"/"}, false, 0, 6, null);
                    String str = (String) d7.b.j0(split$default);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!z.h((String) next, str, false)) {
                            arrayList2.add(next);
                        }
                    }
                    arrayList = CollectionsKt.l0(arrayList2, b13);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((String) obj) != null && (!z.j(r4))) {
                        arrayList3.add(obj);
                    }
                }
                List y03 = CollectionsKt.y0(arrayList3, 3);
                String str2 = (String) CollectionsKt.U(0, y03);
                String str3 = (String) CollectionsKt.U(1, y03);
                String str4 = (String) CollectionsKt.U(2, y03);
                e style = e.MONTAGE;
                Intrinsics.checkNotNullParameter(style, "style");
                ArrayList arrayList4 = new ArrayList();
                if (str2 != null) {
                    arrayList4.add(str2);
                }
                if (str3 != null) {
                    arrayList4.add(str3);
                }
                if (str4 != null) {
                    arrayList4.add(str4);
                }
                return CollectionsKt.H0(arrayList4);
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                if (!a(model)) {
                    return q0.f80391a;
                }
                vh vhVar = (vh) model;
                ArrayList arrayList5 = new ArrayList();
                List<s> list = vhVar.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                if (list.isEmpty()) {
                    list = null;
                } else {
                    float f13 = 1.0f;
                    if (hf0.b.q() && hf0.b.o()) {
                        kh khVar = vhVar.f42858p;
                        if (khVar != null && (c15 = khVar.c()) != null && (contentVisibleItems3 = c15.getContentVisibleItems()) != null && (tabletPortrait = contentVisibleItems3.getTabletPortrait()) != null) {
                            f13 = tabletPortrait.floatValue();
                        }
                    } else if (hf0.b.q() && hf0.b.m()) {
                        kh khVar2 = vhVar.f42858p;
                        if (khVar2 != null && (c14 = khVar2.c()) != null && (contentVisibleItems2 = c14.getContentVisibleItems()) != null && (tabletLandscape = contentVisibleItems2.getTabletLandscape()) != null) {
                            f13 = tabletLandscape.floatValue();
                        }
                    } else {
                        kh khVar3 = vhVar.f42858p;
                        if (khVar3 != null && (c13 = khVar3.c()) != null && (contentVisibleItems = c13.getContentVisibleItems()) != null && (mobile = contentVisibleItems.getMobile()) != null) {
                            f13 = mobile.floatValue();
                        }
                    }
                    int ceil = (int) Math.ceil(f13);
                    if (list.size() > ceil) {
                        list = ceil > 1 ? list.subList(0, ceil) : list.subList(0, 0);
                    }
                }
                String v14 = vhVar.v();
                String q13 = vhVar.q();
                m0 m0Var = vhVar.f42868z;
                Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
                StringBuilder w13 = a.a.w("Judging a DynamicStorytype [", v14, "] storyType [", q13, "] containerType [");
                w13.append(m0Var);
                w13.append("] visibleObjects size [");
                w13.append(valueOf);
                w13.append("]");
                String message = w13.toString();
                Intrinsics.checkNotNullParameter(message, "message");
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    m0 m0Var2 = vhVar.f42868z;
                    m0 m0Var3 = m0.CAROUSEL;
                    if (m0Var2 == m0Var3 && z.i(vhVar.q(), "bubble_one_col", true)) {
                        Intrinsics.checkNotNullParameter("prefetch a non structured DynamicStory:ExploreArticle model, CAROUSEL:STORY_TYPE_BUBBLE_ONE_COL", "message");
                        arrayList5.addAll(c(vhVar.f42865w));
                    } else if (vhVar.f42868z == m0Var3) {
                        Intrinsics.checkNotNullParameter("prefetch a non structured DynamicStory:Pin model, CAROUSEL:ANY", "message");
                        List<s> list3 = vhVar.f42865w;
                        if (list3 != null) {
                            list3.isEmpty();
                        }
                        Intrinsics.checkNotNullParameter("prefetch a DynamicStory:Pin model", "message");
                        ArrayList arrayList6 = new ArrayList();
                        if (list3 != null) {
                            for (s sVar : list3) {
                                if (sVar instanceof f30) {
                                    f30 f30Var = (f30) sVar;
                                    if (j1.U0(f30Var.y4())) {
                                        String y43 = f30Var.y4();
                                        Intrinsics.f(y43);
                                        arrayList6.add(y43);
                                    }
                                }
                            }
                        }
                        arrayList5.addAll(arrayList6);
                    }
                } else {
                    s sVar2 = (s) list.get(0);
                    if (sVar2 instanceof f30) {
                        Intrinsics.checkNotNullParameter("prefetch a structured DynamicStory:Pin model", "message");
                        ArrayList arrayList7 = new ArrayList();
                        for (s sVar3 : list) {
                            String B0 = bs1.c.B0(sVar3 instanceof f30 ? (f30) sVar3 : null);
                            if (B0 != null && B0.length() > 0) {
                                arrayList7.add(B0);
                            }
                        }
                        arrayList5.addAll(arrayList7);
                    } else if (sVar2 instanceof xk) {
                        if (Intrinsics.d(vhVar.q(), "related_searches_organic")) {
                            arrayList5.addAll(c(list));
                        } else {
                            Intrinsics.checkNotNullExpressionValue(((xk) sVar2).e(), "getLargeCoverImageList(...)");
                            if (!r13.isEmpty()) {
                                list.isEmpty();
                                Intrinsics.checkNotNullParameter("prefetch a DynamicStory:ExploreArticle model", "message");
                                ArrayList arrayList8 = new ArrayList();
                                for (s sVar4 : list) {
                                    if (sVar4 instanceof xk) {
                                        List<String> e13 = ((xk) sVar4).e();
                                        List list4 = e13;
                                        if (list4 != null && !list4.isEmpty()) {
                                            Intrinsics.f(e13);
                                            for (String str5 : e13) {
                                                Intrinsics.f(str5);
                                                arrayList8.add(str5);
                                            }
                                        }
                                    }
                                }
                                arrayList5.addAll(arrayList8);
                            }
                        }
                    }
                }
                return arrayList5;
        }
    }
}
