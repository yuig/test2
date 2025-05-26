package dp1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import ln1.e;

/* loaded from: classes2.dex */
public final class a implements ns1.a, oe0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f56032a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final oe0.c f56033b;

    public a(oe0.c cVar) {
        this.f56033b = cVar;
    }

    @Override // ns1.a
    public final boolean a(boolean z13) {
        boolean z14;
        ViewParent parent;
        if (z13) {
            return false;
        }
        oe0.c cVar = this.f56033b;
        FullBleedGestaltSpinner fullBleedGestaltSpinner = cVar.f94216d;
        if ((fullBleedGestaltSpinner != null && cVar.f94217e) && (parent = fullBleedGestaltSpinner.getParent()) != null && (parent instanceof ViewGroup)) {
            cVar.f94216d.a(e.LOADED);
            ((ViewGroup) parent).removeView(cVar.f94216d);
            cVar.f94217e = false;
            z14 = true;
        } else {
            z14 = false;
        }
        this.f56032a = -1;
        return z14;
    }

    @Override // ns1.a
    public final boolean d(View view, String str) {
        View findViewById = view.findViewById(this.f56032a);
        boolean z13 = false;
        if (findViewById == null || !(findViewById instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        oe0.c cVar = this.f56033b;
        cVar.getClass();
        Context context = viewGroup.getContext();
        if (cVar.f94216d == null) {
            cVar.f94216d = new FullBleedGestaltSpinner(context);
        }
        FullBleedGestaltSpinner fullBleedGestaltSpinner = cVar.f94216d;
        if (fullBleedGestaltSpinner != null && cVar.f94217e) {
            z13 = true;
        }
        if (!z13) {
            viewGroup.addView(fullBleedGestaltSpinner);
            cVar.f94217e = true;
            cVar.f94216d.a(e.LOADING);
        }
        return true;
    }

    @Override // ns1.a
    public final boolean e(Bundle bundle) {
        int i13 = this.f56032a;
        if (i13 == -1) {
            return false;
        }
        bundle.putInt("brio.widget.progress.loading.container.id.key", i13);
        return true;
    }

    @Override // ns1.a
    public final boolean f(Bundle bundle) {
        int i13 = bundle.getInt("brio.widget.progress.loading.container.id.key", -1);
        this.f56032a = i13;
        return i13 != -1;
    }
}
