package qi;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f103965a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f103966b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature f103967c;

    /* renamed from: d, reason: collision with root package name */
    public static final Feature[] f103968d;

    static {
        Feature feature = new Feature("verify_with_recaptcha_v2_internal", 1L);
        Feature feature2 = new Feature("init", 2L);
        f103965a = feature2;
        Feature feature3 = new Feature("execute", 4L);
        f103966b = feature3;
        Feature feature4 = new Feature("close", 2L);
        f103967c = feature4;
        f103968d = new Feature[]{feature, feature2, feature3, feature4};
    }
}
