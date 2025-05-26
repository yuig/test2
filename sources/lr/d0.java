package lr;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.z1;
import java.time.Instant;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes.dex */
public final class d0 extends we0.a {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.android.gms.common.api.d f84486g = new com.google.android.gms.common.api.d(21, 0);

    /* renamed from: h, reason: collision with root package name */
    public static boolean f84487h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f84488i;

    /* renamed from: d, reason: collision with root package name */
    public final wy0 f84489d;

    /* renamed from: e, reason: collision with root package name */
    public final z40.n f84490e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f84491f;

    public d0(wy0 sender, z40.n conversationFields, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(conversationFields, "conversationFields");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f84489d = sender;
        this.f84490e = conversationFields;
        this.f84491f = eventManager;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Object obj;
        Intrinsics.checkNotNullParameter(container, "container");
        com.google.android.gms.common.api.d dVar = f84486g;
        long time = new Date().getTime();
        dVar.getClass();
        ((lb0.b) lb0.n.b()).m("PREF_UNREAD_MESSAGE_REMINDER_TOAST_SEEN_LAST_24H_2024_V1", time);
        boolean z13 = f.f84504g;
        ((lb0.b) lb0.n.b()).m("PREF_BOARD_INVITE_REMINDER_TOAST_SEEN_LAST_24H_2024_V1", new Date().getTime());
        z40.h d2 = this.f84490e.d();
        if (d2 != null) {
            String messageId = d2.a();
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            lb0.p pVar = lb0.n.f82725d;
            Set h10 = ((lb0.b) pVar.a()).h("PREF_UNREAD_MESSAGE_ID_SEEN_LAST_24H_2024_V1", new LinkedHashSet());
            if (h10 != null) {
                if (h10.size() >= 30) {
                    dl2.b.s(h10).remove(CollectionsKt.T(h10));
                }
                h10.add(Instant.now().toString() + "_" + messageId);
                lb0.m c13 = ((lb0.b) pVar.a()).c();
                c13.putStringSet("PREF_UNREAD_MESSAGE_ID_SEEN_LAST_24H_2024_V1", h10);
                c13.apply();
            }
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Resources resources = container.getResources();
        int i13 = x0.user_sent_you_a_message;
        wy0 wy0Var = this.f84489d;
        String string = resources.getString(i13, wy0Var.U2());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Intrinsics.checkNotNullParameter(string, "string");
        u50.f0 f0Var = new u50.f0(string);
        Iterator it = kotlin.collections.f0.j(wy0Var.l3(), wy0Var.k3(), wy0Var.n3()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) obj;
            if (!(str == null || str.length() == 0)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = "";
        }
        String Z2 = wy0Var.Z2();
        return new GestaltToast(context, new do1.d(f0Var, new do1.e(str2, Z2 != null ? Z2 : ""), new do1.b(d7.g.q(container.getResources(), x0.reply, "getString(...)"), new v(this, 2)), null, 0, 7000, 0, null, false, 472));
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84491f.d(Navigation.z0((ScreenLocation) z1.f51665b.getValue(), this.f84490e.a()));
        super.b(context);
    }
}
