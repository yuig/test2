package yq1;

import android.graphics.Bitmap;
import android.view.View;
import com.pinterest.navigation.view.behavior.BottomNavigationBehavior;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements o82.o2, vr1.c, q5.f1, nx.h1, rd.b, l82.g0, r5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f139832b;

    public /* synthetic */ d1(Object obj, int i13) {
        this.f139831a = i13;
        this.f139832b = obj;
    }

    @Override // rd.b
    public final boolean a(File file) {
        Bitmap bitmap = (Bitmap) this.f139832b;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException e13) {
            e13.printStackTrace();
            return false;
        }
    }

    @Override // nx.h1
    public final HashMap f() {
        int i13 = this.f139831a;
        Object obj = this.f139832b;
        switch (i13) {
            case 5:
                v72.g this$0 = (v72.g) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.f124417d.f();
            case 9:
                return qa2.p0.b((qa2.p0) obj);
            case 10:
                qa2.r0 this$02 = (qa2.r0) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                return this$02.f103340c.f();
            default:
                wc2.e this$03 = (wc2.e) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                return this$03.f129119d.f();
        }
    }

    @Override // l82.g0
    public final void i(l82.e resultBuilder) {
        l82.h0 lens = (l82.h0) this.f139832b;
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
    }

    @Override // o82.o2
    public final Object invoke(Object obj) {
        m1 this$0 = (m1) this.f139832b;
        wr1.f1 vmState = (wr1.f1) obj;
        int i13 = m1.X0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return new wr1.e1(vmState.f130967a, new k1(this$0, 0));
    }

    @Override // r5.p
    public final boolean l(View view) {
        LegoPinGridCellImpl this$0 = (LegoPinGridCellImpl) this.f139832b;
        int i13 = LegoPinGridCellImpl.Z2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z13 = this$0.G;
        String str = ((ua2.d0) this$0.f52410f2.getValue()).f121482o;
        com.pinterest.framework.screens.a coreFragment = this$0.getCoreFragment();
        kg.p.Z(this$0, z13, str, coreFragment instanceof ta2.a ? (ta2.a) coreFragment : null, view);
        return true;
    }

    @Override // vr1.c
    public final void m(vr1.b input) {
        Function1 function1;
        int i13 = this.f139831a;
        Object obj = this.f139832b;
        switch (i13) {
            case 1:
                h2 this$0 = (h2) obj;
                int i14 = h2.E0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(input, "input");
                this$0.c8().d(new u1(input, 2));
                break;
            default:
                zz1.p this$02 = (zz1.p) obj;
                int i15 = zz1.p.f143223r0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(input, "input");
                View view = this$02.getView();
                if (view != null && (function1 = this$02.f143240q0) != null) {
                    function1.invoke(new b02.j(view));
                }
                this$02.b8(input.f126458b);
                break;
        }
    }

    @Override // q5.f1
    public final void s(View view) {
        BottomNavigationBehavior bottomNavigationBehavior = (BottomNavigationBehavior) this.f139832b;
        q6.c cVar = BottomNavigationBehavior.f49946h;
        bottomNavigationBehavior.getClass();
        bottomNavigationBehavior.f49947d.f106358h.c(Integer.valueOf((int) view.getTranslationY()));
    }
}
