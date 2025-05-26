package fd1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class i0 extends LinearLayout implements cd1.c, af2.c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f61945g = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f61946a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61947b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f61948c;

    /* renamed from: d, reason: collision with root package name */
    public final dl1.s f61949d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f61950e;

    /* renamed from: f, reason: collision with root package name */
    public final no1.e f61951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, nx.d0 pinalytics, int i13, dl1.s model) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(model, "model");
        if (!this.f61947b) {
            this.f61947b = true;
            jb jbVar = (jb) ((j0) generatedComponent());
            this.f61950e = (m60.w) jbVar.f113483a.f113885r0.get();
            this.f61951f = jbVar.f113485c.C5();
        }
        this.f61948c = pinalytics;
        this.f61949d = model;
        View.inflate(context, b62.c.view_lego_sendmessage_modal, this);
        setOrientation(1);
        e0.t.f56747e = i13;
        GestaltText gestaltText = (GestaltText) findViewById(b62.b.youre_following_title);
        Intrinsics.f(gestaltText);
        Resources resources = getResources();
        int i14 = m60.x0.youre_following;
        Intrinsics.g(model, "null cannot be cast to non-null type com.pinterest.api.model.User");
        String string = resources.getString(i14, ((wy0) model).Z2());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(gestaltText, string);
        ((GestaltButton) findViewById(b62.b.send_message_cta)).e(new ca1.h(this, 15));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f61946a == null) {
            this.f61946a = new ye2.o(this);
        }
        return this.f61946a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f61946a == null) {
            this.f61946a = new ye2.o(this);
        }
        return this.f61946a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hf0.b.k(this);
        super.onDetachedFromWindow();
    }
}
