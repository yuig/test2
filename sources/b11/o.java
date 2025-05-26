package b11;

import androidx.recyclerview.widget.LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.search.results.view.GraphQLSearchGridFragment;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements androidx.recyclerview.widget.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk1.k f21070b;

    public /* synthetic */ o(wk1.k kVar, int i13) {
        this.f21069a = i13;
        this.f21070b = kVar;
    }

    @Override // androidx.recyclerview.widget.s0
    public final LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException a(Exception originalException) {
        int i13 = this.f21069a;
        wk1.k kVar = this.f21070b;
        switch (i13) {
            case 0:
                PinCloseupFragment this$0 = (PinCloseupFragment) kVar;
                int i14 = PinCloseupFragment.f46972m3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(originalException, "originalException");
                return new PinCloseupFragment.LayoutManagerException(this$0.h8(), originalException);
            case 1:
                GraphQLSearchGridFragment this$02 = (GraphQLSearchGridFragment) kVar;
                int i15 = GraphQLSearchGridFragment.H1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(originalException, "originalException");
                return new GraphQLSearchGridFragment.LayoutManagerException(this$02.h8(), originalException);
            default:
                SearchGridMultiSectionFragment this$03 = (SearchGridMultiSectionFragment) kVar;
                int i16 = SearchGridMultiSectionFragment.O2;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(originalException, "originalException");
                return new SearchGridMultiSectionFragment.LayoutManagerException(this$03.h8(), originalException);
        }
    }
}
