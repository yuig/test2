package ads_mobile_sdk;

import java.util.LinkedHashMap;
import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a.t7 f8465b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f8466c;

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f8467d;

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f8468e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n0[] f8469f;

    /* renamed from: a, reason: collision with root package name */
    public final int f8470a;

    static {
        n0 n0Var = new n0("FORMAT_DEFAULT", 0, 0);
        f8467d = n0Var;
        n0 n0Var2 = new n0("ONE_PIXEL", 1, 1);
        f8468e = n0Var2;
        n0[] n0VarArr = {n0Var, n0Var2};
        f8469f = n0VarArr;
        l0.b0(n0VarArr);
        f8465b = new a.t7();
        n0[] values = values();
        int a13 = kotlin.collections.y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (n0 n0Var3 : values) {
            linkedHashMap.put(Integer.valueOf(n0Var3.f8470a), n0Var3);
        }
        f8466c = linkedHashMap;
    }

    public n0(String str, int i13, int i14) {
        this.f8470a = i14;
    }

    public static n0[] values() {
        return (n0[]) f8469f.clone();
    }
}
