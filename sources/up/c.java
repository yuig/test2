package up;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import ap.o;
import com.pinterest.api.model.v7;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toast.GestaltToast;
import cp1.p;
import d70.g;
import df.j1;
import do1.d;
import do1.j;
import do1.l;
import do1.m;
import e0.t;
import et1.r0;
import fz1.f;
import g70.h;
import h32.b3;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kh2.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lb0.r;
import m60.x0;
import r0.p0;
import rm1.i;
import rm1.q;
import tq.a0;
import u50.f0;
import u50.k0;
import yq.k;

/* loaded from: classes3.dex */
public final class c extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f122936d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f122937e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f122938f;

    public c(Context context, String str) {
        this.f122937e = str;
        this.f122938f = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.CharSequence] */
    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        m lVar;
        int i13 = this.f122936d;
        int i14 = 0;
        Object obj = this.f122937e;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                CharSequence a03 = j1.a0((String) obj);
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                f0 h23 = bs1.c.h2(a03);
                String string = container.getResources().getString(x0.undo);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return new GestaltToast(context, new d(h23, null, new do1.b(bs1.c.p2(string), new db.m(this, 7)), null, 0, 0, 0, null, false, 506));
            case 1:
                Resources resources = container.getResources();
                String string2 = resources.getString(f.lens_toast_pincode_title);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string2).append((CharSequence) "\n").append((CharSequence) resources.getString(f.lens_saved_camera));
                append.setSpan(new te0.c(container.getContext()), 0, string2.length(), 33);
                return new GestaltToast(container.getContext()).v(new k(i14, this, append));
            case 2:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context2 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltToast gestaltToast = new GestaltToast(6, context2, (AttributeSet) null);
                pp2.a.l(gestaltToast, new a0(container, 5));
                return gestaltToast;
            case 3:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context3 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                ?? a04 = j1.a0((String) obj);
                return new GestaltToast(context3, new d(bs1.c.h2(a04 != 0 ? a04 : ""), null, null, null, 0, 0, 0, null, false, 510));
            case 4:
                Intrinsics.checkNotNullParameter(container, "container");
                v7 v7Var = (v7) obj;
                String Y = j1.Y("%s\n%s", new Object[]{v7Var.j1(), container.getContext().getString(g.board_invites_sent)}, null, 6);
                Context context4 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                f0 p23 = bs1.c.p2(Y);
                String b13 = v7Var.b1();
                if (b13 == null || b13.length() == 0) {
                    lVar = new l(new rm1.f(q.BOARD, i.MD));
                } else {
                    String b14 = v7Var.b1();
                    lVar = new j(b14 != null ? b14 : "");
                }
                return new GestaltToast(context4, new d(p23, lVar, null, null, 0, 0, 0, null, false, 508));
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Bundle bundle = (Bundle) obj;
                String string3 = bundle.getString("EXTRA_EMAIL_SURVEY_TYPE");
                if (string3 == null) {
                    string3 = "";
                }
                int i15 = ev1.a.f60282a[ev1.b.valueOf(string3).ordinal()];
                if (i15 == 1) {
                    Context context5 = container.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    int i16 = ev1.c.email_generic_feedback_landing_message;
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    return new GestaltToast(context5, new d(new k0(i16, new ArrayList(0)), null, null, null, 0, 0, 0, null, true, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN));
                }
                if (i15 == 2) {
                    Context context6 = container.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    int i17 = ev1.c.email_user_survey_feedback_landing_message;
                    String[] formatArgs2 = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                    return new GestaltToast(context6, new d(new k0(i17, new ArrayList(0)), null, null, null, 0, 0, 0, null, true, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN));
                }
                int i18 = 3;
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                String string4 = bundle.getString("EXTRA_USER_SURVEY_RESPONSE");
                int i19 = z.h(string4 != null ? string4 : "", "positive", false) ? ev1.c.email_user_interest_feedback_positive_message : ev1.c.email_user_interest_feedback_negative_message;
                Context context7 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                String[] formatArgs3 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs3, "formatArgs");
                k0 k0Var = new k0(i19, new ArrayList(0));
                String string5 = container.getResources().getString(x0.undo);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                Intrinsics.checkNotNullParameter(string5, "string");
                return new GestaltToast(context7, new d(k0Var, null, new do1.b(new f0(string5), new r0(i18, this, container)), null, 0, 0, 0, null, true, 250));
        }
    }

    @Override // we0.a
    public final void b(Context context) {
        int i13 = this.f122936d;
        Object obj = this.f122938f;
        switch (i13) {
            case 1:
                super.b(context);
                ((Context) obj).startActivity(new Intent("android.intent.action.VIEW", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                v7 v7Var = (v7) this.f122937e;
                u2.a1(null, v7Var.getUid(), b3.BOARD_COLLAB_INVITE);
                h.f((h) obj, v7Var, null, 6);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                super.b(context);
                ((Function0) obj).invoke();
                break;
            default:
                super.b(context);
                break;
        }
    }

    @Override // we0.a
    public final void c(Context context) {
        switch (this.f122936d) {
            case 4:
                Intrinsics.checkNotNullParameter(context, "context");
                super.c(context);
                if (bs1.c.c1(context)) {
                    Activity k03 = bs1.c.k0(context);
                    if (k03 instanceof p) {
                        p pVar = (p) k03;
                        o oVar = (o) this.f122938f;
                        if (!oVar.e() && !t.L0(oVar.f20289i, pVar)) {
                            r rVar = oVar.f20290j;
                            Date date = new Date(rVar.a("PREF_UPLOAD_CONTACTS_DIALOG_LAST_SHOWN", 0L));
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(5, -30);
                            if (calendar.getTime().compareTo(date) > 0) {
                                androidx.appcompat.widget.q qVar = new androidx.appcompat.widget.q(oVar, 2);
                                rVar.c("PREF_UPLOAD_CONTACTS_DIALOG_LAST_SHOWN", new Date().getTime());
                                oVar.f20287g.d(new of0.a(new ap.g(qVar)));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                super.c(context);
                break;
        }
    }

    public c(Bundle bundle, no1.d graphQLNotificationLandingDataSource) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(graphQLNotificationLandingDataSource, "graphQLNotificationLandingDataSource");
        this.f122937e = bundle;
        this.f122938f = graphQLNotificationLandingDataSource;
    }

    public c(v7 board, o uploadContactsUtil) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        this.f122937e = board;
        this.f122938f = uploadContactsUtil;
    }

    public c(v7 board, h boardNavigator) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f122937e = board;
        this.f122938f = boardNavigator;
    }

    public c(Function0 dismissScreen, String displayText) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        Intrinsics.checkNotNullParameter(dismissScreen, "dismissScreen");
        this.f122937e = displayText;
        this.f122938f = dismissScreen;
    }

    public c(p0 onUndo, String messageText) {
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(onUndo, "onUndo");
        this.f122937e = messageText;
        this.f122938f = onUndo;
    }
}
