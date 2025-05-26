package m92;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.Toast;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.toast.view.TextToastView;
import i92.g;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import pk.a0;

/* loaded from: classes4.dex */
public final class d extends PinterestToastContainer {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f86748e;

    /* renamed from: f, reason: collision with root package name */
    public final a f86749f;

    public d(Context context) {
        super(context, null);
        this.f86748e = new HashMap();
        this.f86749f = new a(this);
    }

    @Override // com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer
    public final void b(we0.a aVar) {
        super.b(aVar);
        if (aVar instanceof g) {
            String str = ((g) aVar).f71928d;
            if (a0.s0(str)) {
                str = "";
            }
            this.f86748e.put(str.toLowerCase(), new c(str, SystemClock.elapsedRealtime()));
        }
    }

    @Override // com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer
    public final float d() {
        return hf0.b.f69002b;
    }

    public final boolean m(String str) {
        return this.f86748e.containsKey(str.toLowerCase());
    }

    public final void n(Context context) {
        for (c cVar : this.f86748e.values()) {
            if (SystemClock.elapsedRealtime() - cVar.f86747b < 500) {
                Intrinsics.checkNotNullParameter(context, "context");
                String text = cVar.f86746a;
                Intrinsics.checkNotNullParameter(text, "text");
                Toast.makeText(context, text, 1).show();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.f85943a.h(this.f86749f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        u.f85943a.j(this.f86749f);
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer, android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getTag() instanceof g) {
            this.f86748e.remove(view instanceof GestaltToast ? ((GestaltToast) view).z().f55665a.a(getContext()).toString().toLowerCase() : ((TextToastView) view).f52195a.getText().toString().toLowerCase());
        }
        super.removeView(view);
    }
}
