package ads_mobile_sdk;

import a.v9;
import java.util.LinkedHashMap;
import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v9 f9879b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f9880c;

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f9881d;

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f9882e;

    /* renamed from: f, reason: collision with root package name */
    public static final q0 f9883f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q0[] f9884g;

    /* renamed from: a, reason: collision with root package name */
    public final int f9885a;

    static {
        q0 q0Var = new q0("FORMAT_DEFAULT", 0, 0);
        f9881d = q0Var;
        q0 q0Var2 = new q0("ON_AD_OPENED", 1, 1);
        f9882e = q0Var2;
        q0 q0Var3 = new q0("ON_AD_SHOW", 2, 2);
        f9883f = q0Var3;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3};
        f9884g = q0VarArr;
        l0.b0(q0VarArr);
        f9879b = new v9();
        q0[] values = values();
        int a13 = kotlin.collections.y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (q0 q0Var4 : values) {
            linkedHashMap.put(Integer.valueOf(q0Var4.f9885a), q0Var4);
        }
        f9880c = linkedHashMap;
    }

    public q0(String str, int i13, int i14) {
        this.f9885a = i14;
    }

    public static q0[] values() {
        return (q0[]) f9884g.clone();
    }
}
