package oh1;

import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.f30;
import i32.y0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import t3.s1;

/* loaded from: classes5.dex */
public final class f implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f94504a;

    public f(m mVar) {
        this.f94504a = mVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.f event) {
        dl1.s sVar;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f100062c;
        m mVar = this.f94504a;
        if (Intrinsics.d(str, mVar.f94536r)) {
            if (m.H3(mVar.f94537s) && mVar.x3().f49127q.size() == 1) {
                f30 f30Var = mVar.f94537s;
                Intrinsics.f(f30Var);
                m.t3(mVar, 1, f30Var);
            } else if (m.W3() && mVar.x3().f49127q.size() == 0) {
                f30 f30Var2 = mVar.f94537s;
                Intrinsics.f(f30Var2);
                m.t3(mVar, 1, f30Var2);
            }
            rp0.d dVar = event.f100060a;
            if (dVar instanceof rp0.b) {
                Intrinsics.g(dVar, "null cannot be cast to non-null type com.pinterest.feature.comment.unifiedcomments.model.UnifiedComment.UnifiedAggregatedComment");
                sVar = ((rp0.b) dVar).f109053a;
            } else if (dVar instanceof rp0.c) {
                Intrinsics.g(dVar, "null cannot be cast to non-null type com.pinterest.feature.comment.unifiedcomments.model.UnifiedComment.UnifiedUserDidIt");
                sVar = ((rp0.c) dVar).f109054a;
            } else {
                sVar = null;
            }
            if (sVar != null) {
                mh1.d x33 = mVar.x3();
                if (x33.getItem(0) instanceof f30) {
                    x33.removeItem(0);
                }
                if (m.H3(mVar.f94537s)) {
                    x33.P(2, sVar);
                } else if (m.W3()) {
                    x33.P(1, sVar);
                } else {
                    x33.P(0, sVar);
                }
            }
            ((rh1.k) ((com.pinterest.feature.unifiedcomments.d) mVar.getView())).E8(0, true);
            HashMap hashMap = new HashMap();
            FragmentActivity requireActivity = ((rh1.k) ((com.pinterest.feature.unifiedcomments.d) mVar.getView())).requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            hashMap.putAll(dl2.b.k0(requireActivity, mVar.f94535q));
            mVar.addDisposable(nl.b.s(s1.f(((dh0.d) mVar.f94527i).g(y0.ANDROID_COMMENT_FEED_TAKEOVER_AFTER_COMMENT_SUBMISSION, hashMap, new tg0.c(false, false)).H(tk2.e.f118017c), "observeOn(...)"), new d(mVar, 9), null, null, 6));
            mVar.N3();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f94504a.Z3(event.f100066a, event.f100067b);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f94504a.z3().e(event.f100068a, event.f100069b, false);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event.f100072b;
        m mVar = this.f94504a;
        if (z13) {
            mVar.T3(event.f100071a);
        } else {
            mVar.onRecyclerRefresh();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m mVar = this.f94504a;
        if (m.H3(mVar.f94537s)) {
            mVar.D3(e.f94492p);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m mVar = this.f94504a;
        if (m.H3(mVar.f94537s)) {
            mVar.D3(e.f94490n);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m mVar = this.f94504a;
        if (m.H3(mVar.f94537s)) {
            mVar.D3(e.f94491o);
        }
    }
}
