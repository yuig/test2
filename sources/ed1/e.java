package ed1;

import android.content.Context;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.sharesheet.view.InviteModalAppListView;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import so.a5;
import so.b5;
import so.r8;

/* loaded from: classes5.dex */
public final class e extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f58562a;

    /* renamed from: b, reason: collision with root package name */
    public final nx.d0 f58563b;

    /* renamed from: c, reason: collision with root package name */
    public final p32.c f58564c;

    /* renamed from: d, reason: collision with root package name */
    public final SendableObject f58565d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58566e;

    /* renamed from: f, reason: collision with root package name */
    public final yk1.j f58567f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.w f58568g;

    /* renamed from: h, reason: collision with root package name */
    public final uk1.e f58569h;

    /* renamed from: i, reason: collision with root package name */
    public final a5 f58570i;

    /* renamed from: j, reason: collision with root package name */
    public final lz1.a f58571j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, nx.d0 pinalytics, p32.c inviteCategory, SendableObject sendableObject, int i13, yk1.j mvpBinder, m60.w eventManager, uk1.e presenterPinalyticsFactory, a5 inviteModalAppListPresenterFactory, lz1.c sendShareUpsellPreferences) {
        super(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(inviteModalAppListPresenterFactory, "inviteModalAppListPresenterFactory");
        Intrinsics.checkNotNullParameter(sendShareUpsellPreferences, "sendShareUpsellPreferences");
        this.f58562a = context;
        this.f58563b = pinalytics;
        this.f58564c = inviteCategory;
        this.f58565d = sendableObject;
        this.f58566e = i13;
        this.f58567f = mvpBinder;
        this.f58568g = eventManager;
        this.f58569h = presenterPinalyticsFactory;
        this.f58570i = inviteModalAppListPresenterFactory;
        this.f58571j = sendShareUpsellPreferences;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        uk1.d f13;
        String str;
        cd1.a view = (cd1.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        f13 = ((uk1.a) this.f58569h).f(this.f58563b, "");
        r8 r8Var = this.f58570i.f113324a;
        d dVar = new d(this.f58562a, this.f58564c, this.f58565d, f13, r8Var.f114090a.f113947u9, (b5) r8Var.f114091b.f114446pd.get(), r8Var.f114090a.b3());
        Object value = ((fd1.s) view).f61994c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        this.f58567f.d((InviteModalAppListView) value, dVar);
        HashMap hashMap = new HashMap();
        hashMap.put("invite_object", p32.i.PINNER.toString());
        y32.f.Companion.getClass();
        y32.f a13 = y32.d.a(this.f58566e);
        if (a13 == null || (str = a13.name()) == null) {
            str = "unknown";
        }
        hashMap.put("source", str);
        this.f58563b.h0((r18 & 1) != 0 ? f1.TAP : f1.SEND_SHARE_OPEN, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : h32.g0.SEND_SHARE_INVITE_PRIVATE_PROFILE, (r18 & 8) != 0 ? null : this.f58565d.d(), (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // yk1.b
    public final void onUnbind() {
        String str;
        SendableObject sendableObject = this.f58565d;
        if (sendableObject.g()) {
            boolean z13 = e0.t.f56752j;
            HashMap hashMap = new HashMap();
            hashMap.put("invite_object", p32.i.PINNER.toString());
            y32.f.Companion.getClass();
            y32.f a13 = y32.d.a(this.f58566e);
            if (a13 == null || (str = a13.name()) == null) {
                str = "unknown";
            }
            hashMap.put("source", str);
            if (sendableObject.g()) {
                hashMap.put("invite_object", String.valueOf(sendableObject.b().value()));
                this.f58563b.h0((r18 & 1) != 0 ? f1.TAP : !z13 ? f1.SHARE_SHEET_DISMISS_NO_SEND : f1.SHARE_SHEET_DISMISS_WITH_SEND, (r18 & 2) != 0 ? null : u0.SEND_SHARE_DISMISS_BUTTON, (r18 & 4) != 0 ? null : h32.g0.SEND_SHARE_INVITE_PRIVATE_PROFILE, (r18 & 8) != 0 ? null : sendableObject.d(), (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
            ig1.b.s0(this.f58568g, this.f58571j);
            e0.t.f56747e = -1;
        }
        super.onUnbind();
    }
}
