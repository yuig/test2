package r5;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f106211e = new d(1, (String) null);

    /* renamed from: f, reason: collision with root package name */
    public static final d f106212f = new d(2, (String) null);

    /* renamed from: g, reason: collision with root package name */
    public static final d f106213g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f106214h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f106215i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f106216j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f106217k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f106218l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f106219m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f106220n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f106221o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f106222p;

    /* renamed from: q, reason: collision with root package name */
    public static final d f106223q;

    /* renamed from: r, reason: collision with root package name */
    public static final d f106224r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f106225s;

    /* renamed from: t, reason: collision with root package name */
    public static final d f106226t;

    /* renamed from: a, reason: collision with root package name */
    public final Object f106227a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106228b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f106229c;

    /* renamed from: d, reason: collision with root package name */
    public final p f106230d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        new d(4, (String) null);
        new d(8, (String) null);
        f106213g = new d(16, (String) null);
        f106214h = new d(32, (String) null);
        f106215i = new d(64, (String) null);
        f106216j = new d(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, (String) null);
        new d(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, i.class);
        new d(BitmapUtils.BITMAP_TO_JPEG_SIZE, i.class);
        new d(1024, j.class);
        new d(2048, j.class);
        f106217k = new d(4096, (String) null);
        f106218l = new d(8192, (String) null);
        new d(16384, (String) null);
        new d(32768, (String) null);
        new d(65536, (String) null);
        new d(131072, n.class);
        f106219m = new d(262144, (String) null);
        f106220n = new d(524288, (String) null);
        f106221o = new d(1048576, (String) null);
        new d(2097152, o.class);
        int i13 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, l.class);
        f106222p = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f106223q = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f106224r = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f106225s = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new d(i13 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        if (i13 >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new d(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
        new d(i13 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i13 >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new d(accessibilityAction2, R.id.accessibilityActionPageRight, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f106226t = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, m.class);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, k.class);
        if (i13 >= 28) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new d(accessibilityAction3, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i13 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new d(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i13 >= 30) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new d(accessibilityAction5, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i13 >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new d(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        if (i13 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new d(accessibilityAction7, R.id.accessibilityActionDragStart, null, null, null);
        new d(i13 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        if (i13 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new d(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i13 >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new d(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new d(i13 >= 34 ? d0.i.b() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public d(int i13, Class cls) {
        this(null, i13, null, null, cls);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f106227a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f106227a;
        Object obj3 = this.f106227a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f106227a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = e.d(this.f106228b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f106227a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb3.append(d2);
        return sb3.toString();
    }

    public d(int i13, String str) {
        this(null, i13, str, null, null);
    }

    public d(Object obj, int i13, String str, p pVar, Class cls) {
        this.f106228b = i13;
        this.f106230d = pVar;
        if (obj == null) {
            this.f106227a = new AccessibilityNodeInfo.AccessibilityAction(i13, str);
        } else {
            this.f106227a = obj;
        }
        this.f106229c = cls;
    }
}
