package wb1;

import com.pinterest.api.model.qv;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129060a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f129061b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f129062c;

    static {
        int[] iArr = new int[qv.a.values().length];
        try {
            iArr[qv.a.FRIENDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qv.a.FOLLOWERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qv.a.FOLLOWEES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qv.a.CONTACTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qv.a.OTHERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f129060a = iArr;
        int[] iArr2 = new int[qv.b.values().length];
        try {
            iArr2[qv.b.DIRECTTOINBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[qv.b.SENDREQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[qv.b.BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f129061b = iArr2;
        int[] iArr3 = new int[z42.o.values().length];
        try {
            iArr3[z42.o.DIRECT_TO_INBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[z42.o.SEND_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[z42.o.BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        f129062c = iArr3;
    }
}
