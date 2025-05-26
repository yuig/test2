package vh;

/* loaded from: classes3.dex */
public enum b implements com.google.android.gms.fido.fido2.api.common.a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);

    private final int zzb;

    b(int i13) {
        this.zzb = i13;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public int getAlgoValue() {
        return this.zzb;
    }
}
