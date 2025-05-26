package mm1;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmm1/l;", "Lnl1/d;", "<init>", "()V", "fragmentLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class l extends o {

    /* renamed from: c0, reason: collision with root package name */
    public k f87627c0;

    public l() {
        this.E = tk1.b.gestalt_sheet_fragment;
    }

    public final void Y7(View.OnClickListener onClickListener) {
        k kVar = this.f87627c0;
        if (kVar != null) {
            kVar.h().t(onClickListener);
        } else {
            Intrinsics.r("delegate");
            throw null;
        }
    }

    public final void Z7(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        k kVar = this.f87627c0;
        if (kVar != null) {
            kVar.h().u(nextState);
        } else {
            Intrinsics.r("delegate");
            throw null;
        }
    }

    public final void a8(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        k kVar = this.f87627c0;
        if (kVar != null) {
            kVar.i().T(nextState);
        } else {
            Intrinsics.r("delegate");
            throw null;
        }
    }

    public abstract d b8();

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k kVar = new k(this, b8());
        kVar.l();
        this.f87627c0 = kVar;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        k kVar = this.f87627c0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar.f().d();
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        k kVar = this.f87627c0;
        if (kVar != null) {
            kVar.m(v13);
        } else {
            Intrinsics.r("delegate");
            throw null;
        }
    }
}
