package vh;

/* loaded from: classes3.dex */
public enum e implements com.google.android.gms.fido.fido2.api.common.a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    private final int zzb;

    e(int i13) {
        this.zzb = i13;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public int getAlgoValue() {
        return this.zzb;
    }
}
