package gb1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import k1.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends LinearLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f64692a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f64693b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f64694c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f64695d;

    /* renamed from: e, reason: collision with root package name */
    public final String f64696e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f64697f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, boolean z13, boolean z14, String checkText, b0 checkedChangedListener) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(checkText, "checkText");
        Intrinsics.checkNotNullParameter(checkedChangedListener, "checkedChangedListener");
        int i13 = 0;
        int i14 = 1;
        if (!this.f64693b) {
            this.f64693b = true;
            ((g) generatedComponent()).getClass();
        }
        this.f64694c = z13;
        this.f64695d = z14;
        this.f64696e = checkText;
        this.f64697f = checkedChangedListener;
        View.inflate(context, c52.d.notif_settings_item_checkmark, this);
        setOrientation(0);
        c0.d.l(((GestaltCheckBox) findViewById(c52.c.notif_setting_checkbox)).L(new e(this, i13)), new e(this, i14));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f64692a == null) {
            this.f64692a = new ye2.o(this);
        }
        return this.f64692a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f64692a == null) {
            this.f64692a = new ye2.o(this);
        }
        return this.f64692a.generatedComponent();
    }
}
