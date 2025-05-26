package d7;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.feature.home.viewpager.tabs.HomeFeedTunerTab;
import h32.f1;
import h32.u0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53834a;

    /* renamed from: b, reason: collision with root package name */
    public int f53835b;

    /* renamed from: c, reason: collision with root package name */
    public int f53836c;

    /* renamed from: d, reason: collision with root package name */
    public Object f53837d;

    /* renamed from: e, reason: collision with root package name */
    public Object f53838e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0() {
        this(10, 0);
        this.f53834a = 0;
    }

    public final synchronized void a(long j13, Object obj) {
        if (this.f53836c > 0) {
            if (j13 <= ((long[]) this.f53837d)[((this.f53835b + r0) - 1) % ((Object[]) this.f53838e).length]) {
                c();
            }
        }
        d();
        int i13 = this.f53835b;
        int i14 = this.f53836c;
        Object obj2 = this.f53838e;
        int length = (i13 + i14) % ((Object[]) obj2).length;
        ((long[]) this.f53837d)[length] = j13;
        ((Object[]) obj2)[length] = obj;
        this.f53836c = i14 + 1;
    }

    public final void b(TabLayout tabLayout, kt0.e0 e0Var) {
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        int size = tabLayout.f33126b.size();
        for (int i13 = this.f53835b; i13 < size; i13++) {
            ek.e n13 = tabLayout.n(i13);
            View view = n13 != null ? n13.f59129f : null;
            if (view != null) {
                boolean e13 = e(view);
                if (!e13) {
                    ((Set) this.f53838e).remove(Integer.valueOf(i13));
                    if (i13 > this.f53836c) {
                        this.f53836c = i13 - 1;
                        return;
                    } else {
                        int i14 = this.f53835b;
                        if (i13 >= i14) {
                            this.f53835b = i14 + 1;
                        }
                    }
                }
                if (e13 && !((Set) this.f53838e).contains(Integer.valueOf(i13))) {
                    f(n13, i13, e0Var);
                }
            }
        }
        this.f53836c = r1.size() - 1;
    }

    public final synchronized void c() {
        this.f53835b = 0;
        this.f53836c = 0;
        Arrays.fill((Object[]) this.f53838e, (Object) null);
    }

    public final void d() {
        int length = ((Object[]) this.f53838e).length;
        if (this.f53836c < length) {
            return;
        }
        int i13 = length * 2;
        long[] jArr = new long[i13];
        Object[] objArr = new Object[i13];
        int i14 = this.f53835b;
        int i15 = length - i14;
        System.arraycopy((long[]) this.f53837d, i14, jArr, 0, i15);
        System.arraycopy((Object[]) this.f53838e, this.f53835b, objArr, 0, i15);
        int i16 = this.f53835b;
        if (i16 > 0) {
            System.arraycopy((long[]) this.f53837d, 0, jArr, i15, i16);
            System.arraycopy((Object[]) this.f53838e, 0, objArr, i15, this.f53835b);
        }
        this.f53837d = jArr;
        this.f53838e = objArr;
        this.f53835b = 0;
    }

    public final boolean e(View view) {
        int i13 = ((Context) this.f53837d).getResources().getDisplayMetrics().widthPixels;
        int width = view.getWidth();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int F0 = dl2.b.F0((Context) this.f53837d, eo1.a.comp_tabs_horizontal_padding);
        int i14 = iArr[0];
        return (i14 > 0 || ((width + i14) - F0 > 0)) && i14 < i13;
    }

    public final void f(ek.e eVar, int i13, kt0.e0 e0Var) {
        boolean z13 = eVar.f59129f instanceof HomeFeedTunerTab;
        ((Set) this.f53838e).add(Integer.valueOf(i13));
        if (e0Var != null) {
            if (z13) {
                kt0.t.d(e0Var.t3(), f1.VIEW, u0.HOMEFEED_TUNER_BUTTON, h32.g0.TAB_CAROUSEL, null, 24);
                return;
            }
            kt0.t t33 = e0Var.t3();
            lt0.e eVar2 = (lt0.e) CollectionsKt.U(i13, e0Var.f80816j);
            if (eVar2 == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("tab_title", eVar2.f84782b);
            hashMap.put("index", String.valueOf(i13));
            hashMap.put("referrer", String.valueOf(x22.c.HOME_FEED_SWIPE.getValue()));
            t33.c(f1.VIEW, kt0.t.a(eVar2.f84790j), h32.g0.TAB_CAROUSEL, eVar2.f84786f, hashMap);
        }
    }

    public final Object g(long j13, boolean z13) {
        Object obj = null;
        long j14 = Long.MAX_VALUE;
        while (this.f53836c > 0) {
            long j15 = j13 - ((long[]) this.f53837d)[this.f53835b];
            if (j15 < 0 && (z13 || (-j15) >= j14)) {
                break;
            }
            obj = j();
            j14 = j15;
        }
        return obj;
    }

    public final synchronized Object h() {
        return this.f53836c == 0 ? null : j();
    }

    public final synchronized Object i(long j13) {
        return g(j13, true);
    }

    public final Object j() {
        bf.b.t(this.f53836c > 0);
        Object obj = this.f53838e;
        int i13 = this.f53835b;
        Object obj2 = ((Object[]) obj)[i13];
        ((Object[]) obj)[i13] = null;
        this.f53835b = (i13 + 1) % ((Object[]) obj).length;
        this.f53836c--;
        return obj2;
    }

    public final synchronized int k() {
        return this.f53836c;
    }

    public final String toString() {
        switch (this.f53834a) {
            case 4:
                int i13 = this.f53836c;
                int i14 = this.f53835b;
                Boolean bool = (Boolean) this.f53837d;
                Boolean bool2 = (Boolean) this.f53838e;
                StringBuilder t13 = a.a.t("height : ", i13, " width : ", i14, " white edge : ");
                t13.append(bool);
                t13.append(" cached : ");
                t13.append(bool2);
                return t13.toString();
            default:
                return super.toString();
        }
    }

    public j0(int i13, int i14) {
        this.f53834a = i14;
        if (i14 != 1) {
            this.f53837d = new long[i13];
            this.f53838e = new Object[i13];
        } else {
            this.f53837d = new j9.q[i13];
            this.f53836c = 0;
        }
    }

    public j0(Boolean bool, int i13, int i14, Boolean bool2) {
        this.f53834a = 4;
        this.f53837d = bool;
        this.f53835b = i13;
        this.f53836c = i14;
        this.f53838e = bool2;
    }

    public j0(Context context) {
        this.f53834a = 3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53837d = context;
        this.f53838e = new LinkedHashSet();
        this.f53836c = -1;
    }

    public j0(com.google.android.material.textfield.n nVar, x92.b bVar) {
        this.f53834a = 2;
        this.f53837d = new SparseArray();
        this.f53838e = nVar;
        this.f53835b = bVar.C(fj.m.TextInputLayout_endIconDrawable, 0);
        this.f53836c = bVar.C(fj.m.TextInputLayout_passwordToggleDrawable, 0);
    }
}
