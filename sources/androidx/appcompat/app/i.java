package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class i {
    public TextView A;
    public View B;
    public ListAdapter C;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final g f16025J;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16026a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f16027b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f16028c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16029d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f16030e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f16031f;

    /* renamed from: g, reason: collision with root package name */
    public View f16032g;

    /* renamed from: h, reason: collision with root package name */
    public int f16033h;

    /* renamed from: j, reason: collision with root package name */
    public Button f16035j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f16036k;

    /* renamed from: l, reason: collision with root package name */
    public Message f16037l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f16038m;

    /* renamed from: n, reason: collision with root package name */
    public Button f16039n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f16040o;

    /* renamed from: p, reason: collision with root package name */
    public Message f16041p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f16042q;

    /* renamed from: r, reason: collision with root package name */
    public Button f16043r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f16044s;

    /* renamed from: t, reason: collision with root package name */
    public Message f16045t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f16046u;

    /* renamed from: v, reason: collision with root package name */
    public NestedScrollView f16047v;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f16049x;

    /* renamed from: y, reason: collision with root package name */
    public ImageView f16050y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f16051z;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16034i = false;

    /* renamed from: w, reason: collision with root package name */
    public int f16048w = 0;
    public int D = -1;
    public final c K = new c(this, 0);

    public i(Context context, p0 p0Var, Window window) {
        this.f16026a = context;
        this.f16027b = p0Var;
        this.f16028c = window;
        g gVar = new g();
        gVar.f16015a = new WeakReference(p0Var);
        this.f16025J = gVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, i.j.AlertDialog, i.a.alertDialogStyle, 0);
        this.E = obtainStyledAttributes.getResourceId(i.j.AlertDialog_android_layout, 0);
        obtainStyledAttributes.getResourceId(i.j.AlertDialog_buttonPanelSideLayout, 0);
        this.F = obtainStyledAttributes.getResourceId(i.j.AlertDialog_listLayout, 0);
        obtainStyledAttributes.getResourceId(i.j.AlertDialog_multiChoiceItemLayout, 0);
        this.G = obtainStyledAttributes.getResourceId(i.j.AlertDialog_singleChoiceItemLayout, 0);
        this.H = obtainStyledAttributes.getResourceId(i.j.AlertDialog_listItemLayout, 0);
        this.I = obtainStyledAttributes.getBoolean(i.j.AlertDialog_showTitle, true);
        this.f16029d = obtainStyledAttributes.getDimensionPixelSize(i.j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        p0Var.d().j(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i13, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f16025J.obtainMessage(i13, onClickListener) : null;
        if (i13 == -3) {
            this.f16044s = charSequence;
            this.f16045t = obtainMessage;
            this.f16046u = null;
        } else if (i13 == -2) {
            this.f16040o = charSequence;
            this.f16041p = obtainMessage;
            this.f16042q = null;
        } else {
            if (i13 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f16036k = charSequence;
            this.f16037l = obtainMessage;
            this.f16038m = null;
        }
    }
}
