package pu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.pinterest.navigation.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpu/j0;", "Lmu/p0;", "Lli0/a;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NoFragmentConstructorInjection"})
/* loaded from: classes.dex */
public abstract class j0 extends c0 implements li0.a {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f101356u0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public z70.m f101357r0;

    /* renamed from: s0, reason: collision with root package name */
    public final xk2.v f101358s0 = xk2.m.b(new f0(this, 1));

    /* renamed from: t0, reason: collision with root package name */
    public final xk2.v f101359t0 = xk2.m.b(new f0(this, 0));

    @Override // li0.a
    public final boolean G5(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return lf.a.b(E4(), valueCallback, fileChooserParams);
    }

    @Override // mu.p0, nl1.d
    public final void K7() {
        super.K7();
        Navigation navigation = this.I;
        f8().a(new q(new tu.l(navigation != null ? navigation.S("com.pinterest.EXTRA_IS_REQUIRED_SPAM_CHECK", false) : false)));
    }

    @Override // nl1.d
    public final void L7() {
        super.L7();
        f8().a(new q(tu.o.f119301a));
    }

    @Override // nl1.d
    public final boolean N7(int i13, KeyEvent keyEvent) {
        b8().n1().onKeyDown(i13, keyEvent);
        return false;
    }

    @Override // mu.p0
    public final wb.c Y7() {
        return new wb.c(e8(), 6);
    }

    @Override // mu.p0
    public final mq.z Z7() {
        return new mq.z(f8(), 9);
    }

    @Override // mu.p0
    public qu.a a8() {
        return (qu.a) this.f101359t0.getValue();
    }

    @Override // mu.p0
    public ru.b b8() {
        return (ru.b) this.f101358s0.getValue();
    }

    public abstract wb.c e8();

    public abstract mq.z f8();

    @Override // mu.p0, nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public boolean getF103154e0() {
        f8().a(new e(a8().k0()));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        if (i13 == 300) {
            f8().a(h.f101349a);
        } else {
            lf.a.n(i13, i14, intent);
        }
    }

    @Override // mu.p0, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f8().a(new j(System.currentTimeMillis() * 1000000));
        super.onDestroyView();
    }

    @Override // mu.p0, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        f8().a(l.f101361a);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new i0(this, null), 3);
    }
}
