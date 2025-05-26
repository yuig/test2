package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum t71 implements a.w {
    /* JADX INFO: Fake field, exist only in values array */
    OS_UNKNOWN(0),
    OS_ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    OS_IOS(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f11438a;

    t71(int i13) {
        this.f11438a = i13;
    }

    @Override // a.w
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f11438a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append(t71.class.getName());
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
