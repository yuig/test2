package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum g92 implements a.w {
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_TYPE_UNKNOWN(0),
    REQUEST_TYPE_ADX(1),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_TYPE_ADMOB(2),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_TYPE_AD_MANAGER(3),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_TYPE_SCAR(6),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f5482a;

    g92(int i13) {
        this.f5482a = i13;
    }

    @Override // a.w
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f5482a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append(g92.class.getName());
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
