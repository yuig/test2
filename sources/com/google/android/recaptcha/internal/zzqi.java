package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public enum zzqi implements zznf {
    UNKNOWN(0),
    NET_CAPABILITY_MMS(1),
    NET_CAPABILITY_SUPL(2),
    NET_CAPABILITY_DUN(3),
    NET_CAPABILITY_FOTA(4),
    NET_CAPABILITY_IMS(5),
    NET_CAPABILITY_CBS(6),
    NET_CAPABILITY_WIFI_P2P(7),
    NET_CAPABILITY_IA(8),
    NET_CAPABILITY_RCS(9),
    NET_CAPABILITY_XCAP(10),
    NET_CAPABILITY_EIMS(11),
    NET_CAPABILITY_NOT_METERED(12),
    NET_CAPABILITY_INTERNET(13),
    NET_CAPABILITY_NOT_RESTRICTED(14),
    NET_CAPABILITY_TRUSTED(15),
    NET_CAPABILITY_NOT_VPN(16),
    NET_CAPABILITY_VALIDATED(17),
    NET_CAPABILITY_CAPTIVE_PORTAL(18),
    NET_CAPABILITY_NOT_ROAMING(19),
    NET_CAPABILITY_FOREGROUND(20),
    NET_CAPABILITY_NOT_CONGESTED(21),
    NET_CAPABILITY_NOT_SUSPENDED(22),
    NET_CAPABILITY_OEM_PAID(23),
    NET_CAPABILITY_MCX(24),
    NET_CAPABILITY_PARTIAL_CONNECTIVITY(25),
    NET_CAPABILITY_TEMPORARILY_NOT_METERED(26),
    NET_CAPABILITY_OEM_PRIVATE(27),
    NET_CAPABILITY_VEHICLE_INTERNAL(28),
    NET_CAPABILITY_NOT_VCN_MANAGED(29),
    NET_CAPABILITY_ENTERPRISE(30),
    NET_CAPABILITY_VSIM(31),
    NET_CAPABILITY_BIP(32),
    NET_CAPABILITY_HEAD_UNIT(33),
    NET_CAPABILITY_MMTEL(34),
    NET_CAPABILITY_PRIORITIZE_LATENCY(35),
    NET_CAPABILITY_PRIORITIZE_BANDWIDTH(36),
    SDK_RECAPTCHA_NET_REACHABLE(37),
    TRANSPORT_WIFI(38),
    TRANSPORT_CELLULAR(39),
    TRANSPORT_VPN(40),
    TRANSPORT_ETHERNET(41),
    UNRECOGNIZED(-1);

    private final int zzS;

    zzqi(int i13) {
        this.zzS = i13;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.recaptcha.internal.zznf
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzS;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
