package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xy0 {

    /* renamed from: a, reason: collision with root package name */
    public static final xy0 f13883a;

    /* renamed from: b, reason: collision with root package name */
    public static final xy0 f13884b;

    /* renamed from: c, reason: collision with root package name */
    public static final xy0 f13885c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ xy0[] f13886d;

    static {
        xy0 xy0Var = new xy0("INITIALIZATION_NOT_STARTED", 0);
        f13883a = xy0Var;
        xy0 xy0Var2 = new xy0("INITIALIZATION_STARTED", 1);
        f13884b = xy0Var2;
        xy0 xy0Var3 = new xy0("INITIALIZATION_COMPLETE", 2);
        f13885c = xy0Var3;
        xy0[] xy0VarArr = {xy0Var, xy0Var2, xy0Var3};
        f13886d = xy0VarArr;
        l0.b0(xy0VarArr);
    }

    public xy0(String str, int i13) {
    }

    public static xy0[] values() {
        return (xy0[]) f13886d.clone();
    }
}
