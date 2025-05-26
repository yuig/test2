package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum pl0 implements a.w {
    TAG_UNKNOWN(0),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f9732a;

    pl0(int i13) {
        this.f9732a = i13;
    }

    @Override // a.w
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f9732a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append(pl0.class.getName());
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
