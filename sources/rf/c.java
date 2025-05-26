package rf;

import sf.g;
import sf.h;
import sf.i;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107727a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f107728b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f107729c;

    static {
        int[] iArr = new int[h.values().length];
        f107729c = iArr;
        try {
            iArr[h.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f107729c[h.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[g.values().length];
        f107728b = iArr2;
        try {
            iArr2[g.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f107728b[g.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f107728b[g.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr3 = new int[i.values().length];
        f107727a = iArr3;
        try {
            iArr3[i.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f107727a[i.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
