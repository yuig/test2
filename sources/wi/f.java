package wi;

import lb.l0;

/* loaded from: classes3.dex */
public final class f extends Enum {
    public static final f ALREADY_OPEN;
    public static final f FAILED_TO_LOAD;
    public static final f INTERNAL_ERROR;
    public static final f NOT_IN_TEST_MODE;

    /* renamed from: b */
    private static final /* synthetic */ f[] f129939b;

    /* renamed from: a */
    private final int f129940a;

    static {
        f fVar = new f("INTERNAL_ERROR", 0, 0);
        INTERNAL_ERROR = fVar;
        f fVar2 = new f("FAILED_TO_LOAD", 1, 1);
        FAILED_TO_LOAD = fVar2;
        f fVar3 = new f("NOT_IN_TEST_MODE", 2, 2);
        NOT_IN_TEST_MODE = fVar3;
        f fVar4 = new f("ALREADY_OPEN", 3, 3);
        ALREADY_OPEN = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f129939b = fVarArr;
        l0.b0(fVarArr);
    }

    private f(String str, int i13, int i14) {
        super(str, i13);
        this.f129940a = i14;
    }

    public static f[] values() {
        return (f[]) f129939b.clone();
    }

    public final int getValue() {
        return this.f129940a;
    }
}
