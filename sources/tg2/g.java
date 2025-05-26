package tg2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f117608a;

    public g(nd2.a deviceIdProvider) {
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f117608a = deviceIdProvider;
    }

    public final Boolean a(Float f13) {
        if (f13 != null) {
            return Boolean.valueOf(b(f13.floatValue()));
        }
        return null;
    }

    public final boolean b(float f13) {
        if (f13 <= 0.0f || f13 > 100.0f) {
            return false;
        }
        String substring = ((String) this.f117608a.invoke()).substring(r0.length() - 6);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return f13 >= (((float) Integer.valueOf(substring, 16).intValue()) / ((float) ((int) (Math.pow((double) 16, 6.0d) - ((double) 1))))) * ((float) 100);
    }
}
