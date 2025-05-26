package tb;

import android.database.Cursor;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import ja.d0;
import ja.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kb.c0;
import kb.l0;
import kb.s0;
import kotlin.jvm.internal.Intrinsics;
import rl2.g0;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f117050a;

    /* renamed from: b, reason: collision with root package name */
    public final b f117051b;

    /* renamed from: c, reason: collision with root package name */
    public final x f117052c;

    /* renamed from: d, reason: collision with root package name */
    public final u f117053d;

    /* renamed from: e, reason: collision with root package name */
    public final u f117054e;

    /* renamed from: f, reason: collision with root package name */
    public final u f117055f;

    /* renamed from: g, reason: collision with root package name */
    public final u f117056g;

    /* renamed from: h, reason: collision with root package name */
    public final u f117057h;

    /* renamed from: i, reason: collision with root package name */
    public final u f117058i;

    /* renamed from: j, reason: collision with root package name */
    public final u f117059j;

    /* renamed from: k, reason: collision with root package name */
    public final u f117060k;

    /* renamed from: l, reason: collision with root package name */
    public final u f117061l;

    /* renamed from: m, reason: collision with root package name */
    public final u f117062m;

    /* renamed from: n, reason: collision with root package name */
    public final u f117063n;

    /* renamed from: o, reason: collision with root package name */
    public final u f117064o;

    public y(d0 d0Var) {
        this.f117050a = d0Var;
        int i13 = 5;
        this.f117051b = new b(this, d0Var, i13);
        int i14 = 0;
        this.f117052c = new x(this, d0Var, i14);
        this.f117053d = new u(d0Var, 8);
        this.f117054e = new u(d0Var, 9);
        this.f117055f = new u(d0Var, 10);
        this.f117056g = new u(d0Var, 11);
        this.f117057h = new u(d0Var, 12);
        this.f117058i = new u(d0Var, 13);
        this.f117059j = new u(d0Var, 14);
        this.f117060k = new u(d0Var, i14);
        new u(d0Var, 1);
        this.f117061l = new u(d0Var, 2);
        this.f117062m = new u(d0Var, 3);
        this.f117063n = new u(d0Var, 4);
        new u(d0Var, i13);
        new u(d0Var, 6);
        this.f117064o = new u(d0Var, 7);
    }

    public final void a(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            g0.d0(hashMap, new t(this, 1));
            return;
        }
        StringBuilder a03 = g0.a0();
        a03.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        g0.l(size, a03);
        a03.append(")");
        f0 d2 = f0.d(size, a03.toString());
        Iterator it = keySet.iterator();
        int i13 = 1;
        while (it.hasNext()) {
            d2.c1(i13, (String) it.next());
            i13++;
        }
        Cursor m03 = d7.b.m0(this.f117050a, d2, false);
        try {
            int v13 = b7.c.v(m03, "work_spec_id");
            if (v13 == -1) {
                return;
            }
            while (m03.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(m03.getString(v13));
                if (arrayList != null) {
                    arrayList.add(kb.l.a(m03.getBlob(0)));
                }
            }
        } finally {
            m03.close();
        }
    }

    public final void b(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            g0.d0(hashMap, new t(this, 0));
            return;
        }
        StringBuilder a03 = g0.a0();
        a03.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        g0.l(size, a03);
        a03.append(")");
        f0 d2 = f0.d(size, a03.toString());
        Iterator it = keySet.iterator();
        int i13 = 1;
        while (it.hasNext()) {
            d2.c1(i13, (String) it.next());
            i13++;
        }
        Cursor m03 = d7.b.m0(this.f117050a, d2, false);
        try {
            int v13 = b7.c.v(m03, "work_spec_id");
            if (v13 == -1) {
                return;
            }
            while (m03.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(m03.getString(v13));
                if (arrayList != null) {
                    arrayList.add(m03.getString(0));
                }
            }
        } finally {
            m03.close();
        }
    }

    public final void c(String str) {
        d0 d0Var = this.f117050a;
        d0Var.b();
        u uVar = this.f117053d;
        oa.i a13 = uVar.a();
        a13.c1(1, str);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
            } finally {
                d0Var.m();
            }
        } finally {
            uVar.j(a13);
        }
    }

    public final ArrayList d() {
        f0 f0Var;
        int w13;
        int w14;
        int w15;
        int w16;
        int w17;
        int w18;
        int w19;
        int w23;
        int w24;
        int w25;
        int w26;
        int w27;
        int w28;
        int w29;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        f0 d2 = f0.d(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        d2.u1(1, 200);
        d0 d0Var = this.f117050a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            w13 = b7.c.w(m03, "id");
            w14 = b7.c.w(m03, AnimatedTarget.PROPERTY_STATE);
            w15 = b7.c.w(m03, "worker_class_name");
            w16 = b7.c.w(m03, "input_merger_class_name");
            w17 = b7.c.w(m03, "input");
            w18 = b7.c.w(m03, "output");
            w19 = b7.c.w(m03, "initial_delay");
            w23 = b7.c.w(m03, "interval_duration");
            w24 = b7.c.w(m03, "flex_duration");
            w25 = b7.c.w(m03, "run_attempt_count");
            w26 = b7.c.w(m03, "backoff_policy");
            w27 = b7.c.w(m03, "backoff_delay_duration");
            w28 = b7.c.w(m03, "last_enqueue_time");
            w29 = b7.c.w(m03, "minimum_retention_duration");
            f0Var = d2;
        } catch (Throwable th3) {
            th = th3;
            f0Var = d2;
        }
        try {
            int w33 = b7.c.w(m03, "schedule_requested_at");
            int w34 = b7.c.w(m03, "run_in_foreground");
            int w35 = b7.c.w(m03, "out_of_quota_policy");
            int w36 = b7.c.w(m03, "period_count");
            int w37 = b7.c.w(m03, "generation");
            int w38 = b7.c.w(m03, "next_schedule_time_override");
            int w39 = b7.c.w(m03, "next_schedule_time_override_generation");
            int w43 = b7.c.w(m03, "stop_reason");
            int w44 = b7.c.w(m03, "trace_tag");
            int w45 = b7.c.w(m03, "required_network_type");
            int w46 = b7.c.w(m03, "required_network_request");
            int w47 = b7.c.w(m03, "requires_charging");
            int w48 = b7.c.w(m03, "requires_device_idle");
            int w49 = b7.c.w(m03, "requires_battery_not_low");
            int w53 = b7.c.w(m03, "requires_storage_not_low");
            int w54 = b7.c.w(m03, "trigger_content_update_delay");
            int w55 = b7.c.w(m03, "trigger_max_content_delay");
            int w56 = b7.c.w(m03, "content_uri_triggers");
            int i18 = w29;
            ArrayList arrayList = new ArrayList(m03.getCount());
            while (m03.moveToNext()) {
                String string = m03.getString(w13);
                s0 v13 = dl2.b.v1(m03.getInt(w14));
                String string2 = m03.getString(w15);
                String string3 = m03.getString(w16);
                kb.l a13 = kb.l.a(m03.getBlob(w17));
                kb.l a14 = kb.l.a(m03.getBlob(w18));
                long j13 = m03.getLong(w19);
                long j14 = m03.getLong(w23);
                long j15 = m03.getLong(w24);
                int i19 = m03.getInt(w25);
                kb.a s13 = dl2.b.s1(m03.getInt(w26));
                long j16 = m03.getLong(w27);
                long j17 = m03.getLong(w28);
                int i23 = i18;
                long j18 = m03.getLong(i23);
                int i24 = w13;
                int i25 = w33;
                long j19 = m03.getLong(i25);
                w33 = i25;
                int i26 = w34;
                if (m03.getInt(i26) != 0) {
                    w34 = i26;
                    i13 = w35;
                    z13 = true;
                } else {
                    w34 = i26;
                    i13 = w35;
                    z13 = false;
                }
                l0 u13 = dl2.b.u1(m03.getInt(i13));
                w35 = i13;
                int i27 = w36;
                int i28 = m03.getInt(i27);
                w36 = i27;
                int i29 = w37;
                int i33 = m03.getInt(i29);
                w37 = i29;
                int i34 = w38;
                long j23 = m03.getLong(i34);
                w38 = i34;
                int i35 = w39;
                int i36 = m03.getInt(i35);
                w39 = i35;
                int i37 = w43;
                int i38 = m03.getInt(i37);
                w43 = i37;
                int i39 = w44;
                String string4 = m03.isNull(i39) ? null : m03.getString(i39);
                w44 = i39;
                int i43 = w45;
                c0 t13 = dl2.b.t1(m03.getInt(i43));
                w45 = i43;
                int i44 = w46;
                ub.g U2 = dl2.b.U2(m03.getBlob(i44));
                w46 = i44;
                int i45 = w47;
                if (m03.getInt(i45) != 0) {
                    w47 = i45;
                    i14 = w48;
                    z14 = true;
                } else {
                    w47 = i45;
                    i14 = w48;
                    z14 = false;
                }
                if (m03.getInt(i14) != 0) {
                    w48 = i14;
                    i15 = w49;
                    z15 = true;
                } else {
                    w48 = i14;
                    i15 = w49;
                    z15 = false;
                }
                if (m03.getInt(i15) != 0) {
                    w49 = i15;
                    i16 = w53;
                    z16 = true;
                } else {
                    w49 = i15;
                    i16 = w53;
                    z16 = false;
                }
                if (m03.getInt(i16) != 0) {
                    w53 = i16;
                    i17 = w54;
                    z17 = true;
                } else {
                    w53 = i16;
                    i17 = w54;
                    z17 = false;
                }
                long j24 = m03.getLong(i17);
                w54 = i17;
                int i46 = w55;
                long j25 = m03.getLong(i46);
                w55 = i46;
                int i47 = w56;
                w56 = i47;
                arrayList.add(new s(string, v13, string2, string3, a13, a14, j13, j14, j15, new kb.g(U2, t13, z14, z15, z16, z17, j24, j25, dl2.b.C(m03.getBlob(i47))), i19, s13, j16, j17, j18, j19, z13, u13, i28, i33, j23, i36, i38, string4));
                w13 = i24;
                i18 = i23;
            }
            m03.close();
            f0Var.e();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            m03.close();
            f0Var.e();
            throw th;
        }
    }

    public final ArrayList e(int i13) {
        f0 f0Var;
        int w13;
        int w14;
        int w15;
        int w16;
        int w17;
        int w18;
        int w19;
        int w23;
        int w24;
        int w25;
        int w26;
        int w27;
        int w28;
        int w29;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        boolean z16;
        int i18;
        boolean z17;
        f0 d2 = f0.d(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        d2.u1(1, i13);
        d0 d0Var = this.f117050a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            w13 = b7.c.w(m03, "id");
            w14 = b7.c.w(m03, AnimatedTarget.PROPERTY_STATE);
            w15 = b7.c.w(m03, "worker_class_name");
            w16 = b7.c.w(m03, "input_merger_class_name");
            w17 = b7.c.w(m03, "input");
            w18 = b7.c.w(m03, "output");
            w19 = b7.c.w(m03, "initial_delay");
            w23 = b7.c.w(m03, "interval_duration");
            w24 = b7.c.w(m03, "flex_duration");
            w25 = b7.c.w(m03, "run_attempt_count");
            w26 = b7.c.w(m03, "backoff_policy");
            w27 = b7.c.w(m03, "backoff_delay_duration");
            w28 = b7.c.w(m03, "last_enqueue_time");
            w29 = b7.c.w(m03, "minimum_retention_duration");
            f0Var = d2;
        } catch (Throwable th3) {
            th = th3;
            f0Var = d2;
        }
        try {
            int w33 = b7.c.w(m03, "schedule_requested_at");
            int w34 = b7.c.w(m03, "run_in_foreground");
            int w35 = b7.c.w(m03, "out_of_quota_policy");
            int w36 = b7.c.w(m03, "period_count");
            int w37 = b7.c.w(m03, "generation");
            int w38 = b7.c.w(m03, "next_schedule_time_override");
            int w39 = b7.c.w(m03, "next_schedule_time_override_generation");
            int w43 = b7.c.w(m03, "stop_reason");
            int w44 = b7.c.w(m03, "trace_tag");
            int w45 = b7.c.w(m03, "required_network_type");
            int w46 = b7.c.w(m03, "required_network_request");
            int w47 = b7.c.w(m03, "requires_charging");
            int w48 = b7.c.w(m03, "requires_device_idle");
            int w49 = b7.c.w(m03, "requires_battery_not_low");
            int w53 = b7.c.w(m03, "requires_storage_not_low");
            int w54 = b7.c.w(m03, "trigger_content_update_delay");
            int w55 = b7.c.w(m03, "trigger_max_content_delay");
            int w56 = b7.c.w(m03, "content_uri_triggers");
            int i19 = w29;
            ArrayList arrayList = new ArrayList(m03.getCount());
            while (m03.moveToNext()) {
                String string = m03.getString(w13);
                s0 v13 = dl2.b.v1(m03.getInt(w14));
                String string2 = m03.getString(w15);
                String string3 = m03.getString(w16);
                kb.l a13 = kb.l.a(m03.getBlob(w17));
                kb.l a14 = kb.l.a(m03.getBlob(w18));
                long j13 = m03.getLong(w19);
                long j14 = m03.getLong(w23);
                long j15 = m03.getLong(w24);
                int i23 = m03.getInt(w25);
                kb.a s13 = dl2.b.s1(m03.getInt(w26));
                long j16 = m03.getLong(w27);
                long j17 = m03.getLong(w28);
                int i24 = i19;
                long j18 = m03.getLong(i24);
                int i25 = w13;
                int i26 = w33;
                long j19 = m03.getLong(i26);
                w33 = i26;
                int i27 = w34;
                if (m03.getInt(i27) != 0) {
                    w34 = i27;
                    i14 = w35;
                    z13 = true;
                } else {
                    w34 = i27;
                    i14 = w35;
                    z13 = false;
                }
                l0 u13 = dl2.b.u1(m03.getInt(i14));
                w35 = i14;
                int i28 = w36;
                int i29 = m03.getInt(i28);
                w36 = i28;
                int i33 = w37;
                int i34 = m03.getInt(i33);
                w37 = i33;
                int i35 = w38;
                long j23 = m03.getLong(i35);
                w38 = i35;
                int i36 = w39;
                int i37 = m03.getInt(i36);
                w39 = i36;
                int i38 = w43;
                int i39 = m03.getInt(i38);
                w43 = i38;
                int i43 = w44;
                String string4 = m03.isNull(i43) ? null : m03.getString(i43);
                w44 = i43;
                int i44 = w45;
                c0 t13 = dl2.b.t1(m03.getInt(i44));
                w45 = i44;
                int i45 = w46;
                ub.g U2 = dl2.b.U2(m03.getBlob(i45));
                w46 = i45;
                int i46 = w47;
                if (m03.getInt(i46) != 0) {
                    w47 = i46;
                    i15 = w48;
                    z14 = true;
                } else {
                    w47 = i46;
                    i15 = w48;
                    z14 = false;
                }
                if (m03.getInt(i15) != 0) {
                    w48 = i15;
                    i16 = w49;
                    z15 = true;
                } else {
                    w48 = i15;
                    i16 = w49;
                    z15 = false;
                }
                if (m03.getInt(i16) != 0) {
                    w49 = i16;
                    i17 = w53;
                    z16 = true;
                } else {
                    w49 = i16;
                    i17 = w53;
                    z16 = false;
                }
                if (m03.getInt(i17) != 0) {
                    w53 = i17;
                    i18 = w54;
                    z17 = true;
                } else {
                    w53 = i17;
                    i18 = w54;
                    z17 = false;
                }
                long j24 = m03.getLong(i18);
                w54 = i18;
                int i47 = w55;
                long j25 = m03.getLong(i47);
                w55 = i47;
                int i48 = w56;
                w56 = i48;
                arrayList.add(new s(string, v13, string2, string3, a13, a14, j13, j14, j15, new kb.g(U2, t13, z14, z15, z16, z17, j24, j25, dl2.b.C(m03.getBlob(i48))), i23, s13, j16, j17, j18, j19, z13, u13, i29, i34, j23, i37, i39, string4));
                w13 = i25;
                i19 = i24;
            }
            m03.close();
            f0Var.e();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            m03.close();
            f0Var.e();
            throw th;
        }
    }

    public final ArrayList f() {
        f0 f0Var;
        int w13;
        int w14;
        int w15;
        int w16;
        int w17;
        int w18;
        int w19;
        int w23;
        int w24;
        int w25;
        int w26;
        int w27;
        int w28;
        int w29;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        f0 d2 = f0.d(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        d0 d0Var = this.f117050a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            w13 = b7.c.w(m03, "id");
            w14 = b7.c.w(m03, AnimatedTarget.PROPERTY_STATE);
            w15 = b7.c.w(m03, "worker_class_name");
            w16 = b7.c.w(m03, "input_merger_class_name");
            w17 = b7.c.w(m03, "input");
            w18 = b7.c.w(m03, "output");
            w19 = b7.c.w(m03, "initial_delay");
            w23 = b7.c.w(m03, "interval_duration");
            w24 = b7.c.w(m03, "flex_duration");
            w25 = b7.c.w(m03, "run_attempt_count");
            w26 = b7.c.w(m03, "backoff_policy");
            w27 = b7.c.w(m03, "backoff_delay_duration");
            w28 = b7.c.w(m03, "last_enqueue_time");
            w29 = b7.c.w(m03, "minimum_retention_duration");
            f0Var = d2;
        } catch (Throwable th3) {
            th = th3;
            f0Var = d2;
        }
        try {
            int w33 = b7.c.w(m03, "schedule_requested_at");
            int w34 = b7.c.w(m03, "run_in_foreground");
            int w35 = b7.c.w(m03, "out_of_quota_policy");
            int w36 = b7.c.w(m03, "period_count");
            int w37 = b7.c.w(m03, "generation");
            int w38 = b7.c.w(m03, "next_schedule_time_override");
            int w39 = b7.c.w(m03, "next_schedule_time_override_generation");
            int w43 = b7.c.w(m03, "stop_reason");
            int w44 = b7.c.w(m03, "trace_tag");
            int w45 = b7.c.w(m03, "required_network_type");
            int w46 = b7.c.w(m03, "required_network_request");
            int w47 = b7.c.w(m03, "requires_charging");
            int w48 = b7.c.w(m03, "requires_device_idle");
            int w49 = b7.c.w(m03, "requires_battery_not_low");
            int w53 = b7.c.w(m03, "requires_storage_not_low");
            int w54 = b7.c.w(m03, "trigger_content_update_delay");
            int w55 = b7.c.w(m03, "trigger_max_content_delay");
            int w56 = b7.c.w(m03, "content_uri_triggers");
            int i18 = w29;
            ArrayList arrayList = new ArrayList(m03.getCount());
            while (m03.moveToNext()) {
                String string = m03.getString(w13);
                s0 v13 = dl2.b.v1(m03.getInt(w14));
                String string2 = m03.getString(w15);
                String string3 = m03.getString(w16);
                kb.l a13 = kb.l.a(m03.getBlob(w17));
                kb.l a14 = kb.l.a(m03.getBlob(w18));
                long j13 = m03.getLong(w19);
                long j14 = m03.getLong(w23);
                long j15 = m03.getLong(w24);
                int i19 = m03.getInt(w25);
                kb.a s13 = dl2.b.s1(m03.getInt(w26));
                long j16 = m03.getLong(w27);
                long j17 = m03.getLong(w28);
                int i23 = i18;
                long j18 = m03.getLong(i23);
                int i24 = w13;
                int i25 = w33;
                long j19 = m03.getLong(i25);
                w33 = i25;
                int i26 = w34;
                if (m03.getInt(i26) != 0) {
                    w34 = i26;
                    i13 = w35;
                    z13 = true;
                } else {
                    w34 = i26;
                    i13 = w35;
                    z13 = false;
                }
                l0 u13 = dl2.b.u1(m03.getInt(i13));
                w35 = i13;
                int i27 = w36;
                int i28 = m03.getInt(i27);
                w36 = i27;
                int i29 = w37;
                int i33 = m03.getInt(i29);
                w37 = i29;
                int i34 = w38;
                long j23 = m03.getLong(i34);
                w38 = i34;
                int i35 = w39;
                int i36 = m03.getInt(i35);
                w39 = i35;
                int i37 = w43;
                int i38 = m03.getInt(i37);
                w43 = i37;
                int i39 = w44;
                String string4 = m03.isNull(i39) ? null : m03.getString(i39);
                w44 = i39;
                int i43 = w45;
                c0 t13 = dl2.b.t1(m03.getInt(i43));
                w45 = i43;
                int i44 = w46;
                ub.g U2 = dl2.b.U2(m03.getBlob(i44));
                w46 = i44;
                int i45 = w47;
                if (m03.getInt(i45) != 0) {
                    w47 = i45;
                    i14 = w48;
                    z14 = true;
                } else {
                    w47 = i45;
                    i14 = w48;
                    z14 = false;
                }
                if (m03.getInt(i14) != 0) {
                    w48 = i14;
                    i15 = w49;
                    z15 = true;
                } else {
                    w48 = i14;
                    i15 = w49;
                    z15 = false;
                }
                if (m03.getInt(i15) != 0) {
                    w49 = i15;
                    i16 = w53;
                    z16 = true;
                } else {
                    w49 = i15;
                    i16 = w53;
                    z16 = false;
                }
                if (m03.getInt(i16) != 0) {
                    w53 = i16;
                    i17 = w54;
                    z17 = true;
                } else {
                    w53 = i16;
                    i17 = w54;
                    z17 = false;
                }
                long j24 = m03.getLong(i17);
                w54 = i17;
                int i46 = w55;
                long j25 = m03.getLong(i46);
                w55 = i46;
                int i47 = w56;
                w56 = i47;
                arrayList.add(new s(string, v13, string2, string3, a13, a14, j13, j14, j15, new kb.g(U2, t13, z14, z15, z16, z17, j24, j25, dl2.b.C(m03.getBlob(i47))), i19, s13, j16, j17, j18, j19, z13, u13, i28, i33, j23, i36, i38, string4));
                w13 = i24;
                i18 = i23;
            }
            m03.close();
            f0Var.e();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            m03.close();
            f0Var.e();
            throw th;
        }
    }

    public final ArrayList g() {
        f0 f0Var;
        int w13;
        int w14;
        int w15;
        int w16;
        int w17;
        int w18;
        int w19;
        int w23;
        int w24;
        int w25;
        int w26;
        int w27;
        int w28;
        int w29;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        f0 d2 = f0.d(0, "SELECT * FROM workspec WHERE state=1");
        d0 d0Var = this.f117050a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            w13 = b7.c.w(m03, "id");
            w14 = b7.c.w(m03, AnimatedTarget.PROPERTY_STATE);
            w15 = b7.c.w(m03, "worker_class_name");
            w16 = b7.c.w(m03, "input_merger_class_name");
            w17 = b7.c.w(m03, "input");
            w18 = b7.c.w(m03, "output");
            w19 = b7.c.w(m03, "initial_delay");
            w23 = b7.c.w(m03, "interval_duration");
            w24 = b7.c.w(m03, "flex_duration");
            w25 = b7.c.w(m03, "run_attempt_count");
            w26 = b7.c.w(m03, "backoff_policy");
            w27 = b7.c.w(m03, "backoff_delay_duration");
            w28 = b7.c.w(m03, "last_enqueue_time");
            w29 = b7.c.w(m03, "minimum_retention_duration");
            f0Var = d2;
        } catch (Throwable th3) {
            th = th3;
            f0Var = d2;
        }
        try {
            int w33 = b7.c.w(m03, "schedule_requested_at");
            int w34 = b7.c.w(m03, "run_in_foreground");
            int w35 = b7.c.w(m03, "out_of_quota_policy");
            int w36 = b7.c.w(m03, "period_count");
            int w37 = b7.c.w(m03, "generation");
            int w38 = b7.c.w(m03, "next_schedule_time_override");
            int w39 = b7.c.w(m03, "next_schedule_time_override_generation");
            int w43 = b7.c.w(m03, "stop_reason");
            int w44 = b7.c.w(m03, "trace_tag");
            int w45 = b7.c.w(m03, "required_network_type");
            int w46 = b7.c.w(m03, "required_network_request");
            int w47 = b7.c.w(m03, "requires_charging");
            int w48 = b7.c.w(m03, "requires_device_idle");
            int w49 = b7.c.w(m03, "requires_battery_not_low");
            int w53 = b7.c.w(m03, "requires_storage_not_low");
            int w54 = b7.c.w(m03, "trigger_content_update_delay");
            int w55 = b7.c.w(m03, "trigger_max_content_delay");
            int w56 = b7.c.w(m03, "content_uri_triggers");
            int i18 = w29;
            ArrayList arrayList = new ArrayList(m03.getCount());
            while (m03.moveToNext()) {
                String string = m03.getString(w13);
                s0 v13 = dl2.b.v1(m03.getInt(w14));
                String string2 = m03.getString(w15);
                String string3 = m03.getString(w16);
                kb.l a13 = kb.l.a(m03.getBlob(w17));
                kb.l a14 = kb.l.a(m03.getBlob(w18));
                long j13 = m03.getLong(w19);
                long j14 = m03.getLong(w23);
                long j15 = m03.getLong(w24);
                int i19 = m03.getInt(w25);
                kb.a s13 = dl2.b.s1(m03.getInt(w26));
                long j16 = m03.getLong(w27);
                long j17 = m03.getLong(w28);
                int i23 = i18;
                long j18 = m03.getLong(i23);
                int i24 = w13;
                int i25 = w33;
                long j19 = m03.getLong(i25);
                w33 = i25;
                int i26 = w34;
                if (m03.getInt(i26) != 0) {
                    w34 = i26;
                    i13 = w35;
                    z13 = true;
                } else {
                    w34 = i26;
                    i13 = w35;
                    z13 = false;
                }
                l0 u13 = dl2.b.u1(m03.getInt(i13));
                w35 = i13;
                int i27 = w36;
                int i28 = m03.getInt(i27);
                w36 = i27;
                int i29 = w37;
                int i33 = m03.getInt(i29);
                w37 = i29;
                int i34 = w38;
                long j23 = m03.getLong(i34);
                w38 = i34;
                int i35 = w39;
                int i36 = m03.getInt(i35);
                w39 = i35;
                int i37 = w43;
                int i38 = m03.getInt(i37);
                w43 = i37;
                int i39 = w44;
                String string4 = m03.isNull(i39) ? null : m03.getString(i39);
                w44 = i39;
                int i43 = w45;
                c0 t13 = dl2.b.t1(m03.getInt(i43));
                w45 = i43;
                int i44 = w46;
                ub.g U2 = dl2.b.U2(m03.getBlob(i44));
                w46 = i44;
                int i45 = w47;
                if (m03.getInt(i45) != 0) {
                    w47 = i45;
                    i14 = w48;
                    z14 = true;
                } else {
                    w47 = i45;
                    i14 = w48;
                    z14 = false;
                }
                if (m03.getInt(i14) != 0) {
                    w48 = i14;
                    i15 = w49;
                    z15 = true;
                } else {
                    w48 = i14;
                    i15 = w49;
                    z15 = false;
                }
                if (m03.getInt(i15) != 0) {
                    w49 = i15;
                    i16 = w53;
                    z16 = true;
                } else {
                    w49 = i15;
                    i16 = w53;
                    z16 = false;
                }
                if (m03.getInt(i16) != 0) {
                    w53 = i16;
                    i17 = w54;
                    z17 = true;
                } else {
                    w53 = i16;
                    i17 = w54;
                    z17 = false;
                }
                long j24 = m03.getLong(i17);
                w54 = i17;
                int i46 = w55;
                long j25 = m03.getLong(i46);
                w55 = i46;
                int i47 = w56;
                w56 = i47;
                arrayList.add(new s(string, v13, string2, string3, a13, a14, j13, j14, j15, new kb.g(U2, t13, z14, z15, z16, z17, j24, j25, dl2.b.C(m03.getBlob(i47))), i19, s13, j16, j17, j18, j19, z13, u13, i28, i33, j23, i36, i38, string4));
                w13 = i24;
                i18 = i23;
            }
            m03.close();
            f0Var.e();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            m03.close();
            f0Var.e();
            throw th;
        }
    }

    public final ArrayList h() {
        f0 f0Var;
        int w13;
        int w14;
        int w15;
        int w16;
        int w17;
        int w18;
        int w19;
        int w23;
        int w24;
        int w25;
        int w26;
        int w27;
        int w28;
        int w29;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        f0 d2 = f0.d(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        d0 d0Var = this.f117050a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            w13 = b7.c.w(m03, "id");
            w14 = b7.c.w(m03, AnimatedTarget.PROPERTY_STATE);
            w15 = b7.c.w(m03, "worker_class_name");
            w16 = b7.c.w(m03, "input_merger_class_name");
            w17 = b7.c.w(m03, "input");
            w18 = b7.c.w(m03, "output");
            w19 = b7.c.w(m03, "initial_delay");
            w23 = b7.c.w(m03, "interval_duration");
            w24 = b7.c.w(m03, "flex_duration");
            w25 = b7.c.w(m03, "run_attempt_count");
            w26 = b7.c.w(m03, "backoff_policy");
            w27 = b7.c.w(m03, "backoff_delay_duration");
            w28 = b7.c.w(m03, "last_enqueue_time");
            w29 = b7.c.w(m03, "minimum_retention_duration");
            f0Var = d2;
        } catch (Throwable th3) {
            th = th3;
            f0Var = d2;
        }
        try {
            int w33 = b7.c.w(m03, "schedule_requested_at");
            int w34 = b7.c.w(m03, "run_in_foreground");
            int w35 = b7.c.w(m03, "out_of_quota_policy");
            int w36 = b7.c.w(m03, "period_count");
            int w37 = b7.c.w(m03, "generation");
            int w38 = b7.c.w(m03, "next_schedule_time_override");
            int w39 = b7.c.w(m03, "next_schedule_time_override_generation");
            int w43 = b7.c.w(m03, "stop_reason");
            int w44 = b7.c.w(m03, "trace_tag");
            int w45 = b7.c.w(m03, "required_network_type");
            int w46 = b7.c.w(m03, "required_network_request");
            int w47 = b7.c.w(m03, "requires_charging");
            int w48 = b7.c.w(m03, "requires_device_idle");
            int w49 = b7.c.w(m03, "requires_battery_not_low");
            int w53 = b7.c.w(m03, "requires_storage_not_low");
            int w54 = b7.c.w(m03, "trigger_content_update_delay");
            int w55 = b7.c.w(m03, "trigger_max_content_delay");
            int w56 = b7.c.w(m03, "content_uri_triggers");
            int i18 = w29;
            ArrayList arrayList = new ArrayList(m03.getCount());
            while (m03.moveToNext()) {
                String string = m03.getString(w13);
                s0 v13 = dl2.b.v1(m03.getInt(w14));
                String string2 = m03.getString(w15);
                String string3 = m03.getString(w16);
                kb.l a13 = kb.l.a(m03.getBlob(w17));
                kb.l a14 = kb.l.a(m03.getBlob(w18));
                long j13 = m03.getLong(w19);
                long j14 = m03.getLong(w23);
                long j15 = m03.getLong(w24);
                int i19 = m03.getInt(w25);
                kb.a s13 = dl2.b.s1(m03.getInt(w26));
                long j16 = m03.getLong(w27);
                long j17 = m03.getLong(w28);
                int i23 = i18;
                long j18 = m03.getLong(i23);
                int i24 = w13;
                int i25 = w33;
                long j19 = m03.getLong(i25);
                w33 = i25;
                int i26 = w34;
                if (m03.getInt(i26) != 0) {
                    w34 = i26;
                    i13 = w35;
                    z13 = true;
                } else {
                    w34 = i26;
                    i13 = w35;
                    z13 = false;
                }
                l0 u13 = dl2.b.u1(m03.getInt(i13));
                w35 = i13;
                int i27 = w36;
                int i28 = m03.getInt(i27);
                w36 = i27;
                int i29 = w37;
                int i33 = m03.getInt(i29);
                w37 = i29;
                int i34 = w38;
                long j23 = m03.getLong(i34);
                w38 = i34;
                int i35 = w39;
                int i36 = m03.getInt(i35);
                w39 = i35;
                int i37 = w43;
                int i38 = m03.getInt(i37);
                w43 = i37;
                int i39 = w44;
                String string4 = m03.isNull(i39) ? null : m03.getString(i39);
                w44 = i39;
                int i43 = w45;
                c0 t13 = dl2.b.t1(m03.getInt(i43));
                w45 = i43;
                int i44 = w46;
                ub.g U2 = dl2.b.U2(m03.getBlob(i44));
                w46 = i44;
                int i45 = w47;
                if (m03.getInt(i45) != 0) {
                    w47 = i45;
                    i14 = w48;
                    z14 = true;
                } else {
                    w47 = i45;
                    i14 = w48;
                    z14 = false;
                }
                if (m03.getInt(i14) != 0) {
                    w48 = i14;
                    i15 = w49;
                    z15 = true;
                } else {
                    w48 = i14;
                    i15 = w49;
                    z15 = false;
                }
                if (m03.getInt(i15) != 0) {
                    w49 = i15;
                    i16 = w53;
                    z16 = true;
                } else {
                    w49 = i15;
                    i16 = w53;
                    z16 = false;
                }
                if (m03.getInt(i16) != 0) {
                    w53 = i16;
                    i17 = w54;
                    z17 = true;
                } else {
                    w53 = i16;
                    i17 = w54;
                    z17 = false;
                }
                long j24 = m03.getLong(i17);
                w54 = i17;
                int i46 = w55;
                long j25 = m03.getLong(i46);
                w55 = i46;
                int i47 = w56;
                w56 = i47;
                arrayList.add(new s(string, v13, string2, string3, a13, a14, j13, j14, j15, new kb.g(U2, t13, z14, z15, z16, z17, j24, j25, dl2.b.C(m03.getBlob(i47))), i19, s13, j16, j17, j18, j19, z13, u13, i28, i33, j23, i36, i38, string4));
                w13 = i24;
                i18 = i23;
            }
            m03.close();
            f0Var.e();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            m03.close();
            f0Var.e();
            throw th;
        }
    }

    public final s0 i(String str) {
        f0 d2 = f0.d(1, "SELECT state FROM workspec WHERE id=?");
        d2.c1(1, str);
        d0 d0Var = this.f117050a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            s0 s0Var = null;
            if (m03.moveToFirst()) {
                Integer valueOf = m03.isNull(0) ? null : Integer.valueOf(m03.getInt(0));
                if (valueOf != null) {
                    s0Var = dl2.b.v1(valueOf.intValue());
                }
            }
            return s0Var;
        } finally {
            m03.close();
            d2.e();
        }
    }

    public final s j(String str) {
        f0 f0Var;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        f0 d2 = f0.d(1, "SELECT * FROM workspec WHERE id=?");
        d2.c1(1, str);
        d0 d0Var = this.f117050a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            int w13 = b7.c.w(m03, "id");
            int w14 = b7.c.w(m03, AnimatedTarget.PROPERTY_STATE);
            int w15 = b7.c.w(m03, "worker_class_name");
            int w16 = b7.c.w(m03, "input_merger_class_name");
            int w17 = b7.c.w(m03, "input");
            int w18 = b7.c.w(m03, "output");
            int w19 = b7.c.w(m03, "initial_delay");
            int w23 = b7.c.w(m03, "interval_duration");
            int w24 = b7.c.w(m03, "flex_duration");
            int w25 = b7.c.w(m03, "run_attempt_count");
            int w26 = b7.c.w(m03, "backoff_policy");
            int w27 = b7.c.w(m03, "backoff_delay_duration");
            int w28 = b7.c.w(m03, "last_enqueue_time");
            int w29 = b7.c.w(m03, "minimum_retention_duration");
            f0Var = d2;
            try {
                int w33 = b7.c.w(m03, "schedule_requested_at");
                int w34 = b7.c.w(m03, "run_in_foreground");
                int w35 = b7.c.w(m03, "out_of_quota_policy");
                int w36 = b7.c.w(m03, "period_count");
                int w37 = b7.c.w(m03, "generation");
                int w38 = b7.c.w(m03, "next_schedule_time_override");
                int w39 = b7.c.w(m03, "next_schedule_time_override_generation");
                int w43 = b7.c.w(m03, "stop_reason");
                int w44 = b7.c.w(m03, "trace_tag");
                int w45 = b7.c.w(m03, "required_network_type");
                int w46 = b7.c.w(m03, "required_network_request");
                int w47 = b7.c.w(m03, "requires_charging");
                int w48 = b7.c.w(m03, "requires_device_idle");
                int w49 = b7.c.w(m03, "requires_battery_not_low");
                int w53 = b7.c.w(m03, "requires_storage_not_low");
                int w54 = b7.c.w(m03, "trigger_content_update_delay");
                int w55 = b7.c.w(m03, "trigger_max_content_delay");
                int w56 = b7.c.w(m03, "content_uri_triggers");
                s sVar = null;
                if (m03.moveToFirst()) {
                    String string = m03.getString(w13);
                    s0 v13 = dl2.b.v1(m03.getInt(w14));
                    String string2 = m03.getString(w15);
                    String string3 = m03.getString(w16);
                    kb.l a13 = kb.l.a(m03.getBlob(w17));
                    kb.l a14 = kb.l.a(m03.getBlob(w18));
                    long j13 = m03.getLong(w19);
                    long j14 = m03.getLong(w23);
                    long j15 = m03.getLong(w24);
                    int i18 = m03.getInt(w25);
                    kb.a s13 = dl2.b.s1(m03.getInt(w26));
                    long j16 = m03.getLong(w27);
                    long j17 = m03.getLong(w28);
                    long j18 = m03.getLong(w29);
                    long j19 = m03.getLong(w33);
                    if (m03.getInt(w34) != 0) {
                        i13 = w35;
                        z13 = true;
                    } else {
                        i13 = w35;
                        z13 = false;
                    }
                    l0 u13 = dl2.b.u1(m03.getInt(i13));
                    int i19 = m03.getInt(w36);
                    int i23 = m03.getInt(w37);
                    long j23 = m03.getLong(w38);
                    int i24 = m03.getInt(w39);
                    int i25 = m03.getInt(w43);
                    String string4 = m03.isNull(w44) ? null : m03.getString(w44);
                    c0 t13 = dl2.b.t1(m03.getInt(w45));
                    ub.g U2 = dl2.b.U2(m03.getBlob(w46));
                    if (m03.getInt(w47) != 0) {
                        i14 = w48;
                        z14 = true;
                    } else {
                        i14 = w48;
                        z14 = false;
                    }
                    if (m03.getInt(i14) != 0) {
                        i15 = w49;
                        z15 = true;
                    } else {
                        i15 = w49;
                        z15 = false;
                    }
                    if (m03.getInt(i15) != 0) {
                        i16 = w53;
                        z16 = true;
                    } else {
                        i16 = w53;
                        z16 = false;
                    }
                    if (m03.getInt(i16) != 0) {
                        i17 = w54;
                        z17 = true;
                    } else {
                        i17 = w54;
                        z17 = false;
                    }
                    sVar = new s(string, v13, string2, string3, a13, a14, j13, j14, j15, new kb.g(U2, t13, z14, z15, z16, z17, m03.getLong(i17), m03.getLong(w55), dl2.b.C(m03.getBlob(w56))), i18, s13, j16, j17, j18, j19, z13, u13, i19, i23, j23, i24, i25, string4);
                }
                m03.close();
                f0Var.e();
                return sVar;
            } catch (Throwable th3) {
                th = th3;
                m03.close();
                f0Var.e();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            f0Var = d2;
        }
    }

    public final ArrayList k(String str) {
        f0 d2 = f0.d(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        d2.c1(1, str);
        d0 d0Var = this.f117050a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            ArrayList arrayList = new ArrayList(m03.getCount());
            while (m03.moveToNext()) {
                String id3 = m03.getString(0);
                s0 state = dl2.b.v1(m03.getInt(1));
                Intrinsics.checkNotNullParameter(id3, "id");
                Intrinsics.checkNotNullParameter(state, "state");
                q qVar = new q();
                qVar.f116995a = id3;
                qVar.f116996b = state;
                arrayList.add(qVar);
            }
            return arrayList;
        } finally {
            m03.close();
            d2.e();
        }
    }

    public final void l(long j13, String str) {
        d0 d0Var = this.f117050a;
        d0Var.b();
        u uVar = this.f117062m;
        oa.i a13 = uVar.a();
        a13.u1(1, j13);
        a13.c1(2, str);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
            } finally {
                d0Var.m();
            }
        } finally {
            uVar.j(a13);
        }
    }

    public final void m(int i13, String str) {
        d0 d0Var = this.f117050a;
        d0Var.b();
        u uVar = this.f117061l;
        oa.i a13 = uVar.a();
        a13.c1(1, str);
        a13.u1(2, i13);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
            } finally {
                d0Var.m();
            }
        } finally {
            uVar.j(a13);
        }
    }

    public final void n(long j13, String str) {
        d0 d0Var = this.f117050a;
        d0Var.b();
        u uVar = this.f117058i;
        oa.i a13 = uVar.a();
        a13.u1(1, j13);
        a13.c1(2, str);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
            } finally {
                d0Var.m();
            }
        } finally {
            uVar.j(a13);
        }
    }

    public final void o(kb.l lVar, String str) {
        d0 d0Var = this.f117050a;
        d0Var.b();
        u uVar = this.f117057h;
        oa.i a13 = uVar.a();
        kb.l lVar2 = kb.l.f79018b;
        a13.y1(1, bk.f.e0(lVar));
        a13.c1(2, str);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
            } finally {
                d0Var.m();
            }
        } finally {
            uVar.j(a13);
        }
    }

    public final void p(s0 s0Var, String str) {
        d0 d0Var = this.f117050a;
        d0Var.b();
        u uVar = this.f117054e;
        oa.i a13 = uVar.a();
        a13.u1(1, dl2.b.L2(s0Var));
        a13.c1(2, str);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
            } finally {
                d0Var.m();
            }
        } finally {
            uVar.j(a13);
        }
    }

    public final void q(int i13, String str) {
        d0 d0Var = this.f117050a;
        d0Var.b();
        u uVar = this.f117064o;
        oa.i a13 = uVar.a();
        a13.u1(1, i13);
        a13.c1(2, str);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
            } finally {
                d0Var.m();
            }
        } finally {
            uVar.j(a13);
        }
    }
}
