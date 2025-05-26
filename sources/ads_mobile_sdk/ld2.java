package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum ld2 implements a.w {
    /* JADX INFO: Fake field, exist only in values array */
    EVICTION_REASON_UNKNOWN(0),
    EVICTION_REASON_EXPIRED(1),
    EVICTION_REASON_OVERFLOW(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7783a;

    ld2(int i13) {
        this.f7783a = i13;
    }

    @Override // a.w
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7783a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append(ld2.class.getName());
        sb3.append('@');
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb3.append(" number=");
            sb3.append(a());
        }
        sb3.append(" name=");
        sb3.append(name());
        sb3.append('>');
        return sb3.toString();
    }
}
