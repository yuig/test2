package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum bt0 implements a.w {
    NONE(0),
    SHAKE(1),
    FLICK(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f3594a;

    bt0(int i13) {
        this.f3594a = i13;
    }

    @Override // a.w
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f3594a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append(bt0.class.getName());
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
