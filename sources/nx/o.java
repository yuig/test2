package nx;

import h32.a4;
import h32.d4;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f92435a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f92436b;

    static {
        int[] iArr = new int[a4.values().length];
        try {
            iArr[a4.BOARD_SELECT_PINS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a4.BOARD_SECTION_SELECT_PINS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a4.BOARD_NOTE_SELECT_PINS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a4.CONVERSATION_THREAD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a4.CONVERSATION_THREAD_CLOSEUP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f92435a = iArr;
        int[] iArr2 = new int[d4.values().length];
        try {
            iArr2[d4.PIN_CREATE_PINMARKLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[d4.FEED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[d4.CONVERSATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f92436b = iArr2;
    }
}
