package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class k extends p0 implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final i f16058f;

    public k(Context context, int i13) {
        super(context, g(context, i13));
        this.f16058f = new i(getContext(), this, getWindow());
    }

    public static int g(Context context, int i13) {
        if (((i13 >>> 24) & 255) >= 1) {
            return i13;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.p0, androidx.activity.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i13;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        i iVar = this.f16058f;
        iVar.f16027b.setContentView(iVar.E);
        int i14 = i.f.parentPanel;
        Window window = iVar.f16028c;
        View findViewById2 = window.findViewById(i14);
        View findViewById3 = findViewById2.findViewById(i.f.topPanel);
        View findViewById4 = findViewById2.findViewById(i.f.contentPanel);
        View findViewById5 = findViewById2.findViewById(i.f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(i.f.customPanel);
        View view = iVar.f16032g;
        Context context = iVar.f16026a;
        if (view == null) {
            view = iVar.f16033h != 0 ? LayoutInflater.from(context).inflate(iVar.f16033h, viewGroup, false) : null;
        }
        boolean z13 = view != null;
        if (!z13 || !i.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z13) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(i.f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (iVar.f16034i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (iVar.f16031f != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(i.f.topPanel);
        View findViewById7 = viewGroup.findViewById(i.f.contentPanel);
        View findViewById8 = viewGroup.findViewById(i.f.buttonPanel);
        ViewGroup c13 = i.c(findViewById6, findViewById3);
        ViewGroup c14 = i.c(findViewById7, findViewById4);
        ViewGroup c15 = i.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(i.f.scrollView);
        iVar.f16047v = nestedScrollView;
        nestedScrollView.setFocusable(false);
        iVar.f16047v.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c14.findViewById(R.id.message);
        iVar.A = textView;
        if (textView != null) {
            textView.setVisibility(8);
            iVar.f16047v.removeView(iVar.A);
            if (iVar.f16031f != null) {
                ViewGroup viewGroup2 = (ViewGroup) iVar.f16047v.getParent();
                int indexOfChild = viewGroup2.indexOfChild(iVar.f16047v);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(iVar.f16031f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c14.setVisibility(8);
            }
        }
        Button button = (Button) c15.findViewById(R.id.button1);
        iVar.f16035j = button;
        c cVar = iVar.K;
        button.setOnClickListener(cVar);
        boolean isEmpty = TextUtils.isEmpty(iVar.f16036k);
        int i15 = iVar.f16029d;
        if (isEmpty && iVar.f16038m == null) {
            iVar.f16035j.setVisibility(8);
            i13 = 0;
        } else {
            iVar.f16035j.setText(iVar.f16036k);
            Drawable drawable = iVar.f16038m;
            if (drawable != null) {
                drawable.setBounds(0, 0, i15, i15);
                iVar.f16035j.setCompoundDrawables(iVar.f16038m, null, null, null);
            }
            iVar.f16035j.setVisibility(0);
            i13 = 1;
        }
        Button button2 = (Button) c15.findViewById(R.id.button2);
        iVar.f16039n = button2;
        button2.setOnClickListener(cVar);
        if (TextUtils.isEmpty(iVar.f16040o) && iVar.f16042q == null) {
            iVar.f16039n.setVisibility(8);
        } else {
            iVar.f16039n.setText(iVar.f16040o);
            Drawable drawable2 = iVar.f16042q;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i15, i15);
                iVar.f16039n.setCompoundDrawables(iVar.f16042q, null, null, null);
            }
            iVar.f16039n.setVisibility(0);
            i13 |= 2;
        }
        Button button3 = (Button) c15.findViewById(R.id.button3);
        iVar.f16043r = button3;
        button3.setOnClickListener(cVar);
        if (TextUtils.isEmpty(iVar.f16044s) && iVar.f16046u == null) {
            iVar.f16043r.setVisibility(8);
        } else {
            iVar.f16043r.setText(iVar.f16044s);
            Drawable drawable3 = iVar.f16046u;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i15, i15);
                iVar.f16043r.setCompoundDrawables(iVar.f16046u, null, null, null);
            }
            iVar.f16043r.setVisibility(0);
            i13 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i13 == 1) {
                Button button4 = iVar.f16035j;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i13 == 2) {
                Button button5 = iVar.f16039n;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i13 == 4) {
                Button button6 = iVar.f16043r;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i13 == 0) {
            c15.setVisibility(8);
        }
        if (iVar.B != null) {
            c13.addView(iVar.B, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(i.f.title_template).setVisibility(8);
        } else {
            iVar.f16050y = (ImageView) window.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(iVar.f16030e)) && iVar.I) {
                TextView textView2 = (TextView) window.findViewById(i.f.alertTitle);
                iVar.f16051z = textView2;
                textView2.setText(iVar.f16030e);
                int i16 = iVar.f16048w;
                if (i16 != 0) {
                    iVar.f16050y.setImageResource(i16);
                } else {
                    Drawable drawable4 = iVar.f16049x;
                    if (drawable4 != null) {
                        iVar.f16050y.setImageDrawable(drawable4);
                    } else {
                        iVar.f16051z.setPadding(iVar.f16050y.getPaddingLeft(), iVar.f16050y.getPaddingTop(), iVar.f16050y.getPaddingRight(), iVar.f16050y.getPaddingBottom());
                        iVar.f16050y.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(i.f.title_template).setVisibility(8);
                iVar.f16050y.setVisibility(8);
                c13.setVisibility(8);
            }
        }
        boolean z14 = viewGroup.getVisibility() != 8;
        int i17 = (c13 == null || c13.getVisibility() == 8) ? 0 : 1;
        boolean z15 = c15.getVisibility() != 8;
        if (!z15 && (findViewById = c14.findViewById(i.f.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i17 != 0) {
            NestedScrollView nestedScrollView2 = iVar.f16047v;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = iVar.f16031f != null ? c13.findViewById(i.f.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = c14.findViewById(i.f.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = iVar.f16031f;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z15 || i17 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i17 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f15946a, alertController$RecycleListView.getPaddingRight(), z15 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f15947b);
            }
        }
        if (!z14) {
            View view2 = iVar.f16031f;
            if (view2 == null) {
                view2 = iVar.f16047v;
            }
            if (view2 != null) {
                int i18 = z15 ? 2 : 0;
                View findViewById11 = window.findViewById(i.f.scrollIndicatorUp);
                View findViewById12 = window.findViewById(i.f.scrollIndicatorDown);
                WeakHashMap weakHashMap = q5.v0.f102521a;
                q5.n0.b(view2, i17 | i18, 3);
                if (findViewById11 != null) {
                    c14.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c14.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = iVar.f16031f;
        if (alertController$RecycleListView2 == null || (listAdapter = iVar.C) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i19 = iVar.D;
        if (i19 > -1) {
            alertController$RecycleListView2.setItemChecked(i19, true);
            alertController$RecycleListView2.setSelection(i19);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f16058f.f16047v;
        if (nestedScrollView == null || !nestedScrollView.o(keyEvent)) {
            return super.onKeyDown(i13, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i13, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f16058f.f16047v;
        if (nestedScrollView == null || !nestedScrollView.o(keyEvent)) {
            return super.onKeyUp(i13, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.p0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        i iVar = this.f16058f;
        iVar.f16030e = charSequence;
        TextView textView = iVar.f16051z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
