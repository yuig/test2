package rr;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends d0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f109841i = 0;

    /* renamed from: g, reason: collision with root package name */
    public final j12.k f109842g;

    /* renamed from: h, reason: collision with root package name */
    public final i92.k f109843h;

    static {
        new com.google.android.gms.common.api.d(28, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qr.h webhookDeeplinkUtil, j12.k boardSectionService, i92.k toastUtils) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(boardSectionService, "boardSectionService");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f109842g = boardSectionService;
        this.f109843h = toastUtils;
    }

    @Override // rr.d0
    public final String a() {
        return "board_section";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        String str2 = pathSegments.get(1);
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        String str3 = pathSegments.get(2);
        Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
        String a13 = n00.b.a(n00.c.BOARD_SECTION_DETAILED);
        this.f109842g.a(str, str2, str3, a13).r(tk2.e.f118017c).l(wj2.c.a()).o(new ir.h(21, new q(this, 0)), new ir.h(22, new q(this, 1)));
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return (!df.j1.f1(uri) || CollectionsKt.L(ie0.a.f72199d, uri.getHost())) && uri.getPathSegments().size() == 3 && !n60.o.x(uri, 0, "communities") && this.f109723a.f104943d.e();
    }
}
