package com.pinterest.activity.conversation.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import cp.i;
import g70.h;
import h12.a;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lp.b;
import m60.u;
import so.jb;
import so.oa;
import tk2.e;
import ye2.o;

/* loaded from: classes3.dex */
public class BoardInviteInboxContainer extends LinearLayout implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34855g = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f34856a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34857b;

    /* renamed from: c, reason: collision with root package name */
    public final a f34858c;

    /* renamed from: d, reason: collision with root package name */
    public final r f34859d;

    /* renamed from: e, reason: collision with root package name */
    public final h f34860e;

    /* renamed from: f, reason: collision with root package name */
    public final b f34861f;

    public BoardInviteInboxContainer(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (!this.f34857b) {
            this.f34857b = true;
            jb jbVar = (jb) ((lp.c) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f34858c = oaVar.q2();
            this.f34859d = (r) oaVar.f113622c1.get();
            this.f34860e = jbVar.f113485c.e5();
        }
        this.f34861f = new b(this);
        setOrientation(1);
        a();
    }

    public final void a() {
        t r13 = this.f34858c.a().l(wj2.c.a()).r(e.f118017c);
        i onComplete = new i(this, 1);
        Intrinsics.checkNotNullParameter(r13, "<this>");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        nl.b.t(r13, onComplete, null, 2);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f34856a == null) {
            this.f34856a = new o(this);
        }
        return this.f34856a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f34856a == null) {
            this.f34856a = new o(this);
        }
        return this.f34856a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.f85943a.h(this.f34861f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        u.f85943a.j(this.f34861f);
        super.onDetachedFromWindow();
    }

    public BoardInviteInboxContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
