package cp;

import com.pinterest.api.model.mv;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.r f52914a;

    /* renamed from: b, reason: collision with root package name */
    public final SimpleDateFormat f52915b;

    public a0(lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f52914a = prefsManagerUser;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        this.f52915b = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static boolean c(mv mvVar) {
        if (mvVar != null) {
            return vb0.g.a(new Date(), -30).before(mvVar.E());
        }
        return false;
    }

    public final boolean a(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        lb0.r rVar = this.f52914a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter("PREF_GROUP_BOARD_UPSELL_CONVOS_ACCEPTED", "key");
        Set k13 = rVar.f82732a.k("PREF_GROUP_BOARD_UPSELL_CONVOS_ACCEPTED", null);
        if (k13 != null) {
            return k13.contains(conversationId);
        }
        return false;
    }

    public final boolean b() {
        String d2 = this.f52914a.d("PREF_GROUP_BOARD_UPSELL_DISMISS_DATE", null);
        Date parse = d2 != null ? this.f52915b.parse(d2) : null;
        if (parse != null) {
            return vb0.g.a(new Date(), -10).before(parse);
        }
        return false;
    }

    public final boolean d() {
        return this.f52914a.g("PREF_GROUP_BOARD_UPSELL_TIMES_DECLINED", 0) >= 2;
    }

    public final void e(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        lb0.r rVar = this.f52914a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter("PREF_GROUP_BOARD_UPSELL_CONVOS_ACCEPTED", "key");
        Set k13 = rVar.f82732a.k("PREF_GROUP_BOARD_UPSELL_CONVOS_ACCEPTED", null);
        Set j13 = k13 != null ? i1.j(k13, conversationId) : Collections.singleton(conversationId);
        rVar.getClass();
        Intrinsics.checkNotNullParameter("PREF_GROUP_BOARD_UPSELL_CONVOS_ACCEPTED", "key");
        rVar.f82732a.o("PREF_GROUP_BOARD_UPSELL_CONVOS_ACCEPTED", j13);
    }

    public final void f() {
        String format = this.f52915b.format(new Date());
        lb0.r rVar = this.f52914a;
        rVar.b("PREF_GROUP_BOARD_UPSELL_DISMISS_DATE", format);
        rVar.h("PREF_GROUP_BOARD_UPSELL_TIMES_DECLINED", rVar.g("PREF_GROUP_BOARD_UPSELL_TIMES_DECLINED", 0) + 1);
    }
}
