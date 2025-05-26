package to0;

import android.app.Activity;
import android.content.Context;
import android.webkit.PermissionRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class t implements c5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f118689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f118690c;

    public /* synthetic */ t(int i13, Context context, Object obj) {
        this.f118688a = i13;
        this.f118689b = context;
        this.f118690c = obj;
    }

    @Override // c5.a
    public final void onRequestPermissionsResult(int i13, String[] permissions, int[] grantResults) {
        int i14 = this.f118688a;
        Object obj = this.f118690c;
        Context context = this.f118689b;
        switch (i14) {
            case 0:
                Activity activity = (Activity) context;
                PermissionRequest request = (PermissionRequest) obj;
                int i15 = e.f118645e;
                Intrinsics.checkNotNullParameter(activity, "$activity");
                Intrinsics.checkNotNullParameter(request, "$request");
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                Intrinsics.checkNotNullParameter(grantResults, "grantResults");
                if (!qy1.d.a(activity, "android.permission.CAMERA")) {
                    request.deny();
                    break;
                } else {
                    request.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                    break;
                }
            case 1:
                Function0 action = (Function0) obj;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(action, "$action");
                Intrinsics.checkNotNullParameter(permissions, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(grantResults, "<anonymous parameter 2>");
                if (qy1.d.a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    action.invoke();
                    break;
                }
                break;
            default:
                cp1.p activity2 = (cp1.p) context;
                dr.k adapter = (dr.k) obj;
                Intrinsics.checkNotNullParameter(activity2, "$activity");
                Intrinsics.checkNotNullParameter(adapter, "$adapter");
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                Intrinsics.checkNotNullParameter(grantResults, "grantResults");
                if (qy1.d.a(activity2, "android.permission.READ_CONTACTS")) {
                    adapter.h();
                    break;
                }
                break;
        }
    }
}
