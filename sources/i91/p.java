package i91;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.pinterest.activity.sendapin.model.SendableObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends r {

    /* renamed from: h, reason: collision with root package name */
    public final String f71884h;

    /* renamed from: i, reason: collision with root package name */
    public final String f71885i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, SendableObject sendableObject, p32.c inviteCategory, String recipeCopyText, String str, nx.d0 topLevelPinalytics, i92.k toastUtils, u20.d sendShareServiceWrapper, tb0.h crashReporting) {
        super(context, sendableObject, inviteCategory, topLevelPinalytics, toastUtils, sendShareServiceWrapper, crashReporting);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(recipeCopyText, "recipeCopyText");
        Intrinsics.checkNotNullParameter(topLevelPinalytics, "topLevelPinalytics");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f71884h = recipeCopyText;
        this.f71885i = str;
    }

    @Override // i91.r
    public final void a(vd0.c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String o13 = data.o("invite_url", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        if (o13.length() > 0) {
            String o14 = data.o("invite_code", "");
            Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
            c(this.f71889b, p32.c.MESSAGE, p32.f.COPY_LINK, e0.t.f56747e, o14);
            Context context = this.f71888a;
            Object systemService = context.getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager != null) {
                StringBuilder D = ep.b.D(o13, "\n\n");
                D.append(this.f71884h);
                clipboardManager.setPrimaryClip(ClipData.newPlainText(context.getString(a62.e.copy_recipe), D.toString()));
                i92.k kVar = this.f71892e;
                String toastText = this.f71885i;
                if (toastText != null) {
                    Intrinsics.checkNotNullParameter(toastText, "toastText");
                    kVar.m(toastText);
                } else {
                    int i13 = a62.e.copy_recipe_success;
                    Intrinsics.checkNotNullParameter(context, "context");
                    kVar.m(context.getResources().getString(i13));
                }
            }
        }
    }
}
