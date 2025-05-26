package ql;

import android.os.Bundle;
import bs1.c;
import oi.h5;
import pk.c1;
import pk.o1;
import pk.v2;
import pk.x0;
import pk.y0;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v2 f104064a;

    /* renamed from: b, reason: collision with root package name */
    public static final v2 f104065b;

    /* renamed from: c, reason: collision with root package name */
    public static final v2 f104066c;

    static {
        o1.u("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
        y0 y0Var = c1.f100372b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        c.v(7, objArr);
        f104064a = c1.l(7, objArr);
        f104065b = c1.x("auto", "app", "am");
        f104066c = c1.w("_r", "_dbg");
        x0 x0Var = new x0(4);
        x0Var.f(h5.f94815e);
        x0Var.f(h5.f94816f);
        x0Var.i();
        c1.w("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str, Bundle bundle) {
        if (f104064a.contains(str)) {
            return false;
        }
        v2 v2Var = f104066c;
        int size = v2Var.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = v2Var.get(i13);
            i13++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str, Bundle bundle) {
        if (!"_cmp".equals(str)) {
            return true;
        }
        if (!c()) {
            return false;
        }
        v2 v2Var = f104066c;
        int size = v2Var.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = v2Var.get(i13);
            i13++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    public static boolean c() {
        return !f104065b.contains("fcm");
    }
}
