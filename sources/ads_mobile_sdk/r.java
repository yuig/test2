package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f10345b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f10346c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f10347d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f10348e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f10349f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f10350g;

    /* renamed from: h, reason: collision with root package name */
    public static final r f10351h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ r[] f10352i;

    /* renamed from: a, reason: collision with root package name */
    public final int f10353a;

    static {
        r rVar = new r("NONE", 0, -2);
        f10345b = rVar;
        r rVar2 = new r("STOPPED", 1, -1);
        f10346c = rVar2;
        r rVar3 = new r("PAUSED", 2, 0);
        f10347d = rVar3;
        r rVar4 = new r("CREATED", 3, 1);
        f10348e = rVar4;
        r rVar5 = new r("INITIAL", 4, 2);
        f10349f = rVar5;
        r rVar6 = new r("STARTED", 5, 3);
        f10350g = rVar6;
        r rVar7 = new r("RESUMED", 6, 4);
        f10351h = rVar7;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7};
        f10352i = rVarArr;
        l0.b0(rVarArr);
    }

    public r(String str, int i13, int i14) {
        this.f10353a = i14;
    }

    public static r[] values() {
        return (r[]) f10352i.clone();
    }
}
