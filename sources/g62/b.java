package g62;

import x72.e;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f63739a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.XRENDERER_VULKAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.XRENDERER_GLES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f63739a = iArr;
    }
}
