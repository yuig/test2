package i91;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.pinterest.activity.sendapin.model.SendableObject;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f71888a;

    /* renamed from: b, reason: collision with root package name */
    public final SendableObject f71889b;

    /* renamed from: c, reason: collision with root package name */
    public final p32.c f71890c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.d0 f71891d;

    /* renamed from: e, reason: collision with root package name */
    public final i92.k f71892e;

    /* renamed from: f, reason: collision with root package name */
    public final u20.d f71893f;

    /* renamed from: g, reason: collision with root package name */
    public final tb0.h f71894g;

    public r(Context context, SendableObject sendableObject, p32.c inviteCategory, nx.d0 topLevelPinalytics, i92.k toastUtils, u20.d sendShareServiceWrapper, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(topLevelPinalytics, "topLevelPinalytics");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f71888a = context;
        this.f71889b = sendableObject;
        this.f71890c = inviteCategory;
        this.f71891d = topLevelPinalytics;
        this.f71892e = toastUtils;
        this.f71893f = sendShareServiceWrapper;
        this.f71894g = crashReporting;
    }

    public void a(vd0.c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String o13 = data.o("invite_url", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        if (o13.length() > 0) {
            u0 u0Var = u0.COPY_LINK_BUTTON;
            this.f71891d.F(h32.g0.MODAL_DIALOG, u0Var);
            String o14 = data.o("invite_code", "");
            Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
            c(this.f71889b, this.f71890c, p32.f.COPY_LINK, e0.t.f56747e, o14);
            Context context = this.f71888a;
            Object systemService = context.getSystemService("clipboard");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(context.getString(x0.copy_link), o13));
            int i13 = a62.e.copy_link_success;
            Intrinsics.checkNotNullParameter(context, "context");
            this.f71892e.m(context.getResources().getString(i13));
        }
    }

    public final void b(SendableObject sendableObject, p32.c inviteCategory, p32.f inviteChannel) {
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(inviteChannel, "inviteChannel");
        String d2 = sendableObject.d();
        Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
        p32.i b13 = sendableObject.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getInviteObject(...)");
        this.f71893f.b(d2, inviteCategory, b13, inviteChannel).r(tk2.e.f118017c).l(wj2.c.a()).o(new x81.h0(9, new q(this, 0)), new x81.h0(10, new q(this, 1)));
    }

    public final void c(SendableObject sendableObject, p32.c inviteCategory, p32.f inviteChannel, int i13, String inviteCode) {
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(inviteChannel, "inviteChannel");
        Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
        p32.i b13 = sendableObject.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getInviteObject(...)");
        String d2 = sendableObject.d();
        Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
        this.f71893f.c(inviteCategory, b13, inviteChannel, d2, i13, inviteCode, sendableObject.f35137k).r(tk2.e.f118017c).o(new xo.l(26), new x81.h0(8, new q(this, 2)));
    }
}
