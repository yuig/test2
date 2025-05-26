package ca0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import com.pinterest.navigation.Navigation;
import h32.d4;
import h32.x3;
import i2.f2;
import i2.y3;
import kh2.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s80.i7;
import s80.j7;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lca0/z;", "Lnl1/d;", "<init>", "()V", "composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class z extends f1 {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f27179j0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public n72.b f27180c0;

    /* renamed from: d0, reason: collision with root package name */
    public n72.m f27181d0;

    /* renamed from: e0, reason: collision with root package name */
    public final m1 f27182e0;

    /* renamed from: f0, reason: collision with root package name */
    public com.pinterest.shuffles.scene.composer.q f27183f0;

    /* renamed from: g0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f27184g0;

    /* renamed from: h0, reason: collision with root package name */
    public zy.a0 f27185h0;

    /* renamed from: i0, reason: collision with root package name */
    public final d4 f27186i0;

    public z() {
        xk2.k q13 = jq.b.q(26, new q1(this, 23), xk2.n.NONE);
        int i13 = 22;
        this.f27182e0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(b1.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        this.f27184g0 = bs1.c.u1(new d(null, null, null, false, 4095), y3.f71400a);
        this.f27185h0 = new zy.a0();
        this.f27186i0 = d4.COLLAGE_COMPOSER_CREATE_PIN;
    }

    public static final void Y7(z zVar, i2.o oVar, int i13) {
        zVar.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-399852423);
        d dVar = (d) zVar.f27184g0.getValue();
        com.pinterest.shuffles.scene.composer.q qVar = zVar.f27183f0;
        if (qVar == null) {
            Intrinsics.r("stickerFactory");
            throw null;
        }
        n72.m mVar = zVar.f27181d0;
        if (mVar == null) {
            Intrinsics.r("logger");
            throw null;
        }
        n0.a(dVar, qVar, mVar, zVar.Z7().c(), null, sVar, 4680, 16);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.t0(zVar, i13, 17);
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        c cVar;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        int hashCode = code.hashCode();
        if (hashCode == -1056262969) {
            if (code.equals("com.pinterest.EXTRA_BOARD_PICKER_RESULT_CODE")) {
                kh2.j.x2(Z7(), p.f27150a);
                return;
            }
            return;
        }
        if (hashCode != -1048808300) {
            if (hashCode == 1012682206 && code.equals("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_PROFILE_RESULT_CODE")) {
                kh2.j.x2(Z7(), new g(b.f27072a));
                return;
            }
            return;
        }
        if (code.equals("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_CODE")) {
            if (result.containsKey("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_ID")) {
                String string = result.getString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_ID");
                if (string == null) {
                    string = "";
                }
                String string2 = result.getString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_NAME");
                cVar = new a(string, new u50.f0(string2 != null ? string2 : ""), result.getString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_IMAGE_URL"), result.getString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_SECTION_ID"));
            } else {
                cVar = b.f27072a;
            }
            kh2.j.x2(Z7(), new g(cVar));
        }
    }

    public final b1 Z7() {
        return (b1) this.f27182e0.getValue();
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.f27185h0.e();
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f27185h0.f();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF87992j0() {
        return this.f27186i0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new y(Z7().c(), 0);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = j7.fragment_collage_publish;
        Z7().h(com.bumptech.glide.d.i0(null, null, this.f27186i0, ""), this.f27185h0.f());
        if (df.j1.U0(com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_ID", ""))) {
            ((l82.c) Z7().c()).a(new s(com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_ID", "")));
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Context context = onCreateView.getContext();
        com.pinterest.shuffles.scene.composer.a1 P0 = m2.P0();
        n72.m mVar = this.f27181d0;
        if (mVar == null) {
            Intrinsics.r("logger");
            throw null;
        }
        n72.b bVar = this.f27180c0;
        if (bVar == null) {
            Intrinsics.r("fontManager");
            throw null;
        }
        Intrinsics.f(context);
        this.f27183f0 = new com.pinterest.shuffles.scene.composer.q(context, P0, bVar, mVar);
        View findViewById = onCreateView.findViewById(i7.collage_publish_view);
        v vVar = new v(this, 1);
        Object obj = q2.i.f102113a;
        ((ComposeView) findViewById).o(new q2.h(vVar, true, 555153220));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        kh2.b0.D1(this, new x(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f27185h0.e().f67083c;
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            return str;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }
}
