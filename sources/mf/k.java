package mf;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.z;
import com.facebook.login.e0;
import com.facebook.login.f0;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f87081a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f87082b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f87083c;

    /* renamed from: d, reason: collision with root package name */
    public i f87084d;

    /* renamed from: e, reason: collision with root package name */
    public PopupWindow f87085e;

    /* renamed from: f, reason: collision with root package name */
    public j f87086f = j.BLUE;

    /* renamed from: g, reason: collision with root package name */
    public long f87087g = 6000;

    /* renamed from: h, reason: collision with root package name */
    public final h f87088h = new h(this);

    public k(View view, String str) {
        this.f87081a = str;
        this.f87082b = new WeakReference(view);
        this.f87083c = view.getContext();
    }

    public static /* synthetic */ PopupWindow a(k kVar) {
        if (p001if.a.b(k.class)) {
            return null;
        }
        try {
            return kVar.f87085e;
        } catch (Throwable th3) {
            p001if.a.a(k.class, th3);
            return null;
        }
    }

    public final void b() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            d();
            PopupWindow popupWindow = this.f87085e;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void c() {
        Context context = this.f87083c;
        if (p001if.a.b(this)) {
            return;
        }
        WeakReference weakReference = this.f87082b;
        try {
            if (weakReference.get() != null) {
                i iVar = new i(this, context);
                this.f87084d = iVar;
                ((TextView) iVar.findViewById(f0.com_facebook_tooltip_bubble_view_text_body)).setText(this.f87081a);
                if (this.f87086f == j.BLUE) {
                    this.f87084d.f87079d.setBackgroundResource(e0.com_facebook_tooltip_blue_background);
                    ((ImageView) this.f87084d.f87077b).setImageResource(e0.com_facebook_tooltip_blue_bottomnub);
                    ((ImageView) this.f87084d.f87076a).setImageResource(e0.com_facebook_tooltip_blue_topnub);
                    this.f87084d.f87078c.setImageResource(e0.com_facebook_tooltip_blue_xout);
                } else {
                    this.f87084d.f87079d.setBackgroundResource(e0.com_facebook_tooltip_black_background);
                    ((ImageView) this.f87084d.f87077b).setImageResource(e0.com_facebook_tooltip_black_bottomnub);
                    ((ImageView) this.f87084d.f87076a).setImageResource(e0.com_facebook_tooltip_black_topnub);
                    this.f87084d.f87078c.setImageResource(e0.com_facebook_tooltip_black_xout);
                }
                View decorView = ((Activity) context).getWindow().getDecorView();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                if (!p001if.a.b(this)) {
                    try {
                        d();
                        if (weakReference.get() != null) {
                            ((View) weakReference.get()).getViewTreeObserver().addOnScrollChangedListener(this.f87088h);
                        }
                    } catch (Throwable th3) {
                        p001if.a.a(this, th3);
                    }
                }
                this.f87084d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                i iVar2 = this.f87084d;
                PopupWindow popupWindow = new PopupWindow(iVar2, iVar2.getMeasuredWidth(), this.f87084d.getMeasuredHeight());
                this.f87085e = popupWindow;
                popupWindow.showAsDropDown((View) weakReference.get());
                if (!p001if.a.b(this)) {
                    try {
                        PopupWindow popupWindow2 = this.f87085e;
                        if (popupWindow2 != null && popupWindow2.isShowing()) {
                            if (this.f87085e.isAboveAnchor()) {
                                i iVar3 = this.f87084d;
                                ((ImageView) iVar3.f87076a).setVisibility(4);
                                ((ImageView) iVar3.f87077b).setVisibility(0);
                            } else {
                                i iVar4 = this.f87084d;
                                ((ImageView) iVar4.f87076a).setVisibility(0);
                                ((ImageView) iVar4.f87077b).setVisibility(4);
                            }
                        }
                    } catch (Throwable th4) {
                        p001if.a.a(this, th4);
                    }
                }
                long j13 = this.f87087g;
                if (j13 > 0) {
                    this.f87084d.postDelayed(new z(this, 22), j13);
                }
                this.f87085e.setTouchable(true);
                this.f87084d.setOnClickListener(new androidx.appcompat.app.c(this, 3));
            }
        } catch (Throwable th5) {
            p001if.a.a(this, th5);
        }
    }

    public final void d() {
        if (p001if.a.b(this)) {
            return;
        }
        WeakReference weakReference = this.f87082b;
        try {
            if (weakReference.get() != null) {
                ((View) weakReference.get()).getViewTreeObserver().removeOnScrollChangedListener(this.f87088h);
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
