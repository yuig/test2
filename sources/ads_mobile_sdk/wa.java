package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum wa implements a.w {
    DEBUGGER_STATE_UNSPECIFIED(0),
    DEBUGGER_STATE_NOT_INSTALLED(1),
    DEBUGGER_STATE_INSTALLED(2),
    DEBUGGER_STATE_ACTIVE(3),
    DEBUGGER_STATE_ENVVAR(4),
    DEBUGGER_STATE_MACHPORT(5),
    DEBUGGER_STATE_ENVVAR_MACHPORT(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f12918a;

    wa(int i13) {
        this.f12918a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f12918a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + wa.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f12918a + " name=" + name() + '>';
    }
}
