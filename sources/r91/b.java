package r91;

import android.content.Context;
import c52.e;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kh2.k3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.j0;
import nx.m;
import p91.v;
import qz.d;
import v.f1;
import xa0.j;
import yb0.k;
import yb0.l;
import yb0.n;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f106883a = f0.j(4800, 4801);

    public static final n a(Context context, nx.f0 pinalyticsFactory, Function0 onUserConfirmedSkip) {
        n a13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(onUserConfirmedSkip, "onUserConfirmedSkip");
        j0 a14 = ((m) pinalyticsFactory).a(new ss0.b(3));
        int i13 = n.f138503p;
        String string = context.getString(e.settings_skip_passcode_title);
        String string2 = context.getString(e.settings_skip_passcode_message);
        String string3 = context.getString(x0.update);
        String string4 = context.getString(x0.cancel);
        Intrinsics.f(string);
        Intrinsics.f(string3);
        Intrinsics.f(string4);
        a13 = j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? k.f138491j : new v(2, a14, onUserConfirmedSkip), (r20 & 64) != 0 ? k.f138492k : new a(a14, 0), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? k.f138493l : new a(a14, 1), (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? l.f138495j : null);
        return a13;
    }

    public static final boolean b(Throwable error) {
        f1 f1Var;
        d M;
        Intrinsics.checkNotNullParameter(error, "error");
        NetworkResponseError networkResponseError = error instanceof NetworkResponseError ? (NetworkResponseError) error : null;
        return (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null || M.f105387g != 1403) ? false : true;
    }

    public static final boolean c(Throwable error) {
        f1 f1Var;
        Intrinsics.checkNotNullParameter(error, "error");
        NetworkResponseError networkResponseError = error instanceof NetworkResponseError ? (NetworkResponseError) error : null;
        if (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || f1Var.f123449b != 401) {
            return false;
        }
        List list = f106883a;
        d M = k3.M(f1Var);
        return CollectionsKt.L(list, M != null ? Integer.valueOf(M.f105387g) : null);
    }

    public static final boolean d(Throwable error) {
        f1 f1Var;
        d M;
        Intrinsics.checkNotNullParameter(error, "error");
        NetworkResponseError networkResponseError = error instanceof NetworkResponseError ? (NetworkResponseError) error : null;
        return (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || f1Var.f123449b != 401 || (M = k3.M(f1Var)) == null || M.f105387g != 4811) ? false : true;
    }
}
