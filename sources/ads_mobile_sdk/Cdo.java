package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ads_mobile_sdk.do, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cdo {

    /* renamed from: a, reason: collision with root package name */
    public static final Cdo f4378a;

    /* renamed from: b, reason: collision with root package name */
    public static final Cdo f4379b;

    /* renamed from: c, reason: collision with root package name */
    public static final Cdo f4380c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Cdo[] f4381d;

    static {
        Cdo cdo = new Cdo("BACK_BUTTON", 0);
        f4378a = cdo;
        Cdo cdo2 = new Cdo("CLOSE_BUTTON", 1);
        f4379b = cdo2;
        Cdo cdo3 = new Cdo("CUSTOM", 2);
        f4380c = cdo3;
        Cdo[] cdoArr = {cdo, cdo2, cdo3, new Cdo("OTHER", 3)};
        f4381d = cdoArr;
        l0.b0(cdoArr);
    }

    public Cdo(String str, int i13) {
    }

    public static Cdo[] values() {
        return (Cdo[]) f4381d.clone();
    }
}
