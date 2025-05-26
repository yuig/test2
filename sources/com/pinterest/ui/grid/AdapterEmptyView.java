package com.pinterest.ui.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.design.brio.widget.voice.PinterestVoiceMessage;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import pk.a0;
import ve0.b;
import wy1.d;
import wy1.e;

/* loaded from: classes4.dex */
public class AdapterEmptyView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f52367e = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f52368a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltSpinner f52369b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f52370c;

    /* renamed from: d, reason: collision with root package name */
    public PinterestVoiceMessage f52371d;

    public AdapterEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52368a = 2;
        a();
    }

    public final void a() {
        View inflate = LayoutInflater.from(getContext()).inflate(e.adapter_empty_view, (ViewGroup) null);
        this.f52369b = (GestaltSpinner) inflate.findViewById(d.loading_pb);
        this.f52371d = (PinterestVoiceMessage) inflate.findViewById(d.empty_alert);
        this.f52370c = (ViewGroup) inflate.findViewById(d.container);
        e();
        addView(inflate);
    }

    public final void b(b bVar) {
        PinterestVoiceMessage pinterestVoiceMessage = this.f52371d;
        if (pinterestVoiceMessage != null) {
            pinterestVoiceMessage.g(bVar);
        }
    }

    public final void c(String str) {
        PinterestVoiceMessage pinterestVoiceMessage;
        if (a0.x0(str) || (pinterestVoiceMessage = this.f52371d) == null) {
            return;
        }
        pinterestVoiceMessage.a(str);
        this.f52371d.setVisibility(0);
    }

    public final void d(int i13) {
        if (this.f52368a == i13) {
            return;
        }
        this.f52368a = i13;
        e();
    }

    public final void e() {
        int i13 = this.f52368a;
        if (i13 == 0) {
            this.f52369b.u(new oo0.b(19));
            this.f52370c.setVisibility(8);
            this.f52371d.setVisibility(8);
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    return;
                }
                this.f52369b.u(new oo0.b(20));
                this.f52370c.setVisibility(8);
                this.f52371d.setVisibility(8);
                return;
            }
            this.f52369b.u(new oo0.b(18));
            this.f52370c.setVisibility(0);
            if (this.f52371d.b()) {
                this.f52371d.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeAllViews();
        super.onDetachedFromWindow();
    }

    public AdapterEmptyView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f52368a = 2;
        a();
    }
}
