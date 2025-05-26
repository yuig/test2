package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes.dex */
public class q extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    public Handler f18405a;

    /* renamed from: j */
    public boolean f18414j;

    /* renamed from: l */
    public Dialog f18416l;

    /* renamed from: m */
    public boolean f18417m;

    /* renamed from: n */
    public boolean f18418n;

    /* renamed from: o */
    public boolean f18419o;

    /* renamed from: b */
    public final l f18406b = new l(this, 0);

    /* renamed from: c */
    public final m f18407c = new m(this);

    /* renamed from: d */
    public final n f18408d = new n(this);

    /* renamed from: e */
    public int f18409e = 0;

    /* renamed from: f */
    public int f18410f = 0;

    /* renamed from: g */
    public boolean f18411g = true;

    /* renamed from: h */
    public boolean f18412h = true;

    /* renamed from: i */
    public int f18413i = -1;

    /* renamed from: k */
    public final o f18415k = new o(this);

    /* renamed from: p */
    public boolean f18420p = false;

    public final void M6() {
        N6(true, false);
    }

    public final void N6(boolean z13, boolean z14) {
        if (this.f18418n) {
            return;
        }
        this.f18418n = true;
        this.f18419o = false;
        Dialog dialog = this.f18416l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f18416l.dismiss();
            if (!z14) {
                if (Looper.myLooper() == this.f18405a.getLooper()) {
                    onDismiss(this.f18416l);
                } else {
                    this.f18405a.post(this.f18406b);
                }
            }
        }
        this.f18417m = true;
        if (this.f18413i >= 0) {
            getParentFragmentManager().T(this.f18413i, z13);
            this.f18413i = -1;
            return;
        }
        w0 parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        a aVar = new a(parentFragmentManager);
        aVar.f18281p = true;
        aVar.k(this);
        if (z13) {
            aVar.e(true);
        } else {
            aVar.e(false);
        }
    }

    public Dialog O6(Bundle bundle) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.p(requireContext(), this.f18410f);
    }

    public final Dialog P6() {
        Dialog dialog = this.f18416l;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void Q6(int i13, int i14) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i13 + ", " + i14);
        }
        this.f18409e = i13;
        if (i13 == 2 || i13 == 3) {
            this.f18410f = R.style.Theme.Panel;
        }
        if (i14 != 0) {
            this.f18410f = i14;
        }
    }

    public void R6(Dialog dialog, int i13) {
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void S6(w0 w0Var, String str) {
        this.f18418n = false;
        this.f18419o = true;
        w0Var.getClass();
        a aVar = new a(w0Var);
        aVar.f18281p = true;
        aVar.g(0, this, str, 1);
        aVar.e(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final d0 createFragmentContainer() {
        return new p(this, super.createFragmentContainer());
    }

    public void dismiss() {
        N6(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.f18415k);
        if (this.f18419o) {
            return;
        }
        this.f18418n = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18405a = new Handler();
        this.f18412h = this.mContainerId == 0;
        if (bundle != null) {
            this.f18409e = bundle.getInt("android:style", 0);
            this.f18410f = bundle.getInt("android:theme", 0);
            this.f18411g = bundle.getBoolean("android:cancelable", true);
            this.f18412h = bundle.getBoolean("android:showsDialog", this.f18412h);
            this.f18413i = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f18416l;
        if (dialog != null) {
            this.f18417m = true;
            dialog.setOnDismissListener(null);
            this.f18416l.dismiss();
            if (!this.f18418n) {
                onDismiss(this.f18416l);
            }
            this.f18416l = null;
            this.f18420p = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (!this.f18419o && !this.f18418n) {
            this.f18418n = true;
        }
        getViewLifecycleOwnerLiveData().j(this.f18415k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f18417m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        N6(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z13 = this.f18412h;
        if (!z13 || this.f18414j) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f18412h) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return onGetLayoutInflater;
        }
        if (z13 && !this.f18420p) {
            try {
                this.f18414j = true;
                Dialog O6 = O6(bundle);
                this.f18416l = O6;
                if (this.f18412h) {
                    R6(O6, this.f18409e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f18416l.setOwnerActivity((Activity) context);
                    }
                    this.f18416l.setCancelable(this.f18411g);
                    this.f18416l.setOnCancelListener(this.f18407c);
                    this.f18416l.setOnDismissListener(this.f18408d);
                    this.f18420p = true;
                } else {
                    this.f18416l = null;
                }
                this.f18414j = false;
            } catch (Throwable th3) {
                this.f18414j = false;
                throw th3;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f18416l;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f18416l;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i13 = this.f18409e;
        if (i13 != 0) {
            bundle.putInt("android:style", i13);
        }
        int i14 = this.f18410f;
        if (i14 != 0) {
            bundle.putInt("android:theme", i14);
        }
        boolean z13 = this.f18411g;
        if (!z13) {
            bundle.putBoolean("android:cancelable", z13);
        }
        boolean z14 = this.f18412h;
        if (!z14) {
            bundle.putBoolean("android:showsDialog", z14);
        }
        int i15 = this.f18413i;
        if (i15 != -1) {
            bundle.putInt("android:backStackId", i15);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f18416l;
        if (dialog != null) {
            this.f18417m = false;
            dialog.show();
            View decorView = this.f18416l.getWindow().getDecorView();
            b7.c.Q(decorView, this);
            d7.b.t0(decorView, this);
            lb.l0.i1(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f18416l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f18416l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f18416l.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f18416l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f18416l.onRestoreInstanceState(bundle2);
    }
}
