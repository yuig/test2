package rr;

import android.net.Uri;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f109875g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(qr.h webhookDeeplinkUtil, b60.b activeUserManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f109875g = activeUserManager;
    }

    public static boolean g(String str, List list) {
        if (list.size() == 3 && Intrinsics.d(list.get(0), "pear") && Intrinsics.d(list.get(1), "insights")) {
            return true;
        }
        if (Intrinsics.d(str, "pear") && list.size() == 2 && Intrinsics.d(list.get(0), "insights")) {
            return true;
        }
        return list.size() == 2 && Intrinsics.d(list.get(0), "personal-insights");
    }

    public static boolean h(String str, List list) {
        return (list.size() == 3 && Intrinsics.d(list.get(0), "pear") && Intrinsics.d(list.get(1), "quiz")) || (Intrinsics.d(str, "pear") && list.size() == 2 && Intrinsics.d(list.get(0), "quiz")) || ((list.size() == 5 && Intrinsics.d(list.get(0), "pear") && Intrinsics.d(list.get(1), "quiz") && Intrinsics.d(list.get(3), "output")) || ((Intrinsics.d(str, "pear") && list.size() == 4 && Intrinsics.d(list.get(0), "quiz") && Intrinsics.d(list.get(2), "output")) || ((list.size() == 2 && Intrinsics.d(list.get(0), "quizzes")) || (list.size() == 4 && Intrinsics.d(list.get(0), "quizzes") && Intrinsics.d(list.get(2), "output")))));
    }

    @Override // rr.d0
    public final String a() {
        return "pear";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        String host = uri.getHost();
        String str = (String) ep.b.i(pathSegments, 1);
        boolean i13 = i(pathSegments);
        qr.h hVar = this.f109723a;
        if (i13) {
            NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.r());
            w13.m0("com.pinterest.EXTRA_STYLE_ID", str);
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            hVar.m(w13);
            return;
        }
        if (g(host, pathSegments)) {
            NavigationImpl w14 = Navigation.w1(com.pinterest.screens.g1.s());
            w14.m0("com.pinterest.EXTRA_INSIGHT_ID", str);
            String queryParameter = uri.getQueryParameter("referrer");
            w14.m0("com.pinterest.EXTRA_REFERRER", queryParameter != null ? queryParameter : "");
            Intrinsics.checkNotNullExpressionValue(w14, "apply(...)");
            hVar.m(w14);
            return;
        }
        if (h(host, pathSegments)) {
            Iterator<String> it = pathSegments.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                String next = it.next();
                if (Intrinsics.d(next, "quiz") || Intrinsics.d(next, "quizzes")) {
                    break;
                } else {
                    i14++;
                }
            }
            String str2 = (String) CollectionsKt.U(i14 + 1, pathSegments);
            if (str2 == null) {
                return;
            }
            if (Intrinsics.d(CollectionsKt.U(i14 + 2, pathSegments), "output")) {
                NavigationImpl w15 = Navigation.w1(com.pinterest.screens.g1.q());
                w15.m0("com.pinterest.EXTRA_QUIZ_ID", str2);
                w15.m0("com.pinterest.EXTRA_QUIZ_RESULT", (String) CollectionsKt.U(i14 + 3, pathSegments));
                w15.m0("com.pinterest.EXTRA_REFERRER", "share");
                Intrinsics.checkNotNullExpressionValue(w15, "apply(...)");
                hVar.m(w15);
                return;
            }
            NavigationImpl w16 = Navigation.w1(com.pinterest.screens.g1.p());
            w16.m0("com.pinterest.EXTRA_QUIZ_ID", str2);
            String queryParameter2 = uri.getQueryParameter("rs");
            w16.m0("com.pinterest.EXTRA_REFERRER", queryParameter2 != null ? queryParameter2 : "");
            Intrinsics.checkNotNullExpressionValue(w16, "apply(...)");
            hVar.m(w16);
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        String host = uri.getHost();
        Intrinsics.f(pathSegments);
        return g(host, pathSegments) || i(pathSegments) || h(host, pathSegments);
    }

    public final boolean i(List list) {
        wy0 f13 = ((b60.d) this.f109875g).f();
        if (com.bumptech.glide.d.o0(f13 != null ? f13.z3() : null)) {
            return (list.size() == 3 && Intrinsics.d(list.get(0), "pear") && Intrinsics.d(list.get(1), "style")) || (list.size() == 2 && Intrinsics.d(list.get(0), "style-explorer"));
        }
        return false;
    }
}
