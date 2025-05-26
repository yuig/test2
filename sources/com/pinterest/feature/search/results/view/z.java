package com.pinterest.feature.search.results.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import h32.d4;
import i32.y0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q5.w0;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47835i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47836j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(SearchGridMultiSectionFragment searchGridMultiSectionFragment, int i13) {
        super(1);
        this.f47835i = i13;
        this.f47836j = searchGridMultiSectionFragment;
    }

    public final void b(vd0.c cVar) {
        int i13 = this.f47835i;
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47836j;
        switch (i13) {
            case 0:
                rg0.s a13 = rg0.y.a();
                y0 y0Var = y0.ANDROID_HYBRID_SEARCH_RESULTS;
                rg0.n c13 = ((dh0.d) a13).c(y0Var);
                if (c13 != null) {
                    WeakReference weakReference = new WeakReference(searchGridMultiSectionFragment);
                    OneBarContainer oneBarContainer = searchGridMultiSectionFragment.C1;
                    if (oneBarContainer == null) {
                        Intrinsics.r("oneBarContainerView");
                        throw null;
                    }
                    RecyclerView recyclerView = oneBarContainer.getPinterestRecyclerView().f52531a;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
                    w0 O = d7.b.O(recyclerView);
                    Intrinsics.checkNotNullParameter(O, "<this>");
                    Iterator it = O.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Sequence is empty.");
                    }
                    kg.a.X(c13, y0Var, weakReference, null, (View) it.next());
                    return;
                }
                return;
            default:
                searchGridMultiSectionFragment.f47736u2 = ur0.g.g(y0.ANDROID_SEARCH_PIN_RESULTS_TAKEOVER, searchGridMultiSectionFragment, null);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f47835i;
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47836j;
        switch (i13) {
            case 0:
                b((vd0.c) obj);
                return Unit.f80348a;
            case 1:
                b((vd0.c) obj);
                return Unit.f80348a;
            case 2:
                h32.i0 source = (h32.i0) obj;
                Intrinsics.checkNotNullParameter(source, "it");
                Intrinsics.checkNotNullParameter(source, "source");
                d4 d4Var = source.f67081a;
                return new h32.i0(searchGridMultiSectionFragment.f47728q2, searchGridMultiSectionFragment.f47730r2, source.f67083c, source.f67084d, source.f67085e, source.f67086f);
            default:
                h32.i0 i0Var = (h32.i0) obj;
                bz.i w73 = searchGridMultiSectionFragment.w7();
                Intrinsics.f(i0Var);
                int i14 = bz.i.f24182g;
                w73.f(i0Var, null);
                return Unit.f80348a;
        }
    }
}
