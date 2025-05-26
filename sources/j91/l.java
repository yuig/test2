package j91;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import i91.h0;
import java.util.ArrayList;
import java.util.Collections;
import m60.u;
import nx.d0;
import so.jb;
import ye2.o;

/* loaded from: classes5.dex */
public final class l extends LinearLayout implements af2.c {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f75133l = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f75134a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75135b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f75136c;

    /* renamed from: d, reason: collision with root package name */
    public String f75137d;

    /* renamed from: e, reason: collision with root package name */
    public final xj2.b f75138e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltTextField f75139f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltButton f75140g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltButton f75141h;

    /* renamed from: i, reason: collision with root package name */
    public no1.e f75142i;

    /* renamed from: j, reason: collision with root package name */
    public i92.k f75143j;

    /* renamed from: k, reason: collision with root package name */
    public int f75144k;

    public l(Context context) {
        super(context, null, 0);
        if (!this.f75135b) {
            this.f75135b = true;
            jb jbVar = (jb) ((m) generatedComponent());
            pe.i.b0(this, jbVar.f113485c.C5());
            pe.i.N0(this, (i92.k) jbVar.f113483a.f113921t1.get());
        }
        this.f75138e = new xj2.b();
    }

    public final void a() {
        String obj = this.f75139f.z0().toString();
        if (obj.trim().length() == 0) {
            this.f75143j.h(x42.c.empty_message_send_error);
        } else {
            oo1.j.b(obj, Collections.singletonList(this.f75137d), new ArrayList(), null, null, null, null, null, null, y32.f.PROFILE.value(), this.f75142i, null).r(tk2.e.f118017c).l(wj2.c.a()).o(new xo.a(this, 19), new h0(1));
            a.c.y(u.f85943a);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f75134a == null) {
            this.f75134a = new o(this);
        }
        return this.f75134a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f75134a == null) {
            this.f75134a = new o(this);
        }
        return this.f75134a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f75144k = activity.getWindow().getAttributes().softInputMode;
            activity.getWindow().setSoftInputMode(16);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Context context = getContext();
        if (context instanceof Activity) {
            ((Activity) context).getWindow().setSoftInputMode(this.f75144k);
        }
        hf0.b.k(this);
        this.f75138e.d();
        super.onDetachedFromWindow();
    }
}
