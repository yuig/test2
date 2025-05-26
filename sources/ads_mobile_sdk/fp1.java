package ads_mobile_sdk;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fp1 {

    /* renamed from: a, reason: collision with root package name */
    public static final fp1 f5235a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ fp1[] f5236b;

    static {
        fp1 fp1Var = new fp1("PENDING", 0);
        fp1 fp1Var2 = new fp1("READY_TO_PING", 1);
        f5235a = fp1Var2;
        fp1[] fp1VarArr = {fp1Var, fp1Var2};
        f5236b = fp1VarArr;
        l0.b0(fp1VarArr);
    }

    public fp1(String str, int i13) {
    }

    public static fp1[] values() {
        return (fp1[]) f5236b.clone();
    }
}
