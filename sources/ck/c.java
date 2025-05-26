package ck;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.view.View;
import android.view.ViewGroup;
import bp1.h;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f27901a;

    public c(SideSheetBehavior sideSheetBehavior) {
        this.f27901a = sideSheetBehavior;
    }

    @Override // bp1.h
    public final void B(int i13) {
        if (i13 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f27901a;
            if (sideSheetBehavior.f33025g) {
                sideSheetBehavior.D(1);
            }
        }
    }

    @Override // bp1.h
    public final void C(View view, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f27901a;
        WeakReference weakReference = sideSheetBehavior.f33035q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            a aVar = sideSheetBehavior.f33019a;
            int left = view.getLeft();
            int right = view.getRight();
            int i15 = aVar.f27895e;
            SideSheetBehavior sideSheetBehavior2 = aVar.f27896f;
            switch (i15) {
                case 0:
                    if (left <= sideSheetBehavior2.f33031m) {
                        marginLayoutParams.leftMargin = right;
                        break;
                    }
                    break;
                default:
                    int i16 = sideSheetBehavior2.f33031m;
                    if (left <= i16) {
                        marginLayoutParams.rightMargin = i16 - left;
                        break;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f33040v;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        sideSheetBehavior.f33019a.x(i13);
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (java.lang.Math.abs(r6 - r0.f33019a.y()) < java.lang.Math.abs(r6 - r0.f33019a.z())) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.f33019a.B(r5) == false) goto L19;
     */
    @Override // bp1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r4.f27901a
            ck.a r1 = r0.f33019a
            boolean r1 = r1.A(r6)
            r2 = 3
            if (r1 == 0) goto Lc
            goto L56
        Lc:
            ck.a r1 = r0.f33019a
            boolean r1 = r1.D(r5, r6)
            r3 = 5
            if (r1 == 0) goto L27
            ck.a r1 = r0.f33019a
            boolean r6 = r1.C(r6, r7)
            if (r6 != 0) goto L25
            ck.a r6 = r0.f33019a
            boolean r6 = r6.B(r5)
            if (r6 == 0) goto L56
        L25:
            r2 = r3
            goto L56
        L27:
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L39
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L39
            goto L25
        L39:
            int r6 = r5.getLeft()
            ck.a r7 = r0.f33019a
            int r7 = r7.y()
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            ck.a r1 = r0.f33019a
            int r1 = r1.z()
            int r6 = r6 - r1
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L25
        L56:
            r6 = 1
            r0.F(r5, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ck.c.D(android.view.View, float, float):void");
    }

    @Override // bp1.h
    public final boolean I(View view, int i13) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f27901a;
        return (sideSheetBehavior.f33026h == 1 || (weakReference = sideSheetBehavior.f33034p) == null || weakReference.get() != view) ? false : true;
    }

    @Override // bp1.h
    public final int f(View view, int i13) {
        int i14;
        int i15;
        SideSheetBehavior sideSheetBehavior = this.f27901a;
        a aVar = sideSheetBehavior.f33019a;
        switch (aVar.f27895e) {
            case 0:
                i14 = -aVar.f27896f.f33030l;
                break;
            default:
                i14 = aVar.y();
                break;
        }
        a aVar2 = sideSheetBehavior.f33019a;
        int i16 = aVar2.f27895e;
        SideSheetBehavior sideSheetBehavior2 = aVar2.f27896f;
        switch (i16) {
            case 0:
                i15 = sideSheetBehavior2.f33033o;
                break;
            default:
                i15 = sideSheetBehavior2.f33031m;
                break;
        }
        return com.bumptech.glide.c.q(i13, i14, i15);
    }

    @Override // bp1.h
    public final int g(View view, int i13) {
        return view.getTop();
    }

    @Override // bp1.h
    public final int r(View view) {
        SideSheetBehavior sideSheetBehavior = this.f27901a;
        return sideSheetBehavior.f33030l + sideSheetBehavior.f33033o;
    }
}
