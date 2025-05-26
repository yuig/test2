package vb0;

import android.content.Context;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import m60.f0;
import so.oa;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a */
    public static final f0 f125466a = new f0();

    /* renamed from: b */
    public static n1 f125467b;

    /* renamed from: c */
    public static Boolean f125468c;

    /* renamed from: d */
    public static long f125469d;

    /* renamed from: e */
    public static long f125470e;

    /* renamed from: f */
    public static long f125471f;

    /* renamed from: g */
    public static long f125472g;

    /* renamed from: h */
    public static long f125473h;

    /* renamed from: i */
    public static long f125474i;

    /* renamed from: j */
    public static long f125475j;

    /* renamed from: k */
    public static long f125476k;

    /* renamed from: l */
    public static long f125477l;

    /* renamed from: m */
    public static long f125478m;

    /* renamed from: n */
    public static long f125479n;

    /* renamed from: o */
    public static long f125480o;

    /* renamed from: p */
    public static long f125481p;

    /* renamed from: q */
    public static long f125482q;

    /* renamed from: r */
    public static boolean f125483r;

    /* renamed from: s */
    public static String f125484s;

    /* renamed from: t */
    public static double f125485t;

    public static boolean a() {
        Boolean bool = f125468c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z13 = false;
        if (!ff0.j.a() || f125467b != null) {
            n1 n1Var = f125467b;
            if (n1Var == null) {
                Context context = kb0.a.f79058b;
                Context X = f0.X();
                Intrinsics.checkNotNullParameter(X, "<this>");
                Intrinsics.checkNotNullParameter(a.class, "clazz");
                n1Var = (n1) ((oa) ((a) j1.b0(a.class, X.getApplicationContext()))).E0.get();
                f125467b = n1Var;
            }
            z3 activate = z3.ACTIVATE_EXPERIMENT;
            n1Var.getClass();
            Intrinsics.checkNotNullParameter("holdout", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            g1 g1Var = (g1) n1Var.f83439a;
            boolean z14 = !g1Var.k("android_vr_holdout", "holdout", activate);
            boolean z15 = !(g1Var.o("android_vr_ad_exclusion_disabled", "enabled", a4.f83298b) || g1Var.l("android_vr_ad_exclusion_disabled"));
            if (z14 && z15) {
                z13 = true;
            }
        }
        boolean z16 = z13;
        f125468c = Boolean.valueOf(z16);
        return z16;
    }
}
