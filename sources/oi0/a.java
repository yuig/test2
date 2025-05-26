package oi0;

import android.view.animation.OvershootInterpolator;
import com.pinterest.api.model.f30;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import qi0.d;
import vq0.h;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final l51.a f95302a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f95303b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95304c;

    public a(l51.a adsQcmAnalytics) {
        Intrinsics.checkNotNullParameter(adsQcmAnalytics, "adsQcmAnalytics");
        this.f95302a = adsQcmAnalytics;
        this.f95303b = new HashSet();
        this.f95304c = true;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        d view = (d) nVar;
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        view.setPin(model, i13);
        jh0.d onClickListener = new jh0.d(this, 2);
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        view.f103991t = onClickListener;
        HashSet hashSet = this.f95303b;
        if (hashSet.contains(Integer.valueOf(i13)) || i13 >= 5) {
            return;
        }
        view.setScaleX(0.6f);
        view.setScaleY(0.6f);
        view.setAlpha(0.0f);
        view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setStartDelay(i13 * 50).setInterpolator(new OvershootInterpolator(0.3f)).start();
        hashSet.add(Integer.valueOf(i13));
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
