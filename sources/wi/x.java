package wi;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class x {
    public static final x DEFAULT;
    public static final x DISABLED;
    public static final x ENABLED;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ x[] f129990b;

    /* renamed from: a, reason: collision with root package name */
    private final int f129991a;

    static {
        x xVar = new x("DEFAULT", 0, 0);
        DEFAULT = xVar;
        x xVar2 = new x("ENABLED", 1, 1);
        ENABLED = xVar2;
        x xVar3 = new x("DISABLED", 2, 2);
        DISABLED = xVar3;
        x[] xVarArr = {xVar, xVar2, xVar3};
        f129990b = xVarArr;
        l0.b0(xVarArr);
    }

    private x(String str, int i13, int i14) {
        this.f129991a = i14;
    }

    public static x[] values() {
        return (x[]) f129990b.clone();
    }

    public final int getValue() {
        return this.f129991a;
    }
}
