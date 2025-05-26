package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hs {

    /* renamed from: b, reason: collision with root package name */
    public static final hs f6059b;

    /* renamed from: c, reason: collision with root package name */
    public static final hs f6060c;

    /* renamed from: d, reason: collision with root package name */
    public static final hs f6061d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ hs[] f6062e;

    /* renamed from: a, reason: collision with root package name */
    public final int f6063a;

    static {
        hs hsVar = new hs("UNKNOWN", 0, -1);
        hs hsVar2 = new hs("STRING", 1, 0);
        f6059b = hsVar2;
        hs hsVar3 = new hs("NUMBER", 2, 1);
        f6060c = hsVar3;
        hs hsVar4 = new hs("BOOLEAN", 3, 2);
        f6061d = hsVar4;
        hs[] hsVarArr = {hsVar, hsVar2, hsVar3, hsVar4};
        f6062e = hsVarArr;
        l0.b0(hsVarArr);
    }

    public hs(String str, int i13, int i14) {
        this.f6063a = i14;
    }

    public static hs[] values() {
        return (hs[]) f6062e.clone();
    }
}
