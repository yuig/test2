package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class je2 extends hn2 {

    /* renamed from: e, reason: collision with root package name */
    public final String f6769e;

    /* renamed from: f, reason: collision with root package name */
    public final oh0 f6770f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f6771g;

    /* renamed from: h, reason: collision with root package name */
    public final cm0 f6772h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6773i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je2(String afmaVersion, oh0 flags, Context context, cm0 gmaUtil, String gmaVersion) {
        super(il0.CUI_NAME_SDKINIT_INIT_ENVIRONMENT_SIGNAL);
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        this.f6769e = afmaVersion;
        this.f6770f = flags;
        this.f6771g = context;
        this.f6772h = gmaUtil;
        this.f6773i = gmaVersion;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.SDK_ENV;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        ApplicationInfo applicationInfo = this.f6771g.getApplicationInfo();
        int i13 = applicationInfo != null ? applicationInfo.targetSdkVersion : 0;
        String str = this.f6769e;
        String str2 = (String) this.f6770f.a("gads:sdk_core_constants:caps", "", oh0.f9294r);
        String str3 = this.f6773i;
        boolean c13 = this.f6772h.c();
        this.f6772h.getClass();
        int myUid = Process.myUid();
        return new pk0(new ie2(str, str2, i13, str3, c13, myUid == 0 || myUid == 1000 || myUid == 1001 || myUid == 1002 || myUid == 1027));
    }
}
