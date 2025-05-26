package r5;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.y1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import net.quikkly.android.utils.BitmapUtils;
import t3.c0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final AccessibilityNodeInfo f106231a;

    /* renamed from: b */
    public int f106232b = -1;

    /* renamed from: c */
    public int f106233c = -1;

    public e(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f106231a = accessibilityNodeInfo;
    }

    public static String d(int i13) {
        if (i13 == 1) {
            return "ACTION_FOCUS";
        }
        if (i13 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i13) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case BitmapUtils.BITMAP_TO_JPEG_SIZE /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i13) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i13) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i13) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void A(int i13) {
        this.f106231a.setLiveRegion(i13);
    }

    public final void B(int i13) {
        this.f106231a.setMovementGranularities(i13);
    }

    public final void C(boolean z13) {
        this.f106231a.setScrollable(z13);
    }

    public final void D(boolean z13) {
        this.f106231a.setSelected(z13);
    }

    public final void E(boolean z13) {
        this.f106231a.setShowingHintText(z13);
    }

    public final void F(CharSequence charSequence) {
        this.f106231a.setText(charSequence);
    }

    public final void G(int i13, int i14) {
        this.f106231a.setTextSelection(i13, i14);
    }

    public final void H(c0 c0Var, int i13) {
        this.f106231a.setTraversalAfter(c0Var, i13);
    }

    public final void I(View view) {
        this.f106231a.setTraversalBefore(view);
    }

    public final void J(c0 c0Var, int i13) {
        this.f106231a.setTraversalBefore(c0Var, i13);
    }

    public final void K(String str) {
        this.f106231a.setViewIdResourceName(str);
    }

    public final void a(int i13) {
        this.f106231a.addAction(i13);
    }

    public final void b(d dVar) {
        this.f106231a.addAction((AccessibilityNodeInfo.AccessibilityAction) dVar.f106227a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f106231a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean e(int i13) {
        Bundle extras = this.f106231a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i13) == i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f106231a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f106231a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f106233c == eVar.f106233c && this.f106232b == eVar.f106232b;
    }

    public final void f(Rect rect) {
        this.f106231a.getBoundsInParent(rect);
    }

    public final Bundle g() {
        return this.f106231a.getExtras();
    }

    public final int h() {
        return this.f106231a.getMovementGranularities();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f106231a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final CharSequence i() {
        boolean z13 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f106231a;
        if (!z13) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList c14 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList c15 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList c16 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i13 = 0; i13 < c13.size(); i13++) {
            spannableString.setSpan(new a(((Integer) c16.get(i13)).intValue(), this, g().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c13.get(i13)).intValue(), ((Integer) c14.get(i13)).intValue(), ((Integer) c15.get(i13)).intValue());
        }
        return spannableString;
    }

    public final boolean j() {
        return this.f106231a.isClickable();
    }

    public final boolean k() {
        return this.f106231a.isFocused();
    }

    public final void l(d dVar) {
        this.f106231a.removeAction((AccessibilityNodeInfo.AccessibilityAction) dVar.f106227a);
    }

    public final void m(boolean z13) {
        this.f106231a.setAccessibilityFocused(z13);
    }

    public final void n(int i13, boolean z13) {
        Bundle extras = this.f106231a.getExtras();
        if (extras != null) {
            int i14 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i13);
            if (!z13) {
                i13 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i13 | i14);
        }
    }

    public final void o(Rect rect) {
        this.f106231a.setBoundsInParent(rect);
    }

    public final void p(Rect rect) {
        this.f106231a.setBoundsInScreen(rect);
    }

    public final void q(boolean z13) {
        this.f106231a.setChecked(z13);
    }

    public final void r(CharSequence charSequence) {
        this.f106231a.setClassName(charSequence);
    }

    public final void s(boolean z13) {
        this.f106231a.setClickable(z13);
    }

    public final void t(y1 y1Var) {
        this.f106231a.setCollectionInfo(y1Var == null ? null : (AccessibilityNodeInfo.CollectionInfo) y1Var.f19715a);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb3.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f106231a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb3.append("; boundsInScreen: " + rect);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            d0.i.d(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb3.append("; boundsInWindow: " + rect);
        sb3.append("; packageName: ");
        sb3.append(accessibilityNodeInfo.getPackageName());
        sb3.append("; className: ");
        sb3.append(accessibilityNodeInfo.getClassName());
        sb3.append("; text: ");
        sb3.append(i());
        sb3.append("; error: ");
        sb3.append(accessibilityNodeInfo.getError());
        sb3.append("; maxTextLength: ");
        sb3.append(accessibilityNodeInfo.getMaxTextLength());
        sb3.append("; stateDescription: ");
        sb3.append(i13 >= 30 ? j5.a.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb3.append("; contentDescription: ");
        sb3.append(accessibilityNodeInfo.getContentDescription());
        sb3.append("; tooltipText: ");
        sb3.append(i13 >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb3.append("; viewIdResName: ");
        sb3.append(accessibilityNodeInfo.getViewIdResourceName());
        sb3.append("; uniqueId: ");
        sb3.append(i13 >= 33 ? v.y1.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb3.append("; checkable: ");
        sb3.append(accessibilityNodeInfo.isCheckable());
        sb3.append("; checked: ");
        sb3.append(accessibilityNodeInfo.isChecked());
        sb3.append("; focusable: ");
        sb3.append(accessibilityNodeInfo.isFocusable());
        sb3.append("; focused: ");
        sb3.append(accessibilityNodeInfo.isFocused());
        sb3.append("; selected: ");
        sb3.append(accessibilityNodeInfo.isSelected());
        sb3.append("; clickable: ");
        sb3.append(accessibilityNodeInfo.isClickable());
        sb3.append("; longClickable: ");
        sb3.append(accessibilityNodeInfo.isLongClickable());
        sb3.append("; contextClickable: ");
        sb3.append(accessibilityNodeInfo.isContextClickable());
        sb3.append("; enabled: ");
        sb3.append(accessibilityNodeInfo.isEnabled());
        sb3.append("; password: ");
        sb3.append(accessibilityNodeInfo.isPassword());
        sb3.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb3.append("; containerTitle: ");
        sb3.append(i13 >= 34 ? d0.i.e(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb3.append("; granularScrollingSupported: ");
        sb3.append(e(67108864));
        sb3.append("; importantForAccessibility: ");
        sb3.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb3.append("; visible: ");
        sb3.append(accessibilityNodeInfo.isVisibleToUser());
        sb3.append("; isTextSelectable: ");
        sb3.append(i13 >= 33 ? v.y1.d(accessibilityNodeInfo) : e(8388608));
        sb3.append("; accessibilityDataSensitive: ");
        sb3.append(i13 >= 34 ? d0.i.k(accessibilityNodeInfo) : e(64));
        sb3.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new d(actionList.get(i14), 0, null, null, null));
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            d dVar = (d) arrayList.get(i15);
            String d2 = d(dVar.a());
            if (d2.equals("ACTION_UNKNOWN")) {
                Object obj = dVar.f106227a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb3.append(d2);
            if (i15 != arrayList.size() - 1) {
                sb3.append(", ");
            }
        }
        sb3.append("]");
        return sb3.toString();
    }

    public final void u(y1 y1Var) {
        this.f106231a.setCollectionItemInfo(y1Var == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) y1Var.f19715a);
    }

    public final void v(CharSequence charSequence) {
        this.f106231a.setContentDescription(charSequence);
    }

    public final void w(CharSequence charSequence) {
        this.f106231a.setError(charSequence);
    }

    public final void x(boolean z13) {
        this.f106231a.setFocused(z13);
    }

    public final void y(CharSequence charSequence) {
        this.f106231a.setHintText(charSequence);
    }

    public final void z(AppCompatTextView appCompatTextView) {
        this.f106231a.setLabelFor(appCompatTextView);
    }
}
