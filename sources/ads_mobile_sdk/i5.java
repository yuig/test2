package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.u4 f6231a;

    /* renamed from: b, reason: collision with root package name */
    public static final i5 f6232b;

    /* renamed from: c, reason: collision with root package name */
    public static final i5 f6233c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i5[] f6234d;

    static {
        i5 i5Var = new i5("UNKNOWN", 0);
        f6232b = i5Var;
        i5 i5Var2 = new i5("BANNER", 1);
        i5 i5Var3 = new i5("INTERSTITIAL", 2);
        i5 i5Var4 = new i5("NATIVE", 3);
        i5 i5Var5 = new i5("REWARDED", 4);
        i5 i5Var6 = new i5("APP_OPEN", 5);
        f6233c = i5Var6;
        i5[] i5VarArr = {i5Var, i5Var2, i5Var3, i5Var4, i5Var5, i5Var6, new i5("REWARDED_INTERSTITIAL", 6)};
        f6234d = i5VarArr;
        l0.b0(i5VarArr);
        f6231a = new a.u4();
    }

    public i5(String str, int i13) {
    }

    public static i5[] values() {
        return (i5[]) f6234d.clone();
    }
}
