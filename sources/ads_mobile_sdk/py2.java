package ads_mobile_sdk;

import lb.l0;

/* loaded from: classes2.dex */
public final class py2 extends Enum {

    /* renamed from: a */
    public static final py2 f9857a;

    /* renamed from: b */
    public static final py2 f9858b;

    /* renamed from: c */
    public static final py2 f9859c;

    /* renamed from: d */
    public static final /* synthetic */ py2[] f9860d;

    static {
        py2 py2Var = new py2("LAYOUT", 0);
        f9857a = py2Var;
        py2 py2Var2 = new py2("STATE", 1);
        f9858b = py2Var2;
        py2 py2Var3 = new py2("SCROLL", 2);
        f9859c = py2Var3;
        py2[] py2VarArr = {py2Var, py2Var2, py2Var3};
        f9860d = py2VarArr;
        l0.b0(py2VarArr);
    }

    public py2(String str, int i13) {
        super(str, i13);
    }

    public static py2[] values() {
        return (py2[]) f9860d.clone();
    }
}
