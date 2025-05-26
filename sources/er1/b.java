package er1;

import i92.k;
import kotlin.jvm.internal.Intrinsics;
import m60.d;
import m60.e;
import t00.m;
import t00.n;

/* loaded from: classes2.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final e f59974a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f59975b;

    /* renamed from: c, reason: collision with root package name */
    public final k f59976c;

    /* renamed from: d, reason: collision with root package name */
    public final x92.b f59977d;

    public b(e applicationInfo, b60.b activeUserManager, k toastUtils, x92.b developerPreferences) {
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(developerPreferences, "developerPreferences");
        this.f59974a = applicationInfo;
        this.f59975b = activeUserManager;
        this.f59976c = toastUtils;
        this.f59977d = developerPreferences;
    }

    @Override // t00.n
    public final m a(boolean z13) {
        d dVar = (d) this.f59974a;
        dVar.h();
        return new a(this.f59976c, dVar.f(), this.f59975b, this.f59977d, z13);
    }
}
