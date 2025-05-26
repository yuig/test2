package ez1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.l;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.selectList.GestaltSelectList;
import ex1.n;
import h32.d4;
import i92.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.p;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lez1/d;", "Lnl1/d;", "<init>", "()V", "pinalyticsPlayground_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends f {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f60704l0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public RecyclerView f60705c0;

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f60706d0;

    /* renamed from: e0, reason: collision with root package name */
    public vx.d f60707e0;

    /* renamed from: f0, reason: collision with root package name */
    public vx.c f60708f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltSearchField f60709g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f60710h0;

    /* renamed from: i0, reason: collision with root package name */
    public l f60711i0;

    /* renamed from: j0, reason: collision with root package name */
    public k f60712j0;

    /* renamed from: k0, reason: collision with root package name */
    public final List f60713k0 = f0.j("VIDEO_PLAYBACK_INTERVAL", "PIN_IMPRESSION_ONE_PIXEL");

    public final void Y7(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f60706d0;
        if (arrayList2 == null) {
            Intrinsics.r("dataList");
            throw null;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (StringsKt.E(gVar.b(), str, true) || StringsKt.E(gVar.c(), str, true) || StringsKt.E(gVar.a(), str, true)) {
                arrayList.add(gVar);
            }
        }
        a8(arrayList);
    }

    public final k Z7() {
        k kVar = this.f60712j0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    public final void a8(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            i92.a.a(Z7(), "No Data Found..", false, 6);
            return;
        }
        l lVar = this.f60711i0;
        if (lVar != null) {
            lVar.E(arrayList);
        } else {
            Intrinsics.r("eventsDetailsAdapter");
            throw null;
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getB0() {
        return d4.APPLICATION;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(dz1.c.event_context_fields_details_container, viewGroup, false);
        vx.c cVar = this.f60708f0;
        if (cVar == null) {
            Intrinsics.r("contextLogViewHelper");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        cVar.a(requireActivity);
        View findViewById = inflate.findViewById(dz1.b.filterByGroupedEventTypesSelectList);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSelectList gestaltSelectList = (GestaltSelectList) findViewById;
        View findViewById2 = inflate.findViewById(dz1.b.groupEventsButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        gestaltButton.e(new la1.k(29, this, gestaltButton));
        this.f60709g0 = (GestaltSearchField) inflate.findViewById(dz1.b.filterToolBar);
        View findViewById3 = inflate.findViewById(dz1.b.eventDetailsDevToolRecyclerView);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f60705c0 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        getContext();
        recyclerView.R2(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.f60705c0;
        if (recyclerView2 == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        recyclerView2.m(new b0(getContext(), 1));
        this.f60706d0 = new ArrayList();
        vx.d dVar = this.f60707e0;
        if (dVar == null) {
            Intrinsics.r("eventLogger");
            throw null;
        }
        ArrayList H0 = CollectionsKt.H0(dVar.f126811b);
        vx.d dVar2 = this.f60707e0;
        if (dVar2 == null) {
            Intrinsics.r("eventLogger");
            throw null;
        }
        ArrayList H02 = CollectionsKt.H0(dVar2.f126812c);
        vx.d dVar3 = this.f60707e0;
        if (dVar3 == null) {
            Intrinsics.r("eventLogger");
            throw null;
        }
        ArrayList H03 = CollectionsKt.H0(dVar3.f126813d);
        if (!H0.isEmpty() && !H02.isEmpty() && !H03.isEmpty()) {
            int min = Math.min(H0.size(), Math.min(H02.size(), H03.size()));
            for (int i13 = 0; i13 < min; i13++) {
                g gVar = new g((String) H0.get(i13), (String) H02.get(i13), (String) H03.get(i13));
                ArrayList arrayList = this.f60706d0;
                if (arrayList == null) {
                    Intrinsics.r("dataList");
                    throw null;
                }
                arrayList.add(gVar);
            }
        }
        ArrayList arrayList2 = this.f60706d0;
        if (arrayList2 == null) {
            Intrinsics.r("dataList");
            throw null;
        }
        l lVar = new l(arrayList2);
        this.f60711i0 = lVar;
        RecyclerView recyclerView3 = this.f60705c0;
        if (recyclerView3 == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        recyclerView3.H2(lVar);
        GestaltSearchField gestaltSearchField = this.f60709g0;
        if (gestaltSearchField != null) {
            gestaltSearchField.g0(new b(this, gestaltSearchField));
        }
        Context context = gestaltSelectList.getContext();
        if (context != null) {
            String[] stringArray = context.getResources().getStringArray(dz1.a.event_types_array);
            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
            p.n(gestaltSelectList, new n(stringArray, 15));
            gestaltSelectList.L(new b(0, gestaltSelectList, this));
        }
        return inflate;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        FragmentActivity activity = E4();
        if (activity != null) {
            if (this.f60708f0 != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            } else {
                Intrinsics.r("contextLogViewHelper");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z13) {
        super.onHiddenChanged(z13);
        if (z13) {
            FragmentActivity activity = E4();
            if (activity != null) {
                if (this.f60708f0 != null) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    return;
                } else {
                    Intrinsics.r("contextLogViewHelper");
                    throw null;
                }
            }
            return;
        }
        FragmentActivity E4 = E4();
        if (E4 != null) {
            vx.c cVar = this.f60708f0;
            if (cVar != null) {
                cVar.a(E4);
            } else {
                Intrinsics.r("contextLogViewHelper");
                throw null;
            }
        }
    }
}
