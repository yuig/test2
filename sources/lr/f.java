package lr;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes.dex */
public final class f extends we0.a {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f84504g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f84505h;

    /* renamed from: d, reason: collision with root package name */
    public final wy0 f84506d;

    /* renamed from: e, reason: collision with root package name */
    public final v7 f84507e;

    /* renamed from: f, reason: collision with root package name */
    public final g70.h f84508f;

    public f(wy0 inviter, v7 v7Var, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f84506d = inviter;
        this.f84507e = v7Var;
        this.f84508f = boardNavigator;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Resources resources = container.getResources();
        int i13 = x0.board_invite_reminder_single_user_invite;
        Object[] objArr = new Object[2];
        wy0 wy0Var = this.f84506d;
        objArr[0] = wy0Var.U2();
        v7 v7Var = this.f84507e;
        objArr[1] = v7Var != null ? v7Var.j1() : null;
        String string = resources.getString(i13, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = container.getResources().getString(x0.board_invite_reminder_button_text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String l33 = wy0Var.l3();
        if (l33 != null && l33.length() == 0) {
            l33 = wy0Var.k3();
        }
        if (l33 != null && l33.length() == 0) {
            l33 = wy0Var.n3();
        }
        do1.j jVar = l33 != null ? new do1.j(l33) : null;
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        u50.f0 h23 = bs1.c.h2(string);
        if (string2 == null) {
            string2 = "";
        }
        GestaltToast gestaltToast = new GestaltToast(context, new do1.d(h23, jVar, new do1.b(bs1.c.h2(string2), new db.m(this, 27)), do1.n.DEFAULT, Integer.MIN_VALUE, 7000, 0, null, false, 448));
        ((lb0.b) lb0.n.b()).m("PREF_BOARD_INVITE_REMINDER_TOAST_SEEN_LAST_24H_2024_V1", new Date().getTime());
        com.google.android.gms.common.api.d dVar = d0.f84486g;
        long time = new Date().getTime();
        dVar.getClass();
        ((lb0.b) lb0.n.b()).m("PREF_UNREAD_MESSAGE_REMINDER_TOAST_SEEN_LAST_24H_2024_V1", time);
        return gestaltToast;
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        v7 v7Var = this.f84507e;
        if (v7Var != null) {
            g70.h.f(this.f84508f, v7Var, e.f84492j, 2);
        }
        super.b(context);
    }
}
