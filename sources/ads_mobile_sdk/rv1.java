package ads_mobile_sdk;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class rv1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10818a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10819b;

    public rv1(String str, String str2) {
        this.f10818a = str;
        this.f10819b = str2;
    }

    public static rv1 a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new rv1(str, str2);
    }
}
