package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mn0 {

    /* renamed from: b, reason: collision with root package name */
    public static final mn0 f8293b;

    /* renamed from: c, reason: collision with root package name */
    public static final mn0 f8294c;

    /* renamed from: d, reason: collision with root package name */
    public static final mn0 f8295d;

    /* renamed from: e, reason: collision with root package name */
    public static final mn0 f8296e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mn0[] f8297f;

    /* renamed from: a, reason: collision with root package name */
    public final int f8298a;

    static {
        mn0 mn0Var = new mn0("UNKNOWN", 0, 0);
        f8293b = mn0Var;
        mn0 mn0Var2 = new mn0("PLAYING", 1, 1);
        f8294c = mn0Var2;
        mn0 mn0Var3 = new mn0("PAUSED", 2, 2);
        f8295d = mn0Var3;
        mn0 mn0Var4 = new mn0("ENDED", 3, 3);
        f8296e = mn0Var4;
        mn0[] mn0VarArr = {mn0Var, mn0Var2, mn0Var3, mn0Var4, new mn0("READY", 4, 5)};
        f8297f = mn0VarArr;
        l0.b0(mn0VarArr);
    }

    public mn0(String str, int i13, int i14) {
        this.f8298a = i14;
    }

    public static mn0[] values() {
        return (mn0[]) f8297f.clone();
    }
}
