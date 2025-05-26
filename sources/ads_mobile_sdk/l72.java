package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l72 {

    /* renamed from: b, reason: collision with root package name */
    public static final l72 f7698b;

    /* renamed from: c, reason: collision with root package name */
    public static final l72 f7699c;

    /* renamed from: d, reason: collision with root package name */
    public static final l72 f7700d;

    /* renamed from: e, reason: collision with root package name */
    public static final l72 f7701e;

    /* renamed from: f, reason: collision with root package name */
    public static final l72 f7702f;

    /* renamed from: g, reason: collision with root package name */
    public static final l72 f7703g;

    /* renamed from: h, reason: collision with root package name */
    public static final l72 f7704h;

    /* renamed from: i, reason: collision with root package name */
    public static final l72 f7705i;

    /* renamed from: j, reason: collision with root package name */
    public static final l72 f7706j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ l72[] f7707k;

    /* renamed from: a, reason: collision with root package name */
    public final int f7708a;

    static {
        l72 l72Var = new l72("FILL", 0, 0);
        f7698b = l72Var;
        l72 l72Var2 = new l72("NO_FILL", 1, 1);
        f7699c = l72Var2;
        l72 l72Var3 = new l72("TIMEOUT", 2, 2);
        f7700d = l72Var3;
        l72 l72Var4 = new l72("NOT_FOUND", 3, 3);
        f7701e = l72Var4;
        l72 l72Var5 = new l72("CANCELLED", 4, 4);
        f7702f = l72Var5;
        l72 l72Var6 = new l72("EXCEPTION", 5, 5);
        f7703g = l72Var6;
        l72 l72Var7 = new l72("ERROR", 6, 6);
        f7704h = l72Var7;
        l72 l72Var8 = new l72("RENDERED_BUT_LOST", 7, 8);
        f7705i = l72Var8;
        l72 l72Var9 = new l72("INFLIGHT", 8, 9);
        f7706j = l72Var9;
        l72[] l72VarArr = {l72Var, l72Var2, l72Var3, l72Var4, l72Var5, l72Var6, l72Var7, l72Var8, l72Var9};
        f7707k = l72VarArr;
        l0.b0(l72VarArr);
    }

    public l72(String str, int i13, int i14) {
        this.f7708a = i14;
    }

    public static l72[] values() {
        return (l72[]) f7707k.clone();
    }

    public final int a() {
        return this.f7708a;
    }
}
