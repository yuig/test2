package fz0;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.feature.pear.quiz.view.QuizNuxView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kh2.a1;
import kl0.w;
import kl0.x;
import kl0.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import ml0.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfz0/l;", "Lnl1/d;", "<init>", "()V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f63133l0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f63134c0;

    /* renamed from: d0, reason: collision with root package name */
    public final HashMap f63135d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltText f63136e0;

    /* renamed from: f0, reason: collision with root package name */
    public FrameLayout f63137f0;

    /* renamed from: g0, reason: collision with root package name */
    public QuizNuxView f63138g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f63139h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltSpinner f63140i0;

    /* renamed from: j0, reason: collision with root package name */
    public final d4 f63141j0;

    /* renamed from: k0, reason: collision with root package name */
    public final a4 f63142k0;

    public l() {
        int i13 = 13;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(i13, new w(this, i13)));
        int i14 = 14;
        this.f63134c0 = a1.s(this, k0.f80436a.b(u.class), new v(a13, i13), new x(null, a13, i14), new y(this, a13, i14));
        this.f63135d0 = new HashMap();
        this.f63141j0 = d4.PEAR_QUIZ;
        this.f63142k0 = a4.PEAR_QUIZ_QUESTIONS;
    }

    public final u Y7() {
        return (u) this.f63134c0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getI0() {
        return this.f63142k0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f63141j0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = iy1.e.fragment_quiz;
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_QUIZ_ID", "");
        Navigation navigation = this.I;
        String g23 = navigation != null ? navigation.g2("com.pinterest.EXTRA_REFERRER", "") : null;
        String str = g23 != null ? g23 : "";
        u Y7 = Y7();
        Navigation navigation2 = this.I;
        Y7.h(generateLoggingContext(), Z, str, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_SKIP_NUX", false) : false);
        HashMap hashMap = this.f63135d0;
        hashMap.put("quiz_id", Z);
        hashMap.put("referrer", str);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(iy1.d.quiz_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f63136e0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(iy1.d.quiz_content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f63137f0 = (FrameLayout) findViewById2;
        View findViewById3 = v13.findViewById(iy1.d.quiz_nux_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f63138g0 = (QuizNuxView) findViewById3;
        View findViewById4 = v13.findViewById(iy1.d.quiz_progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f63139h0 = findViewById4;
        View findViewById5 = v13.findViewById(iy1.d.loading_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f63140i0 = (GestaltSpinner) findViewById5;
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new k(this, v13, null), 3);
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5, reason: from getter */
    public final HashMap getF63135d0() {
        return this.f63135d0;
    }
}
