package ua;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: b, reason: collision with root package name */
    public final View f121378b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f121377a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f121379c = new ArrayList();

    public y0(View view) {
        this.f121378b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f121378b == y0Var.f121378b && this.f121377a.equals(y0Var.f121377a);
    }

    public final int hashCode() {
        return this.f121377a.hashCode() + (this.f121378b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder D = ep.b.D("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        D.append(this.f121378b);
        D.append("\n");
        String C = a.a.C(D.toString(), "    values:");
        HashMap hashMap = this.f121377a;
        for (String str : hashMap.keySet()) {
            C = C + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return C;
    }
}
