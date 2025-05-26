package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oc0 {

    /* renamed from: b, reason: collision with root package name */
    public static final oc0 f9212b;

    /* renamed from: c, reason: collision with root package name */
    public static final oc0 f9213c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ oc0[] f9214d;

    /* renamed from: a, reason: collision with root package name */
    public final String f9215a;

    static {
        oc0 oc0Var = new oc0(0, "INTERNAL_ERROR", "Internal error.");
        oc0 oc0Var2 = new oc0(1, "NO_FILL_ERROR", "No fill.");
        f9212b = oc0Var2;
        oc0 oc0Var3 = new oc0(2, "TIMEOUT_ERROR", "Operation timed out.");
        f9213c = oc0Var3;
        oc0[] oc0VarArr = {oc0Var, oc0Var2, oc0Var3};
        f9214d = oc0VarArr;
        l0.b0(oc0VarArr);
    }

    public oc0(int i13, String str, String str2) {
        this.f9215a = str2;
    }

    public static oc0[] values() {
        return (oc0[]) f9214d.clone();
    }

    public final String a() {
        return this.f9215a;
    }
}
