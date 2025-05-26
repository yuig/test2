package sx0;

import android.content.Context;
import com.pinterest.feature.newshub.feed.view.NewsHubUnifiedInboxEmptyView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.h2;
import org.chromium.net.y;
import rb2.n;
import rb2.q;
import rb2.t;
import rb2.w;
import rb2.z;
import rx0.i;
import rx0.j;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115619i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f115620j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, int i13) {
        super(0);
        this.f115619i = i13;
        this.f115620j = gVar;
    }

    public final rb2.d b() {
        int i13 = this.f115619i;
        g gVar = this.f115620j;
        switch (i13) {
            case 8:
                Context requireContext = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new rb2.d(requireContext, true);
            default:
                Context requireContext2 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new rb2.d(requireContext2, true);
        }
    }

    public final i e() {
        int i13 = this.f115619i;
        g gVar = this.f115620j;
        switch (i13) {
            case 4:
                Context requireContext = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new i(requireContext, true);
            default:
                Context requireContext2 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new i(requireContext2, false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f115619i;
        g gVar = this.f115620j;
        switch (i13) {
            case 0:
                h2 h2Var = gVar.D0;
                if (h2Var != null) {
                    return Boolean.valueOf(h2Var.c());
                }
                Intrinsics.r("experiments");
                throw null;
            case 1:
                q qVar = gVar.M0;
                if (qVar != null) {
                    qVar.W();
                }
                return Unit.f80348a;
            case 2:
                Context requireContext = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new w(requireContext);
            case 3:
                Context requireContext2 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new NewsHubUnifiedInboxEmptyView(requireContext2);
            case 4:
                return e();
            case 5:
                return e();
            case 6:
                Context requireContext3 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new j(requireContext3, gVar.U8());
            case 7:
                Context requireContext4 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return new t(requireContext4, new y(), true);
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                Context requireContext5 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new rb2.i(requireContext5, true);
            case 11:
                Context requireContext6 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                return new n(requireContext6, true);
            case 12:
                Context requireContext7 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext7, "requireContext(...)");
                return new z(requireContext7);
            case 13:
                return new e(gVar);
            default:
                return new f(gVar);
        }
    }
}
