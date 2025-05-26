package t00;

import android.app.Dialog;
import com.pinterest.error.ServerError;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final k f115690a;

    /* renamed from: b, reason: collision with root package name */
    public final w f115691b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f115692c;

    public i(k guardianErrorMessageHandler, w eventManager, i92.k toastUtils, m60.e applicationInfoProvider, x92.b developerPreferences) {
        Intrinsics.checkNotNullParameter(guardianErrorMessageHandler, "guardianErrorMessageHandler");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(developerPreferences, "developerPreferences");
        this.f115690a = guardianErrorMessageHandler;
        this.f115691b = eventManager;
        this.f115692c = toastUtils;
    }

    public final void a(String str, String str2) {
        mf0.f fVar;
        mf0.f fVar2 = new mf0.f();
        if (this.f115690a.f115702c) {
            mf0.i iVar = new mf0.i();
            iVar.f18411g = false;
            Dialog dialog = iVar.f18416l;
            if (dialog != null) {
                dialog.setCancelable(false);
            }
            iVar.f87116h0 = Integer.valueOf(yu1.a.dismiss);
            iVar.f87111c0 = null;
            iVar.p7();
            fVar = iVar;
        } else {
            fVar2.f87096J = yu1.a.f140162ok;
            fVar2.U = null;
            fVar2.l7();
            fVar = fVar2;
        }
        if (str == null) {
            str = "";
        }
        fVar.h7(str);
        fVar.d7(str2);
        this.f115691b.d(new of0.a(fVar));
    }

    public final void b(String str, Throwable th3) {
        this.f115692c.i(str);
        ServerError serverError = th3 instanceof ServerError ? (ServerError) th3 : null;
        if (serverError == null) {
            return;
        }
        serverError.c();
    }
}
