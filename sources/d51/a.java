package d51;

import b11.j0;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.pin.reactions.view.PinReactionIconButton;
import com.pinterest.feature.search.results.view.GraphQLSearchGridFragment;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import uj2.f0;
import uj2.t;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.f, ak2.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f53685b;

    public /* synthetic */ a(int i13, Function1 function1) {
        this.f53684a = i13;
        this.f53685b = function1;
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        int i13 = this.f53684a;
        Function1 function1 = this.f53685b;
        switch (i13) {
            case 0:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 1:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 2:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 3:
                return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 4:
                return (i0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 5:
                return (t) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 6:
                int i14 = GraphQLSearchGridFragment.H1;
                return (h32.i0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 7:
                int i15 = SearchGridMultiSectionFragment.O2;
                return (h32.i0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 8:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 9:
                return (Iterable) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 10:
                return (t) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 11:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 12:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 13:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 14:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 15:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 16:
                return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 17:
                return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 18:
                return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 19:
                return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 20:
                return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 21:
                return (z71.c) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 22:
                return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 23:
                return (z71.c) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 24:
                return (i0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 25:
                return (f0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 26:
                return (i0) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 27:
                return (t) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            case 28:
                return (List) ep.b.j(function1, "$tmp0", obj, "p0", obj);
            default:
                return (String) ep.b.j(function1, "$tmp0", obj, "p0", obj);
        }
    }

    @Override // ak2.g
    public boolean test(Object obj) {
        boolean observeRelatedPinsDataReset$lambda$9;
        boolean observeRelatedPinsFirstPageLoad$lambda$12;
        int i13 = this.f53684a;
        Function1 function1 = this.f53685b;
        switch (i13) {
            case 0:
                observeRelatedPinsDataReset$lambda$9 = PinCloseupPresenter.observeRelatedPinsDataReset$lambda$9(function1, obj);
                break;
            case 1:
                observeRelatedPinsFirstPageLoad$lambda$12 = PinCloseupPresenter.observeRelatedPinsFirstPageLoad$lambda$12(function1, obj);
                break;
            case 2:
                int i14 = PinCloseupFragment.f46972m3;
                break;
            case 3:
                int i15 = j0.W;
                break;
            case 7:
                int i16 = PinReactionIconButton.f47261z;
                break;
        }
        return ((Boolean) ep.b.j(function1, "$tmp0", obj, "p0", obj)).booleanValue();
    }
}
