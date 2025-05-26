package androidx.core.widget;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18008d;

    public /* synthetic */ g(int i13) {
        this.f18008d = i13;
    }

    @Override // q5.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f18008d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.C() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.C());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // q5.b
    public final void d(View v13, r5.e info2) {
        int C;
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        AccessibilityNodeInfo accessibilityNodeInfo = info2.f106231a;
        switch (this.f18008d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(v13, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) v13;
                info2.r(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (C = nestedScrollView.C()) > 0) {
                    info2.C(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        info2.b(r5.d.f106218l);
                        info2.b(r5.d.f106222p);
                    }
                    if (nestedScrollView.getScrollY() < C) {
                        info2.b(r5.d.f106217k);
                        info2.b(r5.d.f106224r);
                        break;
                    }
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(v13, accessibilityNodeInfo);
                if (!DrawerLayout.i(v13)) {
                    info2.f106232b = -1;
                    accessibilityNodeInfo.setParent(null);
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(v13, "v");
                Intrinsics.checkNotNullParameter(info2, "info");
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(v13, accessibilityNodeInfo);
                info2.l(r5.d.f106214h);
                accessibilityNodeInfo.setLongClickable(false);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(v13, "host");
                Intrinsics.checkNotNullParameter(info2, "info");
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(v13, accessibilityNodeInfo);
                info2.t(null);
                info2.u(null);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(v13, "host");
                Intrinsics.checkNotNullParameter(info2, "info");
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(v13, accessibilityNodeInfo);
                info2.l(r5.d.f106213g);
                info2.s(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(v13, "host");
                Intrinsics.checkNotNullParameter(info2, "info");
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(v13, accessibilityNodeInfo);
                info2.l(r5.d.f106213g);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r6 != 16908346) goto L11;
     */
    @Override // q5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f18008d
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.g(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La0
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1f
        L1c:
            r0 = r1
            goto La0
        L1f:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3c
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3c
            int r7 = r2.height()
        L3c:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L76
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4f
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4f
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L76
            goto L1c
        L4f:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.r0(r1, r6, r0)
            goto La0
        L76:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.C()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.r0(r1, r6, r0)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.g.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
