package lr;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.zs;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.o1;
import df.j1;
import h32.b3;
import h32.u0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import s80.l7;
import u50.k0;

/* loaded from: classes3.dex */
public final class z extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84571d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f84572e;

    public z(zs zsVar) {
        this.f84571d = 1;
        this.f84572e = zsVar;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        do1.j jVar;
        String Y;
        sr srVar;
        String j13;
        int i13 = this.f84571d;
        Object obj = this.f84572e;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Resources resources = container.getResources();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) (resources.getString(p22.b.idea_pin_schedule_toast_title) + " "));
                StyleSpan styleSpan = new StyleSpan(1);
                int length = spannableStringBuilder.length();
                kg0 kg0Var = (kg0) obj;
                Calendar calendar = Calendar.getInstance();
                Integer G = kg0Var.G();
                Intrinsics.checkNotNullExpressionValue(G, "getScheduledTs(...)");
                int intValue = G.intValue();
                Date date = new Date();
                Date date2 = new Date(TimeUnit.SECONDS.toMillis(intValue));
                if (date2.after(date)) {
                    date = date2;
                }
                calendar.setTime(date);
                Date time = calendar.getTime();
                Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
                Calendar calendar3 = Calendar.getInstance(TimeZone.getDefault());
                calendar3.setTime(time);
                if (calendar2.get(6) == calendar3.get(6)) {
                    String string = resources.getString(p22.b.idea_pin_schedule_toast_same_day_confirmation);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    jVar = null;
                    Y = j1.Y(string, new Object[]{new SimpleDateFormat("hh:mm a").format(time)}, null, 6);
                } else {
                    jVar = null;
                    String string2 = resources.getString(p22.b.idea_pin_schedule_toast_confirmation);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Y = j1.Y(string2, new Object[]{time, new SimpleDateFormat("hh:mm a").format(time)}, null, 6);
                }
                spannableStringBuilder.append((CharSequence) Y);
                spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                u50.f0 h23 = bs1.c.h2(spannableStringBuilder);
                Map D = kg0Var.D();
                return new GestaltToast(context, new do1.d(h23, (D == null || (srVar = (sr) D.get("45x45")) == null || (j13 = srVar.j()) == null) ? jVar : new do1.j(j13), null, null, 0, 0, 0, null, false, 508));
            case 1:
                zs zsVar = (zs) obj;
                String X = j1.X("%s %s", zsVar.C().booleanValue() ? container.getContext().getString(x0.you_followed) : container.getContext().getString(x0.you_unfollowed), zsVar.D());
                SpannableString spannableString = new SpannableString(X);
                spannableString.setSpan(new StyleSpan(1), X.indexOf(zsVar.D()), X.length(), 33);
                GestaltToast gestaltToast = new GestaltToast(container.getContext());
                gestaltToast.v(new yq.k(5, this, spannableString));
                return gestaltToast;
            case 2:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context2 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                String string3 = ((z80.d) obj).f141050d.getString(l7.toast_continue_working);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Intrinsics.checkNotNullParameter(string3, "string");
                return new GestaltToast(context2, new do1.d(new u50.f0(string3), new do1.l(new rm1.f(rm1.q.COLLAGE, rm1.i.LG)), null, null, 0, 0, 0, new u50.b0(eo1.c.space_700), true, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER));
            case 3:
                Intrinsics.checkNotNullParameter(container, "container");
                Context noNullContext = (Context) obj;
                Intrinsics.checkNotNullExpressionValue(noNullContext, "$noNullContext");
                String string4 = noNullContext.getString(x0.inclusive_feedback_thanks_message);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return new GestaltToast(noNullContext, new do1.d(bs1.c.p2(string4), null, null, null, 0, 0, 0, null, true, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN));
            case 4:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context3 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GestaltToast gestaltToast2 = new GestaltToast(6, context3, (AttributeSet) null);
                gestaltToast2.v(new q91.h((z91.c) obj, 7));
                return gestaltToast2;
            case 5:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context4 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                GestaltToast gestaltToast3 = new GestaltToast(6, context4, (AttributeSet) null);
                gestaltToast3.v(new q91.h((aa1.c) obj, 10));
                return gestaltToast3;
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context5 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                int i14 = pt1.c.creator_profile_cover_toast_success_message;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return new GestaltToast(context5, new do1.d(new k0(i14, new ArrayList(0)), new do1.j((String) obj), null, null, 0, 0, 0, null, false, 508));
        }
    }

    @Override // we0.a
    public final void b(Context context) {
        switch (this.f84571d) {
            case 1:
                m60.w wVar = m60.u.f85943a;
                ScreenLocation screenLocation = (ScreenLocation) o1.f51169b.getValue();
                zs zsVar = (zs) this.f84572e;
                wVar.d(Navigation.r0(screenLocation, zsVar));
                u0 u0Var = u0.HOMEFEED_BUILDER_FOLLOW_TOAST;
                String uid = zsVar.getUid();
                b3 toastType = b3.TOPIC_FOLLOW;
                Intrinsics.checkNotNullParameter(toastType, "toastType");
                u2.a1(u0Var, uid, toastType);
                break;
            default:
                super.b(context);
                break;
        }
    }

    public z(kg0 scheduledPin) {
        this.f84571d = 0;
        Intrinsics.checkNotNullParameter(scheduledPin, "scheduledPin");
        this.f84572e = scheduledPin;
    }

    public z(Object obj, int i13) {
        this.f84571d = i13;
        this.f84572e = obj;
    }
}
