package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class os0 {

    /* renamed from: a, reason: collision with root package name */
    public static final os0 f9420a;

    /* renamed from: b, reason: collision with root package name */
    public static final os0 f9421b;

    /* renamed from: c, reason: collision with root package name */
    public static final os0 f9422c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ os0[] f9423d;

    static {
        os0 os0Var = new os0("AD_REQUESTED", 0);
        f9420a = os0Var;
        os0 os0Var2 = new os0("AD_LOADED", 1);
        f9421b = os0Var2;
        os0 os0Var3 = new os0("AD_LOAD_FAILED", 2);
        f9422c = os0Var3;
        os0[] os0VarArr = {os0Var, os0Var2, os0Var3};
        f9423d = os0VarArr;
        l0.b0(os0VarArr);
    }

    public os0(String str, int i13) {
    }

    public static os0[] values() {
        return (os0[]) f9423d.clone();
    }
}
