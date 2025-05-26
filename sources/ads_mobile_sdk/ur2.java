package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ur2 {

    /* renamed from: b, reason: collision with root package name */
    public static final ur2 f12173b;

    /* renamed from: c, reason: collision with root package name */
    public static final ur2 f12174c;

    /* renamed from: d, reason: collision with root package name */
    public static final ur2 f12175d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ur2[] f12176e;

    /* renamed from: a, reason: collision with root package name */
    public final int f12177a;

    static {
        ur2 ur2Var = new ur2("UNKNOWN_ERROR", 0, 0);
        f12173b = ur2Var;
        ur2 ur2Var2 = new ur2("SUCCESSFUL", 1, 1);
        ur2 ur2Var3 = new ur2("UNAUTHORIZED", 2, 2);
        f12174c = ur2Var3;
        ur2 ur2Var4 = new ur2("INCOMPATIBLE_BUILD", 3, 4);
        f12175d = ur2Var4;
        ur2[] ur2VarArr = {ur2Var, ur2Var2, ur2Var3, ur2Var4};
        f12176e = ur2VarArr;
        l0.b0(ur2VarArr);
    }

    public ur2(String str, int i13, int i14) {
        this.f12177a = i14;
    }

    public static ur2[] values() {
        return (ur2[]) f12176e.clone();
    }
}
