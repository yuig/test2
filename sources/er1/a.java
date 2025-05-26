package er1;

import i92.k;
import kotlin.jvm.internal.Intrinsics;
import m60.e;
import qz.d;

/* loaded from: classes2.dex */
public final class a extends t00.b {

    /* renamed from: b, reason: collision with root package name */
    public final k f59969b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59970c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59971d;

    /* renamed from: e, reason: collision with root package name */
    public final x92.b f59972e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f59973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k toastUtils, boolean z13, b60.b activeUserManager, x92.b developerPreferences, boolean z14) {
        super(activeUserManager);
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(developerPreferences, "developerPreferences");
        this.f59969b = toastUtils;
        this.f59970c = true;
        this.f59971d = z13;
        this.f59972e = developerPreferences;
        this.f59973f = z14;
    }

    @Override // t00.m
    public final void a(d response, String baseUrl, Throwable th3) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        if (this.f59970c || this.f59971d) {
            return;
        }
        String str = response.f105384d;
        if (str == null || str.length() == 0) {
            if (th3 == null) {
                str = "Request valid. No message because throwable is null";
            } else {
                str = th3.getMessage();
                if (str == null || str.length() == 0) {
                    str = th3.toString();
                }
            }
        }
        if (this.f59973f) {
            ((m60.d) ((e) this.f59972e.f134366c)).g();
            this.f59969b.i("DEV-ONLY: " + str);
        }
    }
}
