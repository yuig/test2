package ps0;

import a.cb;
import android.content.Context;
import android.view.View;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.feature.pin.creation.view.UploadProgressBarLayout;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f101276b;

    public /* synthetic */ k(Object obj, int i13) {
        this.f101275a = i13;
        this.f101276b = obj;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        final int i13 = 0;
        int i14 = this.f101275a;
        Object obj = this.f101276b;
        switch (i14) {
            case 0:
                HomeFeedFragment this$0 = (HomeFeedFragment) obj;
                int i15 = HomeFeedFragment.U1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                c cVar = this$0.f45768x1;
                if (cVar != null) {
                    r0 r0Var = (r0) cVar;
                    r0Var.getPinalytics().F(h32.g0.HOME_FEED_EMPTY_STATE, u0.REFRESH_BUTTON);
                    r0Var.f4(false);
                    break;
                }
                break;
            case 1:
                final UploadProgressBarLayout this$02 = (UploadProgressBarLayout) obj;
                boolean z13 = UploadProgressBarLayout.f47125n;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    com.pinterest.feature.video.model.d dVar = this$02.f47134l;
                    if ((dVar != null ? dVar.f48998a : null) != com.pinterest.feature.video.model.e.FAILURE) {
                        if (!Intrinsics.d(dVar != null ? dVar.f49005h : null, "STORY_PIN_UPLOAD_WORK")) {
                            Context context = this$02.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            yb0.n nVar = new yb0.n(context);
                            String string = nVar.getResources().getString(uy1.b.anko_cancel_upload_title);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            nVar.w(string);
                            String string2 = nVar.getResources().getString(uy1.b.anko_cancel_upload_confirm);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            nVar.q(string2);
                            String string3 = nVar.getResources().getString(uy1.b.anko_cancel_upload_decline);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            nVar.m(string3);
                            final int i16 = 1;
                            nVar.f138513j = new View.OnClickListener() { // from class: p11.n
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i17 = i16;
                                    UploadProgressBarLayout this$03 = this$02;
                                    switch (i17) {
                                        case 0:
                                            boolean z14 = UploadProgressBarLayout.f47125n;
                                            Intrinsics.checkNotNullParameter(this$03, "this$0");
                                            UploadProgressBarLayout.e(this$03);
                                            ((w) this$03.g().get()).d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
                                            break;
                                        default:
                                            boolean z15 = UploadProgressBarLayout.f47125n;
                                            Intrinsics.checkNotNullParameter(this$03, "this$0");
                                            UploadProgressBarLayout.e(this$03);
                                            ((w) this$03.g().get()).d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                                            break;
                                    }
                                }
                            };
                            cb.x(nVar, (m60.w) this$02.g().get());
                            break;
                        } else {
                            Context context2 = this$02.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            xf1.a aVar = new xf1.a(context2);
                            String string4 = aVar.getResources().getString(x0.are_you_sure_text);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            aVar.w(string4);
                            aVar.u(aVar.getResources().getString(uy1.b.pin_cancel_upload_subtitle));
                            String string5 = aVar.getResources().getString(x0.story_pin_user_feedback_on_publish_question);
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            String string6 = aVar.getResources().getString(x0.story_pin_user_feedback_on_publish_share);
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            aVar.x(string5, string6);
                            String string7 = aVar.getResources().getString(x0.button_publish);
                            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                            aVar.q(string7);
                            String string8 = aVar.getResources().getString(uy1.b.cancel_upload);
                            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                            aVar.m(string8);
                            aVar.f138514k = new View.OnClickListener() { // from class: p11.n
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i17 = i13;
                                    UploadProgressBarLayout this$03 = this$02;
                                    switch (i17) {
                                        case 0:
                                            boolean z14 = UploadProgressBarLayout.f47125n;
                                            Intrinsics.checkNotNullParameter(this$03, "this$0");
                                            UploadProgressBarLayout.e(this$03);
                                            ((w) this$03.g().get()).d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
                                            break;
                                        default:
                                            boolean z15 = UploadProgressBarLayout.f47125n;
                                            Intrinsics.checkNotNullParameter(this$03, "this$0");
                                            UploadProgressBarLayout.e(this$03);
                                            ((w) this$03.g().get()).d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                                            break;
                                    }
                                }
                            };
                            ((m60.w) this$02.g().get()).d(new yb0.e(aVar));
                            break;
                        }
                    } else {
                        UploadProgressBarLayout.e(this$02);
                        break;
                    }
                }
                break;
            default:
                ij1.j this$03 = (ij1.j) obj;
                int i17 = ij1.j.B;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof rl1.w) {
                    this$03.f72356l.invalidate();
                    break;
                }
                break;
        }
    }
}
