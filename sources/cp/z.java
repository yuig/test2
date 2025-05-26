package cp;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f52984d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f52985a;

    /* renamed from: b, reason: collision with root package name */
    public final q12.b f52986b;

    /* renamed from: c, reason: collision with root package name */
    public final xj2.b f52987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, String conversationId, q12.b conversationService) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        this.f52985a = conversationId;
        this.f52986b = conversationService;
        o5.c a13 = o5.c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.f52987c = new xj2.b();
        setOrientation(1);
        ha2.e eVar = new ha2.e(context, a13);
        eVar.a(new ha2.z(new ha2.x(t70.e.nav_bar_tab_label_notifications, null, null, null, null, 30), f0.j(new ha2.a0(xc0.i.conversation_notifications_always_on, 0, null, null, null, null, null, null, null, 1020), new ha2.a0(xc0.i.conversation_notifications_mute_one_hour, 1, null, null, null, null, null, null, null, 1020), new ha2.a0(xc0.i.conversation_notifications_mute_eight_hours, 2, null, null, null, null, null, null, null, 1020), new ha2.a0(xc0.i.conversation_notifications_mute_one_week, 3, null, null, null, null, null, null, null, 1020), new ha2.a0(xc0.i.conversation_notifications_mute_until_turned_on, 4, null, null, null, null, null, null, null, 1020)), new z3.m(this, 9)));
        addView(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52987c.d();
    }
}
