package ye2;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;

/* loaded from: classes2.dex */
public final class m extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public LayoutInflater f138921a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f138922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, Fragment fragment) {
        super(context);
        context.getClass();
        d1 d1Var = new d1(this);
        this.f138921a = null;
        fragment.getClass();
        fragment.getLifecycle().a(d1Var);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f138922b == null) {
            if (this.f138921a == null) {
                this.f138921a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f138922b = this.f138921a.cloneInContext(this);
        }
        return this.f138922b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(android.view.LayoutInflater r2, androidx.fragment.app.Fragment r3) {
        /*
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            r1.<init>(r0)
            androidx.lifecycle.d1 r0 = new androidx.lifecycle.d1
            r0.<init>(r1)
            r1.f138921a = r2
            r3.getClass()
            androidx.lifecycle.s r2 = r3.getLifecycle()
            r2.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ye2.m.<init>(android.view.LayoutInflater, androidx.fragment.app.Fragment):void");
    }
}
