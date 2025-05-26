package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum hl0 implements a.w {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_CACHEABLE(0),
    EXPIRED(1),
    CACHED(2),
    UPDATING(3),
    STALE(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f6013a;

    hl0(int i13) {
        this.f6013a = i13;
    }

    @Override // a.w
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f6013a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append(hl0.class.getName());
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
