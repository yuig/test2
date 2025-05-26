package ads_mobile_sdk;

import android.content.Context;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t4 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11388a;

    /* renamed from: b, reason: collision with root package name */
    public final h92 f11389b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f11390c;

    /* renamed from: d, reason: collision with root package name */
    public final oh0 f11391d;

    public t4(Optional bannerRequest, h92 requestType, Context context, oh0 flags) {
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f11388a = bannerRequest;
        this.f11389b = requestType;
        this.f11390c = context;
        this.f11391d = flags;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AD_SIZE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0085, code lost:
    
        if (((java.lang.Boolean) r19.f11391d.a("gads:drop_format_string_if_not_set:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.oh0.f9281e)).booleanValue() != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00aa  */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r20) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.t4.c(bl2.c):java.lang.Object");
    }
}
