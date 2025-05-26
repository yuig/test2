package ads_mobile_sdk;

import java.util.LinkedHashMap;
import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e6 {

    /* renamed from: b, reason: collision with root package name */
    public static final a.i1 f4722b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f4723c;

    /* renamed from: d, reason: collision with root package name */
    public static final e6 f4724d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e6[] f4725e;

    /* renamed from: a, reason: collision with root package name */
    public final int f4726a;

    static {
        e6 e6Var = new e6("UNKNOWN", 0, 0);
        e6 e6Var2 = new e6("CPM", 1, 1);
        e6 e6Var3 = new e6("CPC", 2, 2);
        e6 e6Var4 = new e6("ONE_PIXEL", 3, 3);
        f4724d = e6Var4;
        e6[] e6VarArr = {e6Var, e6Var2, e6Var3, e6Var4};
        f4725e = e6VarArr;
        l0.b0(e6VarArr);
        f4722b = new a.i1();
        e6[] values = values();
        int a13 = kotlin.collections.y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (e6 e6Var5 : values) {
            linkedHashMap.put(Integer.valueOf(e6Var5.f4726a), e6Var5);
        }
        f4723c = linkedHashMap;
    }

    public e6(String str, int i13, int i14) {
        this.f4726a = i14;
    }

    public static e6[] values() {
        return (e6[]) f4725e.clone();
    }
}
