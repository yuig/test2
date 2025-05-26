package com.google.android.material.textfield;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.activity.conversation.view.PeopleFacetSearchBar;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.feature.sendshare.view.ContactSearchAndSelectModalView;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kh2.u2;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes3.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33308b;

    public /* synthetic */ r(Object obj, int i13) {
        this.f33307a = i13;
        this.f33308b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        Object item;
        View selectedView;
        int selectedItemPosition;
        long selectedItemId;
        f1 f1Var;
        er.c cVar;
        er.c cVar2;
        int i14 = this.f33307a;
        int i15 = 0;
        Object obj = this.f33308b;
        TypeAheadItem typeAheadItem = null;
        switch (i14) {
            case 0:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) obj;
                if (i13 < 0) {
                    ListPopupWindow listPopupWindow = materialAutoCompleteTextView.f33151e;
                    item = !listPopupWindow.f16397z.isShowing() ? null : listPopupWindow.f16374c.getSelectedItem();
                } else {
                    item = materialAutoCompleteTextView.getAdapter().getItem(i13);
                }
                MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) obj;
                MaterialAutoCompleteTextView.a(materialAutoCompleteTextView2, item);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView2.getOnItemClickListener();
                ListPopupWindow listPopupWindow2 = materialAutoCompleteTextView2.f33151e;
                if (onItemClickListener != null) {
                    if (view == null || i13 < 0) {
                        selectedView = !listPopupWindow2.f16397z.isShowing() ? null : listPopupWindow2.f16374c.getSelectedView();
                        selectedItemPosition = !listPopupWindow2.f16397z.isShowing() ? -1 : listPopupWindow2.f16374c.getSelectedItemPosition();
                        selectedItemId = !listPopupWindow2.f16397z.isShowing() ? Long.MIN_VALUE : listPopupWindow2.f16374c.getSelectedItemId();
                    } else {
                        selectedItemId = j13;
                        selectedView = view;
                        selectedItemPosition = i13;
                    }
                    onItemClickListener.onItemClick(listPopupWindow2.f16374c, selectedView, selectedItemPosition, selectedItemId);
                }
                listPopupWindow2.dismiss();
                return;
            case 1:
                cp.n nVar = (cp.n) obj;
                TypeAheadItem typeAheadItem2 = (TypeAheadItem) nVar.f52957o0.f56200o.get(i13);
                er.c cVar3 = typeAheadItem2.f35145f;
                if (cVar3 == er.c.EMAIL_PLACEHOLDER) {
                    String str = nVar.f52959q0;
                    if (!tr1.b.c(str)) {
                        nVar.f52955m0.i(nVar.getResources().getString(a62.e.please_enter_a_valid_email));
                        return;
                    }
                    TypeAheadItem typeAheadItem3 = new TypeAheadItem();
                    typeAheadItem3.f35145f = er.c.EMAIL_CONTACT;
                    typeAheadItem3.f35143d = str;
                    typeAheadItem2 = typeAheadItem3;
                } else if (cVar3 == er.c.CONNECT_FB_PLACEHOLDER) {
                    nVar.f52951i0.w(nVar.requireActivity(), e82.w.FACEBOOK);
                    return;
                }
                if (nVar.f52957o0.j(typeAheadItem2) || !nVar.f52958p0.add(typeAheadItem2)) {
                    if (!nVar.f52958p0.remove(typeAheadItem2)) {
                        Iterator it = ((Set) nVar.f52957o0.f56031J).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                TypeAheadItem typeAheadItem4 = (TypeAheadItem) it.next();
                                if (typeAheadItem4.A() != null && typeAheadItem4.A().equals(typeAheadItem2.A())) {
                                    typeAheadItem = typeAheadItem4;
                                }
                            }
                        }
                        nVar.f52958p0.remove(typeAheadItem);
                        typeAheadItem2 = typeAheadItem;
                    }
                    PeopleFacetSearchBar peopleFacetSearchBar = nVar.f52947e0;
                    int childCount = peopleFacetSearchBar.f34885a.getChildCount();
                    while (true) {
                        if (i15 < childCount) {
                            View childAt = peopleFacetSearchBar.f34885a.getChildAt(i15);
                            if (typeAheadItem2.equals(childAt.getTag())) {
                                peopleFacetSearchBar.f34885a.removeView(childAt);
                            } else {
                                i15++;
                            }
                        }
                    }
                    ((Set) nVar.f52957o0.f56031J).remove(typeAheadItem2);
                } else {
                    nVar.f52947e0.a(typeAheadItem2);
                    nVar.f52957o0.k(typeAheadItem2);
                }
                nVar.Y7();
                nVar.f52957o0.getView(i13, view, adapterView);
                return;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                ContactSearchAndSelectModalView contactSearchAndSelectModalView = (ContactSearchAndSelectModalView) obj;
                dr.k kVar = contactSearchAndSelectModalView.f48074n;
                if (kVar == null) {
                    Intrinsics.r("adapter");
                    throw null;
                }
                Object obj2 = kVar.f56200o.get(i13);
                if (obj2 instanceof TypeAheadItem) {
                    GestaltSearchField gestaltSearchField = contactSearchAndSelectModalView.f48075o;
                    if (gestaltSearchField == null) {
                        Intrinsics.r("searchEt");
                        throw null;
                    }
                    gestaltSearchField.clearFocus();
                    GestaltSearchField gestaltSearchField2 = contactSearchAndSelectModalView.f48075o;
                    if (gestaltSearchField2 == null) {
                        Intrinsics.r("searchEt");
                        throw null;
                    }
                    hf0.b.k(gestaltSearchField2);
                    TypeAheadItem typeAheadItem5 = (TypeAheadItem) obj2;
                    if (typeAheadItem5 != null && (cVar2 = typeAheadItem5.f35145f) != er.c.SEARCH_PLACEHOLDER && cVar2 != er.c.CONNECT_FB_PLACEHOLDER) {
                        if (cVar2 == er.c.EMAIL_PLACEHOLDER && !ig1.b.v(typeAheadItem5)) {
                            Context context = kb0.a.f79058b;
                            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(view.getResources().getString(a62.e.please_enter_a_valid_email));
                            return;
                        } else if (typeAheadItem5.f35145f != er.c.SYNC_CONTACTS_PLACEHOLDER) {
                            boolean z13 = !typeAheadItem5.f35152m;
                            typeAheadItem5.f35152m = z13;
                            view.findViewById(wy1.d.pinner_avatars);
                            view.findViewById(wy1.d.pinner_iv_container);
                            GestaltButtonToggle gestaltButtonToggle = (GestaltButtonToggle) view.findViewById(wy1.d.inline_add_button);
                            Intrinsics.f(gestaltButtonToggle);
                            u2.x(gestaltButtonToggle, new u81.h(z13, 4));
                        }
                    }
                    if (typeAheadItem5 == null || (cVar = typeAheadItem5.f35145f) == er.c.SEARCH_PLACEHOLDER || cVar == er.c.CONNECT_FB_PLACEHOLDER) {
                        f1Var = f1.TAP;
                        er.c cVar4 = typeAheadItem5.f35145f;
                        vb0.j.f125466a.S(cVar4 == er.c.CONNECT_FB_PLACEHOLDER, "Unexpected contact item type " + cVar4, new Object[0]);
                        androidx.appcompat.widget.x xVar = contactSearchAndSelectModalView.f48065e;
                        if (xVar == null) {
                            Intrinsics.r("socialConnectManager");
                            throw null;
                        }
                        Context context2 = contactSearchAndSelectModalView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        Activity k03 = bs1.c.k0(context2);
                        Intrinsics.g(k03, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        xVar.w((FragmentActivity) k03, e82.w.FACEBOOK);
                    } else {
                        if (typeAheadItem5.f35152m) {
                            h91.a aVar = h91.a.f68311d;
                            aVar.getClass();
                            String b13 = h91.a.b(typeAheadItem5);
                            LinkedHashMap linkedHashMap = aVar.f68314c;
                            if (linkedHashMap.containsKey(b13)) {
                                linkedHashMap.remove(b13);
                            } else {
                                aVar.f68313b.put(b13, typeAheadItem5);
                            }
                            f1Var = f1.TOGGLE_ON;
                        } else {
                            h91.a aVar2 = h91.a.f68311d;
                            aVar2.getClass();
                            String b14 = h91.a.b(typeAheadItem5);
                            LinkedHashMap linkedHashMap2 = aVar2.f68313b;
                            if (linkedHashMap2.containsKey(b14)) {
                                linkedHashMap2.remove(b14);
                            } else {
                                aVar2.f68314c.put(b14, typeAheadItem5);
                            }
                            f1Var = f1.TOGGLE_OFF;
                        }
                        contactSearchAndSelectModalView.j();
                    }
                    f1 f1Var2 = f1Var;
                    u0 u0Var = u0.SEARCH_CONTACT_LIST_ITEM;
                    g0 g0Var = g0.SOCIAL_TYPEAHEAD_SUGGESTIONS;
                    Pair[] pairArr = new Pair[2];
                    GestaltSearchField gestaltSearchField3 = contactSearchAndSelectModalView.f48075o;
                    if (gestaltSearchField3 == null) {
                        Intrinsics.r("searchEt");
                        throw null;
                    }
                    pairArr[0] = new Pair("entered_query", gestaltSearchField3.I0());
                    pairArr[1] = new Pair("result_index", String.valueOf(i13));
                    contactSearchAndSelectModalView.D.h0(f1Var2, u0Var, g0Var, null, z0.f(pairArr), null, null, false);
                    return;
                }
                return;
        }
    }
}
