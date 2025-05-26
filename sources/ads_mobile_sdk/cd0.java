package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class cd0 {

    /* renamed from: b, reason: collision with root package name */
    public static final cd0 f3865b;

    /* renamed from: c, reason: collision with root package name */
    public static final cd0 f3866c;

    /* renamed from: d, reason: collision with root package name */
    public static final cd0 f3867d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cd0[] f3868e;

    /* renamed from: a, reason: collision with root package name */
    public final String f3869a;

    static {
        cd0 cd0Var = new cd0(0, "CLICK", "_ac");
        f3865b = cd0Var;
        cd0 cd0Var2 = new cd0(1, "IMPRESSION", "_ai");
        f3866c = cd0Var2;
        cd0 cd0Var3 = new cd0(2, "REWARD", "_ar");
        f3867d = cd0Var3;
        cd0[] cd0VarArr = {cd0Var, cd0Var2, cd0Var3};
        f3868e = cd0VarArr;
        l0.b0(cd0VarArr);
    }

    public cd0(int i13, String str, String str2) {
        this.f3869a = str2;
    }

    public static cd0[] values() {
        return (cd0[]) f3868e.clone();
    }

    public final String a() {
        return this.f3869a;
    }
}
