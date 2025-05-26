package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum ml0 implements a.w {
    PROCESS_STATE_UNKNOWN(0),
    PROCESS_STATE_FOREGROUND(1),
    PROCESS_STATE_BACKGROUND(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f8277a;

    ml0(int i13) {
        this.f8277a = i13;
    }

    @Override // a.w
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f8277a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append(ml0.class.getName());
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
