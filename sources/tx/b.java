package tx;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import tb0.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f119617a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.e f119618b;

    /* renamed from: c, reason: collision with root package name */
    public final h f119619c;

    /* renamed from: d, reason: collision with root package name */
    public final r f119620d;

    /* renamed from: e, reason: collision with root package name */
    public SimpleDateFormat f119621e;

    public b(b60.b activeUserManager, m60.e applicationInfo, h crashReporting, r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f119617a = activeUserManager;
        this.f119618b = applicationInfo;
        this.f119619c = crashReporting;
        this.f119620d = prefsManagerUser;
    }

    public final SimpleDateFormat a() {
        if (this.f119621e == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            this.f119621e = simpleDateFormat;
        }
        return this.f119621e;
    }
}
