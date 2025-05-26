package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class u extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f32573b;

    public u(Fragment fragment, int i13) {
        this.f32572a = i13;
        this.f32573b = fragment;
    }

    @Override // com.google.android.material.datepicker.d0
    public final void a() {
        int i13 = this.f32572a;
        Fragment fragment = this.f32573b;
        switch (i13) {
            case 0:
                ((w) fragment).Q.setEnabled(false);
                break;
            default:
                Iterator it = ((x) fragment).f32515a.iterator();
                while (it.hasNext()) {
                    ((d0) it.next()).a();
                }
                break;
        }
    }

    @Override // com.google.android.material.datepicker.d0
    public final void b(Object obj) {
        int i13 = this.f32572a;
        Fragment fragment = this.f32573b;
        switch (i13) {
            case 0:
                w wVar = (w) fragment;
                String d13 = wVar.U6().d1(wVar.getContext());
                wVar.N.setContentDescription(wVar.U6().q0(wVar.requireContext()));
                wVar.N.setText(d13);
                wVar.Q.setEnabled(wVar.U6().N1());
                break;
            default:
                Iterator it = ((x) fragment).f32515a.iterator();
                while (it.hasNext()) {
                    ((d0) it.next()).b(obj);
                }
                break;
        }
    }
}
