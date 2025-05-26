package oi;

/* loaded from: classes3.dex */
public enum h {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');

    private final char zzj;

    h(char c13) {
        this.zzj = c13;
    }

    public static h zza(char c13) {
        for (h hVar : values()) {
            if (hVar.zzj == c13) {
                return hVar;
            }
        }
        return UNSET;
    }
}
