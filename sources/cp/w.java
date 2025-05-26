package cp;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f52981a;

    static {
        int[] iArr = new int[kp.o.values().length];
        try {
            iArr[kp.o.SET_NOTIFICATIONS_ALWAYS_ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kp.o.SET_NOTIFICATIONS_MUTE_ONE_HOUR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kp.o.SET_NOTIFICATIONS_MUTE_EIGHT_HOURS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kp.o.SET_NOTIFICATIONS_MUTE_ONE_WEEK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[kp.o.SET_NOTIFICATIONS_MUTE_UNTIL_TURNED_ON.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f52981a = iArr;
    }
}
