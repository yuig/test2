package wi;

import lb.l0;

/* loaded from: classes3.dex */
public final class q extends Enum {
    public static final q AD_RESPONSE_ALREADY_USED;
    public static final q APP_ID_MISSING;
    public static final q CANCELLED;
    public static final q INTERNAL_ERROR;
    public static final q INVALID_AD_RESPONSE;
    public static final q INVALID_REQUEST;
    public static final q NETWORK_ERROR;
    public static final q NOT_FOUND;
    public static final q NO_FILL;
    public static final q REQUEST_ID_MISMATCH;
    public static final q TIMEOUT;

    /* renamed from: b */
    private static final /* synthetic */ q[] f129979b;

    /* renamed from: a */
    private final int f129980a;

    static {
        q qVar = new q("INTERNAL_ERROR", 0, 0);
        INTERNAL_ERROR = qVar;
        q qVar2 = new q("INVALID_REQUEST", 1, 1);
        INVALID_REQUEST = qVar2;
        q qVar3 = new q("NETWORK_ERROR", 2, 2);
        NETWORK_ERROR = qVar3;
        q qVar4 = new q("NO_FILL", 3, 3);
        NO_FILL = qVar4;
        q qVar5 = new q("TIMEOUT", 4, 4);
        TIMEOUT = qVar5;
        q qVar6 = new q("CANCELLED", 5, 5);
        CANCELLED = qVar6;
        q qVar7 = new q("NOT_FOUND", 6, 7);
        NOT_FOUND = qVar7;
        q qVar8 = new q("APP_ID_MISSING", 7, 8);
        APP_ID_MISSING = qVar8;
        q qVar9 = new q("REQUEST_ID_MISMATCH", 8, 10);
        REQUEST_ID_MISMATCH = qVar9;
        q qVar10 = new q("INVALID_AD_RESPONSE", 9, 11);
        INVALID_AD_RESPONSE = qVar10;
        q qVar11 = new q("AD_RESPONSE_ALREADY_USED", 10, 12);
        AD_RESPONSE_ALREADY_USED = qVar11;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11};
        f129979b = qVarArr;
        l0.b0(qVarArr);
    }

    private q(String str, int i13, int i14) {
        super(str, i13);
        this.f129980a = i14;
    }

    public static q[] values() {
        return (q[]) f129979b.clone();
    }

    public final int getValue() {
        return this.f129980a;
    }
}
