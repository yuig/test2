package kp;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.pinterest.api.model.gw;
import dl1.t;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import nx.d0;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final i92.k f80546a;

    /* renamed from: b, reason: collision with root package name */
    public final w f80547b;

    /* renamed from: c, reason: collision with root package name */
    public final t f80548c;

    /* renamed from: d, reason: collision with root package name */
    public final t f80549d;

    /* renamed from: e, reason: collision with root package name */
    public final fp.b f80550e;

    /* renamed from: f, reason: collision with root package name */
    public final gw f80551f;

    /* renamed from: g, reason: collision with root package name */
    public final p12.b f80552g;

    /* renamed from: h, reason: collision with root package name */
    public final k22.m f80553h;

    /* renamed from: i, reason: collision with root package name */
    public final b60.b f80554i;

    /* renamed from: j, reason: collision with root package name */
    public final no1.d f80555j;

    /* renamed from: k, reason: collision with root package name */
    public final g70.h f80556k;

    /* renamed from: l, reason: collision with root package name */
    public ek2.f f80557l;

    /* renamed from: m, reason: collision with root package name */
    public ek2.f f80558m;

    public m(i92.k toastUtils, w eventManager, t boardRepository, t userRepository, fp.b declinedContactRequests, gw modelHelper, p12.b contactRequestService, k22.m userService, b60.b activeUserManager, no1.d contactRequestRemoteDataSource, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(declinedContactRequests, "declinedContactRequests");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(contactRequestService, "contactRequestService");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(contactRequestRemoteDataSource, "contactRequestRemoteDataSource");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f80546a = toastUtils;
        this.f80547b = eventManager;
        this.f80548c = boardRepository;
        this.f80549d = userRepository;
        this.f80550e = declinedContactRequests;
        this.f80551f = modelHelper;
        this.f80552g = contactRequestService;
        this.f80553h = userService;
        this.f80554i = activeUserManager;
        this.f80555j = contactRequestRemoteDataSource;
        this.f80556k = boardNavigator;
    }

    public static String b(Context context, String str) {
        Resources resources;
        int i13;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null) {
            resources = context.getResources();
            i13 = x0.board_invite_declined_msg;
        } else {
            resources = context.getResources();
            i13 = yc0.e.contact_request_message_declined;
        }
        String string = resources.getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final void a(String message, String contactRequestId, int i13, String str, View view, d0 d0Var) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        g gVar = new g(i13, contactRequestId);
        w wVar = this.f80547b;
        wVar.d(gVar);
        wVar.d(new pg0.a(str, false));
        this.f80546a.c(new lr.l(message, contactRequestId, i13, str, view, d0Var, this.f80550e, this.f80547b, this.f80548c, this.f80552g));
    }
}
