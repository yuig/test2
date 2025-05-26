package eu;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.pinterest.ads.feature.owc.view.collection.AdsProductsModule;
import so.hb;
import so.jb;
import so.oa;

/* loaded from: classes3.dex */
public abstract class t extends MaterialCardView implements af2.c {

    /* renamed from: p, reason: collision with root package name */
    public ye2.o f60151p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f60152q;

    public t(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (this.f60152q) {
            return;
        }
        this.f60152q = true;
        AdsProductsModule adsProductsModule = (AdsProductsModule) this;
        jb jbVar = (jb) ((r) generatedComponent());
        adsProductsModule.f35356r = (hb) jbVar.f113496n.get();
        oa oaVar = jbVar.f113483a;
        adsProductsModule.f35357s = (yk1.j) oaVar.Qc.get();
        adsProductsModule.f35358t = (m60.w) oaVar.f113885r0.get();
        adsProductsModule.f35359u = (es.h) oaVar.f113735i7.get();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f60151p == null) {
            this.f60151p = new ye2.o(this);
        }
        return this.f60151p;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f60151p == null) {
            this.f60151p = new ye2.o(this);
        }
        return this.f60151p.generatedComponent();
    }
}
