package oe0;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.pinterest.design.brio.widget.voice.PinterestVoiceMessage;
import kg.n;
import pk.a0;

/* loaded from: classes5.dex */
public final class l implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final g f94242a;

    /* renamed from: b, reason: collision with root package name */
    public final PinterestVoiceMessage f94243b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f94244c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f94245d;

    /* renamed from: e, reason: collision with root package name */
    public k f94246e;

    /* renamed from: f, reason: collision with root package name */
    public ViewGroup f94247f;

    /* renamed from: g, reason: collision with root package name */
    public View f94248g;

    /* renamed from: h, reason: collision with root package name */
    public e f94249h = e.ANCHOR_TO_START_AND_ALIGN;

    /* renamed from: i, reason: collision with root package name */
    public long f94250i;

    /* renamed from: j, reason: collision with root package name */
    public final float f94251j;

    /* renamed from: k, reason: collision with root package name */
    public c f94252k;

    /* renamed from: l, reason: collision with root package name */
    public final InputMethodManager f94253l;

    public l(PinterestVoiceMessage pinterestVoiceMessage) {
        this.f94242a = new g(pinterestVoiceMessage.getResources());
        this.f94243b = pinterestVoiceMessage;
        pinterestVoiceMessage.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        pinterestVoiceMessage.setOnClickListener(this);
        Context context = pinterestVoiceMessage.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f94244c = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnTouchListener(this);
        new bh.b(28);
        this.f94245d = new Rect();
        this.f94246e = k.DEACTIVATED;
        this.f94247f = null;
        this.f94248g = null;
        this.f94250i = 0L;
        this.f94251j = context.getResources().getDimensionPixelOffset(eo1.c.voice_message_anim_y_offset);
        this.f94252k = null;
        this.f94253l = (InputMethodManager) context.getSystemService("input_method");
    }

    public final void a(ViewGroup viewGroup, String str, View view, e eVar) {
        d();
        this.f94247f = viewGroup;
        FrameLayout frameLayout = this.f94244c;
        if (frameLayout != null) {
            viewGroup.addView(frameLayout);
        }
        ViewGroup viewGroup2 = this.f94247f;
        PinterestVoiceMessage pinterestVoiceMessage = this.f94243b;
        viewGroup2.addView(pinterestVoiceMessage);
        this.f94248g = view;
        if (view instanceof EditText) {
            view.setEnabled(false);
        }
        this.f94249h = eVar;
        pinterestVoiceMessage.a(str);
        this.f94245d.setEmpty();
        View view2 = this.f94248g;
        i iVar = new i(this, 1);
        g gVar = this.f94242a;
        gVar.b(this.f94243b, view2, eVar, this.f94245d, gVar.f94231a, true, false, iVar);
        this.f94248g.getViewTreeObserver().addOnGlobalLayoutListener(this);
        if (frameLayout != null) {
            frameLayout.setAlpha(0.0f);
            frameLayout.animate().alpha(0.8f).setDuration(500L);
        }
    }

    public final void b(float f13) {
        this.f94246e = k.ANIMATING_IN;
        j jVar = new j(this, 0);
        this.f94250i = System.currentTimeMillis();
        float f14 = (1.0f - f13) * this.f94251j;
        this.f94242a.getClass();
        g.c(this.f94243b, f13, f14, 500, jVar);
    }

    public final void c() {
        this.f94246e = k.ANIMATING_OUT;
        FrameLayout frameLayout = this.f94244c;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(500L);
        }
        this.f94243b.animate().alpha(0.0f).setDuration(500L).setListener(new j(this, 1));
    }

    public final void d() {
        dp1.c cVar;
        PinterestVoiceMessage pinterestVoiceMessage = this.f94243b;
        a0.q(pinterestVoiceMessage.f44918i, bs1.c.h2(""));
        pinterestVoiceMessage.animate().setListener(null);
        ViewGroup viewGroup = this.f94247f;
        if (viewGroup != null) {
            viewGroup.removeView(pinterestVoiceMessage);
            FrameLayout frameLayout = this.f94244c;
            if (frameLayout != null) {
                this.f94247f.removeView(frameLayout);
            }
            this.f94247f = null;
        }
        View view = this.f94248g;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view2 = this.f94248g;
            if (view2 instanceof EditText) {
                view2.setEnabled(true);
                InputMethodManager inputMethodManager = this.f94253l;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(view2, 1);
                }
            }
            this.f94248g = null;
        }
        this.f94250i = 0L;
        this.f94246e = k.DEACTIVATED;
        c cVar2 = this.f94252k;
        if (cVar2 == null || (cVar = cVar2.f94215c) == null) {
            return;
        }
        if (this == cVar2.f94213a) {
            cVar.g(false);
        } else if (this == cVar2.f94214b) {
            cVar.g(false);
        }
    }

    public final PinterestVoiceMessage e() {
        return this.f94243b;
    }

    public final boolean f() {
        return this.f94247f != null;
    }

    public final void g(c cVar) {
        this.f94252k = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n.a(view);
        if (this.f94243b == view) {
            c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f94248g;
        e eVar = this.f94249h;
        i iVar = new i(this, 0);
        g gVar = this.f94242a;
        gVar.b(this.f94243b, view, eVar, this.f94245d, gVar.f94231a, false, false, iVar);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f94244c != view) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            c();
        }
        return true;
    }
}
