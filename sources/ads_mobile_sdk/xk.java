package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xk {

    /* renamed from: a, reason: collision with root package name */
    public static final xk f13700a;

    /* renamed from: b, reason: collision with root package name */
    public static final xk f13701b;

    /* renamed from: c, reason: collision with root package name */
    public static final xk f13702c;

    /* renamed from: d, reason: collision with root package name */
    public static final xk f13703d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ xk[] f13704e;

    static {
        xk xkVar = new xk("PRODUCTION", 0);
        f13700a = xkVar;
        xk xkVar2 = new xk("DEVELOPMENT", 1);
        f13701b = xkVar2;
        xk xkVar3 = new xk("INTEGRATION_TEST", 2);
        f13702c = xkVar3;
        xk xkVar4 = new xk("ROBOLECTRIC_TEST", 3);
        f13703d = xkVar4;
        xk[] xkVarArr = {xkVar, xkVar2, xkVar3, xkVar4};
        f13704e = xkVarArr;
        l0.b0(xkVarArr);
    }

    public xk(String str, int i13) {
    }

    public static xk[] values() {
        return (xk[]) f13704e.clone();
    }
}
