package sh1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.s2;
import h32.d4;
import h32.i0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.h2;
import lh0.z3;
import m60.w;
import nx.f0;
import so.jb;
import so.oa;
import ye2.m;
import ye2.o;
import zu1.d;

/* loaded from: classes5.dex */
public final class b extends ConstraintLayout implements nx.a, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f112933a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f112934b;

    /* renamed from: c, reason: collision with root package name */
    public final w f112935c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f112936d;

    /* renamed from: e, reason: collision with root package name */
    public final h2 f112937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 1;
        if (!this.f112934b) {
            this.f112934b = true;
            jb jbVar = (jb) ((c) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f112935c = (w) oaVar.f113885r0.get();
            this.f112936d = (f0) oaVar.f113747j2.get();
            this.f112937e = jbVar.f113485c.c6();
        }
        LayoutInflater.from(context).inflate(d.view_unified_inbox_toolbar, (ViewGroup) this, true);
        View findViewById = findViewById(zu1.c.unified_inbox_toolbar_configuration_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(zu1.c.unified_inbox_toolbar_new_message_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById2;
        h2 h2Var = this.f112937e;
        if (h2Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) h2Var.f83382a;
        if (g1Var.o("sg_android_unified_inbox_compose_icon", "enabled", z3Var) || g1Var.l("sg_android_unified_inbox_compose_icon")) {
            GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById(zu1.c.unified_inbox_toolbar_new_message_icon);
            Intrinsics.f(gestaltIconButton);
            com.bumptech.glide.c.u1(gestaltIconButton);
            final int i14 = 0;
            gestaltIconButton.v(new View.OnClickListener(this) { // from class: sh1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f112932b;

                {
                    this.f112932b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i14;
                    b this$0 = this.f112932b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L();
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L();
                            break;
                    }
                }
            });
            bs1.c.X0(imageView);
        }
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: sh1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f112932b;

            {
                this.f112932b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                b this$0 = this.f112932b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L();
                        break;
                }
            }
        });
    }

    public final void L() {
        performHapticFeedback(6);
        f0 f0Var = this.f112936d;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        ((nx.m) f0Var).a(this).X(u0.CONVERSATION_CREATE_BUTTON);
        w wVar = this.f112935c;
        if (wVar != null) {
            wVar.d(Navigation.w1((ScreenLocation) s2.f51343b.getValue()));
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f112933a == null) {
            this.f112933a = new o(this);
        }
        return this.f112933a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.UNIFIED_INBOX, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f112933a == null) {
            this.f112933a = new o(this);
        }
        return this.f112933a.generatedComponent();
    }
}
