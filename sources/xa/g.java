package xa;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class g extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f134385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f134386e;

    public /* synthetic */ g(View view, int i13) {
        this.f134385d = i13;
        this.f134386e = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r3.b() > 1) goto L12;
     */
    @Override // q5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.f134385d
            android.view.View r1 = r2.f134386e
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            super.c(r3, r4)
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r3 = r1.f32663d
            r4.setChecked(r3)
            return
        L12:
            super.c(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            r3 = r1
            androidx.viewpager.widget.ViewPager r3 = (androidx.viewpager.widget.ViewPager) r3
            xa.a r3 = r3.f19892e
            if (r3 == 0) goto L2d
            int r3 = r3.b()
            r0 = 1
            if (r3 <= r0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            r4.setScrollable(r0)
            int r3 = r4.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r3 != r0) goto L50
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            xa.a r3 = r1.f19892e
            if (r3 == 0) goto L50
            int r3 = r3.b()
            r4.setItemCount(r3)
            int r3 = r1.f19893f
            r4.setFromIndex(r3)
            int r3 = r1.f19893f
            r4.setToIndex(r3)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.g.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // q5.b
    public final void d(View view, r5.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f106231a;
        int i13 = this.f134385d;
        View view2 = this.f134386e;
        switch (i13) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                eVar.r(ViewPager.class.getName());
                a aVar = ((ViewPager) view2).f19892e;
                eVar.C(aVar != null && aVar.b() > 1);
                ViewPager viewPager = (ViewPager) view2;
                if (viewPager.canScrollHorizontally(1)) {
                    eVar.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    eVar.a(8192);
                    break;
                }
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f32664e);
                eVar.q(checkableImageButton.f32663d);
                break;
        }
    }

    @Override // q5.b
    public final boolean g(View view, int i13, Bundle bundle) {
        switch (this.f134385d) {
            case 0:
                if (super.g(view, i13, bundle)) {
                    return true;
                }
                View view2 = this.f134386e;
                if (i13 == 4096) {
                    ViewPager viewPager = (ViewPager) view2;
                    if (viewPager.canScrollHorizontally(1)) {
                        viewPager.A(viewPager.f19893f + 1);
                        return true;
                    }
                } else if (i13 == 8192) {
                    ViewPager viewPager2 = (ViewPager) view2;
                    if (viewPager2.canScrollHorizontally(-1)) {
                        viewPager2.A(viewPager2.f19893f - 1);
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i13, bundle);
        }
    }
}
