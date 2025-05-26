package ey;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.gms.net.PlayServicesCronetProvider;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v4 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60603i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f60604j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f60605k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(Object obj, boolean z13, int i13) {
        super(0);
        this.f60603i = i13;
        this.f60605k = obj;
        this.f60604j = z13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        View view;
        int i13 = this.f60603i;
        boolean z13 = false;
        byte b13 = 0;
        boolean z14 = this.f60604j;
        Object obj = this.f60605k;
        switch (i13) {
            case 0:
                return new u4(z14, (w4) obj);
            case 1:
                kt0.q qVar = (kt0.q) obj;
                int i14 = kt0.q.R0;
                qVar.t8(false);
                if (z14) {
                    TabLayout tabLayout = qVar.f80855z0;
                    if (tabLayout == null) {
                        Intrinsics.r("tabLayout");
                        throw null;
                    }
                    if (tabLayout.f33126b.size() > 1) {
                        ArrayList arrayList = new ArrayList();
                        TabLayout tabLayout2 = qVar.f80855z0;
                        if (tabLayout2 == null) {
                            Intrinsics.r("tabLayout");
                            throw null;
                        }
                        int size = tabLayout2.f33126b.size();
                        for (int i15 = 1; i15 < size; i15++) {
                            TabLayout tabLayout3 = qVar.f80855z0;
                            if (tabLayout3 == null) {
                                Intrinsics.r("tabLayout");
                                throw null;
                            }
                            ek.e n13 = tabLayout3.n(i15);
                            if (n13 != null && (view = n13.f59129f) != null) {
                                view.setAlpha(0.0f);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                                ofFloat.setDuration(250L);
                                arrayList.add(ofFloat);
                            }
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(arrayList);
                        kh2.c3.h(animatorSet, new kt0.n(qVar, b13 == true ? 1 : 0));
                        animatorSet.start();
                        d7.j0 r83 = qVar.r8();
                        TabLayout tabLayout4 = qVar.f80855z0;
                        if (tabLayout4 != null) {
                            r83.b(tabLayout4, qVar.H0);
                            return Unit.f80348a;
                        }
                        Intrinsics.r("tabLayout");
                        throw null;
                    }
                }
                TabLayout tabLayout5 = qVar.f80855z0;
                if (tabLayout5 == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                if (tabLayout5.f33126b.size() == 1) {
                    d7.j0 r84 = qVar.r8();
                    TabLayout tabLayout6 = qVar.f80855z0;
                    if (tabLayout6 == null) {
                        Intrinsics.r("tabLayout");
                        throw null;
                    }
                    r84.b(tabLayout6, qVar.H0);
                }
                return Unit.f80348a;
            case 2:
                if (z14) {
                    return Boolean.FALSE;
                }
                tu1.j jVar = (tu1.j) obj;
                if (!jVar.f119398d) {
                    z13 = jVar.d();
                } else if (new PlayServicesCronetProvider(jVar.f119397c).isEnabled()) {
                    z13 = jVar.d();
                }
                return Boolean.valueOf(z13);
            default:
                return new zl2.i((am2.d0) obj, z14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(boolean z13, Object obj, int i13) {
        super(0);
        this.f60603i = i13;
        this.f60604j = z13;
        this.f60605k = obj;
    }
}
