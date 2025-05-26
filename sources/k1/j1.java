package k1;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x40.m9;

/* loaded from: classes2.dex */
public final class j1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77906i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f77907j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(String str, int i13) {
        super(1);
        this.f77906i = i13;
        this.f77907j = str;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f77906i;
        String str = this.f77907j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.p2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 14:
            case 17:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, fm1.c.VISIBLE, false, Integer.valueOf(str.length()), null, null, null, null, 0, 4153342);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
        }
    }

    public final em1.d e(em1.d state) {
        int i13 = this.f77906i;
        String str = this.f77907j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(state, "state");
                return em1.d.e(state, em1.b.CHECKED, null, null, bs1.c.h2(str), null, null, 0, null, false, 0, 1014);
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                return em1.d.e(state, em1.b.CHECKED, null, null, bs1.c.h2(str), null, null, 0, null, false, 0, 1014);
        }
    }

    public final rn1.a f(rn1.a it) {
        int i13 = this.f77906i;
        String str = this.f77907j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2096636);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2096636);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.h2(str), null, null, null, null, false, null, null, 2093054);
            case 26:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 27:
                Intrinsics.checkNotNullParameter(it, "state");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 28:
                Intrinsics.checkNotNullParameter(it, "state");
                return rn1.a.y(it, bs1.c.h2(str), null, null, kotlin.collections.e0.b(vn1.e.BOLD), null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097078);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, kotlin.collections.e0.b(vn1.b.CENTER), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097146);
        }
    }

    public final void h(Throwable th3) {
        int i13 = this.f77906i;
        String str = this.f77907j;
        switch (i13) {
            case 6:
                m60.u.f85943a.d(new i92.i(new i92.f(str)));
                break;
            default:
                m60.u.f85943a.d(new i92.i(new i92.f(str)));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 d2;
        int i13 = this.f77906i;
        String str = this.f77907j;
        switch (i13) {
            case 0:
                z3.y yVar = (z3.y) obj;
                switch (i13) {
                    case 0:
                        z3.w.f(yVar, str);
                        z3.w.h(yVar, 5);
                        break;
                    default:
                        z3.w.f(yVar, str);
                        break;
                }
                return Unit.f80348a;
            case 1:
                z3.y yVar2 = (z3.y) obj;
                switch (i13) {
                    case 0:
                        z3.w.f(yVar2, str);
                        z3.w.h(yVar2, 5);
                        break;
                    default:
                        z3.w.f(yVar2, str);
                        break;
                }
                return Unit.f80348a;
            case 2:
                return Boolean.valueOf(Intrinsics.d((String) obj, str));
            case 3:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.f80346a, str));
            case 4:
            default:
                return f((rn1.a) obj);
            case 5:
                WorkDatabase db3 = (WorkDatabase) obj;
                Intrinsics.checkNotNullParameter(db3, "db");
                tb.p pVar = tb.s.f117015z;
                tb.y y13 = db3.y();
                y13.getClass();
                ja.f0 d13 = ja.f0.d(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                d13.c1(1, str);
                ja.d0 d0Var = y13.f117050a;
                d0Var.b();
                d0Var.c();
                try {
                    Cursor m03 = d7.b.m0(d0Var, d13, true);
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (m03.moveToNext()) {
                            String string = m03.getString(0);
                            if (!hashMap.containsKey(string)) {
                                hashMap.put(string, new ArrayList());
                            }
                            String string2 = m03.getString(0);
                            if (!hashMap2.containsKey(string2)) {
                                hashMap2.put(string2, new ArrayList());
                            }
                        }
                        m03.moveToPosition(-1);
                        y13.b(hashMap);
                        y13.a(hashMap2);
                        ArrayList arrayList = new ArrayList(m03.getCount());
                        while (m03.moveToNext()) {
                            arrayList.add(new tb.r(m03.getString(0), dl2.b.v1(m03.getInt(1)), kb.l.a(m03.getBlob(2)), m03.getLong(14), m03.getLong(15), m03.getLong(16), new kb.g(dl2.b.U2(m03.getBlob(6)), dl2.b.t1(m03.getInt(5)), m03.getInt(7) != 0, m03.getInt(8) != 0, m03.getInt(9) != 0, m03.getInt(10) != 0, m03.getLong(11), m03.getLong(12), dl2.b.C(m03.getBlob(13))), m03.getInt(3), dl2.b.s1(m03.getInt(17)), m03.getLong(18), m03.getLong(19), m03.getInt(20), m03.getInt(4), m03.getLong(21), m03.getInt(22), (ArrayList) hashMap.get(m03.getString(0)), (ArrayList) hashMap2.get(m03.getString(0))));
                        }
                        d0Var.r();
                        m03.close();
                        d13.e();
                        d0Var.m();
                        Object apply = pVar.apply(arrayList);
                        Intrinsics.checkNotNullExpressionValue(apply, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
                        return (List) apply;
                    } catch (Throwable th3) {
                        m03.close();
                        d13.e();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    d0Var.m();
                    throw th4;
                }
            case 6:
                h((Throwable) obj);
                return Unit.f80348a;
            case 7:
                h((Throwable) obj);
                return Unit.f80348a;
            case 8:
                return e((em1.d) obj);
            case 9:
                return e((em1.d) obj);
            case 10:
                Intrinsics.checkNotNullParameter((com.pinterest.framework.multisection.datasource.pagedlist.p) obj, "it");
                return new m9(str);
            case 11:
                return b((ao1.b) obj);
            case 12:
                return b((ao1.b) obj);
            case 13:
                return b((ao1.b) obj);
            case 14:
                return f((rn1.a) obj);
            case 15:
                return b((ao1.b) obj);
            case 16:
                return b((ao1.b) obj);
            case 17:
                return f((rn1.a) obj);
            case 18:
                return b((ao1.b) obj);
            case 19:
                return b((ao1.b) obj);
            case 20:
                return b((ao1.b) obj);
            case 21:
                return f((rn1.a) obj);
            case 22:
                return b((ao1.b) obj);
            case 23:
                return b((ao1.b) obj);
            case 24:
                return f((rn1.a) obj);
            case 25:
                Object[] it2 = (Object[]) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z13 = false;
                for (Object obj2 : it2) {
                    if (obj2 instanceof f30) {
                        hh t53 = ((f30) obj2).t5();
                        if (Intrinsics.d((t53 == null || (d2 = t53.d()) == null) ? null : d2.getUid(), str)) {
                            z13 = true;
                        }
                    }
                }
                return Boolean.valueOf(z13);
            case 26:
                return f((rn1.a) obj);
            case 27:
                return f((rn1.a) obj);
            case 28:
                return f((rn1.a) obj);
        }
    }
}
