package ye2;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import df.j1;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes2.dex */
public final class o implements af2.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile jb f138923a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f138924b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final View f138925c;

    public o(View view) {
        this.f138925c = view;
    }

    public final jb a() {
        View view = this.f138925c;
        Context context = view.getContext();
        while ((context instanceof ContextWrapper) && !af2.b.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Application C = com.bumptech.glide.c.C(context.getApplicationContext());
        Object obj = context;
        if (context == C) {
            d7.b.q(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", view.getClass());
            obj = null;
        }
        if (obj instanceof af2.b) {
            s8 s8Var = (s8) ((n) j1.b0(n.class, (af2.b) obj));
            oa oaVar = s8Var.f114255d;
            view.getClass();
            return new jb(oaVar, s8Var.f114269e, s8Var.f114284f);
        }
        throw new IllegalStateException(view.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f138923a == null) {
            synchronized (this.f138924b) {
                try {
                    if (this.f138923a == null) {
                        this.f138923a = a();
                    }
                } finally {
                }
            }
        }
        return this.f138923a;
    }
}
