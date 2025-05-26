package kj;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.recyclerview.widget.y1;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.NavigationMenuItemView;
import com.pinterest.feature.search.results.view.StaticSearchBarView;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import s42.j;
import v42.k;

/* loaded from: classes3.dex */
public final class d extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f79825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79826e;

    public /* synthetic */ d(Object obj, int i13) {
        this.f79825d = i13;
        this.f79826e = obj;
    }

    @Override // q5.b
    public final void d(View host, r5.e info2) {
        int i13;
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        AccessibilityNodeInfo accessibilityNodeInfo = info2.f106231a;
        int i14 = this.f79825d;
        Object obj = this.f79826e;
        switch (i14) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                if (!((h) obj).f79839j) {
                    accessibilityNodeInfo.setDismissable(false);
                    return;
                } else {
                    info2.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    return;
                }
            case 1:
            case 6:
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i15 = MaterialButtonToggleGroup.f32356k;
                materialButtonToggleGroup.getClass();
                if (host instanceof MaterialButton) {
                    int i16 = 0;
                    for (int i17 = 0; i17 < materialButtonToggleGroup.getChildCount(); i17++) {
                        if (materialButtonToggleGroup.getChildAt(i17) == host) {
                            i13 = i16;
                            info2.u(y1.j(0, 1, i13, 1, false, ((MaterialButton) host).f32352o));
                            return;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i17) instanceof MaterialButton) && materialButtonToggleGroup.c(i17)) {
                                i16++;
                            }
                        }
                    }
                }
                i13 = -1;
                info2.u(y1.j(0, 1, i13, 1, false, ((MaterialButton) host).f32352o));
                return;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).f32681x);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info2, "info");
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                info2.r((String) obj);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info2, "info");
                ImageView imageView = ((StaticSearchBarView) obj).f47756d;
                if (imageView == null) {
                    Intrinsics.r("lensIcon");
                    throw null;
                }
                info2.I(imageView);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(host, "v");
                Intrinsics.checkNotNullParameter(info2, "info");
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                k kVar = (k) obj;
                accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", kVar.getResources().getString(x0.content_description_pin));
                info2.b(new r5.d(16, kVar.getResources().getString(kVar.isSelected() ? j.deselect_pin_action_description : j.select_pin_action_description)));
                return;
        }
    }

    @Override // q5.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f79825d) {
            case 1:
                super.e(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.f79826e;
                    int i13 = BottomSheetDragHandleView.f32328j;
                    bottomSheetDragHandleView.f2();
                    break;
                }
                break;
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // q5.b
    public final boolean g(View host, int i13, Bundle bundle) {
        int i14 = this.f79825d;
        Object obj = this.f79826e;
        switch (i14) {
            case 0:
                if (i13 == 1048576) {
                    h hVar = (h) obj;
                    if (hVar.f79839j) {
                        hVar.cancel();
                        break;
                    }
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(host, "host");
                if (i13 == r5.d.f106213g.a()) {
                    int i15 = uv1.c.f123185g;
                    ((uv1.c) obj).a();
                }
                break;
        }
        return super.g(host, i13, bundle);
    }
}
