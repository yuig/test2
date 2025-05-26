package zc1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.feature.settings.shared.view.RestrictedLockView;
import lb0.r;
import so.jb;
import so.oa;
import ye2.o;

/* loaded from: classes5.dex */
public abstract class a extends IconView implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f141584a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f141585b;

    public a(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (this.f141585b) {
            return;
        }
        this.f141585b = true;
        oa oaVar = ((jb) ((c) generatedComponent())).f113483a;
        ((RestrictedLockView) this).f48328d = (r) oaVar.f113622c1.get();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f141584a == null) {
            this.f141584a = new o(this);
        }
        return this.f141584a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f141584a == null) {
            this.f141584a = new o(this);
        }
        return this.f141584a.generatedComponent();
    }
}
