package a;

import ads_mobile_sdk.jk0;
import ads_mobile_sdk.kk0;
import ads_mobile_sdk.lk0;
import ads_mobile_sdk.mk0;
import ads_mobile_sdk.nk0;
import ads_mobile_sdk.oc0;
import ads_mobile_sdk.ok0;
import ads_mobile_sdk.qk0;
import ads_mobile_sdk.rk0;
import ads_mobile_sdk.sk0;
import ads_mobile_sdk.yx0;
import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class bb implements yg, ua.j0 {

    /* renamed from: d */
    public static final ob f13d = new ob(0);

    /* renamed from: e */
    public static final ob f14e = new ob(1);

    /* renamed from: f */
    public static final ob f15f = new ob(2);

    /* renamed from: g */
    public static final ob f16g = new ob(3);

    /* renamed from: h */
    public static final ob f17h = new ob(4);

    /* renamed from: i */
    public static final ob f18i = new ob(5);

    /* renamed from: j */
    public static final ob f19j = new ob(6);

    /* renamed from: k */
    public static final ob f20k = new ob(7);

    /* renamed from: l */
    public static final String[] f21l = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    /* renamed from: m */
    public static final ob f22m = new ob(8);

    /* renamed from: n */
    public static final ob f23n = new ob(9);

    /* renamed from: o */
    public static final h f24o = new h(0);

    /* renamed from: p */
    public static final h f25p = new h(1);

    public static /* synthetic */ int c(int i13) {
        if (i13 != 0) {
            return i13 - 1;
        }
        throw null;
    }

    public static String d(jk0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.a() == yx0.f14443a) {
            oc0 oc0Var = oc0.f9212b;
            return "Internal error.";
        }
        if (error instanceof rk0) {
            oc0 oc0Var2 = oc0.f9212b;
            return "Internal error.";
        }
        if (error instanceof sk0) {
            oc0 oc0Var3 = oc0.f9212b;
            return "Internal error.";
        }
        if (error instanceof nk0) {
            return ((nk0) error).f8836c;
        }
        if (error instanceof kk0) {
            String str = ((kk0) error).f7344e;
            return str == null ? "" : str;
        }
        if (error instanceof mk0) {
            return ((mk0) error).f8263c.toString();
        }
        if (error instanceof lk0) {
            return error.toString();
        }
        if (error instanceof ok0) {
            return ((ok0) error).f9325c;
        }
        if (error instanceof qk0) {
            return ((qk0) error).f10114c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean e(int i13) {
        if (i13 != 0) {
            return i13 == 1;
        }
        throw null;
    }

    @Override // ua.j0
    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
