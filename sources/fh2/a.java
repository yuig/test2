package fh2;

import io.embrace.android.embracesdk.internal.payload.EnvelopeMetadata;
import io.embrace.android.embracesdk.internal.payload.UserInfo;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kh2.c2;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f62169a;

    public a(c2 userInfoProvider) {
        Intrinsics.checkNotNullParameter(userInfoProvider, "userInfoProvider");
        this.f62169a = userInfoProvider;
    }

    public final EnvelopeMetadata a() {
        UserInfo userInfo = (UserInfo) this.f62169a.invoke();
        String str = userInfo.f73276a;
        Set set = userInfo.f73279d;
        if (set == null) {
            set = s0.f80394a;
        }
        return new EnvelopeMetadata(str, userInfo.f73277b, userInfo.f73278c, set, TimeZone.getDefault().getID(), Locale.getDefault().getLanguage() + '_' + Locale.getDefault().getCountry());
    }
}
