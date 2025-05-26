package kg;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public enum s {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_HIPRI(5),
    /* JADX INFO: Fake field, exist only in values array */
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);

    public static final s MOBILE_HIPRI;
    public static final s WIMAX;
    private static final SparseArray<s> valueMap;
    private final int value;

    static {
        s sVar = MOBILE;
        s sVar2 = WIFI;
        s sVar3 = MOBILE_MMS;
        s sVar4 = MOBILE_SUPL;
        s sVar5 = MOBILE_DUN;
        s sVar6 = MOBILE_HIPRI;
        MOBILE_HIPRI = sVar6;
        s sVar7 = WIMAX;
        WIMAX = sVar7;
        s sVar8 = BLUETOOTH;
        s sVar9 = DUMMY;
        s sVar10 = ETHERNET;
        s sVar11 = MOBILE_FOTA;
        s sVar12 = MOBILE_IMS;
        s sVar13 = MOBILE_CBS;
        s sVar14 = WIFI_P2P;
        s sVar15 = MOBILE_IA;
        s sVar16 = MOBILE_EMERGENCY;
        s sVar17 = PROXY;
        s sVar18 = VPN;
        s sVar19 = NONE;
        SparseArray<s> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, sVar);
        sparseArray.put(1, sVar2);
        sparseArray.put(2, sVar3);
        sparseArray.put(3, sVar4);
        sparseArray.put(4, sVar5);
        sparseArray.put(5, sVar6);
        sparseArray.put(6, sVar7);
        sparseArray.put(7, sVar8);
        sparseArray.put(8, sVar9);
        sparseArray.put(9, sVar10);
        sparseArray.put(10, sVar11);
        sparseArray.put(11, sVar12);
        sparseArray.put(12, sVar13);
        sparseArray.put(13, sVar14);
        sparseArray.put(14, sVar15);
        sparseArray.put(15, sVar16);
        sparseArray.put(16, sVar17);
        sparseArray.put(17, sVar18);
        sparseArray.put(-1, sVar19);
    }

    s(int i13) {
        this.value = i13;
    }

    public static s forNumber(int i13) {
        return valueMap.get(i13);
    }

    public int getValue() {
        return this.value;
    }
}
