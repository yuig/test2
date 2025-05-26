package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import i.a;
import i.f;
import i.j;
import n.b0;
import n.q;
import x92.b;

/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements b0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public q f16177a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f16178b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f16179c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f16180d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f16181e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f16182f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f16183g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f16184h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f16185i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f16186j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16187k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f16188l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16189m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f16190n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f16191o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f16192p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16193q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f16184h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16184h.getLayoutParams();
        rect.top = this.f16184h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    @Override // n.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(n.q r13) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.e(n.q):void");
    }

    @Override // n.b0
    public final q g() {
        return this.f16177a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f16186j);
        TextView textView = (TextView) findViewById(f.title);
        this.f16180d = textView;
        int i13 = this.f16187k;
        if (i13 != -1) {
            textView.setTextAppearance(this.f16188l, i13);
        }
        this.f16182f = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.f16183g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f16190n);
        }
        this.f16184h = (ImageView) findViewById(f.group_divider);
        this.f16185i = (LinearLayout) findViewById(f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (this.f16178b != null && this.f16189m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f16178b.getLayoutParams();
            int i15 = layoutParams.height;
            if (i15 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i15;
            }
        }
        super.onMeasure(i13, i14);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        b N = b.N(getContext(), attributeSet, j.MenuView, i13, 0);
        this.f16186j = N.x(j.MenuView_android_itemBackground);
        this.f16187k = N.C(j.MenuView_android_itemTextAppearance, -1);
        this.f16189m = N.t(j.MenuView_preserveIconSpacing, false);
        this.f16188l = context;
        this.f16190n = N.x(j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.dropDownListViewStyle, 0);
        this.f16191o = obtainStyledAttributes.hasValue(0);
        N.O();
        obtainStyledAttributes.recycle();
    }
}
