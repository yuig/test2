package jn0;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.gestalt.toast.GestaltToast;
import do1.j;
import do1.l;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import rm1.i;
import rm1.q;
import u50.f0;
import ye2.m;

/* loaded from: classes5.dex */
public final class f extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f77086d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f77087e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f77088f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f77089g;

    public f(q qVar, int i13, int i14) {
        this((i14 & 1) != 0 ? null : qVar, i13, q0.f80391a);
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        int i13 = this.f77087e;
        int i14 = this.f77086d;
        Object obj = this.f77089g;
        Object obj2 = this.f77088f;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Object[] array = ((List) obj).toArray(new Object[0]);
                q qVar = (q) obj2;
                return new GestaltToast(context, new do1.d(new f0(bs1.c.g2(container, i13, Arrays.copyOf(array, array.length))), qVar != null ? new l(new rm1.f(qVar, i.LG)) : null, null, null, 0, 0, 0, null, false, 508));
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context it = (Context) obj2;
                Intrinsics.checkNotNullExpressionValue(it, "$it");
                SearchGridMultiSectionFragment searchGridMultiSectionFragment = (SearchGridMultiSectionFragment) obj;
                String string = searchGridMultiSectionFragment.getString(nv1.f.error_message_for_persisted_skin_tone_by_search_session);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return new GestaltToast(it, new do1.d(bs1.c.h2(string), new j(bs1.c.g0(searchGridMultiSectionFragment, i13, null, 6)), null, null, 0, 0, 0, null, true, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN));
        }
    }

    public f(q qVar, int i13, List formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.f77088f = qVar;
        this.f77087e = i13;
        this.f77089g = formatArgs;
    }

    public f(m mVar, SearchGridMultiSectionFragment searchGridMultiSectionFragment, int i13) {
        this.f77088f = mVar;
        this.f77089g = searchGridMultiSectionFragment;
        this.f77087e = i13;
    }
}
