package c0;

import android.location.Location;
import android.view.View;
import java.util.WeakHashMap;
import q5.a2;

/* loaded from: classes2.dex */
public final class d0 implements com.google.android.material.internal.h0 {

    /* renamed from: a */
    public final /* synthetic */ int f24215a;

    /* renamed from: b */
    public final boolean f24216b;

    /* renamed from: c */
    public final boolean f24217c;

    /* renamed from: d */
    public final boolean f24218d;

    /* renamed from: e */
    public final com.google.android.material.internal.h0 f24219e;

    public d0(boolean z13, boolean z14, boolean z15, com.google.android.material.bottomappbar.b bVar) {
        this.f24215a = 1;
        this.f24216b = z13;
        this.f24217c = z14;
        this.f24218d = z15;
        this.f24219e = bVar;
    }

    @Override // com.google.android.material.internal.h0
    public final a2 d(View view, a2 a2Var, l8.p pVar) {
        if (this.f24216b) {
            pVar.f82078d = a2Var.b() + pVar.f82078d;
        }
        boolean H0 = lb.l0.H0(view);
        if (this.f24217c) {
            if (H0) {
                pVar.f82077c = a2Var.c() + pVar.f82077c;
            } else {
                pVar.f82075a = a2Var.c() + pVar.f82075a;
            }
        }
        if (this.f24218d) {
            if (H0) {
                pVar.f82075a = a2Var.d() + pVar.f82075a;
            } else {
                pVar.f82077c = a2Var.d() + pVar.f82077c;
            }
        }
        int i13 = pVar.f82075a;
        int i14 = pVar.f82076b;
        int i15 = pVar.f82077c;
        int i16 = pVar.f82078d;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        view.setPaddingRelative(i13, i14, i15, i16);
        com.google.android.material.internal.h0 h0Var = this.f24219e;
        return h0Var != null ? h0Var.d(view, a2Var, pVar) : a2Var;
    }

    public final String toString() {
        switch (this.f24215a) {
            case 0:
                return "Metadata{mIsReversedHorizontal=" + this.f24216b + ", mIsReversedVertical=" + this.f24218d + ", mLocation=" + ((Location) this.f24219e) + "}";
            default:
                return super.toString();
        }
    }

    public d0() {
        this.f24215a = 0;
        this.f24217c = false;
    }
}
