package i92;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import df.j1;
import do1.n;
import kotlin.jvm.internal.Intrinsics;
import u50.b0;
import u50.f0;
import u50.i0;

/* loaded from: classes4.dex */
public final class b extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final i0 f71925d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f71926e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71927f;

    public b(int i13, f0 debugMessage, boolean z13) {
        Intrinsics.checkNotNullParameter(debugMessage, "debugMessage");
        this.f71925d = debugMessage;
        this.f71926e = z13;
        this.f71927f = i13;
        this.f129243c = true;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence a13 = this.f71925d.a(context);
        Context context2 = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        boolean z13 = this.f71926e;
        String str = z13 ? "Error" : "Debug";
        String string = str + " \n" + ((Object) j1.a0(a13.toString()));
        Intrinsics.checkNotNullParameter(string, "string");
        return new GestaltToast(context2, new do1.d(new f0(string), null, null, z13 ? n.ERROR : n.DEFAULT, 0, this.f71927f, 100, new b0(eo1.c.space_400), true, 22));
    }
}
