package kg;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public enum r {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_0(5),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);

    public static final r EVDO_0;
    public static final r EVDO_A;
    private static final SparseArray<r> valueMap;
    private final int value;

    static {
        r rVar = UNKNOWN_MOBILE_SUBTYPE;
        r rVar2 = GPRS;
        r rVar3 = EDGE;
        r rVar4 = UMTS;
        r rVar5 = CDMA;
        r rVar6 = EVDO_0;
        EVDO_0 = rVar6;
        r rVar7 = EVDO_A;
        EVDO_A = rVar7;
        r rVar8 = RTT;
        r rVar9 = HSDPA;
        r rVar10 = HSUPA;
        r rVar11 = HSPA;
        r rVar12 = IDEN;
        r rVar13 = EVDO_B;
        r rVar14 = LTE;
        r rVar15 = EHRPD;
        r rVar16 = HSPAP;
        r rVar17 = GSM;
        r rVar18 = TD_SCDMA;
        r rVar19 = IWLAN;
        r rVar20 = LTE_CA;
        SparseArray<r> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, rVar);
        sparseArray.put(1, rVar2);
        sparseArray.put(2, rVar3);
        sparseArray.put(3, rVar4);
        sparseArray.put(4, rVar5);
        sparseArray.put(5, rVar6);
        sparseArray.put(6, rVar7);
        sparseArray.put(7, rVar8);
        sparseArray.put(8, rVar9);
        sparseArray.put(9, rVar10);
        sparseArray.put(10, rVar11);
        sparseArray.put(11, rVar12);
        sparseArray.put(12, rVar13);
        sparseArray.put(13, rVar14);
        sparseArray.put(14, rVar15);
        sparseArray.put(15, rVar16);
        sparseArray.put(16, rVar17);
        sparseArray.put(17, rVar18);
        sparseArray.put(18, rVar19);
        sparseArray.put(19, rVar20);
    }

    r(int i13) {
        this.value = i13;
    }

    public static r forNumber(int i13) {
        return valueMap.get(i13);
    }

    public int getValue() {
        return this.value;
    }
}
