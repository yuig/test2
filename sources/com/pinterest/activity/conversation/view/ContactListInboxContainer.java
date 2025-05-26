package com.pinterest.activity.conversation.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ck2.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import no1.e;
import so.jb;
import so.oa;
import tb0.h;
import u20.d;
import xj2.b;
import ye2.o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/conversation/view/ContactListInboxContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ContactListInboxContainer extends LinearLayout implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f34862h = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f34863a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34864b;

    /* renamed from: c, reason: collision with root package name */
    public final b f34865c;

    /* renamed from: d, reason: collision with root package name */
    public h f34866d;

    /* renamed from: e, reason: collision with root package name */
    public w f34867e;

    /* renamed from: f, reason: collision with root package name */
    public d f34868f;

    /* renamed from: g, reason: collision with root package name */
    public e f34869g;

    public ContactListInboxContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
        this.f34865c = new b();
        setOrientation(1);
        b();
    }

    public final void a() {
        if (this.f34864b) {
            return;
        }
        this.f34864b = true;
        jb jbVar = (jb) ((lp.e) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.f34866d = (h) oaVar.f113797m0.get();
        this.f34867e = (w) oaVar.f113885r0.get();
        this.f34868f = (d) oaVar.Y5.get();
        this.f34869g = jbVar.f113485c.C5();
    }

    public final void b() {
        d dVar = this.f34868f;
        if (dVar != null) {
            d.d(dVar, 15).H(tk2.e.f118017c).A(wj2.c.a()).F(new jp.d(8, new lp.d(this, 0)), new jp.d(9, new lp.d(this, 1)), i.f27923c, i.f27924d);
        } else {
            Intrinsics.r("sendShareServiceWrapper");
            throw null;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f34863a == null) {
            this.f34863a = new o(this);
        }
        return this.f34863a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f34863a == null) {
            this.f34863a = new o(this);
        }
        return this.f34863a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34865c.d();
    }

    public ContactListInboxContainer(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a();
        this.f34865c = new b();
        setOrientation(1);
        b();
    }
}
