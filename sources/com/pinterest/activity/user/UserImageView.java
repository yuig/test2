package com.pinterest.activity.user;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import b60.b;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GrayWebImageView;
import kh2.c3;
import nr.i;
import so.jb;
import ye2.m;
import ye2.o;
import zp.j;

/* loaded from: classes3.dex */
public class UserImageView extends ScrollView implements c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f35215k = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f35216a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35217b;

    /* renamed from: c, reason: collision with root package name */
    public GrayWebImageView f35218c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f35219d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltDivider f35220e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltText f35221f;

    /* renamed from: g, reason: collision with root package name */
    public j f35222g;

    /* renamed from: h, reason: collision with root package name */
    public b f35223h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltIconButton f35224i;

    /* renamed from: j, reason: collision with root package name */
    public final i f35225j;

    public UserImageView(m mVar) {
        super(mVar);
        b();
        this.f35225j = new i(this);
        a();
    }

    public final void a() {
        View.inflate(getContext(), oz1.c.user_image, this);
        this.f35218c = (GrayWebImageView) findViewById(oz1.b.user_image);
        this.f35219d = (GestaltText) findViewById(oz1.b.user_name);
        this.f35220e = (GestaltDivider) findViewById(oz1.b.divider);
        GestaltText gestaltText = (GestaltText) findViewById(oz1.b.update_picture);
        this.f35221f = gestaltText;
        gestaltText.j(this.f35225j);
        this.f35224i = (GestaltIconButton) findViewById(oz1.b.cancel_button);
    }

    public final void b() {
        if (this.f35217b) {
            return;
        }
        this.f35217b = true;
        jb jbVar = (jb) ((nr.j) generatedComponent());
        c3.T(this, (j) jbVar.f113485c.U2.get());
        c3.c0(this, (b) jbVar.f113483a.f113850p0.get());
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f35216a == null) {
            this.f35216a = new o(this);
        }
        return this.f35216a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f35216a == null) {
            this.f35216a = new o(this);
        }
        return this.f35216a.generatedComponent();
    }

    public UserImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
        this.f35225j = new i(this);
        a();
    }

    public UserImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        b();
        this.f35225j = new i(this);
        a();
    }
}
