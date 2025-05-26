package jc0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.feature.pin.creation.view.UploadProgressBarLayout;
import so.jb;
import so.oa;
import x02.x2;

/* loaded from: classes.dex */
public abstract class h extends FrameLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75403a;

    /* renamed from: b, reason: collision with root package name */
    public ye2.o f75404b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f75405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        this.f75403a = 2;
        c();
    }

    public final ye2.o a() {
        switch (this.f75403a) {
            case 0:
                if (this.f75404b == null) {
                    this.f75404b = b();
                }
                break;
            case 1:
                if (this.f75404b == null) {
                    this.f75404b = b();
                }
                break;
            default:
                if (this.f75404b == null) {
                    this.f75404b = b();
                }
                break;
        }
        return this.f75404b;
    }

    public final ye2.o b() {
        switch (this.f75403a) {
        }
        return new ye2.o(this);
    }

    public final void c() {
        switch (this.f75403a) {
            case 0:
                if (!this.f75405c) {
                    this.f75405c = true;
                    ((ModalContainer) this).f44765j = (tb0.h) ((jb) ((y) generatedComponent())).f113483a.f113797m0.get();
                    break;
                }
                break;
            case 1:
                if (!this.f75405c) {
                    this.f75405c = true;
                    UploadProgressBarLayout uploadProgressBarLayout = (UploadProgressBarLayout) this;
                    oa oaVar = ((jb) ((p11.t) generatedComponent())).f113483a;
                    uploadProgressBarLayout.f47127e = oaVar.f113885r0;
                    uploadProgressBarLayout.f47128f = (ag1.b) oaVar.Z7.get();
                    break;
                }
                break;
            default:
                if (!this.f75405c) {
                    this.f75405c = true;
                    ru1.i iVar = (ru1.i) this;
                    jb jbVar = (jb) ((ru1.j) generatedComponent());
                    oa oaVar2 = jbVar.f113483a;
                    iVar.f110049e = (x2) oaVar2.f113800m3.get();
                    iVar.f110050f = (b60.b) oaVar2.f113850p0.get();
                    iVar.f110051g = new b20.c((r70.f) jbVar.f113483a.Ac.get());
                    break;
                }
                break;
        }
    }

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f75403a) {
        }
        return a();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f75403a) {
        }
        return a().generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13);
        this.f75403a = i14;
        if (i14 != 1) {
            c();
        } else {
            super(context, attributeSet, i13);
            c();
        }
    }
}
