package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k03 {

    /* renamed from: a, reason: collision with root package name */
    public static final k03 f7032a;

    /* renamed from: b, reason: collision with root package name */
    public static final k03 f7033b;

    /* renamed from: c, reason: collision with root package name */
    public static final k03 f7034c;

    /* renamed from: d, reason: collision with root package name */
    public static final k03 f7035d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k03[] f7036e;

    static {
        k03 k03Var = new k03("DEFAULT", 0);
        f7032a = k03Var;
        k03 k03Var2 = new k03("FIXED_RECTANGLE", 1);
        f7033b = k03Var2;
        k03 k03Var3 = new k03("FLUID_RECTANGLE", 2);
        f7034c = k03Var3;
        k03 k03Var4 = new k03("FULLSCREEN", 3);
        f7035d = k03Var4;
        k03[] k03VarArr = {k03Var, k03Var2, k03Var3, k03Var4};
        f7036e = k03VarArr;
        l0.b0(k03VarArr);
    }

    public k03(String str, int i13) {
    }

    public static k03[] values() {
        return (k03[]) f7036e.clone();
    }
}
