package rr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class q0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final y f109819g;

    /* renamed from: h, reason: collision with root package name */
    public final u12.e f109820h;

    /* renamed from: i, reason: collision with root package name */
    public final m60.g0 f109821i;

    /* renamed from: j, reason: collision with root package name */
    public String f109822j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(qr.h webhookDeeplinkUtil, y searchHandler, u12.e interestService, m60.g0 pageSizeProvider) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(searchHandler, "searchHandler");
        Intrinsics.checkNotNullParameter(interestService, "interestService");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        this.f109819g = searchHandler;
        this.f109820h = interestService;
        this.f109821i = pageSizeProvider;
    }

    @Override // rr.d0
    public final String a() {
        String str = this.f109822j;
        if (str != null) {
            return str;
        }
        Intrinsics.r("action");
        throw null;
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        List split$default;
        String str;
        int length;
        Uri build;
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        String str2 = pathSegments.get(0);
        String original = pathSegments.get(1);
        Intrinsics.f(str2);
        this.f109822j = str2;
        if (kotlin.collections.f0.j("explore", "categories", "topics", "videos", "ideas", "shopping").contains(str2)) {
            Intrinsics.f(original);
            String n13 = kotlin.text.z.n(original, "-", " ");
            if (Intrinsics.d("videos", str2)) {
                build = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("search").appendPath("videos").appendQueryParameter("q", n13).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            } else if (Intrinsics.d("shopping", str2)) {
                build = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("search").appendPath("buyable_pins").appendQueryParameter("q", n13).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            } else {
                build = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("search").appendQueryParameter("q", n13).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            }
            this.f109819g.c(build);
            return;
        }
        boolean d2 = Intrinsics.d("explore", str2);
        qr.h hVar = this.f109723a;
        if (!d2 && !Intrinsics.d("topics", str2) && !Intrinsics.d("ideas", str2) && !Intrinsics.d("videos", str2) && !Intrinsics.d("shopping", str2)) {
            if (!Intrinsics.d("categories", str2) || hVar.f104943d.e()) {
                return;
            }
            hVar.n(null);
            return;
        }
        Intrinsics.f(original);
        Intrinsics.checkNotNullParameter(original, "original");
        split$default = StringsKt__StringsKt.split$default(original, new String[]{"-"}, false, 0, 6, null);
        if (split$default.size() >= 2 && (length = (str = (String) ep.b.i(split$default, 1)).length()) >= 12) {
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    original = str;
                    break;
                } else if (!Character.isDigit(str.charAt(i13))) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (hVar.f104943d.e()) {
            if (Intrinsics.d("explore", str2)) {
                g(original, true);
                return;
            } else {
                g(original, false);
                return;
            }
        }
        sr.g gVar = hVar.f104950k;
        gVar.f115057b.a("unauth_klp_deeplink");
        Context context = kb0.a.f79058b;
        Intent i14 = ((lu1.c) gVar.f115058c).i(m60.f0.W());
        i14.putExtra("com.pinterest.EXTRA_KLP_ID", original);
        gVar.f115056a.startActivity(i14);
        hVar.q();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        String str;
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() < 2 || !kotlin.collections.f0.j("explore", "categories", "topics", "ideas", "videos", "shopping").contains(pathSegments.get(0))) {
            return false;
        }
        String str2 = pathSegments.get(0);
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1309148525:
                    str = "explore";
                    str2.equals(str);
                case -868034268:
                    str = "topics";
                    str2.equals(str);
                case -816678056:
                    str = "videos";
                    str2.equals(str);
                case -344460952:
                    str = "shopping";
                    str2.equals(str);
                case 100048988:
                    str = "ideas";
                    str2.equals(str);
                case 1296516636:
                    if (str2.equals("categories") && this.f109723a.f104943d.e()) {
                    }
                    break;
            }
            return false;
        }
        return true;
    }

    public final void g(String str, boolean z13) {
        hk2.h h10 = this.f109820h.d(str, n00.b.a(n00.c.INTEREST_FOLLOWED_FEED), this.f109821i.b()).e(wj2.c.a()).h(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(h10, "subscribeOn(...)");
        nl.b.o(h10, new r1.f(this, z13, 4), new tq.a0(this, 11));
    }
}
