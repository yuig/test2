package lr;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import h32.b3;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes3.dex */
public final class b extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84475d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84476e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84477f;

    public b(String pinUid, String path, int i13) {
        this.f84475d = i13;
        if (i13 != 1) {
            this.f84476e = pinUid;
            this.f84477f = path;
        } else {
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            Intrinsics.checkNotNullParameter(path, "path");
            this.f84476e = pinUid;
            this.f84477f = path;
        }
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        switch (this.f84475d) {
            case 0:
                GestaltToast gestaltToast = new GestaltToast(container.getContext());
                gestaltToast.v(new cp.i(this, 5));
                return gestaltToast;
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new GestaltToast(context, new do1.d(bs1.c.j2(new String[0], x0.downloaded_to_camera_roll), null, null, null, 0, 0, 0, null, false, 510));
        }
    }

    @Override // we0.a
    public final void b(Context context) {
        switch (this.f84475d) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                u2.a1(null, this.f84476e, b3.SEE_IDEA_PIN_DOWNLOAD);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Uri parse = Uri.parse(this.f84477f);
                    Intrinsics.f(parse);
                    String type = context.getContentResolver().getType(parse);
                    if (type == null) {
                        type = "video/mp4";
                    }
                    intent.setDataAndType(parse, type);
                    intent.addFlags(1);
                    context.startActivity(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
            default:
                super.b(context);
                break;
        }
    }
}
