package oq;

import android.view.View;
import com.pinterest.api.model.f30;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class o0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f97112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f30 f97114c;

    public o0(float f13, int i13, f30 f30Var) {
        this.f97112a = f13;
        this.f97113b = i13;
        this.f97114c = f30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kg.n.a(view);
        HashMap hashMap = new HashMap();
        hashMap.put("rating_value", String.valueOf(this.f97112a));
        hashMap.put("review_count", String.valueOf(this.f97113b));
        sh.f.a().f0(h32.u0.RATING_REVIEW_CELL, null, this.f97114c.getUid(), hashMap, false);
    }
}
