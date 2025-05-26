package o11;

import com.pinterest.api.model.ew;
import com.pinterest.api.model.jg0;
import com.pinterest.api.model.kg0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import df.j1;
import f11.j;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import p11.g;
import p11.l;
import pk.a0;
import ry1.f;
import uj2.q;
import uk1.d;
import yk1.p;
import yk1.r;

/* loaded from: classes5.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public final w f92779a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f92780b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92781c;

    /* renamed from: d, reason: collision with root package name */
    public final Calendar f92782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d presenterPinalytics, q networkStateStream, w eventManager, boolean z13, String editablePinId) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(editablePinId, "editablePinId");
        this.f92779a = eventManager;
        this.f92780b = z13;
        this.f92781c = editablePinId;
        this.f92782d = Calendar.getInstance(TimeZone.getDefault());
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        g view = (g) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(g view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        l lVar = (l) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        lVar.f98663n0 = this;
        Navigation navigation = lVar.I;
        Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_PIN_SELECTED_DATE_TIME") : null;
        Date date = i03 instanceof Date ? (Date) i03 : null;
        if (date == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(date);
        a aVar = lVar.f98663n0;
        if (aVar == null) {
            Intrinsics.r("pageListener");
            throw null;
        }
        aVar.q3(calendar.get(1), calendar.get(2), calendar.get(5));
        a aVar2 = lVar.f98663n0;
        if (aVar2 == null) {
            Intrinsics.r("pageListener");
            throw null;
        }
        aVar2.s3(calendar.get(11), calendar.get(12));
        lVar.f98670u0.setTime(calendar.getTime());
    }

    public final void q3(int i13, int i14, int i15) {
        if (isBound()) {
            Calendar cal = this.f92782d;
            cal.set(1, i13);
            cal.set(2, i14);
            cal.set(5, i15);
            new SimpleDateFormat("EEE, MMMM dd").setTimeZone(cal.getTimeZone());
            if (Calendar.getInstance(TimeZone.getDefault()).get(6) == cal.get(6)) {
                g gVar = (g) getView();
                int i16 = f.date_picker_selection_default;
                GestaltText gestaltText = ((l) gVar).f98664o0;
                if (gestaltText == null) {
                    Intrinsics.r("dateGestaltText");
                    throw null;
                }
                a0.o(gestaltText, i16, new Object[0]);
            } else {
                g gVar2 = (g) getView();
                Date date = cal.getTime();
                Intrinsics.checkNotNullExpressionValue(date, "getTime(...)");
                int i17 = f.date_picker_date_subtitle;
                l lVar = (l) gVar2;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                GestaltText gestaltText2 = lVar.f98664o0;
                if (gestaltText2 == null) {
                    Intrinsics.r("dateGestaltText");
                    throw null;
                }
                String string = lVar.getString(i17);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                a0.p(gestaltText2, j1.U(string, new Object[]{date}));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
            g gVar3 = (g) getView();
            String time = simpleDateFormat.format(cal.getTime());
            Intrinsics.checkNotNullExpressionValue(time, "format(...)");
            l lVar2 = (l) gVar3;
            lVar2.getClass();
            Intrinsics.checkNotNullParameter(time, "time");
            GestaltText gestaltText3 = lVar2.f98665p0;
            if (gestaltText3 == null) {
                Intrinsics.r("timeGestaltText");
                throw null;
            }
            a0.p(gestaltText3, time);
            g gVar4 = (g) getView();
            Intrinsics.checkNotNullExpressionValue(cal, "cal");
            l lVar3 = (l) gVar4;
            lVar3.getClass();
            Intrinsics.checkNotNullParameter(cal, "cal");
            lVar3.f98670u0.setTime(cal.getTime());
        }
    }

    public final void r3() {
        Calendar calendar = this.f92782d;
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        this.f92779a.d(new j(time));
        if (this.f92780b) {
            kg0 d2 = ew.d(this.f92781c);
            if (d2 == null) {
                return;
            }
            jg0 jg0Var = new jg0(d2, 0);
            jg0Var.f39050k = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(calendar.getTime().getTime()));
            boolean[] zArr = jg0Var.f39059t;
            if (zArr.length > 10) {
                zArr[10] = true;
            }
            kg0 a13 = jg0Var.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            ew.m(a13);
        }
        ((l) ((g) getView())).P7();
    }

    public final void s3(int i13, int i14) {
        Calendar cal = this.f92782d;
        cal.set(11, i13);
        cal.set(12, i14);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        if (cal.getTime().compareTo(calendar.getTime()) < 0) {
            cal.setTime(calendar.getTime());
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
        g gVar = (g) getView();
        String time = simpleDateFormat.format(cal.getTime());
        Intrinsics.checkNotNullExpressionValue(time, "format(...)");
        l lVar = (l) gVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(time, "time");
        GestaltText gestaltText = lVar.f98665p0;
        if (gestaltText == null) {
            Intrinsics.r("timeGestaltText");
            throw null;
        }
        a0.p(gestaltText, time);
        g gVar2 = (g) getView();
        Intrinsics.checkNotNullExpressionValue(cal, "cal");
        l lVar2 = (l) gVar2;
        lVar2.getClass();
        Intrinsics.checkNotNullParameter(cal, "cal");
        lVar2.f98670u0.setTime(cal.getTime());
    }

    public final void t3() {
        this.f92782d.setTime(Calendar.getInstance(TimeZone.getDefault()).getTime());
        g gVar = (g) getView();
        int i13 = f.date_picker_selection_default;
        GestaltText gestaltText = ((l) gVar).f98664o0;
        if (gestaltText == null) {
            Intrinsics.r("dateGestaltText");
            throw null;
        }
        a0.o(gestaltText, i13, new Object[0]);
        g gVar2 = (g) getView();
        int i14 = f.time_picker_selection_default;
        GestaltText gestaltText2 = ((l) gVar2).f98665p0;
        if (gestaltText2 != null) {
            a0.o(gestaltText2, i14, new Object[0]);
        } else {
            Intrinsics.r("timeGestaltText");
            throw null;
        }
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }
}
