package we0;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f129241a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f129242b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f129243c;

    public abstract GestaltToast a(PinterestToastContainer pinterestToastContainer);

    public void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c(context);
    }

    public void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
