package rr;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d1 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final lu1.d f109729g;

    /* renamed from: h, reason: collision with root package name */
    public final Activity f109730h;

    /* renamed from: i, reason: collision with root package name */
    public String f109731i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(qr.h webhookDeeplinkUtil, lu1.d activityIntentFactory, Activity activity) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f109729g = activityIntentFactory;
        this.f109730h = activity;
    }

    @Override // rr.d0
    public final String a() {
        return this.f109731i;
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        qr.h hVar = this.f109723a;
        if (!hVar.f104943d.e()) {
            hVar.n(null);
            return;
        }
        Intent intent = this.f109729g.b(this.f109730h, lu1.a.PIN_IT_ACTIVITY);
        c1 addExtras = new c1(uri.getQueryParameter("description"), intent, uri.getQueryParameter("media"), uri.getQueryParameter("method"), hVar, this);
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(addExtras, "addExtras");
        intent.putExtra("android.intent.extra.TEXT", uri.getQueryParameter("url"));
        addExtras.invoke();
        nm.u uVar = new nm.u();
        for (String str : uri.getQueryParameterNames()) {
            uVar.u(str, uri.getQueryParameter(str));
        }
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        intent.putExtra("com.pinterest.EXTRA_META", sVar);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        String queryParameter = uri.getQueryParameter("url");
        List<String> pathSegments = uri.getPathSegments();
        if (host == null || kotlin.text.z.j(host) || queryParameter == null || kotlin.text.z.j(queryParameter)) {
            return false;
        }
        if (pathSegments.size() >= 3 && Intrinsics.d(pathSegments.get(0), "pin") && Intrinsics.d(pathSegments.get(1), "create") && Intrinsics.d(pathSegments.get(2), "button")) {
            this.f109731i = "pin_create_button";
        } else {
            if (pathSegments.size() < 2 || !Intrinsics.d(pathSegments.get(0), "pin") || !Intrinsics.d(pathSegments.get(1), "create")) {
                return false;
            }
            this.f109731i = "pin_create";
        }
        return true;
    }
}
