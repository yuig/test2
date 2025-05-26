package k11;

import android.net.Uri;
import androidx.lifecycle.j0;
import com.pinterest.api.model.PinnableImage;
import df.j1;
import h32.f1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kb.w0;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import m7.h0;
import nx.d0;
import pk.a0;
import tb.s;
import tb.v;
import tb.y;
import v.f0;
import x02.d2;
import x02.i2;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f78120a;

    /* renamed from: b, reason: collision with root package name */
    public String f78121b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f78122c;

    /* renamed from: d, reason: collision with root package name */
    public Uri f78123d;

    /* renamed from: e, reason: collision with root package name */
    public d2 f78124e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f78125f;

    /* renamed from: g, reason: collision with root package name */
    public final String f78126g;

    /* renamed from: h, reason: collision with root package name */
    public final w0 f78127h;

    /* renamed from: i, reason: collision with root package name */
    public final j0 f78128i;

    /* renamed from: j, reason: collision with root package name */
    public final f0 f78129j = new f0(this, 1);

    public d(i2 i2Var, e eVar, w0 workManager, d0 d0Var, String str) {
        this.f78122c = i2Var;
        this.f78120a = new WeakReference(eVar);
        this.f78127h = workManager;
        this.f78125f = d0Var;
        this.f78126g = str;
        if (workManager != null) {
            kb.g gVar = com.pinterest.feature.video.model.c.f48997a;
            Intrinsics.checkNotNullParameter(workManager, "workManager");
            lb.j0 j0Var = (lb.j0) workManager;
            y y13 = j0Var.f82607d.y();
            y13.getClass();
            ja.f0 d2 = ja.f0.d(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
            d2.c1(1, "UPLOAD_MEDIA_WORKER_TAG");
            this.f78128i = c3.v(y13.f117050a.f75182e.b(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new v(y13, d2, 0)), s.f117015z, j0Var.f82608e);
        }
    }

    public final void a(d2 d2Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("pin_creation_method", d2Var.f131328i);
        hashMap.put("image_url", d2Var.f131324e);
        hashMap.put("source_url", d2Var.f131323d);
        hashMap.put("save_session_id", d2Var.f131338s);
        hashMap.put("board_id", d2Var.f131320a);
        this.f78125f.g(f1.PIN_CREATE_ATTEMPTED, null, hashMap, false);
    }

    public final void b(ArrayList arrayList, String str, String str2, String str3, String str4) {
        c(arrayList, str, str2, str3, null, str4, null, null);
    }

    public final void c(List list, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.h hVar = tb0.g.f117075a;
            NullPointerException nullPointerException = new NullPointerException("PinCreator pinnableImages is empty");
            StringBuilder w13 = a.a.w("pinnableImages empty in prepareAndUploadPin for board ", str2, ", boardId ", str, ", boardSectionId ");
            w13.append(str4);
            hVar.q(nullPointerException, w13.toString(), tb0.p.BOARD_CREATE);
            return;
        }
        this.f78121b = str2;
        int size = list.size();
        String str7 = "<this>";
        i2 i2Var = this.f78122c;
        int i13 = 0;
        if (size > 1) {
            ArrayList arrayList = new ArrayList();
            int i14 = 0;
            while (i14 < size) {
                ArrayList arrayList2 = arrayList;
                d2 d2 = d(str, "", str4, str5, (PinnableImage) list.get(i14), this.f78126g, str6, bool);
                arrayList2.add(d2);
                a(d2);
                i14++;
                arrayList = arrayList2;
                i13 = i13;
                i2Var = i2Var;
                str7 = str7;
                size = size;
            }
            ArrayList paramsList = arrayList;
            int i15 = i13;
            String str8 = ((d2) paramsList.get(i15)).f131324e;
            Intrinsics.checkNotNullParameter(i2Var, str7);
            Intrinsics.checkNotNullParameter(paramsList, "paramsList");
            fk2.g gVar = new fk2.g(new h0(paramsList), i15);
            Intrinsics.checkNotNullExpressionValue(gVar, "create(...)");
            gVar.j(new ek0.e(this, str, str8));
            return;
        }
        PinnableImage pinnableImage = (PinnableImage) list.get(0);
        vb0.j.f125466a.N(pinnableImage, "Pin create can't happen without a PinnableImage", new Object[0]);
        d2 params = d(str, str3, str4, str5, pinnableImage, this.f78126g, str6, bool);
        a(params);
        Uri uri = pinnableImage.f35571h;
        if (uri == null) {
            Intrinsics.checkNotNullParameter(i2Var, "<this>");
            Intrinsics.checkNotNullParameter(params, "params");
            List paramsList2 = Collections.singletonList(params);
            Intrinsics.checkNotNullExpressionValue(paramsList2, "singletonList(...)");
            Intrinsics.checkNotNullParameter(i2Var, "<this>");
            Intrinsics.checkNotNullParameter(paramsList2, "paramsList");
            fk2.g gVar2 = new fk2.g(new h0(paramsList2), 0);
            Intrinsics.checkNotNullExpressionValue(gVar2, "create(...)");
            gVar2.j(new go0.l(this, params));
            return;
        }
        String str9 = pinnableImage.f35570g;
        if (str9 != null) {
            params.f131323d = str9;
        }
        if (!pinnableImage.f35575l) {
            new kk2.k(new com.airbnb.lottie.j(this, pinnableImage, params, 4), 1).r(tk2.e.f118016b).l(wj2.c.a()).p(new ij0.a(this, params));
            return;
        }
        this.f78123d = uri;
        this.f78124e = params;
        j0 j0Var = this.f78128i;
        if (j0Var != null) {
            j0Var.f(this.f78129j);
        }
    }

    public final d2 d(String str, String str2, String str3, String str4, PinnableImage pinnableImage, String str5, String str6, Boolean bool) {
        String str7;
        d2 d2Var = new d2();
        if (str != null) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            d2Var.f131320a = str;
        }
        if (str2 != null) {
            d2Var.f131322c = str2;
        }
        WeakReference weakReference = this.f78120a;
        String X1 = ((e) weakReference.get()).X1();
        if (!a0.s0(X1)) {
            d2Var.f131327h = X1;
        }
        String z13 = ((e) weakReference.get()).z1();
        if (!a0.s0(z13)) {
            d2Var.f131328i = z13;
        }
        String s22 = ((e) weakReference.get()).s2();
        if (!a0.s0(s22)) {
            d2Var.f131335p = s22;
        }
        String f81427f1 = ((e) weakReference.get()).getF81427f1();
        if (!a0.s0(f81427f1)) {
            d2Var.f131336q = f81427f1;
        }
        if (str3 != null) {
            d2Var.f131332m = str3;
        }
        j0 j0Var = this.f78128i;
        if (j0Var != null) {
            j0Var.j(this.f78129j);
        }
        String str8 = pinnableImage.f35567d;
        if (str8 != null) {
            d2Var.f131321b = str8;
        }
        if (a0.x0(str2) && (str7 = pinnableImage.f35568e) != null) {
            d2Var.f131322c = str7;
        }
        String str9 = pinnableImage.f35576m;
        if (str9 != null) {
            d2Var.f131337r = str9;
        }
        if (pinnableImage.f35571h == null) {
            String str10 = pinnableImage.f35570g;
            if (str10 != null) {
                d2Var.f131323d = str10;
            }
            String str11 = pinnableImage.f35569f;
            if (str11 != null) {
                d2Var.f131324e = str11;
            }
            String str12 = pinnableImage.f35574k;
            if (str12 != null) {
                d2Var.f131329j = str12;
                if (a0.x0(d2Var.f131322c)) {
                    d2Var.f131322c = j1.a0(pinnableImage.f35568e).toString();
                }
            }
            String str13 = j1.W("%d", Long.valueOf(System.currentTimeMillis())) + pinnableImage.f35564a;
            Intrinsics.checkNotNullParameter(str13, "<set-?>");
            d2Var.f131330k = str13;
            d2Var.f131333n = str4;
            d2Var.f131334o = pinnableImage.f35577n;
        }
        if (str5 != null) {
            d2Var.f131338s = str5;
        }
        if (str6 != null) {
            d2Var.f131339t = str6;
            if (bool != null) {
                d2Var.f131340u = bool.booleanValue();
            }
        }
        return d2Var;
    }
}
