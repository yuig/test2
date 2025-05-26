package wq;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import nx.d0;

/* loaded from: classes3.dex */
public final class d extends LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f130774p = 0;

    /* renamed from: a, reason: collision with root package name */
    public wy0 f130775a;

    /* renamed from: b, reason: collision with root package name */
    public String f130776b;

    /* renamed from: c, reason: collision with root package name */
    public String f130777c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f130778d;

    /* renamed from: e, reason: collision with root package name */
    public int f130779e;

    /* renamed from: f, reason: collision with root package name */
    public final w f130780f;

    /* renamed from: g, reason: collision with root package name */
    public d0 f130781g;

    /* renamed from: h, reason: collision with root package name */
    public p12.b f130782h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f130783i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltText f130784j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltText f130785k;

    /* renamed from: l, reason: collision with root package name */
    public Switch f130786l;

    /* renamed from: m, reason: collision with root package name */
    public GestaltButton f130787m;

    /* renamed from: n, reason: collision with root package name */
    public no1.d f130788n;

    /* renamed from: o, reason: collision with root package name */
    public final xj2.b f130789o;

    public d(Context context) {
        super(context, null, 0);
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f130780f = wVar;
        this.f130789o = new xj2.b();
    }

    public final void a(int i13) {
        int i14 = this.f130779e;
        if (i14 == -1) {
            GestaltButton gestaltButton = this.f130787m;
            if (gestaltButton != null) {
                gestaltButton.d(b.f130769j);
            }
        } else if (i14 != i13) {
            LinearLayout linearLayout = this.f130783i;
            View findViewById = linearLayout != null ? linearLayout.findViewById(i14) : null;
            Intrinsics.g(findViewById, "null cannot be cast to non-null type android.widget.RadioButton");
            ((RadioButton) findViewById).setChecked(false);
        }
        LinearLayout linearLayout2 = this.f130783i;
        View findViewById2 = linearLayout2 != null ? linearLayout2.findViewById(i13) : null;
        Intrinsics.g(findViewById2, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) findViewById2).setChecked(true);
        this.f130779e = i13;
    }

    public final void b(String str) {
        no1.d dVar = this.f130788n;
        if (dVar != null) {
            String str2 = this.f130776b;
            if (str2 != null) {
                dVar.c(str2, str, new c(this));
            } else {
                Intrinsics.r("contactRequestId");
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f130789o.dispose();
    }
}
