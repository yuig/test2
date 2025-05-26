package wi;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {
    public static final n AD_REUSED;
    public static final n APP_NOT_FOREGROUND;
    public static final n H5_SHOW_AD_NOT_LOADED;
    public static final n INTERNAL_ERROR;
    public static final n MEDIATION_SHOW_ERROR;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ n[] f129973b;

    /* renamed from: a, reason: collision with root package name */
    private final int f129974a;

    static {
        n nVar = new n("INTERNAL_ERROR", 0, 0);
        INTERNAL_ERROR = nVar;
        n nVar2 = new n("AD_REUSED", 1, 1);
        AD_REUSED = nVar2;
        n nVar3 = new n("APP_NOT_FOREGROUND", 2, 3);
        APP_NOT_FOREGROUND = nVar3;
        n nVar4 = new n("MEDIATION_SHOW_ERROR", 3, 4);
        MEDIATION_SHOW_ERROR = nVar4;
        n nVar5 = new n("H5_SHOW_AD_NOT_LOADED", 4, 5);
        H5_SHOW_AD_NOT_LOADED = nVar5;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5};
        f129973b = nVarArr;
        l0.b0(nVarArr);
    }

    private n(String str, int i13, int i14) {
        this.f129974a = i14;
    }

    public static n[] values() {
        return (n[]) f129973b.clone();
    }

    public final int getValue() {
        return this.f129974a;
    }
}
