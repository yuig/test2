package ai;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f15225a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f15226b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature f15227c;

    /* renamed from: d, reason: collision with root package name */
    public static final Feature[] f15228d;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 9L);
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        f15225a = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        f15226b = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6L);
        f15227c = feature6;
        f15228d = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, new Feature("auth_api_credentials_save_account_linking_token", 3L), new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
