package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum kb implements a.w {
    TRIGGER_UNSPECIFIED(0),
    NO_TRIGGER(1),
    ON_BACK_PRESSED(2),
    HANDLE_ON_BACK_PRESSED(3),
    ON_KEY_DOWN(4),
    ON_BACK_INVOKED(5),
    ON_CREATE(6),
    ON_START(7),
    ON_RESUME(8),
    ON_RESTART(9),
    ON_PAUSE(10),
    ON_STOP(11),
    ON_DESTROY(12),
    ERROR_EMPTY_STACK_TRACE(13);


    /* renamed from: a, reason: collision with root package name */
    public final int f7204a;

    kb(int i13) {
        this.f7204a = i13;
    }

    public static kb a(int i13) {
        switch (i13) {
            case 0:
                return TRIGGER_UNSPECIFIED;
            case 1:
                return NO_TRIGGER;
            case 2:
                return ON_BACK_PRESSED;
            case 3:
                return HANDLE_ON_BACK_PRESSED;
            case 4:
                return ON_KEY_DOWN;
            case 5:
                return ON_BACK_INVOKED;
            case 6:
                return ON_CREATE;
            case 7:
                return ON_START;
            case 8:
                return ON_RESUME;
            case 9:
                return ON_RESTART;
            case 10:
                return ON_PAUSE;
            case 11:
                return ON_STOP;
            case 12:
                return ON_DESTROY;
            case 13:
                return ERROR_EMPTY_STACK_TRACE;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + kb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7204a + " name=" + name() + '>';
    }

    @Override // a.w
    public final int a() {
        return this.f7204a;
    }
}
