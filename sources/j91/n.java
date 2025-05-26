package j91;

import android.content.Context;
import ap.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends dr.k {
    public final z70.m I;

    /* renamed from: J, reason: collision with root package name */
    public final lu1.b f75145J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, o uploadContactsUtil, z70.m chromeTabHelper, lu1.b baseActivityHelper) {
        super(context, uploadContactsUtil);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(chromeTabHelper, "chromeTabHelper");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.I = chromeTabHelper;
        this.f75145J = baseActivityHelper;
    }
}
