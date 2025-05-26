package ads_mobile_sdk;

import a.x2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.g0;
import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h92 {

    /* renamed from: b, reason: collision with root package name */
    public static final x2 f5896b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f5897c;

    /* renamed from: d, reason: collision with root package name */
    public static final h92 f5898d;

    /* renamed from: e, reason: collision with root package name */
    public static final h92 f5899e;

    /* renamed from: f, reason: collision with root package name */
    public static final h92 f5900f;

    /* renamed from: g, reason: collision with root package name */
    public static final h92 f5901g;

    /* renamed from: h, reason: collision with root package name */
    public static final h92 f5902h;

    /* renamed from: i, reason: collision with root package name */
    public static final h92 f5903i;

    /* renamed from: j, reason: collision with root package name */
    public static final h92 f5904j;

    /* renamed from: k, reason: collision with root package name */
    public static final h92 f5905k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ h92[] f5906l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ el2.a f5907m;

    /* renamed from: a, reason: collision with root package name */
    public final String f5908a;

    static {
        h92 h92Var = new h92(0, "UNKNOWN", "");
        f5898d = h92Var;
        h92 h92Var2 = new h92(1, "APP_OPEN", "app_open_ad");
        f5899e = h92Var2;
        h92 h92Var3 = new h92(2, "BANNER", "banner");
        f5900f = h92Var3;
        h92 h92Var4 = new h92(3, "ICON", "icon");
        f5901g = h92Var4;
        h92 h92Var5 = new h92(4, "INTERSTITIAL", "interstitial");
        f5902h = h92Var5;
        h92 h92Var6 = new h92(5, "NATIVE", "native");
        f5903i = h92Var6;
        h92 h92Var7 = new h92(6, "REWARDED", "rewarded");
        f5904j = h92Var7;
        h92 h92Var8 = new h92(7, "REWARDED_INTERSTITIAL", "rewarded_interstitial");
        f5905k = h92Var8;
        h92[] h92VarArr = {h92Var, h92Var2, h92Var3, h92Var4, h92Var5, h92Var6, h92Var7, h92Var8};
        f5906l = h92VarArr;
        el2.b b03 = l0.b0(h92VarArr);
        f5907m = b03;
        f5896b = new x2();
        int a13 = kotlin.collections.y0.a(g0.q(b03, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        Iterator it = b03.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((h92) next).f5908a, next);
        }
        f5897c = linkedHashMap;
    }

    public h92(int i13, String str, String str2) {
        this.f5908a = str2;
    }

    public static h92[] values() {
        return (h92[]) f5906l.clone();
    }

    public final String a() {
        return this.f5908a;
    }
}
