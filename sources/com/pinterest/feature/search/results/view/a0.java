package com.pinterest.feature.search.results.view;

import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import i32.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;
import t3.s1;

/* loaded from: classes5.dex */
public final class a0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f47761r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchGridMultiSectionFragment f47762s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(SearchGridMultiSectionFragment searchGridMultiSectionFragment, bl2.c cVar) {
        super(2, cVar);
        this.f47762s = searchGridMultiSectionFragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a0(this.f47762s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f47761r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f47761r = 1;
            if (lb.l0.S(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        SearchGridMultiSectionFragment searchGridMultiSectionFragment = this.f47762s;
        OneBarContainer oneBarContainer = searchGridMultiSectionFragment.C1;
        if (oneBarContainer != null) {
            RecyclerView recyclerView = oneBarContainer.getPinterestRecyclerView().f52531a;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
            if (yn2.c0.h(d7.b.O(recyclerView)) >= 1) {
                rg0.s sVar = searchGridMultiSectionFragment.f47702d1;
                if (sVar == null) {
                    Intrinsics.r("experiences");
                    throw null;
                }
                searchGridMultiSectionFragment.R6(nl.b.s(s1.f(((dh0.d) sVar).g(y0.ANDROID_HYBRID_SEARCH_RESULTS, null, new tg0.c(false, false)).H(tk2.e.f118017c), "observeOn(...)"), new z(searchGridMultiSectionFragment, 0), null, null, 6));
                return Unit.f80348a;
            }
        }
        return Unit.f80348a;
    }
}
