package lr;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import df.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f84516d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84517e;

    public h(String boardName, String str) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        this.f84516d = boardName;
        this.f84517e = str;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        String Y = j1.Y("<b>%s</b><br/>%s", new Object[]{container.getResources().getString(y60.e.you_requested_join), this.f84516d}, null, 6);
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence a03 = j1.a0(Y);
        Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
        u50.f0 h23 = bs1.c.h2(a03);
        String str = this.f84517e;
        return new GestaltToast(context, new do1.d(h23, str != null ? new do1.j(str) : null, null, null, 0, 0, 0, null, false, 508));
    }
}
