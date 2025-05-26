package dq0;

import com.pinterest.feature.conversation.view.ContactRequestPreviewWarningView;
import com.pinterest.ui.components.banners.LegoBannerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq0.m0;
import m60.w;

/* loaded from: classes5.dex */
public final class b extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f56068a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56070c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f56071d;

    /* renamed from: e, reason: collision with root package name */
    public final kp.m f56072e;

    /* renamed from: f, reason: collision with root package name */
    public final w f56073f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String senderName, String contactRequestId, int i13, m0 onBackPressed, kp.m contactRequestUtils, w eventManager) {
        super(0);
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(contactRequestUtils, "contactRequestUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f56068a = senderName;
        this.f56069b = contactRequestId;
        this.f56070c = i13;
        this.f56071d = onBackPressed;
        this.f56072e = contactRequestUtils;
        this.f56073f = eventManager;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        aq0.a view = (aq0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        ContactRequestPreviewWarningView contactRequestPreviewWarningView = (ContactRequestPreviewWarningView) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        contactRequestPreviewWarningView.f45522a = this;
        lq0.b action = new lq0.b(contactRequestPreviewWarningView, 0);
        LegoBannerView legoBannerView = contactRequestPreviewWarningView.f45525d;
        legoBannerView.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        legoBannerView.f52263r = action;
        lq0.b action2 = new lq0.b(contactRequestPreviewWarningView, 1);
        Intrinsics.checkNotNullParameter(action2, "action");
        legoBannerView.f52264s = action2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!isBound()) {
            bs1.c.X0(legoBannerView);
            return;
        }
        String senderName = this.f56068a;
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        String string = contactRequestPreviewWarningView.getResources().getString(xc0.i.preview_warning_text, senderName);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        legoBannerView.Z(string);
        bs1.c.U1(legoBannerView);
    }
}
