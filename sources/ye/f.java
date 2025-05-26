package ye;

import android.view.View;
import df.j1;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kg.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.json.JSONObject;
import qe.h;

/* loaded from: classes3.dex */
public final class f implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f138834e = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f138835a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f138836b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f138837c;

    /* renamed from: d, reason: collision with root package name */
    public final String f138838d;

    public f(View view, View view2, String str) {
        this.f138835a = h.e(view);
        this.f138836b = new WeakReference(view2);
        this.f138837c = new WeakReference(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f138838d = z.n(lowerCase, "activity", "");
    }

    public final void a() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            View view = (View) this.f138836b.get();
            View view2 = (View) this.f138837c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String d2 = c.d(view2);
                String b13 = b.b(view2, d2);
                if (b13 == null || me.f.c(b13, d2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("view", c.b(view, view2));
                jSONObject.put("screenname", this.f138838d);
                if (p001if.a.b(this)) {
                    return;
                }
                try {
                    j1.x1(new w.b(jSONObject, d2, this, b13, 9));
                } catch (Throwable th3) {
                    p001if.a.a(this, th3);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n.a(view);
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                View.OnClickListener onClickListener = this.f138835a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                a();
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }
}
